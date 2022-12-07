/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio4.ejercicio4;

/**
 *
 * David Prado Mejuto, DAW118
 * Ejercicio 4 del examen de programacion unidad 3
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        int suma =0;
        for (int i = 1,x=1; i <= 40; i++,x++) { //hago un bucle que vaya desde 1 hasta 40, si el numero que esta en X es PAR , le muestro y le sumo a la variable SUMA
            if (x%2==0) {
                System.out.print(x+", ");
                suma+=x;
            }        
        }
        
        /* MUESTRO LOS DATOS*/
        System.out.println("son los pares");
        System.out.println("La suma es: "+suma);
    }
}
