/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio4.ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        boolean valido = false;
        int contador = 1;
        while (!valido) {

            try {
                System.out.println("Introduce un numero entre 0 y 100");
                int numero = new Scanner(System.in).nextInt();

                if (numero >= 0 && numero <= 100) {
                    System.out.println("!!!!!!!!El numero es valido!!!!!!!");
                    System.out.println("Has usado "+contador+" intentos");
                    valido = true;
                } else {
                    throw new Exception("El numero no esta entre 0 y 100");
                }
            } catch (InputMismatchException ime) {

               System.out.println("El dato tiene que ser entero");

            } catch (Exception e) {
                
                System.out.println(e.getMessage());
                

            }
            contador++;
            
        }
    }
}
