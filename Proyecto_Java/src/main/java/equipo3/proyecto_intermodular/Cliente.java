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
    private String localidad;
    private LocalDate fechaNacimiento;
    private CuentaBancaria cuentaBancaria;
    private PerfilCliente perfil;

    public Cliente(String uuidd, String dni, String nombre, String apellido, int telefono, String direccion, String localidad, LocalDate fechaNacimiento, CuentaBancaria cuentaBancaria, PerfilCliente perfil) {
        this.uuidd = uuidd;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.localidad = localidad;
        this.fechaNacimiento = fechaNacimiento;
        this.cuentaBancaria = cuentaBancaria;
        this.perfil = perfil;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public PerfilCliente getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilCliente perfil) {
        this.perfil = perfil;
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

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
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
        return "Cliente{" + "uuidd=" + uuidd + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono +
                ", direccion=" + direccion + ", localidad=" + localidad + ",  fechaNacimiento=" + fechaNacimiento.format(f) + '}';
    }
}
