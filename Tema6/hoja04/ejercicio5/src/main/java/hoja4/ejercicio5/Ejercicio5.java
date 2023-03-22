/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja4.ejercicio5;

/**
 *
 * @author DAW118
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Tienda t = new Tienda();
        t.insertar();
        t.insertar();
        t.insertar();
        
        t.mostrar();
        
        System.out.println("Borrar..");
        t.borrar();
        
        t.mostrar();
        
        System.out.println("\ndisco con mayor duracion\n");
        
        t.mayorDuracion();
        
        System.out.println("\nnovedades\n");
        
        t.novedades();
    }
}
