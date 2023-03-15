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
        Curso c1= new Curso();
        Curso c2=new Curso(12,"2C",200);
        Curso c3= new Curso();
        Curso c4=new Curso(40,"3D",350);
        int opc;
        System.out.println("Menú de la Academia");
        System.out.println("");
        System.out.println("1- Añadir un nuevo curso al final de la lista");
        System.out.println("2- Insertar un nuevo curso en cualquier posición");
        System.out.println("3- Borrar un curso dado su código");
        System.out.println("4- Modificar el número de Horas de un curso dado su código");
        System.out.println("5- Mostrar todos los cursos");
        System.out.println("0- Salir");
        do {
            System.out.println("Ingresa una opción: ");
            opc = teclado.nextInt();
            switch (opc) {
                case 1 ->
                    a.añadirCursoFinal(c1);
                case 2 ->{
                    System.out.println("Insertando datos...");
                    a.insertarCurso(c2, 0);
                    a.insertarCurso(c3, 1);
                    a.insertarCurso(c4, 2);
                }
                case 3 ->
                    a.borrarCurso(34);
                case 4 ->
                    a.modificarnHoras(15, 350);
                case 5 ->
                    a.mostrar();
                case 0 ->
                    System.out.println("Saliendo...");
                default ->
                    System.out.println("Opción incorrecta");
            }
        } while (opc != 0);
    }
}
