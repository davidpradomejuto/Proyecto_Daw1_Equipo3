/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.ejercicio3;

import java.time.LocalDateTime;

/**
 *
 * @author david
 */
public class Contenedor {
    private int codigo;
    private String origen;
    private LocalDateTime fecha;
    
    public Contenedor(){
        codigo = Teclado.pedirCodigo4Digitos("Introduce el codigo del contenedor:");
        
        origen = Teclado.pedirOrigen("Introduce el origen del contenedor: ");
        
        fecha = Teclado.pedirFechayHora();
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    
    

    @Override
    public String toString() {
        return "Contenedor{" + "codigo=" + codigo + ", origen=" + origen + ", fecha=" + fecha + '}';
    }


    
}
