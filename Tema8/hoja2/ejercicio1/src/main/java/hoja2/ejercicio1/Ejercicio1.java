/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja2.ejercicio1;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author DAW118
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int opcion = 0;

        try ( Connection conn = AccesoBaseDatos.getInstance().getConn()) {
            do {
                System.out.println("Menú: \n"
                        + "1. insertar paciente....\n"
                        + "2. insertar visita\n"
                        + "3. mostrar agenda del dia\n"
                        + "4. mostrar visitas de un paciente\n"
                        + "5. salir");

                opcion = Teclado.pedirIntPositivo("Introduce la opcion que quieras...");

                switch (opcion) {
                    case 1 -> {
                        MetodosDB.insertarPaciente();
                    }
                    case 2 -> {
                        MetodosDB.insertarVisita();
                    }
                    case 3 -> {
                    }
                    case 4 -> {
                    }
                    case 5 -> {
                        System.out.println("Saliendo adios");
                    }
                    default -> {
                    }
                }

            } while (opcion != 5);
        } catch (SQLException ex) {
            System.out.println("error sql" + ex.getMessage());
        }
    }
}
