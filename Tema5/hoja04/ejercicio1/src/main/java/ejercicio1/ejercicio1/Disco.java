/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author david
 */
public class Disco extends Publicacion {
    
    private int duracionMinutos;

    public Disco(int duracionMinutos, String titulo, String autor, int dia, int mes, int anio) {
        super(titulo, autor, dia, mes, anio);
        this.duracionMinutos = duracionMinutos;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDurecionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
        DateTimeFormatter esDateFormat = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy")
                .withLocale(new Locale("es","ES"));
        return "titulo: "+titulo+" Duracion = " + duracionMinutos +" autor: "+autor+
                " fecha de publicacion: "+super.getFecha().format(esDateFormat) ;
    }
    
    
    
}
