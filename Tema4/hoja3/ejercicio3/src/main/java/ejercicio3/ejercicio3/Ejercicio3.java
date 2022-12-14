/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio3.ejercicio3;

/**
 *
 * @author DAW118
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Comunidad a=new Comunidad("montepinar",3);
        
        System.out.println("el resultado del sorteo es : "+a.sorteo());
        
        System.out.println(a.mostrar());
           
        System.out.println(a.buscar("suances"));
        
    }
}
