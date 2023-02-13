/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio1.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Alumno[] matriz = new Alumno[4];
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = new Alumno(3);
        }
        
        try {
            System.out.println("Introduce el numero de jugador 1 - 4 que quieres ver: ");
            int n = new Scanner(System.in).nextInt();
            
        }catch(){}
        
    }
}
