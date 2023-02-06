/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio3.ejercicio3;

/**
 *
 * @author DAW118
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Agenda agenda = new Agenda(5);
        
        Contacto david = new Contacto("david","prado","davidprado@gmail",1235);
        Contacto abel = new Contacto("abel","prado","abel@gmail",54321);
        Contacto pedro = new Contacto("pedro","perez","pedro@gmail",98765);
        System.out.println("Inserto los contactos");
        agenda.insertar(david);
        agenda.insertar(abel);
        agenda.insertar(pedro);
        
        
        System.out.println(agenda.toString());
        agenda.buscar("abel");
        agenda.ordenar();
        System.out.println(agenda.toString());
        agenda.eliminar("david");
                
        System.out.println(agenda.toString());
                
    }
}
