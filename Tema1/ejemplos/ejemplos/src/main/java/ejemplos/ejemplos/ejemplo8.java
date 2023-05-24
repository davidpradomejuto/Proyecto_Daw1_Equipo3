/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.ejemplos;

/**
 *
 * @author DAW118
 */
public class ejemplo8 {

    public static void main(String[] args) {
        int manzanas1 = 34;
        int peras1=12;
        int manzanas2=23;
        int peras2=32;
        int manzanas3=56;
        int peras3=70;

        System.out.println("el 1 semestre el frutero a vendido: ");   
        System.out.println( (float)(manzanas1*2.35)+"€ en manzanas ");
        System.out.println( (float)(peras1*1.95)+"€ en peras ");
        
        System.out.println("el 2 semestre el frutero a vendido: ");   
        System.out.println( (float)(manzanas2*2.35)+"€ en manzanas ");
        System.out.println( (float)(peras2*1.95)+"€ en peras ");
        
        System.out.println("el 3 semestre el frutero a vendido: ");   
        System.out.println( (float)(manzanas3*2.35)+"€ en manzanas ");
        System.out.println( (float)(peras3*1.95)+"€ en peras ");
        
        System.out.println("este año ha ganado: ");
        System.out.println((float)(manzanas1+manzanas2+manzanas3)*2.35+(peras1+peras2+peras3)*1.95+"€");
    }
}
