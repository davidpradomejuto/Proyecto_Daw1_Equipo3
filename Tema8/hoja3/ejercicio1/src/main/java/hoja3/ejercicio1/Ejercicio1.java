/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja3.ejercicio1;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int opcion = 0;
        try ( Connection conn = AccesoBaseDatos.getInstance().getConn()) {
            MetodosDB mysql = new MetodosDB();

            do {
                System.out.println("Menú\n1. Consultar actividad\n2. Inscribirse en una actividad\n3. anular una inscripcion\n4. Salir.");

                opcion = Teclado.pedirIntPositivo("Introduce una opcion...");

                switch (opcion) {
                    case 1 -> {
                        //consultar una actividad,,mostrar el nombe de las actividades, 
                        //selecciona una actividad y a continuación mostramos el horario de la
                        //actividad, el número de plazas libres que quedan y los participantes en la actividad.
                        List<Actividad> lista = mysql.listarActividades();

                        System.out.println("Listado de nuestras actividades");
                        for (Actividad actividad : lista) {
                            System.out.println("identificacion de la actividad -> " + actividad.getId() + "  . Nombre de la actividad " + actividad.getNombre());
                        }

                        int idActividad = Teclado.pedirIntPositivo("Introduce el ID de la actividad que quieras ver...");

                        Actividad auxActividad = mysql.listarActividadPorId(idActividad);
                        if (auxActividad != null) {
                            List<Participante> listaParticipantes = mysql.listarParticipantesPorActividad(idActividad);
                            System.out.println("Actividad " + auxActividad.getNombre() + " Numero de Plazas Libres " + auxActividad.getPlazasLibres());
                            System.out.println("Lista de participantes:");
                            for (Participante participante : listaParticipantes) {
                                System.out.println("\t" + participante.toString());
                            }
                        } else {
                            System.out.println("La actividad escogida no existe");
                        }
                    }
                    case 2 -> {
                        List<Actividad> lista = mysql.listarActividades();

                        System.out.println("Listado de nuestras actividades");
                        for (Actividad actividad : lista) {
                            System.out.println("identificacion de la actividad -> " + actividad.getId() + "  . Nombre de la actividad " + actividad.getNombre());
                        }
                        /* Inscripción en una actividad. Pedimos al usuario la actividad a la que se quiere inscribir,*/
                        int idActividad = Teclado.pedirIntPositivo("Introduce el ID de la actividad en la que te quieras inscribir...");

                        Actividad auxActividad = mysql.listarActividadPorId(idActividad);
                        //reviso si la actividad existe y si tiene plazas libres
                        if (auxActividad != null) {
                            if (auxActividad.getPlazasLibres() > 0) {

                                String dni = Teclado.pedirDNIRegex("Introduce el DNI del participante...");
                                String nombre = Teclado.pedirNombre("Introduce el nombre del participante...");

                                //creo el usuario con el dni y nombre dado y la actividad seleccionada
                                Participante auxParticipante = new Participante(dni, nombre, auxActividad.getId());

                                //checkeo si existe ese participante
                                if (mysql.listarParticipantePorDNI(auxParticipante.getDni()) == null) {

                                    mysql.insertarParticipante(auxParticipante);

                                } else {
                                    System.out.println("este DNI ya esta incrito en una de nuestras actividades");
                                }
                            } else {
                                System.out.println("No hay plazas disponibles en la actividad");
                            }

                        } else {
                            System.out.println("La actividad escogida no existe");
                        }
                        /* validamos que sea una actividad de las que ofrecemos, comprobaremos que hay plazas libres para realizar la inscripción y comprobaremos que el participante no este en
                        ninguna otra actividad e informaremos de las situaciones que se pueden dar.*/
                    }
                    case 3 -> {
                        
                        
                        //listo las actividades de las muestro
                        List<Actividad> lista = mysql.listarActividades();

                        System.out.println("Listado de nuestras actividades");
                        for (Actividad actividad : lista) {
                            System.out.println("identificacion de la actividad -> " + actividad.getId() + "  . Nombre de la actividad " + actividad.getNombre());
                        }
                        
                        //pido el id de la actividad en la que quiero mostrar los participantes
                        int idActividad = Teclado.pedirIntPositivo("Introduce el ID de la actividad en la que quieras ver los participantes...");

                        //si la actividad existe, muestro los participantes
                        if (mysql.listarActividadPorId(idActividad) != null) {
                            
                            //listo los participantes
                            List<Participante> listaParticipantes = mysql.listarParticipantesPorActividad(idActividad);
                            System.out.println("Lista de participantes:");
                            for (Participante participante : listaParticipantes) {
                                System.out.println("\t" + participante.toString());
                            }

                            //pido el dni del participante que quiero borrar
                            String dniParticipante = Teclado.pedirDNIRegex("Introduce el DNI del participante que quieras borrar...");

                            //si el participante existe  comparo si la id de la actividad del participante es la misma que la id elegida por el usuario
                            Participante participanteAux = mysql.listarParticipantePorDNI(dniParticipante);
                            if (participanteAux != null) {
                                if (idActividad == participanteAux.getIdActividad()) {
                                    
                                    //elimino el registro del participante
                                    mysql.eliminar(participanteAux.getDni());

                                } else {
                                    System.out.println("El participante no esta en la actividad que has elegido..");
                                }
                            } else {
                                System.out.println("El participantes no existe...");
                            }

                        } else {
                            System.out.println("Esa actividad no existe...");
                        }
                    }
                    case 4 -> {
                        System.out.println("Saliendo, adios...");
                    }
                    default -> {
                        System.out.println("Opcion no valida....");
                    }
                }
            } while (opcion != 4);
        } catch (SQLException ex) {
            System.out.println("error sql" + ex.getMessage());
        }
    }
}
