/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio1;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Visita {
  private int id;
  private String dni;
  private LocalDate fecha;
  private String tratamiento;
  private String observaciones;

    public Visita() {
        this.dni = Teclado.pedirDNIRegex("Introduce el DNI del paciente...");
        this.fecha = Teclado.pedirFechaDDMMYYY();
        System.out.println("Introduce el tratamiento...");
        this.tratamiento = new Scanner(System.in).nextLine();
        System.out.println("Introduce las observaciones...");
        this.observaciones = new Scanner(System.in).nextLine();
    }

    public Visita(int id, String dni, LocalDate fecha, String tratamiento, String observaciones) {
        this.id = id;
        this.dni = dni;
        this.fecha = fecha;
        this.tratamiento = tratamiento;
        this.observaciones = observaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
  
  

    
    
}
