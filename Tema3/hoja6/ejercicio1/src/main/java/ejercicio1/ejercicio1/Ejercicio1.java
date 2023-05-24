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
        Tarjeta david = new Tarjeta("David Prado",123554,3456.34);
        
        david.desbloquea(7878);
        david.desbloquea(8888);
        int pincorrecto = david.getPin();
        david.desbloquea(pincorrecto);
        
        
        david.pagar(234, 7777,"regalo de navidad", true);
        
        david.pagar(234, pincorrecto,"regalo de navidad", true);
    }
}
