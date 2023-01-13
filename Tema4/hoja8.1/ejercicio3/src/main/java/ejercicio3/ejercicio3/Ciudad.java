/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.ejercicio3;

/**
 *
 * @author DAW118
 */
public class Ciudad {
    private String nombre;
    private double latitud;
    private double longitud;
    private int habitantes;

    public Ciudad(String nombre, double latitud, double longitud, int habitantes) {
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
        this.habitantes = habitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public int getHabitantes() {
        return habitantes;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nombre =" + nombre + ", habitantes =" + habitantes + '}';
    }

    
    
}
