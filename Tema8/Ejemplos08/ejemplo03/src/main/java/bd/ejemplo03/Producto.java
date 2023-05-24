/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd.ejemplo03;


/**
 *
 * @author cic
 */
public class Producto {
    private int    id;
    private String nombre;
    private int cantidad;

    public Producto(){
        nombre=Teclado.introTexto("introduce el nombre del producto");
        cantidad=Teclado.introEnteroPositivo("introduce una cantidad");
        
    }
    public Producto( int id, String nombre, int cantidad) {
        this.id     = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + '}';
    }
    
    
    
}
