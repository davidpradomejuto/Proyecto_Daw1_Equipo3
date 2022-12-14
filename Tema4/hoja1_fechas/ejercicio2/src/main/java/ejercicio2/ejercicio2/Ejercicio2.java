/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio2.ejercicio2;

/**
 *
 * @author david
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Mascota a = new Mascota("simba",2019,5,7);
        System.out.println("la edad del animal es "+a.getEdad());
        System.out.println(a.toString());
        
        Mascota b = new Mascota("Rex",2007,3,6);
        Mascota c = new Mascota("Toby",1997,11,25);
        
        Veterinario clinica = new Veterinario();
        clinica.añadir(a);
        clinica.añadir(b);
        clinica.añadir(c); 
        System.out.println(clinica.mostrar());
        System.out.println(clinica.mostrarMayor5());
    }
}
