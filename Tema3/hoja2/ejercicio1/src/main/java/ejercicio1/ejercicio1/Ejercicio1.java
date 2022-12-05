/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio1.ejercicio1;

import java.util.Scanner;

/**
 * @author david
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el numero del dia de la semana: ");
        int dia = teclado.nextInt();
        
        String texto;
        texto = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 ->  "Sabado";
            case 7 -> "Domingo";
            default -> "?";
        };
        System.out.println("el dia seleccionado es: "+texto);
    }
}
