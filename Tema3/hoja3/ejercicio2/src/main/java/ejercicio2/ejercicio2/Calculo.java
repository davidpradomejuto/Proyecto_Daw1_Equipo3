/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Calculo {

    public Calculo() {
    }

    public static void metodo1() {
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("!DESPEGUE!");
    }

    public static void metodo2() {

        int contador = 1;
        int n;

        int contadorPositivo = 0, contadorNegativo = 0, contadorNulo = 0;

        while (contador <= 10) {

            Scanner teclado = new Scanner(System.in);

            System.out.println("Introduce el numero " + contador + " :");
            n = teclado.nextInt();

            if (n < 0) {
                contadorNegativo++;
            } else if (n > 0) {
                contadorPositivo++;
            } else if (n == 0) {
                contadorNulo++;
            }

            contador++;
        }
        System.out.println("has introducido " + contadorPositivo + " numeros positivos");
        System.out.println("has introducido " + contadorNegativo + " numeros negativos");
        System.out.println("has introducido " + contadorNulo + " numeros nulos");

    }

    public static void metodo3() {
        Scanner teclado = new Scanner(System.in);

        //pido un numero
        System.out.println("Introduce el numero que quieras factorizar :");
        int numeroPedido = teclado.nextInt();

        int contador = numeroPedido - 1;

        while (contador >= 1) {
            numeroPedido = numeroPedido * contador;
            contador--;
        }
        System.out.println("el factorial es: " + numeroPedido);
    }

    public static void metodo4() {

        Scanner teclado = new Scanner(System.in);

        //pido la frase
        System.out.println("Introduce la frase");
        String frase = teclado.nextLine();

        int posicionPunto = frase.lastIndexOf(".");

        String frasefinal = frase.substring(0, posicionPunto);

        int charfinal = frasefinal.length();

        System.out.println("los caracteres de la frase son: " + charfinal);

    }

    public static void metodo5() {
        Scanner teclado = new Scanner(System.in);

        //pido un numero
        System.out.println("Introduce un numero :");
        int n = teclado.nextInt();

        int totalN = 0;
        int contadorN = 0;

        while (n >= 0) {

            System.out.println("Introduce un numero :");
            n = teclado.nextInt();

            if (n >= 0) {
                //si el numero es negativo,sumo n al total
                totalN += n;
            }
            //incremento el contador de numeros introducidos
            contadorN++;
        }
        if (n>0){
        int result = totalN / contadorN;
        System.out.println("la media de todos los numeros introducidos es:" + result);
        }else {
            System.out.println(" la suma de los numeros es 0");
        }
    }
}
