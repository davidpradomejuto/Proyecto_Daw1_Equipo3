/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

import java.util.Scanner;

/**
 * @author david
 */
public class Ejercicio9 {
     public static void main(String[] args) {
         
         Scanner teclado = new Scanner(System.in);
        //recogida de variables
        System.out.println("Escribe el numero a: ");
        int a = teclado.nextInt();
        
        System.out.println("Escribe el numero b: ");
        int b = teclado.nextInt();
        
        boolean igual = a == b ? true:false;
        
        System.out.println("el resultado de la comparacion entre a y b es:" + igual);
        
     }
}
