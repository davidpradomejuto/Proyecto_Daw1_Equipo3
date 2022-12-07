/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio3.ejercicio3;

import java.util.Scanner;

/**
 *
 * David Prado Mejuto, DAW118 Ejercicio 3 del examen de programacion unidad 3
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int caramelos = 1, totalVendidos = 0, totalRegalados = 0, totalEnvoltorios = 0;

        do {
            Scanner teclado = new Scanner(System.in); //instancio la clase teclado

            System.out.println("Introduce caramelos vendidos, 0 para acabar: ");
            caramelos = teclado.nextInt(); //pido el precio del producto

            /*CALCULOS DE LOS CARAMELOS */
            totalRegalados += caramelos / 5; //calculo los caramelos que regalo en esta venta y lo sumo al total de caramelos reagalados
            totalEnvoltorios += caramelos % 5;//calculo los envoltorios que me deberian sobrar
            totalVendidos += caramelos; //sumo al total de caramelos vendidos los que acabo de vender

        } while (caramelos != 0); //si total es distinto se ejecuta lo anterior repetidamente

        /*MUESTRO LOS DATOS POR PANTALLA */
        System.out.println("Caramelos Vendidos: " + totalVendidos);
        System.out.println("Caramelos Regalados: " + totalRegalados);
        System.out.println("Envoltorios: " + totalEnvoltorios);

        //si los caramelos que he recibido por cada caramelos regalado mas los que he recibido sobrante, son iguales a los totales vendidos
        //muestra un mensaje de si es rentable o no
        if ((totalRegalados * 5) + totalEnvoltorios == totalVendidos) {
            System.out.println("Es rentable");
        } else {
            System.out.println("No es rentable");
        }
    }
}
