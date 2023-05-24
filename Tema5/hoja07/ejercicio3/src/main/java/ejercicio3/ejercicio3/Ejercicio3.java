/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio3.ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        boolean valido = false;
        while (!valido) {

            try {
                System.out.println("Introduce un numero entre 0 y 100");
                int numero = new Scanner(System.in).nextInt();

                if (numero >= 0 && numero <= 100) {
                    System.out.println("El numero es valido");
                    valido = true;
                } else {
                    throw new Exception("El numero no esta entre 0 y 100");
                }
            } catch (InputMismatchException ime) {

                System.out.println("El dato tiene que ser entero");

            } catch (Exception e) {
                System.out.println("El rango no es valido");
                System.out.println(e.getMessage());

            }

        }
    }
}
