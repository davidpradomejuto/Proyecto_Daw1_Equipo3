/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.ejercicio3;

import java.util.Arrays;

/**
 *
 * @author DAW118
 */
public class Agenda implements Comparable<Agenda>{

    private int contador;
    private Contacto[] matriz;

    public Agenda(int tamanio) {
        this.contador = 0;
        matriz = new Contacto[tamanio];
    }

    public void insertar(Contacto newcontacto) {
        matriz[contador] = newcontacto;
    }

    public void buscar(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            if (matriz[i].getNombre().contentEquals(nombre)) {
                encontrado = true;
                i = contador;
            }
        }

        if (!encontrado) {
            System.out.println("Contacto no encontrado.");
        } else {
            System.out.println("Contacto " + nombre + "encontrado.");
        }
    }

    public void eliminar(String nombreContacto) {
        int posicionInicial = 0;
        for (int i = 0; i < contador; i++) {
            if (matriz[i].getNombre().contentEquals(nombreContacto)) {
                posicionInicial = i;
            }
        }

        for (int i = contador; i > posicionInicial; i++) {
            Contacto auxobj;

            auxobj = matriz[i - 1];
            matriz[i - 1] = matriz[i];
            matriz[i - 2] = auxobj;
        }
        contador--;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < contador; i++) {
            result = result.concat(matriz[i].toString());
        }

        return result;
    }
    
    public void ordenar

}
