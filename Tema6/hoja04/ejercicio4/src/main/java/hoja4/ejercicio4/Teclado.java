/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Teclado {
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
    
    public static String pedirNombre(String mensaje) { // este metodo me sirve para recoger un nombre, tambien lo uso para pedir los apellidos del alumno, hace lo mismo que el del pedir un color
        // pero recibiendo la frase que va a mostrar por pantalla mediante parametros

        int contCaracteres;
        boolean exitFor;
        String nombre;

        do {

            contCaracteres = 0;
            exitFor = false;

            System.out.print(mensaje);
            nombre = new Scanner(System.in).nextLine();

            for (int i = 0; i < nombre.length() && !exitFor; i++) {

                try {

                    if (Character.isLetter(nombre.charAt(i)) || nombre.charAt(i) == ' ') {
                        contCaracteres++;
                    } else {
                        exitFor = true;
                        throw new Exception("El nombre '" + nombre + "' no es válido. Caracteres válidos: letras y espacio. Vuelve a intentarlo.");
                    }

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }

        } while (contCaracteres != nombre.length());

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
}
