/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio3.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Empresa e = new Empresa();

        int opc;

        do {
            System.out.println("Menu de la empresa");
            System.out.print("1-Listar los datos de todos los contenedores almacenados\n2- Almacenar un contenedor\n3- Retirar un contenedor\n0- Salir\n");

            System.out.println("Ingresa una opcion: ");
            opc = new Scanner(System.in).nextInt();
            switch (opc) {
                case 1 ->
                    e.listar();
                case 2 -> {
                    e.almacenar();
                }
                case 3 ->
                    e.retirar();
                case 0 ->
                    System.out.println("Saliendo...");
                default ->
                    System.out.println("Opcion incorrecta");
            }
        } while (opc != 0);
    }
}
