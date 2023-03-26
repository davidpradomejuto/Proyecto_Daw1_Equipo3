/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja5.ejercicio1;

/**
 *
 * @author DAW118
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Serie s = new Serie("Prison break", Tematica.Aventura, "Americana", true, 4);
        Capitulo a = new Capitulo(1, 1, "inicio");
        Capitulo b = new Capitulo(1, 2, "dos");
        Capitulo c = new Capitulo(1, 3, "tres");
        s.insertarCapitulo(a);
        s.insertarCapitulo(b);
        s.insertarCapitulo(c);

        s.visualizaCapitulos();

        s.eliminarCapitulo("Pris3X1");
        s.eliminarCapitulo("Pris5x1");
        s.visualizaCapitulos();

        System.out.println("--------------");

        System.out.println("----------");
        int opcion = 0;
        GestorSeries ge = new GestorSeries();
        do {
            System.out.println("Elige una opcion");
            System.out.println("1. Añadir serie\n"
                    + "2. Eliminar serie\n"
                    + "3. Ver series almacenadas\n"
                    + "4. Añadir capítulo a una serie ya almacenada \n"
                    + "5. Borrar capítulo de una serie ya almacenada \n"
                    + "6. Ver capítulos de una serie ya almacenada\n"
                    + "7. Salir");
            opcion = Entrada.pedirIntPositivo("introduce tu opcion");
            
            switch (opcion){
            case 1 ->{ge.insertarSerie();}
            case 2 ->{ge.eliminarCap();}
            case 3 ->{ge.mostrar();}
            case 4 ->{ge.insertarCap();}
            case 5 ->{ge.eliminarCap();}
            case 6 ->{ge.verCap();}
            case 7 ->{System.out.println("Saliendo...");}
            default ->{System.out.println("Opcion no valida");}
        }
        } while (opcion != 7);
    }
}
