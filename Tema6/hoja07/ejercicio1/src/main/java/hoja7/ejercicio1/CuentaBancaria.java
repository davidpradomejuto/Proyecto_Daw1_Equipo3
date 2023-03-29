/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DAW118
 */
public abstract class CuentaBancaria implements Identificable {

    protected Persona titular;
    protected double saldo;
    private String entidad;
    private String oficina;
    private String cuenta;

    public CuentaBancaria(Persona titular, String ccc) {
        this.titular = titular;
        //faltaria el metodo para verificar si la CCC es correcta y devolver la String ccc
        //pide la String cc y lo divide en las tres variable,entidad,oficina,cuenta
        entidad = ccc.substring(0, 1);
        oficina = ccc.substring(1, 2);
        cuenta = ccc.substring(2, 3);
        this.saldo = 0;
        
    }

    @Override
    public Map listaOjeto() {
        Map<String, String> matriz = new HashMap();
        matriz.putAll(titular.listaOjeto());
        matriz.put("saldo", String.valueOf(saldo));
        //esto no esta bien, deberia devolver el valor del CC
        matriz.put("ccc", entidad);
        return matriz;
    }

    public abstract void ingresar(double cantidad);

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            saldo -= cantidad;
            System.out.println("Saldo retirado...");
        } else {
            System.out.println("Error.... el saldo no puede ser negativo");
        }

    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

}
