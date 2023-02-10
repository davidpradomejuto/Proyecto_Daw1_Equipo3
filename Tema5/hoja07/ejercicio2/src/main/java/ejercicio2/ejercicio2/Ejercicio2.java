/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio2.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        boolean valido = false;
        int x = 0, i = 0;
        
        while (!valido) { // mientras valido sea distinto de true
            try {

                System.out.println("Introduce el numero X entero");
                x = new Scanner(System.in).nextInt();
                valido = true;

            } catch (InputMismatchException ime) {

                System.out.println("El dato tiene que ser entero");

            } catch (Exception e) {
                System.out.println("Error indeterminado");

            }

        }
        
        valido = false;//reseteo la variable valido a false para volverla a usar
        
        while (!valido) { // mientras valido sea distinto de true
            try {

                System.out.println("Introduce el segundo numero entero");
                i = new Scanner(System.in).nextInt();
                valido = true;

            } catch (InputMismatchException ime) {

                System.out.println("El dato tiene que ser entero");

            } catch (Exception e) {
                System.out.println("Error indeterminado");

            }
        }

        try {

            double result = x / i;
            System.out.println("Resultado " + result);

        } catch (ArithmeticException AE) {
            System.out.println("Has intentado dividir entre 0");
        } catch (Exception e) {
            System.out.println("Error indeterminado");
        }
    }
}
