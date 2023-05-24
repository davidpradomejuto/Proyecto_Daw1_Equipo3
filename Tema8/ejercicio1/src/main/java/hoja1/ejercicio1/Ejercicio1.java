/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja1.ejercicio1;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int opcion = 0;

        try ( Connection conn = AccesoBaseDatos.getInstance().getConn()) {

            Repositorio<Usuario> repositorio = new UsuarioDAOImp();

            do {

                System.out.println("Gestión de usuarios\n"
                        + "1. Actualizar\n"
                        + "2. Eliminar\n"
                        + "3. Agregar\n"
                        + "4. Listar\n"
                        + "5. Salir");
                opcion = Teclado.pedirIntPositivo("Introduce la opcion que quieras...");

                switch (opcion) {
                    case 1 -> {
                        int id = Teclado.pedirIntPositivo("Introduce la id el usuario que quieres actualizar...");

                        Usuario t = repositorio.porId(id);
                        if (t != null) {
                            
                            System.out.println("Datos del usuario:");
                            System.out.println(t.toString());
                            
                            int opcionUpdate = 0;
                            do {
                                System.out.println("Que quiere actualizar? "
                                        + "\n 1. Nombre "
                                        + "\n 2. Contraseña "
                                        + "\n 3. Email "
                                        + "\n 4. salir");
                                
                                opcionUpdate = Teclado.pedirIntPositivo("Introduce la opcion que quieras...");
                                
                                switch (opcionUpdate) {
                                    case 1 -> {
                                        String nombre = Teclado.pedirNombre("Introduce el nuevo nombre del usuario...");
                                        t.setUsername(nombre);
                                    }
                                    case 2 -> {
                                        System.out.println("Introduce la nueva contraseña del usuario...");
                                        String password = new Scanner(System.in).nextLine();
                                        t.setPassword(password);
                                    }
                                    case 3 -> {
                                        String email = Teclado.pedirEmailRegex("Introduce el nuevo Email del usuario...");
                                        t.setEmail(email);
                                    }
                                    case 4 -> {
                                        System.out.println("Saliendo...");
                                    }
                                    default -> {
                                        System.out.println("Opcion no valida...");
                                    }
                                }

                            } while (opcionUpdate != 4);

                            repositorio.guardar(t);

                        } else {
                            System.out.println("El usuario pedido no existe..");
                        }
                    }

                    case 2 -> {
                        int id = Teclado.pedirIntPositivo("Introduce la id el usuario que quieres eliminar...");
                        repositorio.eliminar(id);
                        
                        System.out.println("Usuario eliminado...");
                    }
                    case 3 -> {
                        Usuario usuario = new Usuario();
                        repositorio.guardar(usuario);

                        System.out.println("Usuario agregado...");
                    }
                    case 4 -> {
                        System.out.println("Listando datos...");
                        List<Usuario> lista = repositorio.listar();
                        if (lista.isEmpty()) {
                            System.out.println("Todavia no hay datos..");
                        } else {
                            for (Usuario usuario : lista) {
                                System.out.println(usuario.toString());
                            }
                        }
                    }

                    case 5 -> {
                        System.out.println("Saliendo adios....");
                    }
                }

            } while (opcion != 5);

        } catch (SQLException ex) {
            System.out.println("error sql" + ex.getMessage());
        }
    }
}
