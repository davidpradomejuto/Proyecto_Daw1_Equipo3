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
public class Alumno extends Persona {

    private int[] notas;

    public Alumno(int nNotas) {
        super();
        if (super.getDni().length() != 7) {
            System.out.println("El DNI no tiene la longitud correcta");
        } else {
            notas = new int[nNotas];
            for (int i = 0; i < nNotas; i++) {

                System.out.println("Introduce la nota " + (i + 1) + " :");
                notas[i] = new Scanner(System.in).nextInt();
            }
        }

    }

    @Override
    public String mostrar() {
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        media /= notas.length;

        String stringMedia = String.format("La media es %,.2f", media);

        return " Dni: " + super.getDni() + " direccion: " + super.getDireccion() + "  nombre : " + super.getNombre() + " Nota media = " + stringMedia + " \n";
    }

}
