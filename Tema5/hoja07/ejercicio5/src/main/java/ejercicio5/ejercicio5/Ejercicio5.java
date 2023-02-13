/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio5.ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        boolean valido = false;
        double dividendo=0;
        double divisor=0;
        while (!valido) {
            try {
                System.out.println("Introduce el dividendo: ");
                dividendo = new Scanner(System.in).nextDouble();
                System.out.println("Introduce el divisor: ");
                divisor = new Scanner(System.in).nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error No es un numero");
                ;
            } catch (Exception e) {
                System.out.println("Error Indeterminado");
            }

            try {
                double resultado = division(dividendo, divisor);
                //ejecuto la clase estatica
                System.out.println("El resultado de la Division es " + resultado);
                valido = true;
            } catch (ArithmeticException e) {
                System.out.println("Error Has divido entre 0");
        }
    }
    //creo el metodo y le indico que mande las excepciones a la clase superior

    public static double division(double dividendo, double divisor) throws ArithmeticException {
        return dividendo / divisor;
    }
}
