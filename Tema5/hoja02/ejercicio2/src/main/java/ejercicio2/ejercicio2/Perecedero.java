/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;

/**
 *
 * @author DAW118
 */
public class Perecedero extends Articulo {
    
    private int mes;
    private int aCaducidad;

    public Perecedero(int mes, int aCaducidad, int codigo, String descripcion, int precio) {
        super(codigo, descripcion, precio);
        this.mes = mes;
        this.aCaducidad = aCaducidad;
    }
    
    public void mostrar(){
        System.out.println("El precio de este producto es de "+precio);
        System.out.println("Caduca el mes "+mes+" de año "+aCaducidad);
        System.out.println("Tiene este codigo "+codigo);
        System.out.println("y esta descripcion "+descripcion);
    }
    
    public void caducados(){
        System.out.println("Los articulos caducados son: ");
        
        
    }

    public int getMes() {
        return mes;
    }

    public int getaCaducidad() {
        return aCaducidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }
    
    
    
}
