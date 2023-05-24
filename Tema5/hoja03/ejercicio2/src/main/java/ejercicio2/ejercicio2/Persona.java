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
public abstract class Persona {

    private String dni;
    private String nombre;
    private String direccion;

    public Persona() {
        boolean dnicorrecto = false;
        do {
            System.out.println("Introduce el DNI: ");
            dni = new Scanner(System.in).nextLine();
            
            if (checkDni(dni)) {
                dnicorrecto = true;
            } else {
                System.out.println("Dni incorrecto, intentalo de nuevo");
            }
        } while (!dnicorrecto);

        System.out.println("Introduce el nombre: ");
        nombre = new Scanner(System.in).nextLine();

        System.out.println("Introduce la direccion: ");
        direccion = new Scanner(System.in).nextLine();

    }

    private boolean checkDni(String checkdni) {
        boolean correcto = true;

        if (checkdni.length() != 9) {
            correcto = false;
        } else {
            int i = 0;
            if (Character.isLetter(checkdni.charAt(8))) {
                while (correcto == true && i < 7) {

                    char c = checkdni.charAt(i);
                    if (Character.isDigit(c)) {

                    } else {
                        correcto = false;
                    }

                    i++;
                }
            } else {
                correcto = false;
            }

        }

        return correcto;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String mostrar() {
        return " Nombre: " + nombre + " direccion: " + direccion + " \n";
    }

}
