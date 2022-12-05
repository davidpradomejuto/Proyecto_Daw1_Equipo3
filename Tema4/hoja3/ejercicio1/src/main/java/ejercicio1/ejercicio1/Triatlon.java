/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Triatlon {

    private int dorsal;
    private String nombre;
    private int[] pruebas;

    public Triatlon(int newDorsal, String newNombre, int nPruebas) {
        pruebas = new int[nPruebas];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < pruebas.length; i++) {
            System.out.println("Introduce la puntuacion de la prueba " + i + ": ");
            pruebas[i] = teclado.nextInt();
        }
    }

    public Triatlon() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu dorsal");
        this.dorsal = teclado.nextInt(); //pido el dorsal del participante

        System.out.println("Introduce tu nombre");
        this.nombre = teclado.next(); // pido el nombre del participante

        System.out.println("Introduce el numero de pruebas");
        int nPruebas = teclado.nextInt(); //pido el numero de pruebas

        pruebas = new int[nPruebas]; //dimensiono el array 

        for (int i = 0; i < pruebas.length; i++) { //pido las puntuaciones del array
            System.out.println("Introduce la puntuacion de la prueba " + i + ": ");
            pruebas[i] = teclado.nextInt(); 
        }
    }

    public double pMedia() {
        double media = 0d;
        int suma = 0;
        for (int i = 0; i < pruebas.length; i++) {
            suma += pruebas[i]; //hago la suma
        }
        media = suma / (pruebas.length - 1); //calculo la media de todos los puntos
        return media; //muestro la media
    }

    public Seleccionado esSeleccionado() {
        Seleccionado estado = Seleccionado.Falso;
        for (int i = 0; i < pruebas.length; i++) {
            if (pruebas[i] == 10) {
                estado = Seleccionado.Verdadero; // si algun elemento del array es 10 , el enumerado "estado" es verdadero
            }
        }

        return estado;
    }

    public String mostrar() {
        String lista = "";
        for (int i = 0; i < pruebas.length; i++) {

            if (i == pruebas.length - 1) {
                lista = lista.concat(String.valueOf(pruebas[i])); // si es el ultimo elemento del String no pongo la coma final
            } else {
                lista = lista.concat(String.valueOf(pruebas[i] + ",")); // si no es el ultimo elemento del String el pongo la coma final
            }
        }

        return "Dorsal = " + dorsal + " Nombre = " + nombre + " Puntos = " + lista + " Media = " + String.valueOf(pMedia()); //muestro toda la cadena
    }

}
