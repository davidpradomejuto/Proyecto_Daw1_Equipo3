/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio2;

/**
 *
 * @author DAW118
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Asociacion s = new Asociacion();
        
        s.insertar();
        s.insertar();
        
        s.buscarPorDni("72197202H");
        
        System.out.println("Datos totales...");
        System.out.println(s.ListarDatos());
        
        
    }
}
