/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.ejercicio3;

/**
 *
 * @author DAW118
 */
public class Cambio {
    public Cambio() {}
    
    public String vocalesToO (String frase)
    {
        frase = frase.replace('a','o');
        frase = frase.replace('e','o');
        frase = frase.replace('i','o');
        frase = frase.replace('u','o');
        System.out.println(frase);
        return frase;
    }
}
