/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio3.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Pais francia = new Pais();
        int opcion = 0;

        do {
            System.out.println("Que quieres hacer?\n"
                + "1. Añadir una ciudad\n"
                + "2. Devolver ciudad con mas habitantes\n"
                + "3. Ciudad existe?\n"
                + "4. Media de habitantes\n"
                + "5. to String\n"
                + "6. Salir del programa\n");
            
         System.out.println("Introduce tu opcion : ");
        Scanner Teclado = new Scanner(System.in);
        opcion = Teclado.nextInt();
            switch (opcion) {
                case 1 -> {
                    francia.addCiudad();
                }
                case 2 -> {
                    System.out.println("La ciudad mas habitada es: "+ francia.ciudadMasHabitada());
                }
                case 3 -> {
                    System.out.println("Introduce el nombre de la ciudad que quiera buscar");
                    String ciudadBuscada = new Scanner(System.in).nextLine();
                    francia.ciudadExiste(ciudadBuscada);
                }
                case 4 -> {
                    System.out.println("la media de habitantes en el pais por ciudad es de "+francia.mediaHabitantes()+" habitantes");
                }
                case 5 -> {
                    System.out.println(francia.toString());
                }
                case 6 -> {
                    System.out.println("Saliendo del programa. ADIOS!!!");
                }
                default -> {
                    System.out.println("Opcion no valida");
                }
            }
        } while (opcion != 6);
    }
}
