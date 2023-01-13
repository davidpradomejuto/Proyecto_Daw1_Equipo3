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
        int total, result = 0;
        total = Integer.valueOf(args[0]);
        
        if (args[0].length() == 3) {
            
            for (int i = 0; i <= 2; i++) {
                result += (int) (Math.pow(Integer.valueOf(args[0].substring(i, i+1)), 3));
            }
            
            
            if (result == total) {
                System.out.println("Es un numero armstrong");
            } else {
                System.out.println("No lo es");
            }
        }else{
            System.out.println("No es un numero de tres cifras");
        }
    }
}
