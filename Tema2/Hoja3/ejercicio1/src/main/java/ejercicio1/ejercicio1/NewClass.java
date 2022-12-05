/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

/**
 *
 * @author DAW118
 */
public class NewClass {

    public static void main(String[] args) {//inicio del main
 
        //extraer caracteres de cadenas
        String ciclo = "holamundo";
        char c = ciclo.charAt(0);
        System.out.println("El primer caracter de ciclo es: " + c);
        System.out.println("El quinto caracter de ciclo es: " + ciclo.charAt(4));

        //descomponer cadenas
        System.out.println(ciclo.substring(0, 4));
        System.out.println(ciclo.substring(5, 9));
        
        // comparar cadenas
        String texto1 = "Buenos días";
        String texto2 = new String("Buenos días");
        System.out.println("¿Las cadenas son iguales?: " + texto1.equals(texto2));
        System.out.println("¿Las cadenas son iguales?: " + texto1 == texto2);

       //comparar cadenas y da si una es mayor o menor, se basa en la tabla unicode
        if (texto1.compareTo(texto2) < 0) {System.out.println("texto1 es superior a texto2");}
        else if (texto1.compareTo(texto2) > 0) {System.out.println("texto1 es inferior a texto2");} 
        else {System.out.println("texto1 y texto2 son iguales");}
    }
}
