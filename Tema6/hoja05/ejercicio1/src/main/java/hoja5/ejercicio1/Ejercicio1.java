/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja5.ejercicio1;

/**
 *
 * @author david
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        int opcion = 0;
        Equipo a = new Equipo();
        do {
            System.out.println(" 1. insertar\n"
                    + "2. Borrar un jugador\n"
                    + "3. Devolver una cadena con todos los jugadores\n"
                    + "4. Devolver el jugador más bajo\n"
                    + "5. Devolver el jugador más alto\n"
                    + "6. Devolver jugadores de más de 2 metros\n"
                    + "7. Salir");
            
            opcion = Teclado.pedirIntPositivo("Inserta tu opcion: ");
            
            switch (opcion){
                case 1 -> {a.insertar();}
                case 2 -> {a.borrar();}
                case 3 -> {System.out.println(a.mostrar());}
                case 4 -> { System.out.println(a.jugadorMasBajo().toString());}
                case 5 -> {System.out.println(a.jugadorMasAlto().toString());}
                case 6 -> {System.out.println(a.MasDeDosMetros().toString());}
                case 7 -> {System.out.println("Fin del programa...");}
                default -> {System.out.println("Opcion no valida");}
            }
        } while (opcion != 7) ;

    

    }
}
