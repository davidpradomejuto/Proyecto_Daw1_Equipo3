/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5.ejercicio5;

/**
 *
 * @author DAW118
 */
public class Mayor {
    public static void Mayor(){
        int actual;
        int mayor =0;     
        int menor =100; 
        
        for (int i = 0; i < 10; i++) {
            actual =  (int) Math.floor(Math.random() * 100) + 1; //genero un numero entre 1 y 100
            
            if (actual>mayor){ //compara si el numero actual es mayor al nuevo
                mayor = actual;
            }
            
            if (actual<menor){ //compara si el numero actual es mayor al nuevo
                menor = actual;
            }
            
            System.out.println("el numero sacado es "+actual);
        }
        
        System.out.println("el mayor de todos ha sido "+mayor);
        System.out.println("el menor de todos ha sido "+menor);
    }
}
