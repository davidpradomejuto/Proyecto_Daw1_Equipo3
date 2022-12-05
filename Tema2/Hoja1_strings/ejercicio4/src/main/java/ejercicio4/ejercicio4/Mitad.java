/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.ejercicio4;
/**
 * @author DAW118
 */
public class Mitad {
    //creo la clase con el constructor por defecto
    public Mitad() {}
    
    public String mitad (String frase)
    {
        //recogo el largo de la frase
        int largo = frase.length();
        //calculo el largo de la mitad de la frase
        int largomitad = largo/2;
        
        //guardo en frase la mitad de la frase
        frase = frase.substring(0,largomitad);
        //saco por teclado la informacion
        System.out.println(frase);
        return frase;
    }
}
