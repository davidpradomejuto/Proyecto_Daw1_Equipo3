/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tema5.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author atres
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Academia a = new Academia();

        int opc;

        do {
            System.out.println("Menu de la Academia");
            System.out.print("1- Añadir un nuevo curso al final de la lista\n2- Insertar un nuevo curso en cualquier posicion\n3- Borrar un curso dado su código\n4- Modificar el numero de Horas de un curso dado su codigo\n");
            System.out.print("5- Mostrar todos los cursos\n\0- Salir\n");
            
            System.out.println("Ingresa una opcion: ");
            opc = teclado.nextInt();
            switch (opc) {
                case 1 ->
                    a.aniadirCursoFinal();
                case 2 -> {
                    a.insertarCurso();
                }
                case 3 ->
                    a.borrarCurso();
                case 4 ->
                    a.modificarnHoras();
                case 5 ->
                    a.mostrar();
                case 0 ->
                    System.out.println("Saliendo...");
                default ->
                    System.out.println("Opcion incorrecta");
            }
        } while (opc != 0);
    }
}
