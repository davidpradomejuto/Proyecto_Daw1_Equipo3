/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Agenda {

    SortedSet<Persona> matriz = new ArrayList<>();

    public Agenda() {
    }

    public void insertar() {

        if (matriz.add(new Persona())) {
            System.out.println("Persona insertada......");
        } else {
            System.out.println("Error: Persona no insertada");
        }

    }

    public void borrarPorDni(String dni) {
        boolean encontrada = false;
        for (Persona persona : matriz) {
            if (persona.getDNI().equalsIgnoreCase(dni) && !encontrada) {
                encontrada = true;
                if (matriz.remove(persona)) {
                    System.out.println("Persona Borrada");
                } else {
                    System.out.println("Error: Persona no borrada");
                }

            }
        }

        if (!encontrada) {
            System.out.println("Persona no encontrada");
        }
    }

    public void ordenar() {
        Collections.sort(matriz);
        System.out.println("Array ordenado.....");
    }

    public void mostrar() {
        System.out.println("Mostrando datos de todos los contactos");
        for (Persona persona : matriz) {
            System.out.println(persona.toString());
        }
    }

    public void mostrarPorDni(String dni) {
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
        for (Persona persona : matriz) {
            if (persona.getDNI().equalsIgnoreCase(dni) && !encontrada) {
                encontrada = true;
                
                int opcion = 0;

                do {
                    System.out.println("Introduce que quieres modificar \n 1.nombre \n 2.Apellidos \n 3.salir");;
                    opcion = new Scanner(System.in).nextInt();
                    switch (opcion) {
                        case 1 -> {
                            System.out.println("El nombre actual es :" + persona.getNombre());

                            boolean nombrevalido = false;

                            do {
                                String posibleNombre = Teclado.pedirNombre("Introduce el nombre de la persona: ");

                                if (ValidaDatos.validarNombre(posibleNombre)) {
                                    nombrevalido = true;
                                    System.out.println("Nombre correcto");
                                    persona.setNombre(posibleNombre);
                                } else {
                                    System.out.println("Nombre Invalido repite");
                                }
                            } while (!nombrevalido);

                        }
                        case 2 -> {

                            System.out.println("El appelido actual es" + persona.getApellidos());

                            boolean apellidovalido = false;

                            do {
                                String posibleApellido = Teclado.pedirNombre("Introduce el apellido de la persona: ");

                                if (ValidaDatos.validarNombre(posibleApellido)) {
                                    apellidovalido = true;
                                    System.out.println("apellido correcto");
                                    persona.setApellidos(posibleApellido);
                                } else {
                                    System.out.println("apellido Invalido repite");
                                }
                            } while (!apellidovalido);
                        }
                        case 3 -> {
                            System.out.println("Fin del programa");
                        }
                        default -> {
                            System.out.println("Opcion no valida");
                        }
                    }
                } while (opcion != 3);

            }
        }
        if (!encontrada) {
            System.out.println("Persona no encontrada..");
        }

    }
}
