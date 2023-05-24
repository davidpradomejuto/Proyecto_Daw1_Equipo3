/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

import java.time.LocalDate;


/**
 *
 * @author DAW118
 */
public abstract class Publicacion {
    
    protected String titulo;
    protected String autor;
    protected LocalDate fecha;

    public Publicacion(String titulo, String autor, int dia,int mes,int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = LocalDate.of(anio, mes, dia);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public abstract String toString();
}
