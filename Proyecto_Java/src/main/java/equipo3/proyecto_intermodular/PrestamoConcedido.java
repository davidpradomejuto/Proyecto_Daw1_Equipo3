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
public class PrestamoConcedido {

    private int idPreconcedido;
    private LocalDate fechaConfimacion;
    private double pagoMensual;
    private ArrayList<PagoCliente> pagos;

    public PrestamoConcedido(LocalDate fechaConfimacion, double pagoMensual, int idPreconcedido, ArrayList<PagoCliente> pagos) {
        this.fechaConfimacion = fechaConfimacion;
        this.pagoMensual = pagoMensual;
        this.idPreconcedido = idPreconcedido;
        this.pagos = pagos;
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

    public int getIdPreconcedido() {
        return idPreconcedido;
    }

    public void setIdPreconcedido(int idPreconcedido) {
        this.idPreconcedido = idPreconcedido;
    }

    public ArrayList<PagoCliente> getPagos() {
        return pagos;
    }

    public void setPagos(ArrayList<PagoCliente> pagos) {
        this.pagos = pagos;
    }

}
