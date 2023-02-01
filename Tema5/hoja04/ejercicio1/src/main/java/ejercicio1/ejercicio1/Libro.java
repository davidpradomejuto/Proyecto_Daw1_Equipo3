/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author DAW118
 */
public class Libro extends Publicacion {
    
    private int numPaginas;
    
    public Libro(String newtitulo,String newautor,int newdia,int newmes,int newanio,int numpags){
        super(newtitulo,newautor,newdia,newmes,newanio);
        this.numPaginas=numpags;   
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        
        DateTimeFormatter esDateFormat = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy").withLocale(new Locale("es","ES"));
        return "titulo: "+titulo+" numPaginas = " + numPaginas +" autor: "+autor+
                " fecha de publicacion: "+super.getFecha().format(esDateFormat) ;
    }

    
    
    
}
