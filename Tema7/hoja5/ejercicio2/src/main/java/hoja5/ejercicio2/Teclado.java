/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Teclado {

    public static String pedirVocal(String mensaje) {
        String regex = "[aeiou]+";
        boolean valido = false;
        String nombre;

        do {

            System.out.print(mensaje);
            nombre = new Scanner(System.in).nextLine();
            if (nombre.matches(regex)) {
                valido = true;
            } else {
                System.out.println("Error. La cadena no cumple los requisitos");
            }

        } while (!valido);

        return nombre;
    }
}
