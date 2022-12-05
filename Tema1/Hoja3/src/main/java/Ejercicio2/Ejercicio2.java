/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;
import java.util.Scanner;
/**
 *
 * @author david
 */
public class Ejercicio2 {
    public static void main(String[] args) {
      int divisor;
      int suma;
      int resto;

      Scanner teclado = new Scanner(System.in);
      System.out.println("Escribe un numero entero: ");
      divisor = teclado.nextInt();
      
      resto = divisor % 7;
      suma = 7 - resto;
      
      System.out.println("para que sea multiplo de 7 hay  que sumar: " + suma); 
    }
}
