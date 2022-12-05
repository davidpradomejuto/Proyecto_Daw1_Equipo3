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
        Scanner teclado = new Scanner(System.in);

        int[] lista = new int[10];

        for (int i = 1; i < 10; i++) {
            lista[i] = i; //añado la lista del 1 al 10
        }

        System.out.println("Introduce el valor que quieres buscar: ");
        int x = teclado.nextInt();
        
        boolean encontrado = false;
        
        for (int i = 0; i < 10; i++) {

            if (lista[i] == x) { //si el numero pedido esta en el array se ejecuta
                System.out.println("Numero encontrado, se encuentra en la posicion " + i);
                encontrado = true;
            }

        }
        if (!encontrado) { //si no se ha encontrado se ejecuta
            System.out.println("Numero no encontrado");
        }
    }
}
