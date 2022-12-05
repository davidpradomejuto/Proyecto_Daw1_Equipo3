/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Vectores {

    private int[] array ;

    public Vectores() {
        array = new int[5];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el numero " + i + ": ");
            array[i] = teclado.nextInt();
        }
    }
    public int Menor() {
        int menor = array[0];
        for (int i = array.length - 1; i > 0; i--) {
            if ( array[i]<=menor) {
                menor = array[i];
            }
        }
        return menor;
    }

    public int Mayor() {
        int mayor = array[0];
        for (int i = 0; i < array.length; i++) {
            
            if (array[i] >= mayor) {
                mayor = array[i];
            }
            System.out.println(array[i]);
        }
        return mayor;
    }

    public double Media() {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        double media = suma / 5;
        return media;
    }

    public int[] getArray() {
        return array;
    }
    
    
}
