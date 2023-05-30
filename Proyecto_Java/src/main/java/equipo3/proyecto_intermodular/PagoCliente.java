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
    private int id_preconcedido;
    private LocalDate fechaPago;
    private double CantidadPagada;

    public PagoCliente(int numPago, int id_preconcedido, LocalDate fechaPago, double CantidadPagada) {
        this.numPago = numPago;
        this.id_preconcedido = id_preconcedido;
        this.fechaPago = fechaPago;
        this.CantidadPagada = CantidadPagada;
    }

    public int getNumPago() {
        return numPago;
    }

    public void setNumPago(int numPago) {
        this.numPago = numPago;
    }

    public int getId_preconcedido() {
        return id_preconcedido;
    }

    public void setId_preconcedido(int id_preconcedido) {
        this.id_preconcedido = id_preconcedido;
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
