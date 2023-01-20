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
        AparatoElectrico bombilla = new AparatoElectrico(150);
        AparatoElectrico plancha = new AparatoElectrico(2000);
        
        System.out.println("El consumo es de "+AparatoElectrico.consumo()+" W");      
        bombilla.enciende();
 
        System.out.println("El consumo es de "+AparatoElectrico.consumo()+" W");
        plancha.enciende();
        System.out.println("El consumo es de "+AparatoElectrico.consumo()+" W");
        
    }
}
