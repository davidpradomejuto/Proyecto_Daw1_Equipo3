/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Alumno {
    private String nombre ;
    private int[] notas;

    public Alumno( String newNombre) {
        notas = new int[5];
        nombre = newNombre;

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduce la nota " + i + ": ");
            notas[i] = teclado.nextInt();
        }
    } 
    
    public int mayor(){
        int mayor = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]>=mayor)
                mayor=notas[i];
        }
        return mayor;
    }
    
    public int menor(){
         int menor = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]<=menor)
                menor=notas[i];
        }
        return menor;
    }
    
     public String mostrar(){
        String cadena ="";
            cadena = nombre.toUpperCase();
            int suma =0;
            for (int i = 0; i < notas.length; i++) {
             suma+=notas[i];
         }
            int media = suma/5;
            cadena=cadena.concat(" Su nota media es: "+String.valueOf(media));   
        
        return cadena;
    }
    
}
