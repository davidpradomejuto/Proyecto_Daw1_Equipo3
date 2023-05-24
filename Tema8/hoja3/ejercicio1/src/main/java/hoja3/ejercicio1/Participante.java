/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio1;

/**
 *
 * @author david
 */
public class Participante {
    
    private String dni;
    private String nombre;
    private int idActividad;

    public Participante() {
        this.dni = Teclado.pedirDNIRegex("Introduce el DNI del participante...");
        this.nombre = Teclado.pedirNombre("Introduce el nombre del participante...");
        this.idActividad = Teclado.pedirIntPositivo("Introduce el id de la actividad");
    }
    public Participante(String dni, String nombre, int idActividad) {
        this.dni = dni;
        this.nombre = nombre;
        this.idActividad = idActividad;
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

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    @Override
    public String toString() {
        return "participante{" + "dni=" + dni + ", nombre=" + nombre + ", idActividad=" + idActividad + '}';
    }
    
    
    
}
