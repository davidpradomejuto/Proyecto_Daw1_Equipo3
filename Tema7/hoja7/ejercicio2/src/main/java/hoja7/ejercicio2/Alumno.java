/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio2;

/**
 *
 * @author david
 */
public class Alumno  {

    private String nombreAlumno;
    private int nota;

    public Alumno() {
        this.nombreAlumno = Teclado.pedirNombre("Introduce el nombre del alumno...");
        this.nota = Teclado.pedirIntPositivo("Introduce la nota del alumno...");
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    
}
