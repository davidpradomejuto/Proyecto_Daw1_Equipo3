/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.ejercicio3;

/**
 *
 * @author DAW118
 */
public class Contacto {
    private String nombre;
    private String apellidos;
    private String email;
    private int telefono;

    public Contacto(String nombre, String apellidos, String email, int telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }
    
    
    
    
}
