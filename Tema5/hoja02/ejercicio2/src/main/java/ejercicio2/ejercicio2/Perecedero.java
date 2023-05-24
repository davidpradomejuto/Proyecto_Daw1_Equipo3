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

    public Perecedero(int mes, int aCaducidad, int codigo, String descripcion, double precio) {
        super(codigo, descripcion, precio);
        this.mes = mes;
        this.aCaducidad = aCaducidad;
    }
    

    public int getMes() {
        return mes;
    }

    public int getaCaducidad() {
        return aCaducidad;
    }
    
    
    
}
