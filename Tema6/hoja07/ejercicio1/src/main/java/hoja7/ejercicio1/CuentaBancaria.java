/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author DAW118
 */
public abstract class CuentaBancaria implements Identificable {

    protected Persona titular;
    protected double saldo;
    private String ccc;

    public CuentaBancaria(Persona titular, String ccc) {
        this.titular = titular;
         
        try {
            if (Funciones.validarCuenta(ccc)) {
                System.out.println("Numero de cuenta valido...");
                this.ccc = ccc;
            } 
        }catch(Exception e){
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        }
        this.saldo = 0;

    }

    
    @Override
    public Map listaOjeto() {
        Map<String, String> matriz = new LinkedHashMap();
        matriz.putAll(titular.listaOjeto());
        matriz.put("saldo", String.valueOf(saldo));
        
        matriz.put("ccc", ccc);
        return matriz;
    }

    public void ingresar(double cantidad) {
          if (cantidad <= 0) {
            System.out.println("La cantidad a ingresar debe ser mayor que cero.");
        } else {
            saldo += cantidad;
            System.out.println("Ingreso realizado correctamente.");
            System.out.println("Saldo actual: " + saldo);
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            saldo -= cantidad;
            System.out.println("Saldo retirado...");
        } else if(saldo - cantidad >=0){
            System.out.println("Error.... el saldo no puede ser negativo");
        }else {
            saldo -=cantidad;
            System.out.println("Saldo retirado, tu saldo actual es de : "+saldo);
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

    public String getCcc() {
        return ccc;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.ccc);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CuentaBancaria other = (CuentaBancaria) obj;
        return Objects.equals(this.ccc, other.ccc);
    }

    
}
