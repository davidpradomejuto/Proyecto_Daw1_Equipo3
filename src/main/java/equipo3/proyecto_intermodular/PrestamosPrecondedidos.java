/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipo3.proyecto_intermodular;

/**
 *
 * @author daw118
 */

import java.time.LocalDate;

public class PrestamosPrecondedidos {
    private int ID;
    private Cliente cliente;
    private LocalDate fechaOferta;
    private int cantidadPrestamo;
    private int periodoPrestamo;
    private double tipoInteres;
    private int PlazoParaAceptar;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public LocalDate getFechaOferta() {
        return fechaOferta;
    }

    public void setFechaOferta(LocalDate fechaOferta) {
        this.fechaOferta = fechaOferta;
    }

    public int getCantidadPrestamo() {
        return cantidadPrestamo;
    }

    public void setCantidadPrestamo(int cantidadPrestamo) {
        this.cantidadPrestamo = cantidadPrestamo;
    }

    public int getPeriodoPrestamo() {
        return periodoPrestamo;
    }

    public void setPeriodoPrestamo(int periodoPrestamo) {
        this.periodoPrestamo = periodoPrestamo;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public int getPlazoParaAceptar() {
        return PlazoParaAceptar;
    }

    public void setPlazoParaAceptar(int PlazoParaAceptar) {
        this.PlazoParaAceptar = PlazoParaAceptar;
    }
    
    
}

