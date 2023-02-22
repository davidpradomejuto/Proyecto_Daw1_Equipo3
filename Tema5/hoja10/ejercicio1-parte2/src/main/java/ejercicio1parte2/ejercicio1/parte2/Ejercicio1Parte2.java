/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio1parte2.ejercicio1.parte2;

import ejercicio1.ejercicio1.*;

/**
 *
 * @author david
 */
public class Ejercicio1Parte2 {

    public static void main(String[] args) {
        System.out.println("creo el troyano");
        Troyano t = new Troyano("troyanoprueba", 18, 20);

        System.out.println("creo el griego");
        Griego g = new Griego("griegoprueba", 32, 24);

        System.out.println("Creo un caballo vacio con capacidad para 10 hombres");
        Caballo caballo = new Caballo(t, 10);

        if (caballo.montar(t) == -1) {
            System.out.println("El caballo esta lleno");
        } else if (caballo.montar(t) == -2) {
            System.out.println("Has intentado subir un troyano");
        }else{
            System.out.println("el numero de Griegos en el caballo son: "+caballo.montar(t));
        }
        
         if (caballo.montar(g) == -1) {
            System.out.println("El caballo esta lleno");
        } else if (caballo.montar(g) == -2) {
            System.out.println("Has intentado subir un troyano");
        }else{
            System.out.println("el numero de Griegos en el caballo son: "+caballo.montar(t));
        }

    }
}
