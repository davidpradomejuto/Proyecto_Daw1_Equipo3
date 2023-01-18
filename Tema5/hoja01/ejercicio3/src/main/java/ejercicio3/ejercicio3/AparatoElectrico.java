/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.ejercicio3;

/**
 *
 * @author DAW118
 */
public class AparatoElectrico {

    private static double consumoTotal;

    private double potencia;
    private boolean encendido = false;

    public AparatoElectrico() {
    }

    public AparatoElectrico(double potencia, boolean encendido) {
        this.potencia = potencia;
        this.encendido = encendido;
    }

    public static double consumo() {
        return consumoTotal;
    }

    public void enciende() {
        encendido = true;
        consumoTotal += potencia;
    }

    public void apagado() {
        encendido = false;
        consumoTotal -= potencia;
    }

}
