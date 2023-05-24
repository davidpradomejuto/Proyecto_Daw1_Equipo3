/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio5.ejercicio5;

/**
 * @author DAW118
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        //creo el string con la frase
        String frase = "yo soy , tu eres,el es, ella es";
        //creo el objeto 
        Ocurrencias ocurrenciafrase = new Ocurrencias();
        //ejecuto el objeto con el metodo creado anteriormente
        ocurrenciafrase.ocurrencias(frase);
    }
}
