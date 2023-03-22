/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio5;

import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Locale;

/**
 *
 * @author DAW118
 */
public class Disco extends Publicacion {
    
    private int duracionMinutos;

    public Disco(int duracionMinutos, String titulo, String autor, int dia, int mes, int anio) {
        
        super(titulo, autor, dia, mes, anio);
        try {
        this.duracionMinutos = duracionMinutos;
        }catch(InputMismatchException ime){
            System.out.println("La duracion introducida no es un numero");
        }catch(Exception e){
            System.out.println("Error..");
            System.out.println(e.getMessage());
        }
        
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
