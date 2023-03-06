/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio1.ejercicio1;

/**
 *
 * @author DAW118
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Contenedor<Integer> contenedor = new Contenedor<>(new Integer[0]);
        
        contenedor.insertarAlFinal(3);
        contenedor.insertarAlFinal(6);
        contenedor.insertarAlFinal(9);
        contenedor.insertarAlFinal(11);
        contenedor.insertarAlFinal(13);
        
        System.out.println("Muestro los datos");
        System.out.println(contenedor.toString());
        
        contenedor.extraerDelPrincipio();
        
        System.out.println("Muestro los datos");
        System.out.println(contenedor.toString());
        
    }
}
