/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo3.proyecto_intermodular;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author DAW209
 */
public class Cliente {
    private String uuidd;
    private String dni;
    private String nombre;
    private String apellido;
    private int telefono;
    private String direccion;
    private String localización;
    private LocalDate fechaNacimiento;

    public Cliente(String uuidd, String dni, String nombre, String apellido, int telefono, String direccion, String localización, LocalDate fechaNacimiento) {
        this.uuidd = uuidd;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.localización = localización;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getUuidd() {
        return uuidd;
    }

    public void setUuidd(String uuidd) {
        this.uuidd = uuidd;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public String getLocalización() {
        return localización;
    }

    public void setLocalización(String localización) {
        this.localización = localización;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Cliente{" + "uuidd=" + uuidd + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", direccion=" + direccion + ", localizaci\u00f3n=" + localización + ", fechaNacimiento=" + fechaNacimiento.format(f) + '}';
    }
}
