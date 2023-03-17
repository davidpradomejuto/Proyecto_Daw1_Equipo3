/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja3.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Servicio s = new Servicio();

        int opc;

        do {
            System.out.println("Menu del servicio");
            System.out.print("1- Añadir un nuevo cliente\n2- Atender un cliente\n3- Tiempo medio de los no atendidos\n4- Tiempo medio de los atendidos\n");
            System.out.print("5- Mostrar todos los clientes\n0- Salir\n");

            System.out.println("Ingresa una opcion: ");
            opc = new Scanner(System.in).nextInt();
            switch (opc) {
                case 1 ->
                    s.insertar();
                case 2 -> {
                    s.atenderCliente();
                }
                case 3 ->
                    s.mediaEspera();
                case 4 ->
                    s.mediaEsperaAtendidos();
                case 5 ->
                    s.mostrar();
                case 0 ->
                    System.out.println("Saliendo...");
                default ->
                    System.out.println("Opcion incorrecta");
            }
        } while (opc != 0);
    }

}
