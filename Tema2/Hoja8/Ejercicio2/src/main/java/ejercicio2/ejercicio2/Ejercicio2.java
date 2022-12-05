/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio2.ejercicio2;
/**
 * @author david
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        Libro hobbit = new Libro ("9788499640884","El hobbit","Tolkien");
        Libro elItaliano = new Libro ("123456789","El Italiano","Arturo Perez Reverte");
     
        System.out.println("el titulo es : "+hobbit.getTitulo());
        System.out.println("el autor es : "+hobbit.getAutor());
        System.out.println("el ISBN es :"+hobbit.getIsbn());
        //cambio el autor
        hobbit.setAutor("David Prado");
        System.out.println("el Autor es : "+hobbit.getAutor());
        
        System.out.println("es espanol? "+hobbit.esEspanol()); 
        hobbit.mostrar();
        //pruebo con el otro libro
        System.out.println("es espanol? "+ elItaliano.esEspanol()); 
        elItaliano.mostrar();
    }
}
