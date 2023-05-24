/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio3.ejercicio3;

/**
 *
 * @author david
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        //creo el objeto
        Satelite Satelite = new Satelite();
        
        //modifico las variables meridiano y paralelo
        Satelite.variarPosicion(12.3, 33.6);
        
        //modifico la variable altura, el dato esta en KM
        Satelite.variarAltura(133.6);
        
        //muestro los datos del satelite
        System.out.println(Satelite.printPosicion());
        
        //muestro si esta en orbita
        System.out.println("El satelite esta en orbita? :"+Satelite.enOrbita());
    }
}
