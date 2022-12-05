/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio10 {
    public static void main(String[] args) {
         
         Scanner teclado = new Scanner(System.in);
        //recogida de variables
        System.out.println("Escribe la longitud del lanzamiento en metros :");
        float metros = teclado.nextFloat();
        
        //convirtiendo a centimetros
        float centimetrosfloat = (float)metros*100;
        int centimetrosint = (int)centimetrosfloat;
        
        System.out.println("La longitud del lanzamiento en centimetros es de: "+centimetrosint+" centimetros");
    }
}
