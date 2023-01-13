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
        Array a = new Array();
        a.introducir();
        
        a.mostrar();
       
        a.rotarIzquierda();
        a.mostrar();
        
        int[] prueba = {5,2,6};
        a.comparar(prueba);
        a.sumaPares();
        a.multiplos(3);
        a.mostrar();
    }
}
