/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio5;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author DAW118
 */
public abstract class Publicacion {
    
    protected String titulo;
    protected String autor;
    protected LocalDate fecha;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.titulo);
        hash = 89 * hash + Objects.hashCode(this.autor);
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
        final Publicacion other = (Publicacion) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }

    public Publicacion(String titulo, String autor, int dia,int mes,int anio) {
        try{
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = LocalDate.of(anio, mes, dia);
        }catch (DateTimeException DTE ){
            System.out.println("Fecha no valida");
        }catch (Exception e){
            System.out.println("Error indeterminado");
            System.out.println(e.getMessage());
        }
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
