/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Teclado {
    
    public static String pedirNombreRegex(String mensaje) { // este metodo me sirve para recoger un nombre, tambien lo uso para pedir los apellidos del alumno, hace lo mismo que el del pedir un color
        // pero recibiendo la frase que va a mostrar por pantalla mediante parametros

        String regex = "[A-ZÉÁÍÓÚÑ][a-zéáíóúñ ]*";
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

    
     public static int pedirIntPositivo(String frase) { // este metodo recibe una String que va a ser la frase que pida el numero entero y mira que sea un numero entero lo que recibe la
        //clase scanner, si no lo es, da un error y lo repite
        boolean valido = false;
        int n = 0;

        while (!valido) {
            try {
                System.out.println(frase); // aqui muestro por pantalla la frase que me ha venido por parametros
                n = new Scanner(System.in).nextInt();
                if (n >= 0) { // si es positivo salgo del bucle, si es negativo doy un error
                    valido = true;

                } else {
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
     
     public static String pedirCCC(){
         String mensaje = "Introduce la CCC (separa cada bloque con espacios)";
         String regex = "[0-9 ]*";
        boolean valido = false;
        String ccc;

        do {
            System.out.print(mensaje);
            ccc = new Scanner(System.in).nextLine();
            if (ccc.matches(regex)) {
                valido = true;
            } else {
                System.out.println("Error. La cadena no cumple los requisitos");
            }

        } while (!valido);

        return ccc;
     }
     
     public static double pedirNumeroDecimal() {
        Scanner sc = new Scanner(System.in);
        double num = 0.0;
        boolean entradaValida = false;
        
        while (!entradaValida) {
            System.out.print("Introduce un número decimal: ");
            try {
                num = Double.parseDouble(sc.nextLine());
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: el valor introducido no es un número decimal válido.");
            }
        }
        
        return num;
    }
     
    public static double pedirDouble(String frase) {
        boolean valido = false;
        double n = 0;

        while (!valido) {
            try {
                System.out.println(frase);
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

}
