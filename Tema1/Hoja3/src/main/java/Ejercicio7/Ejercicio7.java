/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;
import java.util.Scanner;
/**
 * @author david
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        int hormigas,aranas,cochinillas;
        //recogida de variables
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el numero de hormigas: ");
        hormigas = teclado.nextInt();
        
        System.out.println("Escribe el numero de aranas: ");
        aranas = teclado.nextInt();
        
        System.out.println("Escribe el numero de cochinillas: ");
        cochinillas = teclado.nextInt();
        
        //calculo de patas
        int patashormigas = hormigas*6;
        int patasaranas = aranas*8;
        int patascochinillas = cochinillas*14;
        
        //calculo total de patas
        int total = patashormigas+patasaranas+patascochinillas;
        //muestro el numero total de patas
        System.out.println("El numero total de patas es de: "+total+" patas.");  
    }
}
