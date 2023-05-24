/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Doble {

    public static void doble() {
        Scanner teclado = new Scanner(System.in);

        int resultadoApuesta;

        for (boolean opcion = true; opcion == true;) {
            System.out.println("Introduce la cantidad a apostar");
            int n = teclado.nextInt();

            resultadoApuesta = (int) Math.floor(Math.random() * 2) + 1;

            if (resultadoApuesta == 1) {
                System.out.println("Has ganado " + n * 2 + " puntos");

                System.out.println("Quieres volverlo a intentar?: true/false");
                opcion = teclado.nextBoolean();
            } else {
                System.out.println("Has perdido, quieres volverlo a intentar?: true/false");
                opcion = teclado.nextBoolean();
            }

        }
    }

}
