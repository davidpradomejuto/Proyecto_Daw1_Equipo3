/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio1.ejercicio1;

/**
 *
 * @author DAW118
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Cono co = new Cono(3,4);
        Cilindro ci = new Cilindro(3,8);
        System.out.printf("Volumen de un cono: %,.2f\n",co.volumen());
        System.out.printf("Area de un cono: %,.2f\n",co.area());
        System.out.printf("Volumen de un Cilindro: %,.2f\n",ci.volumen());
        System.out.printf("Area de un cilindro: %,.2f\n",ci.area());
    }
}
