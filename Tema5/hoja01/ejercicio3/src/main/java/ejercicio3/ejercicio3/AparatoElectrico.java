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
    private boolean encendido;

    public AparatoElectrico() {
    }

    public AparatoElectrico(double potencia) {
        this.potencia = potencia;
        this.encendido = false;
    }

    public static double consumo() {
        return consumoTotal;
    }

    public void enciende() {
        encendido = true;
        consumoTotal += potencia;
        System.out.println("El aparato esta encendido");
    }

    public void apagado() {
        encendido = false;
        consumoTotal -= potencia;
        System.out.println("El aparato esta apagado");
    }

}
