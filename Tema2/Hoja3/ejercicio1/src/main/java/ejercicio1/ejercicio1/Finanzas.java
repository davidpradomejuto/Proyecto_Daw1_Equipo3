/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

/**
 *
 * @author david
 */
public class Finanzas {
    private double cambio = 1.06d;
    //creo un objeto con el construcctor por defecto
    public Finanzas() {}
    public Finanzas(double cambio) {this.cambio=cambio;}
    
    //devuelve los euros
    public double dolaresToEuros (double dolares)
    {
        double result = dolares* cambio;
        return result;
    }
    
    //devuelve los dolares
    public double eurosToDolares ( double euros)
    {
        double result = euros*cambio;
        return result;
    }
}
