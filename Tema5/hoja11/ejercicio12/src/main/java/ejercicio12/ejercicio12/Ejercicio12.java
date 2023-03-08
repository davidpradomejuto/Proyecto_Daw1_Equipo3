/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio12.ejercicio12;

/**
 *
 * @author DAW118
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        double[] v = new double[15];
        try {
            acceso_por_indice(v, 16);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static double acceso_por_indice(double[] v, int j) throws Exception {
        double result = 0;
        try {
            if ((0 <= j) && (j <= v.length)) {
                result = v[j];
            } else {

            }
        } catch (Exception exc) {
            throw exc;
        }
        return result;
    }

}
