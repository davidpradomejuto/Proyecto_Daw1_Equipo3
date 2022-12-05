/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio3;

/**
 *
 * @author DAW118 Ejercicio3.java Programa que muestra el uso de los operadores
 * aritméticos
 */
public class Ejercico3 {

    public static void main(String[] args) { //faltaba abrir las llaves y poner el void
    short x = 7;
    int y = 5;
    float f1 = 13.5f; //faltaba la f al final del numero
    float f2 = 8f;

    System.out.println ("El valor de x es "+x+ " y el valor de y es "+y); //he sustituido las comas por el +
    
    System.out.println ("El resultado de x + y es " + (x + y)); //falta el ;        
    System.out.println("El resultado de x - y es " + (x - y));
    System.out.println ("División entera:  x / y = "+ (x / y )); //cambiar el prinf por println
    System.out.println ("Resto de la división entera:  x % y  =  " + (x % y));
    System.out.printf("El valor de f1 es %.2f y el de f2 es %.2f\n",f2,f1);//cambiar el prinf por println     
    System.out.println ("El resultado de f1 / f2 es " + (f1 / f2)); //falta el ;    
}
}