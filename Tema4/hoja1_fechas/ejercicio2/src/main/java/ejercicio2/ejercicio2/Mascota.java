/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;

import java.time.*;

/**
 *
 * @author david
 */
public class Mascota {

    private String nombre;
    private LocalDate fechaNacimiento;

    public Mascota(String newName, int ano, int mes, int dia){
        this.nombre = newName;
        this.fechaNacimiento = LocalDate.of(ano, mes, dia);
       LocalDate.now();
    }
    
    public int getEdad(){
       return Period.between(fechaNacimiento,LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Nombre de la mascota = " + nombre + ", Fecha de nacimiento = " + fechaNacimiento;
    }
    
}
