/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio2;

/**
 *
 * @author DAW118
 */
public class Articulo {
    private int codigo;
    private String descripcion;
    private int existencias;

    public Articulo() {
        codigo = Teclado.pedirIntPositivo("Introduce el codigo del articulo: ");
        descripcion  = Teclado.pedirNombre("Introduce la descripcion del articulo: ");
        existencias = Teclado.pedirIntPositivo("Introduce las existencias del articulo: ");
    }

    @Override
    public String toString() {
        return "Articulo{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", existencias=" + existencias + '}';
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
    
    
}
