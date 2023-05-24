/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author DAW118
 */
public class CuentaCorrientePersonal extends CuentaCorriente {
    private double comisionMantenimiento;
    public final double MIN_COMISION_MANTENIMIENTO = 0;
    public final double MAX_COMISION_MANTENIMIENTO = 30;

    public CuentaCorrientePersonal(double comisionMantenimiento , Persona titular, String ccc) throws Exception {
        super(titular, ccc);
        if (comisionMantenimiento >0 && comisionMantenimiento<30){
        this.comisionMantenimiento = comisionMantenimiento;
        }else{
            throw new Exception("Error...la comision de mantenimiento esta fuera de rango 0-30");
        }
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
    public Map listaOjeto() {
        Map<String, String> matriz = new LinkedHashMap();
        matriz.putAll(titular.listaOjeto());
        matriz.put("saldo", String.valueOf(saldo));
        matriz.put("ccc", super.getCcc());
        matriz.put("comisionMantenimiento",String.valueOf(getComisionMantenimiento()));
        return matriz;
    }
    
    
}
