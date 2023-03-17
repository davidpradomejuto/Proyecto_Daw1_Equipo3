/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.ejercicio3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.LinkedList;

/**
 *
 * @author david
 */
public class Empresa {

    private LinkedList<Contenedor> matriz;

    public Empresa() {
        matriz = new LinkedList<>();
    }

    public Contenedor almacenar() {
        Contenedor c = new Contenedor();

        int size = matriz.size();
        try {
            matriz.addLast(c);
            System.out.println("Contenedor añadido");

        } catch (Exception e) {
            System.out.println("Error...");
            System.out.println(e.getMessage());
        }
        return c;
    }

    public void listar() {
        System.out.println("Mostrando los contenedores de la pila");
        for (Contenedor c : matriz) {
            System.out.println(c.toString());
        }
    }

    public void retirar() {
        
        if (!matriz.isEmpty()) {
            Contenedor aux = matriz.removeLast();
            System.out.println("Datos del contenedor:");
            System.out.println(aux.toString());
            System.out.println("Tiempo en el contenedor");
            Duration duration = Duration.between(aux.getFecha(), LocalDateTime.now());

            if (duration.getSeconds() > 59) {
                if (duration.getSeconds() > 3600) {
                    if (duration.getSeconds() > 86600) {
                        System.out.println("El tiempo almacenado en horas es de :" + duration.getSeconds() / 3600);
                    }
                } else {
                    System.out.println("El tiempo almacenado en minutos es de :" + duration.getSeconds() / 60);
                }
            } else {
                System.out.println("El tiempo almacenado en segundos es de :" + duration.getSeconds());
            }
        }
    }
}
