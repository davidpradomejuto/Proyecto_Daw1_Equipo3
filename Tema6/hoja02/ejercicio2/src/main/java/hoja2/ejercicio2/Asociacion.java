/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author DAW118
 */
public class Asociacion {

    ArrayList<Persona> matriz = new ArrayList<>();

    public Asociacion() {

    }

    public void insertar() {
        matriz.add(new Persona());
        System.out.println("Persona insertada......");
    }

    public void buscarPorDni(String dni) {

        for (Persona persona : matriz) {
            if (persona.getDNI().equalsIgnoreCase(dni)) {

                System.out.println("Datos de la persona con Dni " + dni);
                System.out.println("Datos de la persona :\n"
                        + persona.getNombre() + "\n"
                        + persona.getFechaDeNacimiento().toString() + "\n"
                        + "edad = "+persona.getEdad());
            }
        };
    }

    public double ListarDatos() {
        double sumatotal = 0;

        for (Persona persona : matriz) {
            if (persona.getEdad() >= 5 && persona.getEdad() <= 10) {
                sumatotal += 1;
            } else if (persona.getEdad() >= 11 && persona.getEdad() <= 17) {
                sumatotal += 2.5;
            } else if (persona.getEdad() >= 18) {
                sumatotal += 3.5;
            }
        }

        return sumatotal;
    }
    
    public void ordenarPorDni(){
       Collections.sort(matriz);
        System.out.println("Array ordenado");
    }
    
    public void ordenarPorNombre(){
        Comparator<Persona> compPersona=new Comparator<>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getNombre().compareToIgnoreCase(o2.getNombre());
            }
        };
        Collections.sort(matriz,compPersona);
    }
}
