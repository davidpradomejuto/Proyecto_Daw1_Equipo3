/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.ejercicio3;

/**
 *
 * @author DAW118
 */
public abstract class Forma {
    protected String identificador;

    public void identidad(){
        System.out.println("soy un "+identificador);
    }

    @Override
    public abstract String toString();
    
    
    
    
    
}
