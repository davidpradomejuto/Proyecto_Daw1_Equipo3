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
        int[] matriz = new int[4];
        try {
            System.out.println(matriz[5]);
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("Has intentado acceder a una posicion fuera del array. ");
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
