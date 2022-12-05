/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Comunidad {

    private String nComunidad;
    private String[] provincias;

    public Comunidad(String newNcomunidad, int nProvincias) {

        provincias = new String[nProvincias];//dimensiono el array  

        nComunidad = newNcomunidad; //asigno el nombre de la comunidad de los argumentos

        for (int i = 0; i < provincias.length; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce de la provincia " + i + " : ");
            provincias[i] = teclado.nextLine();
        }
    }

    public String mostrar() {

        String result = "";

        result = result.concat(nComunidad + " ");
        for (int i = provincias.length - 1; i > 0; i--) {
            String nProvincia = provincias[i];

            if (nProvincia.length() >= 4) {
                nProvincia = nProvincia.substring(0, 4);
                nProvincia = nProvincia.toUpperCase();
                nProvincia = nProvincia.concat(" ");

            } else {
                nProvincia = String.valueOf(nProvincia.length());
            }

            result = result.concat(nProvincia);
        }

        return result;

    }

    public String sorteo() {
        String result = "";
        int random = (int) Math.floor(Math.random() * provincias.length) + 1;
        return result = provincias[random];
    }

    public int buscar(String newNprovincia) {
        int result = 0;

        for (int i = 0; i < provincias.length; i++) {
            String nombre = provincias[i];
            nombre = nombre.toLowerCase();

            if (nombre.contains(newNprovincia)) {
                result = 1;
                i=provincias.length;
            } else {
                result = -1;
            }
        }
        return result;
    }

}
