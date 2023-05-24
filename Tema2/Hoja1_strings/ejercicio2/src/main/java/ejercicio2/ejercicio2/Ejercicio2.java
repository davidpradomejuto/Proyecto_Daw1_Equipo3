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
        //genero las strings
        String nombre = "Pepito";
        String primerapellido = "Perez";
        String segundoapellido = "Fernandez";
        
        //concateno el nombre

        nombre = nombre.concat(primerapellido);
        nombre = nombre.concat(segundoapellido);
        System.out.println(nombre); 
       
        
    }
}
