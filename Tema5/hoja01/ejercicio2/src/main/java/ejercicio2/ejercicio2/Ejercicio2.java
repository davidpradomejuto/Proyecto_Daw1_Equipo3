/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio2.ejercicio2;

/**
 *
 * @author DAW118
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Bombilla.cambiarGeneral(Estado.ON);
        Bombilla a = new Bombilla(Estado.ON);
        Bombilla b = new Bombilla();
        a.luce();
        b.luce();
        System.out.println("Bajo el interruptor del B a ON");
        b.cambiarInterruptor(Estado.ON);
        a.luce();
        b.luce();
        System.out.println("Bajo el interruptor general a OFF");
        Bombilla.cambiarGeneral(Estado.OFF);
        a.luce();
        b.luce();

    }
}
