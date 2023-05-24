/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;
import java.util.Scanner;
/**
 *@author david
 */
public class Ejercicio6 {
     public static void main(String[] args) {
         
        int milimetros,centimetros,metros;
        //recogida de variables
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el numero de milimetros: ");
        milimetros = teclado.nextInt();
        
        System.out.println("Escribe el numero de centimetros: ");
        centimetros = teclado.nextInt();
        
        System.out.println("Escribe el numero de metros: ");
        metros = teclado.nextInt();
        //conversion de milimetros y metros a centimetros
        int cmili = (int) milimetros*100;
        int cmetros = (int) centimetros/100;
        //calculo de los centimetros
        int total = cmili+cmetros+centimetros;
        
        System.out.println("El total en centimetros es de : "+total+" centimetros");
     }
}
