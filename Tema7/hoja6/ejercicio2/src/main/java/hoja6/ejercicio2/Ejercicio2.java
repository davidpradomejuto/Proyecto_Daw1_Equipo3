/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja6.ejercicio2;

import java.io.Serializable;

/**
 *
 * @author DAW118
 */
public class Ejercicio2 implements Serializable {

    public static void main(String[] args) {
         int opcion = 0;
         Fichero fichero = new Fichero();
        do {
            System.out.println("1.- Añadir entrada..\n"
                    + "2.- Listar entradas agenda.\n"
                    + "3.- Buscar en la agenda.\n"
                    + "4.- Borrar entrada en la agenda.\n"
                    + "5.- Borrar fichero de clientes.\n"
                    + "6.- Salir.\n");

            opcion = Teclado.pedirIntPositivo("Introduce la opcion deseada..");

            switch (opcion) {
                case 1 -> {
                    Persona persona = new Persona();
                    fichero.escribir(persona);
                    System.out.println("persona añadida....");
                }
                case 2 -> {
                    System.out.println("Lista de personas....");
                    fichero.leer();
                }
                case 3 -> {
                    String nombre = Teclado.pedirNombre("Introduce el nombre de la persona que quieras buscar...");
                    fichero.Buscar(nombre);

                }case 4 -> {
                     String nombre = Teclado.pedirNombre("Introduce el nombre de la persona que quieras Borrar...");
                    fichero.Borrar(nombre);
                }
                case 5 -> {
                    fichero.BorrarFichero();
                }
                case 6 -> {
                    System.out.println("Adios....");
                }
                default -> {
                    System.out.println("Opcion no valida....");
                }
            }
        } while (opcion != 6);
    }
}
