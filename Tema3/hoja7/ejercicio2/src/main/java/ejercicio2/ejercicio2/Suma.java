/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;

/**
 *
 * @author DAW118
 */
public class Suma {

    public static int sumaSusNumeros(int numero){
        if (numero<=1){
            return 1;
        }else{
            return numero+sumaSusNumeros(numero-1);
        }
    }
}

