/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio1.ejercicio1;

/**
 *
 * @author daw128
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Alumno a = new Alumno("david");
        System.out.println("nota mayor");
        System.out.println(a.mayor());
        System.out.println("nota menor");
        System.out.println(a.menor());
        System.out.println("buscar el 5");
        System.out.println(a.buscar(5));
        System.out.println("los tres mejores");
        int[] result = a.tresMejores();
        for (int i = 0; i < result.length; i++) {
            System.out.println("nota ,"+result[i]);
        }
        
        a.ponerACero();
        System.out.println(a.mayor());
    }
}
