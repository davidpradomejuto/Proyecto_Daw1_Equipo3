/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author DAW118
 */
public class Mundo {

    Set<String> matriz;
    String nombre = "";

    public Mundo() {
        matriz = new HashSet<>();
    }

    public void insertar() {
        this.nombre = pedirNombre("Introduce el nombre del pais. ");
        if (matriz.add(nombre)) {
            System.out.println("Pais Introducido.");
        } else {
            System.out.println("Pais no introducido, puede que este repetido.");
        }

    }

    public void borrar() {
        this.nombre = pedirNombre("Introduce el nombre del pais que quieres borrar. ");

        if (matriz.remove(nombre)) {
            System.out.println("Pais borrado.");
        } else {
            System.out.println("Error. Pais no borrado.");
        }
    }

    public void listar() {
        System.out.println("Mostrando paises:");
        for (String n : matriz) {
            System.out.println("Nombre del pais : " + n);
        }
    }

    public static String pedirNombre(String mensaje) { // este metodo me sirve para recoger un nombre, tambien lo uso para pedir los apellidos del alumno, hace lo mismo que el del pedir un color
        // pero recibiendo la frase que va a mostrar por pantalla mediante parametros

        String regex = "[A-ZÉÁÍÓÚÑ][a-zéáíóúñ ]*";
        boolean valido = false;
        String nombre;

        do {

            System.out.print(mensaje);
            nombre = new Scanner(System.in).nextLine();
            if (nombre.matches(regex)) {
                valido = true;
            }else{
                System.out.println("Error. La cadena no cumple los requisitos");
            }

        } while (!valido);

        return nombre;

    }
}
