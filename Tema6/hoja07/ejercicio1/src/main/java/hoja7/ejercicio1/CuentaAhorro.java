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
public class CuentaAhorro extends CuentaBancaria {
    private double tipoInteres; 
    public final double  MAX_TIPO_INTERES = 8.50; 
    public final double  MIN_TIPO_INTERES = 0.50; 

    public CuentaAhorro(double tipoInteres, Persona titular, String ccc) throws Exception {
        super(titular, ccc);

        if (tipoInteres >0.50 && tipoInteres <8.50){
            this.tipoInteres = tipoInteres;   
        }else{
            throw new Exception("error... Tipo de interes invalido debe estra entre 0.5 y 8.5...");
        }
        
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
    public Map listaOjeto() {
        Map<String, String> matriz = new LinkedHashMap();
        matriz.putAll(titular.listaOjeto());
        matriz.put("saldo", String.valueOf(saldo));
        matriz.put("ccc", super.getCcc());
        matriz.put("tipo interes", String.valueOf(tipoInteres));
        return matriz;
    }
    
    
    
    
}
