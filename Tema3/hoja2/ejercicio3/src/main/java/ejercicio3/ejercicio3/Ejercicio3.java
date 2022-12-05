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
        Scanner teclado = new Scanner(System.in);
        double result = 0;
        
        System.out.println("Introduce el numero para calcular: ");
        int numeroCalcular = teclado.nextInt();

        System.out.println("MOSTRANDO OPCIONES:\n\t1. calcular el cuadrado del número leído.\n\t2. calcular el doble del número.\n\t3. calcular la raiz cuadrada del numero");
        System.out.println("Introduce el numero de la seleccion: ");
        int seleccion = teclado.nextInt();
        
        String cadenaResult = "";
        switch (seleccion) {
            case 1 -> {
                result = Math.pow(numeroCalcular,2);
                cadenaResult= String.format("El cuadrado del numero es :  %,.0f",result);
            }
            case 2 -> {
                result = numeroCalcular * 2;
                cadenaResult= String.format("El doble del numero es : %,.0f",result);
            }
            case 3 -> {
                cadenaResult= String.format("La raiz cuadrada del numero es : %,.4f",Math.sqrt(numeroCalcular));
            }
            default -> System.out.println("No has elegido una opcion valida");
        }
        System.out.println(cadenaResult);
    }
}
