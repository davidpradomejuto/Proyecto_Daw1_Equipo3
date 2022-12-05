/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio4.ejercicio4;

/**
 *
 * @author DAW118
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        
        System.out.println("Ciclo Nº 1");
        
        for (int i = 1; i <= 100; i++) { //si i , menor de 100, realiza esta sentencia
            
            System.out.println(i);

            if (i % 10 == 0) { //si el resto de I entre 10 es 0, significa que es divisor de 10
                System.out.println("ciclo Nº " + (i + 1));
            }

        }
    }
}
