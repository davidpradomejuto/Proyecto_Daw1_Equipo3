/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author david
 */
public class Agenda {

    SortedSet<Persona> matriz;

    public Agenda() {
        matriz = new TreeSet<>();
    }

    public void insertar() {
        matriz.add(new Persona());
    }

    public void borrar() {
        boolean dnivalido = false;
        String dni = "";
        do {
            dni = Teclado.pedirDni("Introduce el Dni");
            dnivalido = Teclado.validarDni(dni);
        } while (!dnivalido);

        boolean encontrada = false;
        
        /*for (Persona persona : matriz) {
            if (persona.getDNI().equalsIgnoreCase(dni) && !encontrada) {
                encontrada = true;
                if (matriz.remove(persona)) {
                    System.out.println("Persona Borrada");
                } else {
                    System.out.println("Error: Persona no borrada");
                }

            }
        }
*/

        Iterator<Persona> it = matriz.iterator();
        while (it.hasNext() && !encontrada) {
            Persona aux = it.next();

            if (aux.getDNI().equalsIgnoreCase(dni) && !encontrada) {
                encontrada = true;
                try {
                    it.remove();
                    System.out.println("Jugador Borrado");
                } catch (UnsupportedOperationException uoe) {
                    System.out.println("error...");
                    System.out.println(uoe.getMessage());
                } catch (Exception e) {
                    System.out.println("Error...");
                    System.out.println(e.getMessage());
                }
            }
        }
       
        if (!encontrada) {
            System.out.println("Persona no encontrada");
        }
    }

    public void mostrar() {
        System.out.println("Mostrando datos de todos los contactos");
        for (Persona persona : matriz) {
            System.out.println(persona.toString());
        }
    }

    public void BuscarPorDni() {

        boolean dnivalido = false;
        String dni = "";
        do {
            dni = Teclado.pedirDni("Introduce el Dni");
            dnivalido = Teclado.validarDni(dni);
        } while (!dnivalido);

        boolean encontrada = false;
        for (Persona persona : matriz) {
            if (persona.getDNI().equalsIgnoreCase(dni) && !encontrada) {
                encontrada = true;
                System.out.println(persona.toString());

            }
        }
        if (!encontrada) {
            System.out.println("Persona no encontrada..");
        }

    }

    public void modificarPorDni(String dni) {
        boolean encontrada = false;
        String newDni = "";

        Persona persona = null;

        Iterator<Persona> it = matriz.iterator();
        while (it.hasNext()) { // busca cada pesona
            persona = it.next();

            if (persona.getDNI().equalsIgnoreCase(dni) && !encontrada) { // si lo encuentra pide un Dni y lo asigna
                encontrada = true;

                boolean dnivalido = false;
                do {
                    dni = Teclado.pedirDni("Introduce el Nuevo Dni");
                    if(Teclado.validarDni(dni)){
                        persona.setDNI(newDni);
                        
                        dnivalido = true;
                    }else{
                        System.out.println("Error Dni invalido");
                    }
                } while (!dnivalido);

            }
        }

        if (!encontrada) {
            System.out.println("Persona no encontrada..");
        }

    }
}
