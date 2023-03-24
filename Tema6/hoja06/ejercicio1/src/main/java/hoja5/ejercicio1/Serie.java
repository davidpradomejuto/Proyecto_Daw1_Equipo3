/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

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

    public void insetarCapitulo(String clave, Capitulo capitulo) {
        try {
            matriz.put(generaClaveCapitulo(capitulo), capitulo);
            System.out.println("Capitulo introducido");
        } catch (Exception e) {
            System.out.println("Error...");
            System.out.println(e.getMessage());
        }
    }

    public void eliminarCapitulo(String clave) {
        try {
            if (matriz.remove(clave)!=null){
                System.out.println("Capitulo borrado...");
            }else {
                System.out.println("Error... capitulo no borrado");
            }
            
        } catch (Exception e) {
            System.out.println("Error...");
            System.out.println(e.getMessage());
        }
        
    }
    
    public void visualizaCapitulos(){
        for (Map.Entry<String, Capitulo> capitulo : matriz.entrySet()) {
            String clave = capitulo.getKey();
            Capitulo valor = capitulo.getValue();
            System.out.println(clave + "  ->  " + valor.toString());
        }
    }

}
