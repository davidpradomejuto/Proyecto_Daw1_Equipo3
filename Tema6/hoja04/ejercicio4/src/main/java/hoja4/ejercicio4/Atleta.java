/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio4;

/**
 *
 * @author david
 */
public class Atleta {
    private int dorsal;
    private String nombre;
    private double tiempo;

    public Atleta() {
        dorsal = Teclado.pedirIntPositivo("Introduce el dorsal: ");
        nombre = Teclado.pedirNombre("Introduce le nombre: ");
        tiempo = Teclado.pedirDouble("Introduce el tiempo:");
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.dorsal;
        return hash;
    }
    
    @Override
     public boolean equals(Object obj) {
        if (obj instanceof Atleta c) {
            return c.dorsal == this.dorsal;
        } else {
            return false;
        }
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Atleta{" + "dorsal=" + dorsal + ", nombre=" + nombre + ", tiempo=" + tiempo + '}';
    }
    
    
    
    
}
