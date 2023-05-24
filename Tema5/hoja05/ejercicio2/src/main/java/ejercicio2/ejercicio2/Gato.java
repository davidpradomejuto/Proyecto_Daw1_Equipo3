/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;

/**
 *
 * @author DAW118
 */
public class Gato extends Mamifero implements Felino, Domestico {
    private String nombre;

    public Gato(String raza, int npatas, String alimento,String nombre) {
        super(raza, npatas, alimento);
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + '}';
    }
    
     @Override
    public String araniar(){
        return "el mamifero arania";
    }
    
    @Override
    public String obedecer(){
        return "el mamifero obedece";
    }
    
    
    
    
}
