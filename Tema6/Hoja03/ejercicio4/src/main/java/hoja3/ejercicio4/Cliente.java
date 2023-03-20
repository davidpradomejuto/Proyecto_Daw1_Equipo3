/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio4;

import java.time.LocalDateTime;


/**
 *
 * @author DAW118
 */
public class Cliente {
    private String nombre;
    private int tlf;
    private LocalDateTime fechaLlegada;
    private LocalDateTime fechaAtencion;
    
    public Cliente(){
        nombre = Teclado.pedirNombre("Introduce el nombre del cliente");
        tlf = Teclado.pedirTlf("Introduce el telefono del cliente");
        System.out.println("Insertar la fecha de llegada......");
        fechaLlegada=Teclado.pedirFechayHora();
       
        fechaAtencion = null;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", tlf=" + tlf + ", fechaLlegada=" + fechaLlegada + ", fechaAtencion=" + fechaAtencion + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public LocalDateTime getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(LocalDateTime fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public LocalDateTime getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(LocalDateTime fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }
    
    
}
