/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio3.ejercicio3;

/**
 *
 * @author david
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        
        SintonizadorFM sin1 = new SintonizadorFM(107);
        sin1.subir();
        sin1.subir();
        sin1.subir();
        sin1.subir();
        sin1.mostrar();
        sin1.bajar();
        sin1.bajar();
        sin1.bajar();
        sin1.mostrar();
        
        SintonizadorFM sin2 = new SintonizadorFM(200);
        sin2.mostrar();
        
    }
}
