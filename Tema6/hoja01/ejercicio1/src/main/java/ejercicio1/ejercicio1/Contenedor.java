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
    
    public Contenedor(T[] matriz) {
        this.matriz = matriz;
    }



    public void insertarAlPrincipio(T nuevo) {
        matriz = Arrays.copyOf(matriz, matriz.length + 1);
        System.arraycopy(matriz, 0, matriz, 1, matriz.length - 1);

        matriz[0] = nuevo;
        
    }

    public void insertarAlFinal(T nuevo) {
        matriz = Arrays.copyOf(matriz, matriz.length + 1);
        matriz[matriz.length-1] = nuevo;
    }
    
    public <T> extraerDelPrincipio(){
        
    }

}
