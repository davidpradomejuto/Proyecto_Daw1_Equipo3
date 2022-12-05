/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.ejercicio4;

import java.util.Scanner;

/*@author DAW118*/
public class CajaFuerte {

    public static void contrasena() {
        Scanner teclado = new Scanner(System.in);
        int contrasena = 0;

        contrasena = (int) Math.floor(Math.random() * 9999) + 1;
        System.out.println(contrasena);

        for (int contador = 3; contador >= 0; contador--) {
            System.out.println("introduce la contraseña de 4 cifras:");
            int n = teclado.nextInt();

            if (n == contrasena) {
                System.out.println("has abierto la caja");
                contador = 0;
            } else {
                System.out.printf("lo siento,esa no es la combinacion, quedan %d intentos \n", contador);
            }
        }

        System.out.println("Numero maximo de intentos alcanzado");

    }
}
