/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Banco a = new Banco(10);
        int opcion = 0;
        while (opcion != 5){
            System.out.println("Introduce la opcion que quieras");
            opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1 -> {
                    a.ingresar();
                }
                case 2 -> {
                    a.mostrar();
                }
                case 3 -> {
                    System.out.println(a.buscar()); 
                }
                case 4 -> {
                    System.out.println("Introduce el id del usuario a eliminar");    
                    int idCliente = new Scanner(System.in).nextInt();
                    
                    a.eliminar(idCliente);
                }
                case 5 -> {
                    System.out.println("ADIOS!!");
                }
                default -> {
                    System.out.println("Opcion erronea");
                }
            }
        }

        a.eliminar(3);
        System.out.println("");
        a.mostrar();

    }
}
