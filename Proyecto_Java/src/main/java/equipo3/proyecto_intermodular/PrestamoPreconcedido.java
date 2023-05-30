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

public class PrestamoPreconcedido {

    private int id;
    private String uuid;
    private LocalDate fechaOferta;
    private int cantidad;
    private int periodo;
    private double tipoInteres;
    private int plazoParaAceptar;

    public PrestamoPreconcedido(int id, String uuid, LocalDate fechaOferta, int cantidad, int periodo, double tipoInteres, int plazoParaAceptar) {
        this.id = id;
        this.uuid = uuid;
        this.fechaOferta = fechaOferta;
        this.cantidad = cantidad;
        this.periodo = periodo;
        this.tipoInteres = tipoInteres;
        this.plazoParaAceptar = plazoParaAceptar;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaOferta() {
        return fechaOferta;
    }

    public void setFechaOferta(LocalDate fechaOferta) {
        this.fechaOferta = fechaOferta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public int getPlazoParaAceptar() {
        return plazoParaAceptar;
    }

    public void setPlazoParaAceptar(int plazoParaAceptar) {
        this.plazoParaAceptar = plazoParaAceptar;
    }

    @Override
    public String toString() {
        return "PrestamoPreconcedido{" + "id=" + id + ", uuid=" + uuid + ", fechaOferta=" + fechaOferta + ", cantidad=" + cantidad + ", periodo=" + periodo + ", tipoInteres=" + tipoInteres + ", plazoParaAceptar=" + plazoParaAceptar + '}';
    }

    
}
