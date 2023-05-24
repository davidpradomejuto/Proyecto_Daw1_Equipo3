/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio4.ejercicio4;

/**
 *
 * @author david
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Alumno david = new Alumno("David Prado");
        System.out.println(" tu mayor nota es: "+david.mayor());
        System.out.println(" tu menor nota es: "+david.menor());
        System.out.println(david.mostrar());
    }
}
