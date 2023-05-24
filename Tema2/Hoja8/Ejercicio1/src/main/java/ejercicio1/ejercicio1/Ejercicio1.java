/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio1.ejercicio1;

/**
 *
 * @author david
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        //creo un objeto llamado david
        Persona david = new Persona("David", "Prado", "Mejuto", "72197202H");
        //ejecuto los metodos      
        System.out.println(david.clave() + " y la letra es " + david.dniValido());
        //creo un objeto llamado laura
        Persona laura = new Persona("Laura", "Perez", "Escanes", "12345678F");
        //ejecuto los metodos   
        System.out.println(laura.clave() + " y la letra es " + laura.dniValido());

    }
}
