/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[] valorCiudad = new double [10];
        double media = 0;
        for (int i = 0; i < 10; i++) {

            System.out.println("Introduce el valor de la ciudad: " + i);
            valorCiudad[i] = teclado.nextDouble();
        }

        for (int i = 0; i <= 10; i++) {
            media += valorCiudad[i];
        }
        System.out.println("La media de la temperatura es : "+media/valorCiudad.length+" grados");

    }
}
