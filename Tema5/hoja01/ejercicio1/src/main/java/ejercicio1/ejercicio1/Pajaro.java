/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

/**
 *
 * @author DAW118
 */
public class Pajaro {
    private static String color;
    private int edad;
    private static int numPajaros;

    public Pajaro(String color, int edad) {
        this.color = color;
        this.edad = edad;
        nuevoPajaro();
    }
    
     public Pajaro() {
         nuevoPajaro();
    }
    
    
    public static void nuevoPajaro(){
        numPajaros++;
    }
    
    public static void muestraPajaro(){
        System.out.println("Se han creado "+numPajaros+" pajaros.");
    }
    
}
