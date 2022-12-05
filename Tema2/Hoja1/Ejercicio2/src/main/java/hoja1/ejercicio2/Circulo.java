/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio2;

/*@author DAW118*/

public class Circulo {
    private double radio;
    
    //creo un objeto con el construcctor por defecto
    public Circulo() {}
    
    //creo un objeto con el atributo radio y la guardo en la variable radio
    //dentro del objeto
    public Circulo(double radio) 
    { this.radio=radio;}
    
    //devuelve la variable radio 
    public double getRadio ()
    {return radio;}
    
    //modifica la variable radio
    public void setRadio (double radio) 
    {this.radio = radio;}
    
    //Muestra el area del radio
    public double area()
    { return Math.PI*Math.pow(radio,2);}
   
    //muestra la longitud del radio
    public double longitud()
    {return 2*Math.PI*radio;}
    
}
