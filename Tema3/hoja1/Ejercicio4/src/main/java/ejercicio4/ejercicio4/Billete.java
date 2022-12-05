/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.ejercicio4;

/**
 *
 * @author DAW118
 */
public class Billete {
    private int distancia; 
    private int ndias; 
    
    public Billete (int newDistancia, int newNdias) {
        this.distancia = newDistancia;
        this.ndias = newNdias;
    }
    
    public double importe () {
        double precio;
        
        if ( this.ndias > 7 && this.distancia > 800) {
            
        } else { this.distancia* 0.60;
        
        }
        return precio;
    }
}

