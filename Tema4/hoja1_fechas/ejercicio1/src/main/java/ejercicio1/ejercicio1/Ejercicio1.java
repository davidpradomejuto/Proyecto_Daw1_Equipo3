/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio1.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero de letras: ");
        int nletras = teclado.nextInt();
        
        Letra arrayletras[] = new Letra[nletras];//genero el array con la clase Letra

        for (int i = 0; i < arrayletras.length; i++) { // hago el for tantas veces como elemento tenga el array
            
            if (arrayletras[i].vencida() == false) { // si la letra no es vencida hago lo sigtuiente
                
                arrayletras[i].mostrar(); //muestro los datos de la letra que acabo de introducir
                
                System.out.println("faltan " + arrayletras[i].diasFaltan() + " dias");
                
                System.out.println("Demoro la letra 15 dias"); //demoro la letra 15 dias
                arrayletras[i].demora(15);
                
                arrayletras[i].mostrar(); // vuelvo a mostrar los datos de la letra
                System.out.println("El titular es " + arrayletras[i].getTitular());
                System.out.println("faltan " + arrayletras[i].diasFaltan() + " dias");
                
            } else {
                System.out.println("La letra esta vencida:"); //si la letra esta vencida muestro este mensaje
            }
        }

    }
}
