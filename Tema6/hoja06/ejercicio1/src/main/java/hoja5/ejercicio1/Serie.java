/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;


/**
 *
 * @author DAW118
 */
public class Serie {

    private String nombre;
    private Tematica tematica;
    private String nacionalidad;
    private boolean finalizada;
    private int temporadas;

    Map<String, Capitulo> matriz;

    public Serie(String nombre, Tematica tematica, String nacionalidad, boolean finalizada, int temporadas) {
        this.nombre = nombre;
        this.tematica = tematica;
        this.nacionalidad = nacionalidad;
        this.finalizada = finalizada;
        this.temporadas = temporadas;
        matriz = new HashMap();
    }
    

    public String generaClaveCapitulo(Capitulo capitulo) {
        String result = "";
        result = result.concat(nombre.substring(0, 4));
        result = result.concat(String.valueOf(capitulo.getNcapitulo()) + "X" + String.valueOf(capitulo.getNtemporada()));
        return result;
    }

    public boolean insertarCapitulo(Capitulo capitulo) {
        boolean insertado= false;
        try {
            matriz.put(generaClaveCapitulo(capitulo), capitulo);
            System.out.println("Capitulo introducido");
            insertado = true;
        } catch (Exception e) {
            System.out.println("Error...");
            System.out.println(e.getMessage());
        }
        return insertado;
    }

    public boolean eliminarCapitulo(String clave) {
        boolean eliminado = false;
        try {
            if (matriz.remove(clave)!=null){
                System.out.println("Capitulo borrado...");
                eliminado = true;
            }else {
                System.out.println("Error... capitulo no borrado");
            }
            
        } catch (Exception e) {
            System.out.println("Error...");
            System.out.println(e.getMessage());
        }      
        return eliminado;
 
    }
    
    public void visualizaCapitulos(){
        for (Map.Entry<String, Capitulo> capitulo : matriz.entrySet()) {
            String clave = capitulo.getKey();
            Capitulo valor = capitulo.getValue();
            System.out.println(clave + "  ->  " + valor.toString());
        }
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.nombre);
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
        final Serie other = (Serie) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tematica getTematica() {
        return tematica;
    }

    public void setTematica(Tematica tematica) {
        this.tematica = tematica;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public Map<String, Capitulo> getMatriz() {
        return matriz;
    }

    public void setMatriz(Map<String, Capitulo> matriz) {
        this.matriz = matriz;
    }

    @Override
    public String toString() {
        String estado = "";
        if (this.finalizada){estado = "si";}else{estado = "no";}
        return "Nombre: " + nombre + ", tematica: " + tematica + ", nacionalidad: " + nacionalidad + ", finalizada:" +estado+ ", temporadas: " + temporadas;
    }
    
    
    
    

}
