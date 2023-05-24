/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio2;

import java.util.Objects;

/**
 *
 * @author david
 */
public class Persona implements Comparable<Persona> {
    private String nombre;
    private String apellidos;
    private String DNI;

     public Persona() {
        boolean dnivalido = false;

        do{
        String posibleDni = Teclado.pedirDni("Introduce el Dni de la persona: ");
        if(Teclado.validarDni(posibleDni)){
            dnivalido = true;
            System.out.println("Dni correcto");
            this.DNI=posibleDni;
        }else{
            System.out.println("Dni Invalido repite");
        }
        }while(!dnivalido);
           
        String posibleNombre = Teclado.pedirNombre("Introduce el nombre de la persona: ");
            this.nombre=posibleNombre;
               
        String posibleApellido = Teclado.pedirNombre("Introduce el apellido de la persona: ");
            this.apellidos=posibleApellido;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + '}';
    }

    @Override
    public int compareTo(Persona o) {
      return o.DNI.compareToIgnoreCase(this.DNI);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.DNI);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return Objects.equals(this.DNI, other.DNI);
    }
     
     



}
