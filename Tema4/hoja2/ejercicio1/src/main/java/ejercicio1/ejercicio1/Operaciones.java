/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

import java.util.Scanner;

/**
 * @author david
 */
public class Operaciones {

    private final int[] lista = new int[5];

    public Operaciones() {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el numero " + i + ": ");
            lista[i] = teclado.nextInt();
        }
    }

    public void multiplicar() {
        for (int i = 0; i < lista.length; i++) { //multiplicar el array por 2
            lista[i] = lista[i] * 2;
        }
    }

    public void mostrar() {
        System.out.println("El array actualmente tiene estos elementos: ");
        for (int i = 0; i < lista.length; i++) { //multiplicar el array por 2
            System.out.print(lista[i] + ",");
        }
    }

    public int sumaDePares() {
        int suma = 0;
        for (int i = 0; i < lista.length; i++) { //multiplicar el array por 2
            if (i == 0 || i % 2 == 0) {
                suma += lista[i];
            }
        }
        return suma;
    }
}
