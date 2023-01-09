/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author daw128
 */
public class Alumno {
    private String nombreA;
    private int[] matriz;
    
    public Alumno( String nombre){
        Scanner teclado = new Scanner(System.in);
        
        nombreA=nombre;
        
        matriz = new int[5];
        for (int i = 0; i <= 5; i++) {
          System.out.println("Introduce la nota numero 1"+i);
          int nota = teclado.nextInt();
          matriz[i]=nota;
        }
        
    }
    
    public int mayor (){
        Arrays.sort(matriz);
    }
}
