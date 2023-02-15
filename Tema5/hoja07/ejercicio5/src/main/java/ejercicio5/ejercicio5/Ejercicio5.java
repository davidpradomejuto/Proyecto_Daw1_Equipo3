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
        double dividendo = 0;
        double divisor = 0;

            try {
                System.out.print("dividendo ");
                dividendo = pedirDouble();
                System.out.print("divisor ");
                divisor = pedirDouble();

                double resultado = division(dividendo, divisor);
                //ejecuto la clase estatica
                System.out.println("El resultado de la Division es " + resultado);
               
            } catch (ArithmeticException ae) {
                System.out.println("Error Has divido entre 0");
                System.out.println(ae.getMessage());
            } catch (Exception e) {
                System.out.println("Error Indeterminado");
                System.out.println(e.getMessage());
            }

    }

    public static double division(double dividendo, double divisor) throws ArithmeticException {
        return dividendo / divisor;
    }

    public static double pedirDouble() {
        boolean valido = false;
        double n = 0;
        
        while (!valido) {
            try {
                System.out.println("Introduce el Numero: ");
                n = new Scanner(System.in).nextDouble();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error No es un numero");
            } catch (Exception e) {
                System.out.println("Error Indeterminado");
            }
        }
        
        return n;
    }
    
    public static double pedirInt() {
        boolean valido = false;
        int n = 0;
        
        while (!valido) {
            try {
                System.out.println("Introduce el Numero: ");
                n = new Scanner(System.in).nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error No es un numero");
            } catch (Exception e) {
                System.out.println("Error Indeterminado");
            }
        }
        
        return n;
    }
}
