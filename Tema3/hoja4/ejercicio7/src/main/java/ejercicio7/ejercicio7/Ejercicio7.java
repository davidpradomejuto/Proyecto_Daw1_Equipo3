/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio7.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el numero: ");
        int n = teclado.nextInt();

        Menu david = new Menu(n);
        
        david.metodo2();

        System.out.println("1.- contar cuantas cifras tiene\n"
                + "2.- escriba sus 10 primeros múltiplos\n"
                + "3.- decir si es perfecto\n"       
                + "4.- salir");
        
        System.out.println("Introduce una opcion: ");
        int opcion = teclado.nextInt();
        
        do {
        switch (opcion){
            case 1 -> {david.metodo1();}
            case 2 -> {david.metodo2();}
            case 3 -> {david.metodo3();}
            case 4 -> {System.out.println("Salirmos del programa");}
            default -> {System.out.println("Opcion introducidad no valida");}
        }
        }while(opcion != 4);

    }
}
