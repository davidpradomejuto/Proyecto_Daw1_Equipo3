/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio3;

/**
 *
 * @author DAW118
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Agenda a = new Agenda();
        
        a.insertar();
        a.insertar();
        
        a.mostrar();
        
        a.ordenar();
        
        a.mostrar();
        
        a.borrarPorDni("72197202H");
        
         a.mostrar();
         
         
         
         System.out.println("Muestro los datos de efren");
         System.out.println("");
         a.mostrarPorDni("72148778d");
         
         
         a.modificarPorDni("72148778d");
        
        
        
        //a.mostrarPorDni("72197202H");
        //a.borrarPorDni("72197202H");
        //a.mostrar();
        
    }
}
