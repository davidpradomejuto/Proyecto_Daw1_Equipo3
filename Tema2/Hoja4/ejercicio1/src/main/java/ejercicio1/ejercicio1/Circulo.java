/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

/**
 *
 * @author DAW118
 */
public class Circulo {
    private float radio=0f;
    
    public Circulo() {}
    public Circulo(float newradio) {this.radio=newradio;}
    
    //modifica la variable radio
    public void setRadio (float newradio) 
    {this.radio = newradio;}
    
    //devuelve la variable radio 
    public float getRadio ()
    {return radio;}
}
