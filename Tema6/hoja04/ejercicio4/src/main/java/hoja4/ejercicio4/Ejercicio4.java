/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja4.ejercicio4;

/**
 *
 * @author david
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Carrera a = new Carrera();

        int opcion = 0;

        do {
            System.out.println("Menu \n1.- Añadir un atleta.\n"
                + "2.- Tiempo medio\n"
                + "3.- Dar la vuelta\n"
                + "4.- mostrar\n"
                + "5.salir");
            
            opcion = Teclado.pedirIntPositivo("Introduce una opcion");
            
            switch(opcion){
                case 1->{a.insertar();}
                case 2->{a.tiempoMedio();}
                case 3->{a.darVuelta();}
                case 4->{a.mostrar();}
                case 5->{System.out.println("Saliendo..");}
                default-> {System.out.println("Opcion no valida");}
            }
        } while (opcion != 5);
    }
}
