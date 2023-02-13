/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Alumno {

    private String nombre;
    private int[] notas;

    public Alumno(int numeroNotas) {

        notas = new int[numeroNotas];

        System.out.println("Introduce el nombre del alumno: ");
        nombre = new Scanner(System.in).nextLine();

        for (int i = 0; i < notas.length; i++) {
            boolean valido = false;
            while (!valido) {
                try {
                    System.out.println("Introduce la nota " + (i + 1) + " :");
                    int nota = new Scanner(System.in).nextInt();

                    if (nota >= 0 || nota <= 10) {
                        notas[i] = nota;
                        valido = true;
                    } else {
                        throw new Exception("El numero no esta entre 0 y 10");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Error No es un numero");
                } catch (Exception e) {
                    System.out.println("Error Indeterminado");
                }
            }

            valido = false;
        }

    }
    
    public void mostrar(){
        System.out.println("Datos del alumno: ");
        System.out.print("Notas :");
        for (int i = 0; i < notas.length; i++) {
            if(i==notas.length-1){
                 System.out.print(notas[i]);
            }else{
            System.out.print(notas[i]+" , ");
            }
           }
    }
    
}
