/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio2;

import java.time.Duration;
import java.time.LocalDate;

/**
 *
 * @author DAW118
 */
public class Persona {
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private String DNI;

    public Persona() {
        String posibleDni = Teclado.pedirDni("Introduce el Dni de la persona: ");
        if(ValidaDatos.validarDni(posibleDni)){
            System.out.println("Dni correcto");
            this.DNI=posibleDni;
        }else{
            System.out.println("Dni Invalido");
        }
        
        String posibleNombre = Teclado.pedirNombre("Introduce el nombre de la persona: ");
        
        if (ValidaDatos.validarNombre(posibleNombre)){
            System.out.println("Nombre correcto");
            this.nombre=posibleNombre;
        }else{
            System.out.println("Nombre Invalido");
        }
        
        this.fechaDeNacimiento = Teclado.pedirFecha();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    public int getEdad(){
        long edad = 0;
        edad = Duration.between(fechaDeNacimiento, LocalDate.now()).toDays();
        return (int) edad/360;
    }
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaDeNacimiento=" + fechaDeNacimiento.toString() + ", DNI=" + DNI + '}';
    }
    
    
}
