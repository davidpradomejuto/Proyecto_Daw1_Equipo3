/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author DAW118
 */
public class Persona {
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private String DNI;

    public Persona() {
        boolean dnivalido = false;
        boolean nombrevalido = false;
        
        do{
        String posibleDni = Teclado.pedirDni("Introduce el Dni de la persona: ");
        if(ValidaDatos.validarDni(posibleDni)){
            dnivalido = true;
            System.out.println("Dni correcto");
            this.DNI=posibleDni;
        }else{
            System.out.println("Dni Invalido repite");
        }
        }while(!dnivalido);
        
        do {
        String posibleNombre = Teclado.pedirNombre("Introduce el nombre de la persona: ");
        
        if (ValidaDatos.validarNombre(posibleNombre)){
            nombrevalido = true;
            System.out.println("Nombre correcto");
            this.nombre=posibleNombre;
        }else{
            System.out.println("Nombre Invalido repite");
        }
        }while(!nombrevalido);
        
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
    
    public long getEdad(){
        long edad = 0;
        edad = Period.between(fechaDeNacimiento,LocalDate.now()).getYears();
        return edad;
    }
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaDeNacimiento=" + fechaDeNacimiento.toString() + ", DNI=" + DNI + '}';
    }
    
    
}
