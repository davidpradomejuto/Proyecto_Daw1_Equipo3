/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5.ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class parte2 {

    public static void main(String[] args) {
        double result = Division();
        System.out.println("El resultado de la division es : " + result);
    }

    public static double Division() {
        double result = 0;
        boolean valido = false;

        System.out.println("Introduce el dividendo: ");
        double dividendo = introDouble();
        System.out.println("Introduce el divisor: ");
        double divisor = introDouble();

        while (!valido) {
            try {
                result = dividendo / divisor;
                valido = true;

            } catch (ArithmeticException e) {
                System.out.println("Error Has divido entre 0");
            } catch (Exception e) {
                System.out.println("Error Indeterminado");
            }
        }
        return result;

    }

    public static double introDouble() {
        double result = 0;
        boolean valido = false;
        while (!valido) {
            try {
                double numero = new Scanner(System.in).nextDouble();
                result = numero;
                valido = true;
            } catch (InputMismatchException ime) {
                System.out.println("El dato tiene que ser un entero");
            } catch (Exception e) {
                System.out.println("error indeterminado");
            }

        }
        return result;
    }

}
