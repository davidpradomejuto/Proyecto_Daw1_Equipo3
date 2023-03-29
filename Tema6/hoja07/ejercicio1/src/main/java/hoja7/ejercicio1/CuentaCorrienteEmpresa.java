/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio1;

/**
 *
 * @author DAW118
 */
public class CuentaCorrienteEmpresa extends CuentaCorriente {
    private double maximoDescubierto;
    public final double MAX_DESCUBIERTO = 50000;

    public CuentaCorrienteEmpresa(double maximoDescubierto,Persona titular, String ccc) {
        super(titular, ccc);
        this.maximoDescubierto = maximoDescubierto;
    }

    public double getMaximoDescubierto() {
        return maximoDescubierto;
    }

    public double getMAX_DESCUBIERTO() {
        return MAX_DESCUBIERTO;
    }

    public void setMaximoDescubierto(double maximoDescubierto) {
        this.maximoDescubierto = maximoDescubierto;
    }

    @Override
    public void ingresar(double cantidad) {
        super.saldo += cantidad;
    }
    
    
    
    
}
