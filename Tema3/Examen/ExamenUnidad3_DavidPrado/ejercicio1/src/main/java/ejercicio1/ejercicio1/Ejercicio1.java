/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio1.ejercicio1;

import java.util.Scanner;

/**
* David Prado Mejuto, DAW118
 * Ejercicio 1 del examen de programacion unidad 3
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        int b = 0,w = 0; //creo estas dos variables para llevar un conteo de los calcetines de cada color introducidos
        
        String opcion;
        int opcionInt=3;
        do{
            Scanner teclado = new Scanner(System.in); //instancion Scanner
            
            System.out.println("Introduce el color del calcetin, . para salir:");
            opcion= teclado.nextLine(); //pido el dato del color del calcetin
            
            
            if(opcion.contentEquals("W")){ //convierto el dato String que he recodigo por teclado a un int ,ya que a mi no me sale del switch comparando un String "."
                opcionInt=1;
            }
            else if(opcion.contentEquals("B")){
                opcionInt=2;
            }
            else if(opcion.contentEquals(".")){
                opcionInt=0;
            }
            
            
            switch(opcionInt){ // genero el menu con 1,2,3 que son los equivalentes a B,W y .
                case 1 ->{
                w++;
                }
                case 2 ->{
                b++;
                }
                case 0 ->{ //si la opcion es . , se compara si W y B son pares para comprobar cual esta desemparejado o no, 
                             //en caso de no introducir ningun calcetin, te manda un mensaje
                    if (w!=0 && b!=0 && w%2==0 && b%2==0){System.out.println("EMPAREJADOS");}
                    else if (w!=0 && b!=0 && w%2==0 && b%2!=0 ){System.out.println("NEGRO SOLITARIO");}
                    else if (w!=0 && b!=0 && w%2!=0 && b%2==0 ){System.out.println("BLANCO SOLITARIO");}
                    else if (w!=0 && b!=0 && w%2!=0 && b%2!=0){System.out.println("PAREJA MIXTA");}
                    else if (w==0 && b == 0 ){System.out.println("No has introducido ningun calcetin");}
                    
                }
                default -> { //opcion por defecto
                    System.out.println("Opcion no valida");
                }
            }
        }while(opcionInt !=0); //mientras que opcion no sea ".",se ejecuta el menu repetitivamente
    }
}
