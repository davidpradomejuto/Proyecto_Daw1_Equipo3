/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;
import java.util.Scanner;
/**
 *
 * @author david
 */
public class Ejercicio4 {
   public static void main(String[] args) {
     
    float altura;
    float base;
    float area;
    Scanner teclado = new Scanner(System.in);   
    
    System.out.println("Introduce la altura: ");
     altura=teclado.nextFloat();
     
     System.out.println("Introduce la base: ");
     base=teclado.nextFloat();
     
     area = (base*altura)/2;
     
     System.out.printf("el area del triangulo es: %.2f",area);
     
}
}
