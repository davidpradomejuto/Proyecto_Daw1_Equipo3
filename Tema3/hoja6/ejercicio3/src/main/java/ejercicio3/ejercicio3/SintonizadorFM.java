/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.ejercicio3;

/**
 *
 * @author david
 */
public class SintonizadorFM {

    private double frecuencia;

    public SintonizadorFM() {
        this.frecuencia = 80;
    }

    public SintonizadorFM(double frecuencia) {
        if (frecuencia >= 80 && frecuencia <= 108) {
            this.frecuencia = frecuencia;
        } else {
            System.out.println(" frecuencia introducida fuera de rango");
        }
    }

    public void subir() {
        final double Subir = 0.5d;
        if (this.frecuencia + Subir > 108) {
            this.frecuencia = 80;
        } else {
            this.frecuencia += Subir;
        }
    }

    public void bajar() {
        final double Bajar = 0.5d;
        if (this.frecuencia - Bajar < 80) {
            this.frecuencia = 108;
        } else {
            this.frecuencia -= Bajar;
        }
    }

    private void comprobarRango() {
        if (this.frecuencia > 108) {
            this.frecuencia = 80;
        } else if (this.frecuencia < 80) {
            this.frecuencia = 108;
        }
    }

    public void mostrar() {
        System.out.println("La frecuencia actual es: " + frecuencia + " MHz");
    }

}
