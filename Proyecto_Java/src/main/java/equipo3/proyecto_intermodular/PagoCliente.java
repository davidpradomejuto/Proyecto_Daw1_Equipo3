/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipo3.proyecto_intermodular;

import java.time.LocalDate;

/**
 *
 * @author DAW118
 */
public class PagoCliente {
    private int numPago;
    private Cliente cliente;
    private LocalDate fechaPago;
    private double CantidadPagada;

    public PagoCliente(int numPago, Cliente cliente, LocalDate fechaPago, double CantidadPagada) {
        this.numPago = numPago;
        this.cliente = cliente;
        this.fechaPago = fechaPago;
        this.CantidadPagada = CantidadPagada;
    }

    public int getNumPago() {
        return numPago;
    }

    public void setNumPago(int numPago) {
        this.numPago = numPago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getCantidadPagada() {
        return CantidadPagada;
    }

    public void setCantidadPagada(double CantidadPagada) {
        this.CantidadPagada = CantidadPagada;
    }
    
    
}
