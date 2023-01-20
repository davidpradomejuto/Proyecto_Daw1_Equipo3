/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio1.ejercicio1;

/**
 *
 * @author DAW118
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("creo un empleado normal");
        Empleado a = new Empleado(400);
        Encargado b = new Encargado(400);
        System.out.printf("El sueldo del empleado normal es de: %,.2f € \n",a.getSueldo());
        System.out.printf("El sueldo del encargado es de: %,.2f € \n",b.getSueldo());
    }
}
