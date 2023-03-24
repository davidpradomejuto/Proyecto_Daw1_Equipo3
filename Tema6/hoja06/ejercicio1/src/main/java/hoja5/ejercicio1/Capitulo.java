/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio1;

/**
 *
 * @author DAW118
 */
public class Capitulo {
    private int Ntemporada;
    private int Ncapitulo;
    private String descripcion;

    public Capitulo(int Ntemporada, int Ncapitulo, String descripcion) {
        this.Ntemporada = Ntemporada;
        this.Ncapitulo = Ncapitulo;
        this.descripcion = descripcion;
    }
    
    public Capitulo (){
        this.Ntemporada = Entrada.pedirIntPositivo("Introduce el numero de la temporada.");
        this.Ncapitulo = Entrada.pedirCapitulo("Introduce el numero del capitulo.");
        this.descripcion = Entrada.pedirNombreRegex("Introduce la descripcion del capitulo.");
    }

    public int getNtemporada() {
        return Ntemporada;
    }

    public void setNtemporada(int Ntemporada) {
        this.Ntemporada = Ntemporada;
    }

    public int getNcapitulo() {
        return Ncapitulo;
    }

    public void setNcapitulo(int Ncapitulo) {
        this.Ncapitulo = Ncapitulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Ntemporada: " + Ntemporada + ", Ncapitulo: " + Ncapitulo + ", descripcion: " + descripcion + "\n";
    }
    
    
    
}
