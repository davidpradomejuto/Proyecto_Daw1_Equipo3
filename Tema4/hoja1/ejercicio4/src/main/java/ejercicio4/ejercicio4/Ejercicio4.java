/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio4.ejercicio4;
/**
 * @author DAW118
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        int lista[] = {1,2,3,4,5,6,7,8,9,10};
        int[] listainv = new int[10];
        
        for (int i = lista.length-1, x = 0; i>=0; i--,x++) {
            listainv[x] = lista[i];
        }
        
        for (int i = 0; i < lista.length; i++) { //mostrar el array
            System.out.print(lista[i]+",");  
        }
        System.out.println("");
        
        for (int i = 0; i < lista.length; i++) { //mostrar el array
            System.out.print(listainv[i]+",");  
        }
    }
}