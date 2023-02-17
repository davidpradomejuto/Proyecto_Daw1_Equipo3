/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

/**
 *
 * @author DAW118
 */
public class Troyano extends Guerrero {

    public Troyano(String newnombre, int newedad, int newfuerza){
        super(newnombre,newedad,newfuerza);
    }
    
    @Override
    public boolean retirarse() {
        return false;
    }

}
