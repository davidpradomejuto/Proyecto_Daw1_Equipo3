/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;
import java.util.Scanner;
/**
 *
 * @author david
 */
public class Ejercicio3 {
    public static void main(String[] args) {
      int divisor;
      int multiplo;
      int suma;
      int resto;

      Scanner teclado = new Scanner(System.in);
      System.out.println("Escribe un numero entero: ");
      divisor = teclado.nextInt();
      
      System.out.println("Escribe el multiplo que quieras comprobar : ");
      multiplo = teclado.nextInt();
   
      resto = divisor % multiplo;
      suma = multiplo - resto;
      
      System.out.println("para que sea multiplo de "+multiplo+" hay  que sumar: " + suma); 
    }
}
