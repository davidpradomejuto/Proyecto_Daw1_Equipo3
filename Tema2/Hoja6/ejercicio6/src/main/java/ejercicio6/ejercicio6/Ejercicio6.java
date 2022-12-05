/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio6.ejercicio6;
import java.util.Scanner;

/**
  * @author DAW118
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //introduzco en variables los materiales iniciales
        System.out.println("Introduce la cantidad de bidones iniciales: ");
        int bidones = teclado.nextInt();
        System.out.println("Introduce la cantidad de ruedas iniciales: ");
        int ruedas = teclado.nextInt();
        
        // creo el objeto con el constructor por parametros
        Taller davidMotor = new Taller(bidones, ruedas);
        
        //muestro el material que tengo
        System.out.println("Tienes " + davidMotor.getAceite() + " Litros");
        System.out.println("Tienes " + davidMotor.getRuedas() + " Ruedas");
        
        //creo el objeto copia
        Taller copiaDavidMotor = new Taller(davidMotor);
        
        //añado materiales
        System.out.println("Introduce la cantidad de bidones a añadir: ");
        bidones = teclado.nextInt();
        davidMotor.addAceite(bidones);

        System.out.println("Introduce la cantidad de Ruedas a añadir: ");
        ruedas = teclado.nextInt();
        davidMotor.addRuedas(ruedas);
        
               
        //muestro el material que tengo
        System.out.println("Tienes " + davidMotor.getAceite() + " Litros");
        System.out.println("Tienes " + davidMotor.getRuedas() + " Ruedas");
        
        //realizo un cambio
        davidMotor.cambioParcial();
        
        //muestro los cambio que puedo hacer
        System.out.println("Puedes hacer "+davidMotor.getcambioCompletos()+" cambios completos");
        System.out.println("Puedes hacer "+davidMotor.getcambioParciales()+" cambios Parciales");
        davidMotor.cambioCompleto();
        davidMotor.cambioCompleto();
        
        //muestro el material que tengo
        System.out.println("Tienes " + davidMotor.getAceite() + " Litros");
        System.out.println("Tienes " + davidMotor.getRuedas() + " Ruedas");
        
        //muestro los materiales y los ingresos
        System.out.println(davidMotor.toString());
        
        //muestro los materiales y los ingresos de la copia
        System.out.println(copiaDavidMotor.toString());
       
       
    }
}
