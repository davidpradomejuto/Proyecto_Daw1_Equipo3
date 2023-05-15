/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio1;

/**
 *
 * @author DAW118
 */
public class Paciente {
    private String dni;
    private String nombre;
    private String telefono;

    public Paciente(){
        this.dni = Teclado.pedirDNIRegex("Intoduce el DNI del paciente....");
        this.nombre = Teclado.pedirNombre("Introduce el nombre del paciente....");
        this.telefono = String.valueOf(Teclado.pedirTlf("Introduce el telefono del paciente..."));
    }

    public Paciente(String dni, String nombre, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
    
}
