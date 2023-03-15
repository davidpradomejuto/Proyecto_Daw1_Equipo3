/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author atres
 */
public class ValidarDatos {

public static String validarDescripcion(){
    Scanner teclado= new Scanner(System.in);
    boolean valido=false;
    String descripcion=" ";
    int contCaracteres;
   do{
            contCaracteres = 0;
            valido = false;
            System.out.println("Introduce una descripcion: ");
            descripcion=teclado.nextLine();

            for (int i = 0; i < descripcion.length() && !valido; i++) {

                try {

                    if (Character.isLetter(descripcion.charAt(i)) || descripcion.charAt(i) == ' ') {
                        contCaracteres++;
                    } else {
                        valido = true;
                        throw new Exception("La descripcion '" + descripcion + "' no es válido. Caracteres válidos: letras y espacio. Vuelve a intentarlo.");
                    }

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }

        } while (contCaracteres != descripcion.length());
      
    return descripcion;
}

public static int validarHoras(){
    Scanner teclado= new Scanner(System.in);
    boolean valido=false;
    int h=0;
    while(!valido){
        System.out.println("Introduce el número de horas: ");
        try{
            h=new Scanner(System.in).nextInt();
            if(h>0){
                valido=true;
            }else{
                System.out.println("Has introducido un número negativo");
            }
        }
        catch(InputMismatchException i){
            System.err.println("Error,Has introducido letras");
        }
       
    }
    valido=false;
    return h;
}

}



