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
      
        //creo el objeto c1 con el constructor por defecto sin parametros
        Circulo c1 = new Circulo();
        //modifico la variable radio
        c1.setRadio(6.3f);
                
        //creo el objeto c2 con el parametro de radio a 10
        Circulo c2 = new Circulo(10.0f);
        
        //muestro los dos radios
        System.out.printf("Radio del circulo del primer circulo uan vez establecido un radio: %,.2f \n", c1.getRadio());
        
        System.out.printf("Radio del circulo del segundo circulo nada más crearlo: %.1f \n", c2.getRadio());
    }
}
