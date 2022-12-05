/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Hoja4 {
        
    public static void metodo1 (){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("introduce un numero para  saber sus divisores");
        int n = teclado.nextInt();
        int divisor;
        for (int i = n; i > 0;i--){
            if (n%i == 0){
                System.out.println("Un divisor de "+n+" es :"+i);
            }
        }
        
    }
    
        
    public static void metodo2 (){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("introduce el numero 1:");
        int n1 = teclado.nextInt();
        
        System.out.println("introduce el numero 2:");
        int n2 = teclado.nextInt();
        
        int total=0;
        
        if (n1>=n2) { //comparo cual es el mayor, y el menor le pongo en n1
            int aux =n2;
            n2=n1;
            n1=aux;
        }
        
        //hago el bucle para mostrar el impar y sumarle al total
        for (int i = n1; i <= n2;i++){
            if (i % 2 != 0){ 
                System.out.println("numero impar: "+i);
                total +=i; //sumo el total
            }
        } 
        
        System.out.println(" el total es "+total);
    }
    
    
    public static void metodo3(){
     Scanner teclado = new Scanner(System.in);
        
        System.out.println("introduce un numero menor de 10: ");
        int n = teclado.nextInt();
        
        for (int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+i*n);
        }
    }
    
    public static void metodo4(){
     Scanner teclado = new Scanner(System.in);
        
        System.out.println("introduce el numero 1: ");
        int a = teclado.nextInt();
        
        System.out.println("introduce el numero 2: ");
        int b = teclado.nextInt();
        
        int resto=a; //le doy al resto el valor el divisor
        for (int contador=0;contador<=a/b;contador++){             
            System.out.println("el resto es : "+resto+" el cociente es: "+contador);
            resto -=b; //resto al divisor el dividendo,para dar el resto
        }
    }
}
