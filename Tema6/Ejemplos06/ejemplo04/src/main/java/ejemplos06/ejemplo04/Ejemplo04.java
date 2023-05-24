/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos06.ejemplo04;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author cic
 */
public class Ejemplo04 {

    public static void main(String[] args) {
        Alumno a1 = new Alumno("alberto", 7);
        Alumno a2 = new Alumno("alberto", 6);
        Alumno a3 = new Alumno("alberto", 7);
        Alumno a4 = new Alumno("adrian", 7);
        Alumno a5 = new Alumno("alberto", 7);
        Alumno a6 = new Alumno("adrian", 8);
        // No permiten duplicados según lo establecido en el método equals
        // No guarda ningún orden establecido,la implementación del hasCode
        // puede cambiar el orden en que aparezcan los datos
        Set<Alumno> l = new HashSet<>();
        l.add(a1);
        l.add(a2);
        l.add(a3);
        l.add(a4);
        l.add(a5);
        l.add(a6);
        System.out.println("Lista sin orden");
        for (Alumno alumno : l) {
            System.out.println(alumno);
        }
        // Si mantiene un orden, es el orden en que fueron insertados.
        // No permiten duplicados según lo establecido en el método equals
        Set<Alumno> lista= new LinkedHashSet<>();
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        lista.add(a4);
        lista.add(a5);
        lista.add(a6);
        System.out.println("Lista ordenada según orden de inserción");
        for (Alumno alumno : lista) {
            System.out.println(alumno);
        }

    }
}
