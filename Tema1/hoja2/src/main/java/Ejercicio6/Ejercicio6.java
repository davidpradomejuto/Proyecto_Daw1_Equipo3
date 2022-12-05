/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;
import static java.lang.Math.PI;
import java.util.Scanner;
import java.util.Math;
/**
 *
 * @author david
 */
public class Ejercicio6 {
     public static void main(String[] args) {
    
    float altura;
    float radio;

    Scanner teclado = new Scanner(System.in);   
    
    System.out.println("Introduce la altura: ");
     altura = teclado.nextFloat();
     
     System.out.println("Introduce el radio: ");
     radio = teclado.nextFloat();  
     
     System.out.printf("a. Su area lateral es igual a:   %.3f\n",2*PI*radio*altura);  
     System.out.printf("a. Su volumen es igual a:   %.3f\n",PI*Math.pow(radio,2)*altura);   
     }
}
