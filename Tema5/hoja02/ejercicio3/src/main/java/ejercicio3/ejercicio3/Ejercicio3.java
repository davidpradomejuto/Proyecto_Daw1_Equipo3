/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio3.ejercicio3;

/**
 *
 * @author DAW118
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Circulo a = new Circulo();
        Triangulo b = new Triangulo();
        Rombo c = new Rombo();
        
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        a.identidad();
        b.identidad();
        c.identidad();
        
    }
}
