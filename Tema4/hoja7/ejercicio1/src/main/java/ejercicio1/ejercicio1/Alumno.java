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
    private int[] notas;

    public Alumno(String nombre) {
        Scanner teclado = new Scanner(System.in);

        nombreA = nombre;

        notas = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce la nota numero " + (i+1));
            int nota = teclado.nextInt();
            notas[i] = nota;
        }

    }

    public int mayor() {
        Arrays.sort(notas);
        return notas[notas.length - 1];
    }

    public int menor() {
        Arrays.sort(notas);
        return notas[0];
    }

    public void ponerACero() {
        Arrays.fill(notas, 0);
    }

    public int buscar(int newNota) {
        Arrays.sort(notas);
        return Arrays.binarySearch(notas, newNota);
    }
    
    public int[] tresMejores(){

        Arrays.sort(notas); 
        return Arrays.copyOfRange(notas, notas.length-3,notas.length);
    }
}
