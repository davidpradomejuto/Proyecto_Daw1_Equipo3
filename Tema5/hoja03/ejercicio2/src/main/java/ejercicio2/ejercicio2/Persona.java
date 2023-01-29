/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public abstract class Persona {

    private String dni;
    private String nombre;
    private String direccion;

    public Persona() {
        System.out.println("Introduce el DNI: ");
        dni = new Scanner(System.in).nextLine();

            System.out.println("Introduce el nombre: ");
            nombre = new Scanner(System.in).nextLine();

            System.out.println("Introduce la direccion: ");
            direccion = new Scanner(System.in).nextLine();
        
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String mostrar() {
        return " Nombre: " + nombre + " direccion: " + direccion + " \n";
    }

}
