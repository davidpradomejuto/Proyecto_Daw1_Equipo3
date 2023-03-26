/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author david
 */
public class GestorSeries {

    Set<Serie> matriz;

    public GestorSeries() {
        matriz = new HashSet();
    }

    public Serie existeSerie(String nombre) {
        Serie result = null;
        boolean encontrado = false;
        for (Serie s : matriz) {
            if (s.getNombre().equalsIgnoreCase(nombre) && !encontrado) {
                result = s;
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Serie no encontrada...");
        } else {
            System.out.println("Serie encontrada....");
        }

        return result;
    }

    public void insertarSerie() {

        String nombre = Entrada.pedirNombreRegex("Introduce el nombre...");
        Tematica tematica = Entrada.pedirTematica("introduce la tematica deseada...");
        String nacionalidad = Entrada.pedirNombreRegex("Introduce la nacionalidad...");
        boolean finalizada = Entrada.pedirBooleanRegex("La series ha finalizado? (Si/No)");
        int temporadas = Entrada.pedirIntPositivo("introduce el numero de temporadas...");

        boolean encontrado = false;
        for (Serie s : matriz) {
            if (s.getNombre().equalsIgnoreCase(nombre) && !encontrado) {
                encontrado = true;
            }
        }
        if (!encontrado) {
            try {
                Serie insert = new Serie(nombre, tematica, nacionalidad, finalizada, temporadas);
                if (matriz.add(insert)) {
                    System.out.println("Serie introducida...");
                } else {
                    System.out.println("Error serie no introducida");
                }

            } catch (Exception e) {
                System.out.println("Error...");
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Serie repetida....");
        }

    }

    public void mostrar() {
        System.out.println("Mostrando series almacenadas");

        for (Serie s : matriz) {
            System.out.println(s.toString());
        }
    }

    public void insertarCap() {
        String nombre = "";
        nombre = Entrada.pedirNombreRegex("Inserta el nombre de la serie...");
        Serie aux = null;
        try {
            aux = existeSerie(nombre);
        } catch (Exception e) {
            System.out.println("Error...");
            System.out.println(e.getMessage());
        }

        if (aux != null) { // si la serie existe, se guarda en aux y si aux es distinto de null, genero un capitulo y le meto en la serie
            Capitulo cap = new Capitulo();

            Iterator<Serie> it = matriz.iterator(); //genero un iterator para buscar en el listado de serie la serie que quiero y usar su metodo modificar
            while (it.hasNext()) {
                Serie serie = it.next();

                if (serie.equals(aux)) {
                    try {
                        if (serie.insertarCapitulo(cap)) {
                            System.out.println("Capitulo insertado...");
                        } else {
                            System.out.println("Error al insertar el capitulo...");
                        }
                    } catch (Exception e) {
                        System.out.println("Error...");
                        System.out.println(e.getMessage());
                    }
                }
            }

        } else {
            System.out.println("La Serie no existe...");
        }

    }

    public void eliminarCap() {
        String nombreSerie = "";
        nombreSerie = Entrada.pedirNombreRegex("Inserta el nombre de la serie...");
        Serie aux = null;
        try {
            aux = existeSerie(nombreSerie);
        } catch (Exception e) {
            System.out.println("Error...");
            System.out.println(e.getMessage());
        }

        if (aux != null) { // si la serie existe, se guarda en aux y si aux es distinto de null, genero un capitulo y le meto en la serie
            String claveCap = "";
            claveCap = Entrada.pedirCapRegex("Introduce la clave del capitulo....");

            Iterator<Serie> it = matriz.iterator(); //genero un iterator para buscar en el listado de serie la serie que quiero y usar su metodo modificar
            while (it.hasNext()) {
                Serie serie = it.next();
                try {
                    if (serie.equals(aux)) {
                        serie.eliminarCapitulo(claveCap);
                    }

                } catch (Exception e) {
                    System.out.println("Error...");
                    System.out.println(e.getMessage());
                }
            }
        } else {
            System.out.println("La Serie no existe...");
        }
    }
    
    public void verCap() {
        String nombre = "";
        nombre = Entrada.pedirNombreRegex("Inserta el nombre de la serie...");
        Serie aux = null;
        try {
            aux = existeSerie(nombre);
        } catch (Exception e) {
            System.out.println("Error...");
            System.out.println(e.getMessage());
        }

        if (aux != null) { // si la serie existe, se guarda en aux y si aux es distinto de null, genero un capitulo y le meto en la serie
            

            Iterator<Serie> it = matriz.iterator(); //genero un iterator para buscar en el listado de serie la serie que quiero y usar su metodo modificar
            while (it.hasNext()) {
                Serie serie = it.next();

                if (serie.equals(aux)) {
                    try {
                        serie.visualizaCapitulos();
                            
                    } catch (Exception e) {
                        System.out.println("Error...");
                        System.out.println(e.getMessage());
                    }
                }
            }

        } else {
            System.out.println("La Serie no existe...");
        }

    }
}
