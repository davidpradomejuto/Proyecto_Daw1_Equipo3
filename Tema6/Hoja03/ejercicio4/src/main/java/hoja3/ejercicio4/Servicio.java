/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author DAW118
 */
public class Servicio {

    Queue<Cliente> matriz;

    public Servicio() {
        matriz = new LinkedList<>();
    }

    public void insertar() {
        if (matriz.add(new Cliente())) {

            System.out.println("Cliente añadido");
        } else {
            System.out.println("Error... cliente no añadido");
        }
    }

    public void atenderCliente() {
        String nombreCliente = Teclado.pedirNombre("Introduce el nombre del cliente que quieres atender.");
        boolean encontrado = false;
        for (Cliente cliente : matriz) {
            if (cliente.getNombre().equalsIgnoreCase(nombreCliente) && !encontrado) {
                encontrado = true;
                System.out.println("Cliente " + cliente.getNombre() + " atendido...");
                cliente.setFechaAtencion(LocalDateTime.now());
            }
        }

        if (!encontrado) {
            System.out.println("Cliente no encontrado...");
        }

    }

    public void mediaEspera() {
        int sumaTiempo = 0;
        int size = 0;
        for (Cliente cliente : matriz) {
            if (cliente.getFechaAtencion() == null) {
                size++;
                Duration duration = Duration.between(cliente.getFechaLlegada(),LocalDateTime.now());
                sumaTiempo += duration.getSeconds();
            }
        }

        sumaTiempo /= matriz.size();

        System.out.print("La media de espera es de :");
        int dias = 0;
        int horas = 0;
        int minutos = 0;
        int segundos = 0;
        
        dias =  sumaTiempo / 86400;
        sumaTiempo =  sumaTiempo % 86400;
        horas =  sumaTiempo / 3600;
        sumaTiempo = sumaTiempo % 3600;
        minutos = sumaTiempo / 60;
        segundos = sumaTiempo % 60;

        System.out.println(dias+" dias ,"+horas + " horas, " + minutos + " minutos, " + segundos + " segundos");
    }

    public void mediaEsperaAtendidos() {
        int sumaTiempo = 0;
        int size = 0;

        for (Cliente cliente : matriz) {
            if (cliente.getFechaAtencion() != null) {
                size++;
                Duration duration = Duration.between(cliente.getFechaLlegada(),cliente.getFechaAtencion());
                sumaTiempo += duration.getSeconds();
            }
        }

        sumaTiempo /= size;

        System.out.print("La media de espera es de :");
        int dias = 0;
        int horas = 0;
        int minutos = 0;
        int segundos = 0;
        
        dias =  sumaTiempo / 86400;
        sumaTiempo =  sumaTiempo % 86400;
        horas =  sumaTiempo / 3600;
        sumaTiempo = sumaTiempo % 3600;
        minutos = sumaTiempo / 60;
        segundos = sumaTiempo % 60;

        System.out.println(dias+" dias ,"+horas + " horas, " + minutos + " minutos, " + segundos + " segundos");
    }

    public void mostrar(){
        System.out.println("Datos de los clientes no atendidos: ");
        for (Cliente cliente : matriz) {
            if (cliente.getFechaAtencion() == null){
                System.out.println(cliente.toString());
            }
        }
        System.out.println("Datos de los clientes atendidos: ");
        for (Cliente cliente : matriz) {
            if (cliente.getFechaAtencion() != null){
                System.out.println(cliente.toString());
            }
        }
    }
}
