/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

/**
 *
 * @author DAW118
 */
public class Encargado extends Empleado {
    
    public Encargado(double newSueldo) {
        super(newSueldo);     
    }
    
    @Override
    public double getSueldo() {
        return super.sueldo*1.1;
    }
    
    
}
