/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Invierno {

    private double[] lista;

    public Invierno(int nElementos) {
        lista = new double[nElementos];

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Introduce la temperatura " + i + ": ");
            lista[i] = teclado.nextDouble();
        }
    }
    
    public double tempMedia(){
        int suma = 0;
        for (int i = 0; i < lista.length; i++) {
            suma += lista[i];
        }
        double media = suma / lista.length-1;
        return media;
    }
    
    public double[] fahrenheit(){
        double [] listaF = new double[lista.length];
        for (int i = 0; i < lista.length; i++) {
            listaF[i]=lista[i]*1.8+32;
        }
        return listaF;
    }
    
    public String mostrar(double[] array){
        String cadena ="";
        for(int i=0;i<array.length;i++){
            cadena=cadena.concat(String.valueOf(array[i])+",");   
        }
        return cadena;
    }

}
