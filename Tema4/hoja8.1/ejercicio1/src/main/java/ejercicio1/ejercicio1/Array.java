/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Array {

    private int[] matriz;

    public Array() {
        matriz = new int[10];

    }

    public void mostrar() {
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i] + ",");
        }
        System.out.println("");
    }

    public void introducir() {
        for (int i = 0; i < 10; i++) {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Introduce el numero " + (i + 1)+" :");
            int n = teclado.nextInt();
            matriz[i] = n;
        }
    }

    public int media() {
        int total = 0;
        for (int i = 0; i < matriz.length; i++) {
            total += matriz[i];
        }

        return total / 10;
    }

    public void modificar(int num, int pos) {
        matriz[pos - 1] = num;
    }

    public void rotarIzquierda() {
        int aux = matriz[0];
        for (int i = 0; i < matriz.length-1; i++) {
            matriz[i] = matriz[i+1];
        }
        matriz[9] = aux;
    }

    public void rotarDerecha() {
        int aux = matriz[matriz.length - 1];
        for (int i = matriz.length - 2; i >= 0; i--) {
            matriz[i + 1] = matriz[i];
        }
        matriz[0] = aux;
    }
    
    public void comparar(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(array[i] == matriz[j]){
                    System.out.print(array[i]+" , ");
                }
            }
        }   
    }
    
    public void sumaPares(){
        int suma=0;
        for (int i = 0; i < matriz.length; i+=2) {
            suma+=matriz[i];
        }
        System.out.printf("\nla suma es: "+suma);
        
    }
    
    public void multiplos(int num){
        
        for (int i = 0; i < matriz.length; i++) {
            matriz[i]=num*i;
        }
    }

}
