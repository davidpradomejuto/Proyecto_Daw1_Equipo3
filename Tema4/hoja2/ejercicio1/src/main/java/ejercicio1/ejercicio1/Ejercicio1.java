/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio1.ejercicio1;

/**
 *
 * @author david
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Operaciones a = new Operaciones();
        a.mostrar();
        
        System.out.println();
        
        System.out.println("se Multiplica el array");
        a.multiplicar();
        
        a.mostrar();
        
        System.out.println();
        System.out.println("El resultado de la suma es: " + a.sumaDePares());
    }
}
