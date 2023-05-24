/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio1 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in); 
    
    float base;
    System.out.println("Introduce la base imponible: ");
    base=teclado.nextFloat();
    
    int iva;
    System.out.println("Introduce el IVA: ");
    iva=teclado.nextInt();
    
    float importeiva = (float)(base*iva)/100;
    
    System.out.printf("El importe del iva es el siguiente: %,.2f%s\n ",importeiva,"€");
    System.out.println("El importe total es el siguiente: "+(importeiva+base));
    }
}
