/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio1.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int opcion = 0;
        int matriz[][] = {{101, 102, 103, 104, 105},
        {201, 202, 203, 204, 205},
        {301, 302, 303, 304, 305},
        {401, 402, 403, 404, 405},
        {501, 502, 503, 504, 505}};

        do {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Que opcion quieres elegir?");
            System.out.print("1.-muestra elementos de una fila.\n"
                    + "2.-  muestra los elementos de una columna.\n"
                    + "3.- Mostrar los elementos de la diagonal\n"
                    + "4.- Mostrar los elementos de la diagonal inversa\n"
                    + "5.- Mostrar los elementos de la diagonal hacia arriba\n"
                    + "6.- Salir\n");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> {

                    System.out.println("Que fila quieres elegir?");
                    int fila = teclado.nextInt()-1;
                    if (matriz.length > fila) {
                        
                        for (int i = 0; i < matriz[fila].length; i++) {
                            System.out.print(matriz[fila][i] + ",");

                            System.out.println("");

                        }
                        
                    }
                }

                case 2 -> {
                    System.out.println("Que columna quieres elegir?");
                    int columna = teclado.nextInt()-1;

                    if (matriz[0].length >= columna) {
                        for (int i = 0; i < matriz.length; i++) {
                            System.out.print(matriz[i][columna] + ",");
                        }
                        System.out.println("");
                    }

                }
                case 3 -> {
                    for (int i = 0; i < matriz.length; ++i) {
                        System.out.println(matriz[i][i]);
                    }
                }
                case 4 -> {
                    for (int i = 0, x = matriz.length - 1; i < matriz.length; ++i, x--) {
                        System.out.println(matriz[i][x]);
                    }
                }
                case 5 -> {
                    for (int i = matriz.length - 1; 0 <= i; --i) {
                        System.out.println(matriz[i][i]);
                    }
                }
                case 6 -> {
                    System.out.println("Fin del programa");
                }
                default -> {
                    System.out.println("opcion no valida");
                }
            }
        } while (opcion != 6);

    }
}
