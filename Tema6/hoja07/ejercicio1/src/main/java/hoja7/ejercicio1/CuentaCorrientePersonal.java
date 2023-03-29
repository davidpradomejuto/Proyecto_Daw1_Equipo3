/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio1;

/**
 *
 * @author DAW118
 */
public class CuentaCorrientePersonal extends CuentaCorriente {
    private double comisionMantenimiento;
    public final double MIN_COMISION_MANTENIMIENTO = 0;
    public final double MAX_COMISION_MANTENIMIENTO = 5;

    public CuentaCorrientePersonal(double comisionMantenimiento , Persona titular, String ccc) {
        super(titular, ccc);
        this.comisionMantenimiento = comisionMantenimiento;
    }
    
    
    public double getComisionMantenimiento() {
        return comisionMantenimiento;
    }

    public double getMIN_COMISION_MANTENIMIENTO() {
        return MIN_COMISION_MANTENIMIENTO;
    }

    public double getMAX_COMISION_MANTENIMIENTO() {
        return MAX_COMISION_MANTENIMIENTO;
    }

    public void setComisionMantenimiento(double comisionMantenimiento) {
        this.comisionMantenimiento = comisionMantenimiento;
    }

    @Override
    public void ingresar(double cantidad) {
        super.saldo += cantidad;
    }
    
    
    
}
