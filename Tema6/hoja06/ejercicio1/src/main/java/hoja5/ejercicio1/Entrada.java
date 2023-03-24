/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Entrada {

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

    public static int pedirCapitulo(String frase) { // este metodo recibe una String que va a ser la frase que pida el numero entero y mira que sea un numero entero lo que recibe la
        //clase scanner, si no lo es, da un error y lo repite
        boolean valido = false;
        int n = 0;

        while (!valido) {
            try {
                System.out.println(frase); // aqui muestro por pantalla la frase que me ha venido por parametros
                n = new Scanner(System.in).nextInt();
                if (n >= 0 && n <= 30) { // si es positivo salgo del bucle, si es negativo doy un error

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

    public static Tematica pedirTematica(String mensaje) { // este metodo me sirve para recoger un nombre, tambien lo uso para pedir los apellidos del alumno, hace lo mismo que el del pedir un color
        // pero recibiendo la frase que va a mostrar por pantalla mediante parametros
        Tematica tematica = null;
        boolean valido = false;
        int n = 0;
        int opcion = 0;

        while (!valido) {
            try {
                System.out.println("Elige la tematica.\n1. Aventura\n2. Comedia\n3. Infantil\n4. Policial");
                System.out.println(mensaje); // aqui muestro por pantalla la frase que me ha venido por parametros
                opcion = new Scanner(System.in).nextInt();
                switch (opcion) {
                    case 1 -> {
                        tematica = Tematica.Aventura;
                        valido = true;
                    }
                    case 2 -> {
                        tematica = Tematica.Comedia;
                        valido = true;
                    }
                    case 3 -> {
                        tematica = Tematica.Infantil;
                        valido = true;
                    }
                    case 4 -> {
                        tematica = Tematica.Policial;
                        valido = true;
                    }
                    default -> {
                        System.out.println("Error: elige una opcion");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Error No es un numero");
            } catch (Exception e) {
                System.out.println("Error Indeterminado");
            }
        }

        return tematica;
    }

    public static String pedirNombreRegex(String mensaje) { // este metodo me sirve para recoger un nombre, tambien lo uso para pedir los apellidos del alumno, hace lo mismo que el del pedir un color
        // pero recibiendo la frase que va a mostrar por pantalla mediante parametros

        String regex = "[A-Za-zéáíóúñ ]*";
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

    public static boolean pedirBooleanRegex(String mensaje) { // este metodo me sirve para recoger un nombre, tambien lo uso para pedir los apellidos del alumno, hace lo mismo que el del pedir un color
        // pero recibiendo la frase que va a mostrar por pantalla mediante parametros
        boolean result = false;
        String regex = "^(?:Si|No)";
        boolean valido = false;
        String nombre;

        do {

            System.out.print(mensaje);
            nombre = new Scanner(System.in).nextLine();
            if (nombre.matches(regex)) {
                if (nombre.equalsIgnoreCase("si")) {
                    result = true;
                    valido = true;
                } else {
                    result = false;
                    valido = true;
                }
            } else {
                System.out.println("Error. La cadena no cumple los requisitos");
            }

        } while (!valido);

        return result;
    }

}
