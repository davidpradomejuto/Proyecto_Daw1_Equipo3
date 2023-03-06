/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio2.ejercicio2;

import static ejercicio2.ejercicio2.Teclado.*;

/**
 *
 * @author david
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        boolean negativo = false;
        Integer[] elementos= new Integer[0];
        Contenedor pila = new Contenedor(elementos);
       
         
        do{
            Integer numero = pedirIntPositivo();
            if(numero != -1){
                apilar(numero);
            }else{
                negativo = true;
            }
        }while(!negativo);
        
        System.out.println("muestro los numeros. ");
        
        System.out.println("vacio la pila. ");
    }
}
