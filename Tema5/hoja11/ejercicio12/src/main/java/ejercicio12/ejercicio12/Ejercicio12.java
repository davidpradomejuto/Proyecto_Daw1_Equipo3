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
        double [] v = new double[15];
        acceso_por_indice(v,16);
    }

    public static double acceso_por_indice(double[] v, int j) throws RuntimeException {
        try {
            if ((0 <= j) && (j <= v.length)) {
                return v[j];
            } else {
                throw new Exception("El incide" + j + "no existe");
            }
        } catch (RuntimeException exc) {
            throw exc;
        }
    }
}
