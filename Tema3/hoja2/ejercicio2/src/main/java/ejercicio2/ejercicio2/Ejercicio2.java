/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero del dia de la semana: ");
        int dia = teclado.nextInt();
        String texto;
        texto = switch (dia) {
            case 1,8,15,22,29 -> "Lunes";
            case 2,9,16,23,30 -> "Martes";
            case 3,10,17,24,31 -> "Miercoles";
            case 4,11,18,25 -> "Jueves";
            case 5,12,19,26 -> "Viernes";
            case 6,13,20,27 -> "Sabado";
            case 7,14,21,28 ->"Domingo";          
            default ->
                "?";
        };
        System.out.println("el dia seleccionado es: " + texto);
    }

}


