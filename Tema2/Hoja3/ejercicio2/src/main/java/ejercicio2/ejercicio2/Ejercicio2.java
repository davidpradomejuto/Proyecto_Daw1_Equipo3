/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio2.ejercicio2;

/**
 *
 * @author david
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        //creo el objeto
        Numero Numero = new Numero();
        
        //muestro el numero
        System.out.println("recogo el numero: "+Numero.getNumero());
        
        //pongo la variable numero en 13
        Numero.setNumero(33);
        System.out.println("recogo el numero: "+Numero.getNumero());
        
        System.out.println("el resultado de la suma es de: "+Numero.suma(7));
        System.out.println("el resultado de la resta es de: "+Numero.resta(20));
        System.out.println("el resultado del doble es de: "+Numero.doble());
        System.out.println("el resultado del triple es de: "+Numero.triple());
        System.out.println("recogo el numero: "+Numero.getNumero());
    }
}
