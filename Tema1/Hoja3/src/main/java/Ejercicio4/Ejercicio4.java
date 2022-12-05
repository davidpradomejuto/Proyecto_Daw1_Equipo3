package Ejercicio4;
import java.util.Scanner;
import java.lang.Math;
/**
 *@author david
 */
public class Ejercicio4 {
    public static void main(String[] args) {      
       int a,b,c,x,y;
       
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el numero a: ");
        a = teclado.nextInt();
        
        System.out.println("Escribe el numero b: ");
        b = teclado.nextInt();
        
        System.out.println("Escribe el numero c: ");
        c = teclado.nextInt();
        
         System.out.println("Escribe el numero x: ");
        x = teclado.nextInt();
        
        y =(int) (a*Math.pow(x,2))+(b*x)+c;
        
        System.out.println(" el resultado de y es: "+y);
    }
}
