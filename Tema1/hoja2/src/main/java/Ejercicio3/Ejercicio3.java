/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author david
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        
        double precioeuros = 224000.70f;
        double preciopesetas;
        
        preciopesetas=(int) (precioeuros*166.386);
        System.out.printf("El precio de la vivienda en euros es: %,.2f\n",precioeuros);
        System.out.printf("El precio de la vivienda en pesetas es: %,.0f\n",preciopesetas);
    }
}
