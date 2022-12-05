/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio5;
import java.util.Scanner;
import java.util.Math;

/**
 *
 * @author DAW118
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        
    int n1;
    int n2;    
    Scanner teclado = new Scanner(System.in);     
    
    
     System.out.println("Introduce el primer numero: ");
     n1=teclado.nextInt();
      System.out.println("Introduce el segundo  numero: ");
     n2=teclado.nextInt();
     
     System.out.println("x = "+ n1+" y = "+n2);
     System.out.println("x + y = "+n1+n2);
     System.out.println("x - y = "+(n1-n2));
     System.out.println("x * y = "+n1*n2);
     System.out.println("x / y = "+n1/n2);
     System.out.println("x ^ 2 = "+Math.pow(n1,2));    
     System.out.println("√ x = "+ Math.sqrt(n1));
    }
}
