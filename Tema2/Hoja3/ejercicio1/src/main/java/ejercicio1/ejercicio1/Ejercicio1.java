/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio1.ejercicio1;
import java.util.Scanner;
/**
 * @author david
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //creo el constructor por defecto
        Finanzas finanza = new Finanzas();
        
        System.out.println("Introduce la cantidad de dolares a euros: ");
        double dolares = teclado.nextDouble();
        
        //hago la conversion a dolares
        System.out.printf("el valor en euros es de %,.2f \n",finanza.dolaresToEuros(dolares));
        
        System.out.println("Introduce la cantidad de euros a dolares: ");
        double euros = teclado.nextDouble();
        
        //hago la conversion a dolares
        System.out.printf("el valor en dolares es de %,.2f \n",finanza.eurosToDolares(euros));
        
        System.out.println("Ahora he creado el segundo objeto con el cambio a 1.10");
        //creo el constructor por defecto
        Finanzas finanza2 = new Finanzas(1.10);
        
        //hago la conversion a dolares
        System.out.printf("el valor en euros es de %,.2f \n",finanza2.dolaresToEuros(dolares));
        
        //hago la conversion a dolares
        System.out.printf("el valor en dolares es de %,.2f \n",finanza2.eurosToDolares(euros));
    }
}
