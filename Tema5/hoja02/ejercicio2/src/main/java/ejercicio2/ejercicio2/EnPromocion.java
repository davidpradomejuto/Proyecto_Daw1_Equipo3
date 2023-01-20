/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;

/**
 *
 * @author DAW118
 */
public class EnPromocion extends Articulo {
    private int descuento;

    public EnPromocion(int descuento, int codigo, String descripcion, int precio) {
        super(codigo, descripcion, precio);
        this.descuento = descuento;
    }
    
    public void mostrar(){
        System.out.println("El precio de este producto es de "+(precio-precio*descuento/100));
        System.out.println("El descuento del producto de de "+descuento+" %");
        System.out.println("Tiene este codigo "+codigo);
        System.out.println("y esta descripcion "+descripcion);
    }
    
    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    
    
    
    
}
