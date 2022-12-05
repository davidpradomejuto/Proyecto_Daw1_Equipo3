/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5.ejercicio5;

/**
 *
 * @author DAW118
 */
public class Ocurrencias {
    //creo la clase con el constructor
    public Ocurrencias() {}
    
    //creo el metodo
    public String ocurrencias (String frase)
    {
        //hago que se sustituya es por no por
        frase = frase.replaceAll("es", "no por");
        //devuelvo el resultado
        System.out.println(frase);
        return frase;
    }
}
