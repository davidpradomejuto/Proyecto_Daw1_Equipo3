package Ejercicio5;

import java.util.Scanner;
import java.lang.Math;

/**
 * @author david
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int secs,horas,minutos,total;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el numero a: ");
        secs = teclado.nextInt();
        total = secs;
        horas = secs / 3600;
        secs = secs % 3600;
        minutos = secs / 60;
        secs = secs % 60;
        

        System.out.println("En " + total + " segundos hay:");
        System.out.println(horas + " horas");
        System.out.println(minutos + " minutos");
        System.out.println(secs + " segundos");
    }
}
