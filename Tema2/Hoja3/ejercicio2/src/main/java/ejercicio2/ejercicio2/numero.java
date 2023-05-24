/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;

/**
 * @author david
 */
public class Numero {
    private int numero = 0;
    //creo un objeto con el construcctor por defecto
    public Numero() {}
    public Numero(int numero) {this.numero=numero;}
    
    //hace y devuelve la suma 
    public int suma (int suma)
    {int result = numero+suma;
    return result;}
    
    //hace y devuelve la resta 
    public int resta (int resta)
    {int result = numero+resta;
    return result;}
    
    //devuelve la varaible numero
    public int getNumero ()
    {return numero;}
    
    //modifica la variable radio
    public void setNumero (int numero) 
    {this.numero=numero;}
    
    //hace y devuelve el doble
    public int doble ()
    {int result = numero*2;
    return result;}
    
    //hace y devuelve el triple
    public int triple ()
    {int result = numero*3;
    return result;}
    
    
    
    
    
    
}
