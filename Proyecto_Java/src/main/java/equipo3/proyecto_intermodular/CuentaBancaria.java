/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipo3.proyecto_intermodular;

import java.util.LinkedList;

/**
 *
 * @author daw118
 */
public class CuentaBancaria {
    private String iban;
    private String cliente;
    private String tipocuenta;
    private double saldo;
    private double nominaMes;
    private double mediaNomina;
    private LinkedList<MovimientoCliente> movimientos;

    public CuentaBancaria(String iban, String cliente, String tipocuenta, double saldo, double nominaMes, double mediaNomina, LinkedList<MovimientoCliente> movimientos) {
        this.iban = iban;
        this.cliente = cliente;
        this.tipocuenta = tipocuenta;
        this.saldo = saldo;
        this.nominaMes = nominaMes;
        this.mediaNomina = mediaNomina;
        this.movimientos = movimientos;
    }

    

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTipocuenta() {
        return tipocuenta;
    }

    public void setTipocuenta(String tipocuenta) {
        this.tipocuenta = tipocuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getNominaMes() {
        return nominaMes;
    }

    public void setNominaMes(double nominaMes) {
        this.nominaMes = nominaMes;
    }

    public double getMediaNomina() {
        return mediaNomina;
    }

    public void setMediaNomina(double mediaNomina) {
        this.mediaNomina = mediaNomina;
    }
    
    
}
