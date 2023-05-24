/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.ejercicio3;

/**
 * @author DAW118
 */
public class Imprimir {

    public static void imprimeNumeros(int numero) {

        if (numero > 0) {
            System.out.print(numero);
            imprimeNumeros(numero - 1);
            
        }
    }
}
