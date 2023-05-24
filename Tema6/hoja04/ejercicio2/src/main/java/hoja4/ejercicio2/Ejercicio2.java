/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja4.ejercicio2;

/**
 *
 * @author DAW118
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Almacen a = new Almacen();
        
        a.insertar();
        a.insertar();
        System.out.println("Buscando un articulo");
        System.out.println(a.buscar().toString());
        
        
        System.out.println("Mostrando pedidos por debajo de 5 existencias");
        
        System.out.println(a.pedidos());
    }
    
    
}
