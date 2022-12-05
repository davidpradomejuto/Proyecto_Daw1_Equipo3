/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

/**
 *
 * @author DAW118
 */
public class Factorial {

    public static int factorizar(int numero){
        if (numero<=1){
            return 1;
        }else{
            return numero*factorizar(numero-1);
        }
    }
}
