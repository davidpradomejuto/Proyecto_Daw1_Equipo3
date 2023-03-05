/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.ejercicioejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Teclado {
    
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

    public static int pedirIntPositivo() {
        boolean valido = false;
        int n = 0;

        while (!valido) {
            try {
                System.out.println("Introduce el Numero: ");
                n = new Scanner(System.in).nextInt();
                if (n > 0) {
                    valido = true;
                    
                }else{
                    System.out.println("Has introducido un numero negativo,repite");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error No es un numero");
            } catch (Exception e) {
                System.out.println("Error Indeterminado");
            }
        }

        return n;
    }

    public static String pedirNombre() {
        boolean nombrevalido = false;
        String nombre = "";
        while (!nombrevalido) {
            try {
                System.out.println("Introduce el nombre: ");
                nombre = new Scanner(System.in).nextLine();
                if (nombre.matches("[A-Z][a-z]*\\s*")) {

                } else {
                    throw new Exception("Error el nombre contiene algun caracter no valido");
                }
                nombrevalido = true;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        return nombre;
    }
    public static String pedirEntero() {
        boolean nombrevalido = false;
        String nombre = "";
        while (!nombrevalido) {
            try {
                System.out.println("Introduce el Numero entero: ");
                nombre = new Scanner(System.in).nextLine();
                if (nombre.matches("[0-9]+.*")) {

                } else {
                    throw new Exception("Error el nombre contiene algun caracter no valido");
                }
                nombrevalido = true;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        return nombre;
    }
}
