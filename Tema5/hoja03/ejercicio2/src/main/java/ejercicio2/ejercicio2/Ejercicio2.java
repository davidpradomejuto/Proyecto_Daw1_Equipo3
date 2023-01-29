 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio2.ejercicio2;

/**
 *
 * @author david
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Alumno david = new Alumno(3);
        Profesor carmen = new Profesor(3);
        
        System.out.println(david.mostrar());
        System.out.println(carmen.mostrar());
        
    }
}
