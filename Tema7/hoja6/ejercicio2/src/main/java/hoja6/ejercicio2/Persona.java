/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio2;

import java.io.Serializable;

/**
 *
 * @author DAW118
 */
public class Persona implements Serializable {

    private String nombre;
    private int telefono;
    private String direccion;
    private int codigoPostal;

    public Persona() {
        nombre=Teclado.pedirNombre("Introduce el nombre de la persona...");
        telefono=Teclado.pedirTlf("Introduce el telefono...");
        direccion=Teclado.pedirTextoRegex("Introduce la direccion....");
        codigoPostal=Teclado.pedirIntPositivo("Introduce el codigo postal....");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", codigoPostal=" + codigoPostal + '}';
    }
    
    

}
