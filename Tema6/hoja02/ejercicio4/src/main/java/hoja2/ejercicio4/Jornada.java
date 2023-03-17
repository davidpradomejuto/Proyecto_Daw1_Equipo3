/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio4;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DAW118
 */
public class Jornada {

    ArrayList<Partido> matriz = new ArrayList<>();
    private int contador;

    public Jornada() {
        this.contador = 0;

    }

    public void insertar(Partido p) {
        if (matriz.add(p)) {
            System.out.println("Partido insertado.");
            contador++;
        } else {
            System.out.println("Error, partido no insertado.");
        }
    }

    public void numeroPartidos() {
        System.out.println("Dentro de larray hay " + contador + " partidos.");
    }

    public void mostrar() {
        System.out.println("Mostrando datos de todos los partidos");
        for (Partido partido : matriz) {
            System.out.println(partido.toString());
        }
    }

    public void borrarEmpates() {
        System.out.println("Borrar todos los partidos que sean empates.");
        Iterator<Partido> it = matriz.iterator();
        while (it.hasNext()) {
            Partido partido = it.next();
            
            if (partido.getGolesLocal() == partido.getGolesVisitante()) {
                it.remove();    
            }
        }

    }

}
