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

       Multiplicar a = new Multiplicar();
       a.muestra();
       a.multiplica();
        System.out.println("");
       a.muestra();
       a.valoresAspa();
       
       int[] result =  a.tablaMultiplicar(5);
        for (int i = 1; i < result.length; i++) {
            System.out.print(result[i]+",");
        }
    }
}
