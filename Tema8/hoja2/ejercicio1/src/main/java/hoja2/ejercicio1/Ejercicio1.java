/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja2.ejercicio1;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author DAW118
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int opcion = 0;
        
        MetodosDB mysql = new MetodosDB();

        try ( Connection conn = AccesoBaseDatos.getInstance().getConn();) {
            do {
                System.out.println("Menú: \n"
                        + "1. insertar paciente....\n"
                        + "2. insertar visita\n"
                        + "3. mostrar agenda del dia\n"
                        + "4. mostrar visitas de un paciente\n"
                        + "5. salir");

                opcion = Teclado.pedirIntPositivo("Introduce la opcion que quieras...");

                switch (opcion) {
                    case 1 -> {
                        Paciente auxPaciente = new Paciente();
                        mysql.insertarPaciente(auxPaciente);
                    }
                    case 2 -> {
                        String dni = Teclado.pedirDNIRegex("Introduce el Dni del paciente que quiera añadir la visita..");

                        //si el paciente no existe pide crearlo
                        if (mysql.pedirPacientePorDni(dni) == null) {
                            boolean opcion2 = Teclado.introBoolean("El paciente no existe, quieres crearlo? (s/n)");
                            if (opcion2) {
                                Paciente auxPaciente =new Paciente();
                                mysql.insertarPaciente(auxPaciente);
                            }
                        } else {

                            Visita auxVisita = new Visita();
                            mysql.insertarVisita(auxVisita);

                        }
                    }
                    case 3 -> {
                        ArrayList<Visita> lista = mysql.ListarDia();

                            for (Visita visita : lista) {
                                System.out.println(visita.toString());
                            }

                    }
                    case 4 -> {
                        Paciente auxPaciente = mysql.pedirPacientePorDni(Teclado.pedirDNIRegex("Introduce el DNI del paciente que quieras ver"));
                        if (auxPaciente == null) {
                            System.out.println("El paciente no existe");
                        } else {

                            System.out.println(auxPaciente.toString());
                            LinkedList<Visita> lista = mysql.ListarPaciente(auxPaciente);

                            for (Visita visita : lista) {
                                System.out.println(visita.toString());
                            }

                        }
                    }
                    case 5 -> {
                        System.out.println("Saliendo adios");
                    }
                    default -> {
                    }
                }

            } while (opcion != 5);
        } catch (SQLException ex) {
            System.out.println("error sql" + ex.getMessage());
        }
    }
}
