/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio7.ejercicio7;
/**
 * @author david
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int[] lista = {5, 7, 8, 2, 4, 10, 5, 6, 7, 3};

        for (int c = 0; c < 10; c++) {    //hago un for que sume un contador cada vez que termina el for siguiente

            for (int i = 0; i < lista.length - c - 1; i++) {    //hago que el for se ejecute 1 veces menos cada vez que termina su ejecucion

                if (lista[i] >= lista[i + 1]) {    //comparo los numeros , si el numero actual es mayor al siguiente, intercambio sus posiciones
                    int aux = lista[i + 1];       //esto nos deja con el numero mayor en la ultima posicion del array, en el siguiente comienzo el bucle, esta posicion no se tomara en cuenta
                    lista[i + 1] = lista[i];
                    lista[i] = aux;
                }
            }
        }

        //muestro el array
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + ",");
        }

    }//fin del main
}//fin de la clase

