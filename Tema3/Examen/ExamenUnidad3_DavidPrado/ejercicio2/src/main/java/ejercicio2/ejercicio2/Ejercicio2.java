/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio2.ejercicio2;

import java.util.Scanner;

/**
* David Prado Mejuto, DAW118 Ejercicio 2 del examen de programacion unidad 3
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int total=0;
        do{
            
            Scanner teclado = new Scanner(System.in); //instancio la clase teclado
            
            System.out.println("Introduce total a pagar, -1 para salir: ");
            total = teclado.nextInt(); //pido el precio del producto
            
            if (total !=-1){ //con este IF evito que me hata todo el proceso otra vez al poner -1 por teclado
                
            int descuento = Bola.descuento(); //llamo al metodo estatico descuento que me dara el descuento que tiene ese producto
            
            double importeDescuento = (double)(total*descuento)/100; //calculo el importe que le tengo que descontar al precio del producto
            
            String color = Bola.color(descuento); //llamo al metodo estatico color, que recibe por parametros el % del descuento y me devuelve una String que es el color de la vola
                      
            //genero la Cadena y la muestro por pantalla      
            System.out.printf("Ha salido una bola %s, %d por ciento de descuento: %,.2f Importe con el descuento: %,.2f\n",color,descuento,importeDescuento,(total-importeDescuento));
            
            }
        }while(total !=-1); //si total es distinto se ejecuta lo anterior repetidamente
    }
}
