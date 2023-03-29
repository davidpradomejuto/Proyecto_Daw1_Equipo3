/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio1;

/**
 *
 * @author DAW118
 */
public class CuentaAhorro extends CuentaBancaria {
    private double tipoInteres; 
    public final double  MAX_TIPO_INTERES = 0.50; 
    public final double  MIN_TIPO_INTERES = 8.50; 

    public CuentaAhorro(double tipoInteres, Persona titular, String ccc) {
        super(titular, ccc);
        this.tipoInteres = tipoInteres;   
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public double getMAX_TIPO_INTERES() {
        return MAX_TIPO_INTERES;
    }

    public double getMIN_TIPO_INTERES() {
        return MIN_TIPO_INTERES;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    @Override
    public void ingresar(double cantidad) {
       super.saldo += cantidad;
    }
    
    
    
    
}
