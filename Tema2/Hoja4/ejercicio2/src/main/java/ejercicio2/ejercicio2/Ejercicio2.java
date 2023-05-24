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
        //creo el objeto coche 1 con los dos parametros
        Coche coche1 = new Coche("1234RET",20);
        
        //creo el coche 2 con solo el parametro matricula
        Coche coche2 = new Coche("4567KKK");
        
        System.out.println("El coche 2 acelera y se queda con una velocidad de "+coche2.acelera(45));
        
        System.out.println("El coche 2 frena y se queda con una velocidad de "+coche2.frena(80));
        
        System.out.println("El coche 1 acelera y se queda con una velocidad de "+coche1.acelera(60));
        
        System.out.println("El coche 1 acelera y se queda con una velocidad de "+coche1.acelera(70));
        
        System.out.println("Las letras de la matricula del coche 1 son "+coche1.mostrarMatricula());
       
    }
}
