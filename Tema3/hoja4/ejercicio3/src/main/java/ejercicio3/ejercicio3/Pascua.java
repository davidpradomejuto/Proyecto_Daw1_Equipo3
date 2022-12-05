/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Pascua {

    public static void dia() {
        int a, b, c, d, e, n;
        Scanner teclado = new Scanner(System.in);

        System.out.println("introduce un anio entre 2016 y 2030:");
        int ano = teclado.nextInt();

        a = ano % 19;
        b = ano % 4;
        c = ano % 7;

        d = (19 * a + 24) % 30;
        e = (2 * b + 4 * c + 6 * d + 5) % 7;

        n = 22 + d + e;
        System.out.println("el domingo de dascua de " + ano + " es:");
        if (n <= 31) {
            System.out.printf("%d de Marzo ", n);
        } else {
            System.out.printf("%d de Abril ", n - 31);
        }
    }
}
