/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio3.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Pais francia = new Pais();

        System.out.println("Que quieres hacer?\n"
                + "1. añadir una ciudad\n"
                + "2. devolver ciudad con mas habitantes\n"
                + "3. ciudad existe?\n"
                + "4. habitantes medios\n"
                + "5. to String\n");
        Scanner Teclado = new Scanner(System.in);
        int opcion = Teclado.nextInt();
        
        switch(opcion){
            
        }
    }
}
