/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

import java.util.Arrays;

/**
 *
 * @author DAW118
 */
public class Contenedor<T> {

    private T[] matriz;
    private int contador;

    public Contenedor(T[] matriz) {
        this.matriz = matriz;
        contador = 0;
    }

    public void insertarAlPrincipio(T nuevo) {
        matriz = Arrays.copyOf(matriz, matriz.length + 1);
        System.arraycopy(matriz, 0, matriz, 1, matriz.length - 1);

        matriz[0] = nuevo;
        contador++;

    }

    public void insertarAlFinal(T nuevo) {
        matriz = Arrays.copyOf(matriz, matriz.length + 1);
        System.arraycopy(matriz, 0, matriz, 0, matriz.length - 2);
        matriz[matriz.length - 1] = nuevo;
        contador++;
    }

    public T extraerDelPrincipio() {
        T objeto = (T) matriz[0];
        return objeto;
    }

    public void ordenar() {
        Arrays.sort(matriz);
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i <= contador; i++) {
            result=result.concat( matriz[i].toString()+",");
        }
        
        return result;
    }
    
    
}
