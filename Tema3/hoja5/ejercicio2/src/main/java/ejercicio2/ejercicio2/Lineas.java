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
public class Lineas {

    public static void Lineas() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("introduce el numero de lineas: ");
        int nLineas = teclado.nextInt();
        for (int i = 1; i <= nLineas; i++) {

            if (i % 2 != 0) {

                for (int a = 9; a >= 1; a--) { //muestro cadena Impar
                    System.out.printf("%d ", a);
                }

            } else {
                for (int b = 1; b <= 9; b++) { //muestro cadena Par
                    System.out.printf("%d ", b);
                }
            }

            System.out.println(""); //salto de linea

        }
    }
}
