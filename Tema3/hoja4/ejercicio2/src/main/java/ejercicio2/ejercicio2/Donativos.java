/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Donativos {

    public static void pedir() {
        Scanner teclado = new Scanner(System.in);

        int contador = 1;
        for (int total = 0; total <= 600; contador++) {
            
            System.out.println("introduce un donativo:");//pido el donativo
            int n = teclado.nextInt();

            total += n;//sumo el donativo
            System.out.println("has introducido " + n + " €, el total es de: " + total + " €");
        }

        System.out.println("se han necesitado " + contador + " donaciones para superar los 600 €");
    }

}
