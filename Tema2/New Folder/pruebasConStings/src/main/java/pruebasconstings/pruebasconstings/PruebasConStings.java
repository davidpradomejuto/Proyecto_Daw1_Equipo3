/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pruebasconstings.pruebasconstings;

/**
 *
 * @author david
 */
public class PruebasConStings {

    public static void main(String[] args) {
        Estado e1 = Estado.Falso;
        System.out.println(e1);
        e1= Estado.Verdadero;
         System.out.println(e1);
         //comparacion de strings
        String a = "Hola LLamo Lucas";
        String b = "hola llamo Lucas";
        String n1 = "123.53";
        String n2 = "444";
        System.out.println("son iguales??: "+a.equalsIgnoreCase(b));
        
  
        System.out.println(Float.parseFloat(n1));
        System.out.println(Float.parseFloat(n2));
        
        System.out.println(Integer.parseInt(n2));
        
        System.out.println(a+" "+n1);
        a.concat(n2);
        System.out.println(a);
        System.out.println(a.concat(n2));
       
        
    }
}
