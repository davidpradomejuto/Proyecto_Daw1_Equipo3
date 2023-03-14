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
        Contenedor<Integer> pila = new Contenedor<>(new Integer[0]);
       
         
        do{
            Integer numero = pedirIntPositivo();
            if(numero != -1){
               pila.apilar(numero);
            }else{
                negativo = true;
            }
        }while(!negativo);
        
        System.out.println("muestro los numeros. ");
        
        System.out.println(pila.toString());
        System.out.println("Ordeno los numeros");
        pila.ordenar();
        System.out.println(pila.toString());
        System.out.println("desapilo un dato de la pila. ");
        pila.desapilar();
        System.out.println("muestro los numeros. ");
        
        System.out.println(pila.toString());
        
    }
}
