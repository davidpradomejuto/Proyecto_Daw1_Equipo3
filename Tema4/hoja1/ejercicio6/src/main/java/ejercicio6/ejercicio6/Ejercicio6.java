/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio6.ejercicio6;

/**
 *
 * @author david
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int[] lista = new int[10];

        int mayor = 0;

        for (int i = 0; i < lista.length; i++) { //añado al array numeros aleatorios
            lista[i] = (int) Math.floor(Math.random() * 50) + 1;
            System.out.println(lista[i]);
        }

        for (int i = 0; i < lista.length; i++) { //calculo cual es el mayor
            if (lista[i] >= mayor) {
                mayor = lista[i];
            }
        }
        
        //mostrar el mayor numero
        System.out.println("el mayor numero es : "+mayor);
    }
}
