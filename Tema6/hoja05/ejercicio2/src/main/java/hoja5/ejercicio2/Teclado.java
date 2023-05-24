/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Teclado {
    public static String pedirDni(String mensaje) { // este metodo me sirve para recoger un nombre, tambien lo uso para pedir los apellidos del alumno, hace lo mismo que el del pedir un color
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

                    if (Character.isLetterOrDigit(nombre.charAt(i)) || nombre.charAt(i) == ' ' ) {
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
    public static boolean validarDni(String dni) {
        String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
        boolean result = false;
        try{
        if (dni.length() == 9) {
            
            if (dni.substring(0, 8).matches("[0-9]+")) {
                int resultDivision = Integer.parseInt(dni.substring(0, 8))%23;
                if (dni.substring(8,9).toUpperCase().contentEquals(letrasDni.substring(resultDivision,resultDivision+1))) {
                    result = true;
                }else{
                    throw new Exception("La letra no es correcta");
                }
                
            }else{
                throw new Exception("los primeros 8 caracteres del Dni no son numeros");
            }
            
        }else{
            throw new Exception("El Dni tiene menos de 9 caracteres");
        }
        
        }catch(Exception e){
            System.out.println("Error indeterminado...");
            System.out.println(e.getMessage());
        }
        
        return result;
    }
}
