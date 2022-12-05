/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio2.ejercicio2;

/**
 *
 * @author david
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Baraja a = new Baraja();
        Baraja b = new Baraja();
        System.out.println(a.mostrar());
         System.out.println(b.mostrar());
         
         if( a.getNumero() == b.getNumero()){
             System.out.println("las dos cartas son iguales");
         }else if (a.getNumero() > b.getNumero()){
        System.out.println("la carta A es mayor a la B");
        }else{System.out.println("la carta B es mayor a la A");}

        
    }
}
