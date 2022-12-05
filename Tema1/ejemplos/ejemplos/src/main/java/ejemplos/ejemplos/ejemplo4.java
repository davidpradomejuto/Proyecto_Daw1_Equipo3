/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.ejemplos;

import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class ejemplo4 {
        public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in);     
            
       int nota1;
       int nota2;
       
       System.out.println("nota1: ");
       nota1=teclado.nextInt();
       
       System.out.println("nota2: ");
       nota2=teclado.nextInt();
       
       System.out.println("la nota media es de : ");
       double media = (float) (nota1+nota2 )/2;
       System.out.print(media);
    }
}
