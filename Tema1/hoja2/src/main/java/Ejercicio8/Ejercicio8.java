/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

import java.util.Scanner;
import java.util.Math;
/**
 *
 * @author DAW118
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float radio;
        
        System.out.println("Introduce el radio: ");
        radio = teclado.nextFloat();
        
        float longitud = (float) (2*Math.PI*radio);
        float area = (float) (Math.PI*Math.pow(radio,2));
        
        System.out.println("el area es: "+longitud);
        System.out.println("la longitud es: "+area);
        
    }
}
