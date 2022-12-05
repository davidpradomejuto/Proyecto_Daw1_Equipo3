/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println(" • método1: método que presenta por pantalla una cuenta atrás empezando por 10\n"
                + "• método2: método que pide 10 números enteros y muestra cuantos de\n"
                + "\tellos son negativos, cuantos positivos y cuantos nulos.\n"
                + "• método3: método que pide por teclado un número y nos calcula el factorial\n"
                + "• método4: método que nos pide una serie de caracteres por teclado. La serie finaliza al\n"
                + "\tteclear el carácter ‘.’. Al final nos dirá cuántos caracteres hemos tecleado.\n"
                + "• método5: método que nos calcula la media de un conjunto de números positivos\n"
                + "usuario termina de introducir los datos cuando el número es negativo\n" + "• método 6 : salir del menu\n\n\n");
        
        System.out.println("Existen 5 metodos, introduce el numero del metodo que quieras:");
        int opcion = teclado.nextInt();

        do {
            switch (opcion) {
                case 1 -> { Calculo.metodo1(); }
                case 2 ->{ Calculo.metodo2(); }
                case 3 -> { Calculo.metodo3();}
                case 4 -> { Calculo.metodo4(); }
                case 5 -> { Calculo.metodo5(); }
                case 6 -> { System.out.println("fin del programa"); }
                default -> { System.out.println("Opcion no valida"); }

            }
        } while (opcion != 6);
    }
}
