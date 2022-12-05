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
        Triangulo t1 = new Triangulo(6,6,6);
        
        System.out.println("es equilatero? "+t1.esEquilatero());
        System.out.println("es isosceles? "+t1.esIsosceles());
        
        System.out.println("El perimetro del triangulo es: "+t1.perimetro());
    }
}
