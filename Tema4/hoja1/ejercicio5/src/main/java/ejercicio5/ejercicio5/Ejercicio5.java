/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio5.ejercicio5;

/**
 *
 * @author DAW118
 */
public class Ejercicio5 {

    public static void main(String[] args) {
         int lista[] = {2,7,3,4,5,6,7,8,9,10};
        
        for (int i = 0, x = lista.length-1; i < lista.length/2; i++,x--) {       
            int aux = lista[i];
            
            lista[i]=lista[x]; //el que esta en la posicion i pasa a la posicion contraria. (0/9,2/8,3/7)
            lista[x]=aux;               
        }
        
        
        
        for (int i = 0; i < lista.length; i++) { //muestro el array
            System.out.print(lista[i]+",");  
        }
        
        
    }
}
    

