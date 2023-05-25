/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipo3.proyecto_intermodular;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author DAW118
 */
public class PrestamoCondecido {
    private Cliente cliente;
    private LocalDate fechaConfimacion;
    private double pagoMensual;
    private PrestamoPrecondedido prestamoPrecondedido;
    private ArrayList<PagoCliente> pagos;

    public PrestamoCondecido(Cliente cliente, LocalDate fechaConfimacion, double pagoMensual, PrestamoPrecondedido prestamoPrecondedido, ArrayList<PagoCliente> pagos) {
        this.cliente = cliente;
        this.fechaConfimacion = fechaConfimacion;
        this.pagoMensual = pagoMensual;
        this.prestamoPrecondedido = prestamoPrecondedido;
        this.pagos = pagos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaConfimacion() {
        return fechaConfimacion;
    }

    public void setFechaConfimacion(LocalDate fechaConfimacion) {
        this.fechaConfimacion = fechaConfimacion;
    }

    public double getPagoMensual() {
        return pagoMensual;
    }

    public void setPagoMensual(double pagoMensual) {
        this.pagoMensual = pagoMensual;
    }

    public PrestamoPrecondedido getPrestamoPrecondedido() {
        return prestamoPrecondedido;
    }

    public void setPrestamoPrecondedido(PrestamoPrecondedido prestamoPrecondedido) {
        this.prestamoPrecondedido = prestamoPrecondedido;
    }

    public ArrayList<PagoCliente> getPagos() {
        return pagos;
    }

    public void setPagos(ArrayList<PagoCliente> pagos) {
        this.pagos = pagos;
    }
    
    
}
