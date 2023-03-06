/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Teclado {

    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */

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

    public static int pedirInt() {
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
    
    public static int pedirIntPositivo() {
        boolean valido = false;
        int n = 0;

        while (!valido) {
            try {
                System.out.println("Introduce el Numero: ");
                n = new Scanner(System.in).nextInt();
                if(n>=-1){
                valido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error No es un numero");
            } catch (Exception e) {
                System.out.println("Error Indeterminado");
            }
        }

        return n;
    }

    public static String pedirNombre(String nombre) {
        boolean nombrevalido = false;

        while (!nombrevalido) {
            try {
                System.out.println("Introduce el nombre del alumno: ");
                nombre = new Scanner(System.in).nextLine();
                if (nombre.matches("[a-zA-Z]+.*\\s.*")) {

                } else {
                    throw new Exception(" Error el nombre contiene algun caracter no valido");
                }
                nombrevalido = true;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        return nombre;
    }

}
