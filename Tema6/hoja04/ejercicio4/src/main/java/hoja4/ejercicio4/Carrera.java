/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio4;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author david
 */
public class Carrera {
    Set<Atleta> matriz;

    public Carrera() {
        matriz = new LinkedHashSet<>();
    }
    
    public void insertar() {

        Atleta o = new Atleta();

        if (matriz.add(o)) {
            System.out.println("Atleta Introducido.");
        } else {
            System.out.println("Atleta no introducido, puede que este repetido.");
        }
    }
    
    public void tiempoMedio() {

        int suma = 0;
        
        for (Atleta a : matriz){
            suma+=a.getTiempo();
        }
        
        System.out.println("El tiempo medio es de:"+suma/matriz.size());
    }
}
