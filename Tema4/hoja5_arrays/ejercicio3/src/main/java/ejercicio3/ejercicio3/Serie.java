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
public class Serie {

    private double[] matriz;
    private char signo;

    public Serie(char letra) {
        this.signo=letra;
        matriz = new double[4];
        for (int i = 0; i < matriz.length; i++) {
            Scanner Teclado = new Scanner(System.in);
            System.out.println("Introduce un numero: ");
            double numero = Teclado.nextDouble();
            
            matriz[i]= numero;
        }
    }

    public double resultado() {
        double resultado = 0;
        
        if (signo == ('+')) {

            for (int i = 0; i < matriz.length; i++) {
                resultado += matriz[i];
                
            }
        } else if (signo == ('*')) {

            resultado = 1;
            for (int i = 0; i < matriz.length; i++) {
                resultado *= matriz[i];
                
            }
        }
        return resultado;
    }
}
