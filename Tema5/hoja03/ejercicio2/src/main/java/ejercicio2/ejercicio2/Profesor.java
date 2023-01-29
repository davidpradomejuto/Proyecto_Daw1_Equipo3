/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Profesor extends Persona {

    private String[] asignaturas;

    public Profesor(int nAsignaturas) {
        super();
        if (super.getDni().length() != 7) {
            System.out.println("El DNI no tiene la longitud correcta");
        } else {
            asignaturas = new String[nAsignaturas];
            for (int i = 0; i < asignaturas.length; i++) {

                System.out.println("Introduce la asginatura " + (i + 1) + " :");
                asignaturas[i] = new Scanner(System.in).nextLine();
            }
        }

    }

    @Override
    public String mostrar() {
        String stringAsignaturas = "";

        for (int i = 0; i < asignaturas.length; i++) {
            stringAsignaturas = stringAsignaturas.concat(asignaturas[i] + ", ");
        }

        return " Dni: " + super.getDni() + " direccion: " + super.getDireccion() + " nombre : " + super.getNombre() + " Asignaturas  : " + stringAsignaturas + " \n";
    }
}
