/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

/**
 *
 * @author DAW118
 */
public class Fondo {

    private double c;
    private double i;
    private int n;

    public Fondo(double newC, double newI, int newN) {
        //inicializo las variables
        this.c = newC;
        this.i = newI;
        this.n = newN;
    }

    public void evolucion() {
        int contadorAnos = 1;
        while (contadorAnos <= n){
            System.out.printf("El capital del año %d será de : %,.2f €\n",contadorAnos,c);
            c = c + (c * i / 100 * contadorAnos);
            contadorAnos++;
        }
    }

}
