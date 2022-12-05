/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5.ejercicio5;

/**
 *
 * @author DAW118
 */
public class Potencia {

    public static int potencia(int num, int exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente == 1) {
            return num;
        } else {
            return num * potencia(num, exponente - 1);
        }
    }
}
