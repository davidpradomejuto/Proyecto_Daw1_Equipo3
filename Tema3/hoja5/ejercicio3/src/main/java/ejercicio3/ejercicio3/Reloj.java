/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.ejercicio3;

import java.util.Scanner;

/**
 * @author DAW118
 */
public class Reloj {

    public static void reloj() {
        Scanner teclado = new Scanner(System.in);
        int horas = 0, minutos = 0, segundos = 0;

        do {
            System.out.println("Introduce las horas :");
            horas = teclado.nextInt();
            if (horas <= 0 || horas >= 23) { //si la hora esta fuera del rango, muestro este mensaje
                System.out.println(" Hora introducida fuera de rango, repitiendo");
            }
        } while (horas <= 0 || horas >= 23); //mientras la hora no este en el rango, se realiza la accion

        do {
            System.out.println("Introduce los minutos :");
            minutos = teclado.nextInt();
            if (minutos <= 0 || minutos >= 60) {//si minutos esta fuera del rango, muestro este mensaje
                System.out.println(" Minutos introducidos fuera de rango, repitiendo");
            }
        } while (minutos <= 0 || minutos >= 60); //mientras minutos no este en el rango, se realiza la accion

        do {
            System.out.println("Introduce los segundos :");
            segundos = teclado.nextInt();
            if (segundos <= 0 || segundos >= 60) {//si segundos esta fuera del rango, muestro este mensaje
                System.out.println(" Segundos introducidos fuera de rango, repitiendo");
            }
        } while (segundos <= 0 || segundos >= 60); //mientras segundos no este en el rango, se realiza la accion

        //funcionamiento, es un for anidado, cada vez que los segundos llegan a 60 , vuelven a 0 y se suma 1 minutos, cada vez un minuto llega a 60
        //vuelve a 0 y se suma una hora, al final de cada segundo muestro una cadena con las horas ,minutos y segundos
        for (; horas <= 23; horas++) {
            for (; minutos < 60; minutos++) {
                for (; segundos < 60; segundos++) {
                    System.out.println(horas + " : " + minutos + " : " + segundos);
                }
                segundos = 0;
            }
            minutos = 0;

        }
    }
}
