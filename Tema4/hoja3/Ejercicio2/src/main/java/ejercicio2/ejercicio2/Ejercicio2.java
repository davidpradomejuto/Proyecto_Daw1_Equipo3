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
       Curso a=new Curso(7);
       a.desplaza();
       a.iniciales();
       System.out.println("El nombre en esa posicion es: "+a.verNombre(2));
        System.out.println(a.esDaw());
    }
}
