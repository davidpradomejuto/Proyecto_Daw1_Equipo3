/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author daw128
 */
public class Alumno {

    private String nombreA;
    private int[] matriz;

    public Alumno(String nombre) {
        Scanner teclado = new Scanner(System.in);

        nombreA = nombre;

        matriz = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce la nota numero " + (i+1));
            int nota = teclado.nextInt();
            matriz[i] = nota;
        }

    }

    public int mayor() {
        Arrays.sort(matriz);
        return matriz[matriz.length - 1];
    }

    public int menor() {
        Arrays.sort(matriz);
        return matriz[0];
    }

    public void ponerACero() {
        Arrays.fill(matriz, 0);
    }

    public int buscar(int newNota) {
        Arrays.sort(matriz);
        return Arrays.binarySearch(matriz, newNota);
    }
    
    public int[] tresMejores(){
        int[] result = new int[3];
        Arrays.sort(matriz);
        
        for (int i = matriz.length ,x=0; i > matriz.length-3; i--,x++) {
            result[x] = matriz[i];
        }
        
        return result;
    }
}
