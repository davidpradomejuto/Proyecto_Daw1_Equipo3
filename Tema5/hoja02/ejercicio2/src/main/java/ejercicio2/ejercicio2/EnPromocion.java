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

    public EnPromocion(int codigo, String descripcion, double precio,int descuento) {
        super(codigo, descripcion, precio);
        this.descuento = descuento;
    }
    
    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    
    
    
    
}
