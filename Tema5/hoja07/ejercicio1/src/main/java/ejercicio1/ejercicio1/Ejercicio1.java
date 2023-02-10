/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio1.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        
        boolean doublevalido = false;
        boolean intvalido = false;
        
        while(!intvalido){
        try {
            
            System.out.println("Introduce el numero X entero");
            int x = new Scanner(System.in).nextInt(); //pido el dato por teclado
            intvalido=true; //si la instruccion se ha ejecutado bien, cambio valido a true
            
        } catch (InputMismatchException ime) { //si el dato no es un numero lo coge
            
            System.out.println("El dato tiene que ser entero");
            
        } catch (Exception e) { //excepcion general
            System.out.println("Error indeterminado");
            
        }
        
        }
        
         while(!doublevalido){
        try {
            
            System.out.println("Introduce el numero i decimal");
            double i = new Scanner(System.in).nextDouble();//pido el dato por teclado
            doublevalido=true;//si la instruccion se ha ejecutado bien, cambio valido a true
            
        } catch (InputMismatchException ime) {//si el dato no es un numero lo coge
           
            System.out.println("El dato tiene que ser double");
            
        } catch (Exception e) { //excepcion general
            System.out.println("Error indeterminado");
            
        }
        }
    }
}
