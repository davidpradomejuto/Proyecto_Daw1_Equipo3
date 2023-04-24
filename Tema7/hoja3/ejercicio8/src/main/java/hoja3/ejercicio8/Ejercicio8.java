/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja3.ejercicio8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        /*
        8. - Tenemos un fichero de texto con los nombres de los socios de una ONG, pretendemos hacer una aplicación que nada más abrirla nos cargue los nombres en un ArrayList y nos presente el siguiente menú:
        1- Añadir un nuevo nombre
        2- Borrar un nombre
        3- Salir Al salir antes de cerrar la aplicación volverá a regrabar el fichero inicial con las modificaciones efectuadas de altas y bajas de socios
         */
        File fichero = new File("D:\\Usuarios\\daw118\\Documents\\Pruebas\\nombres.txt");

        ArrayList<String> mapa = new ArrayList();
        BufferedReader br = null;

        String linea;
        try {
            br = new BufferedReader(new FileReader(fichero));
            //mientras el string que viene por el buffer no sea null se sigue
            while ((linea = br.readLine()) != null) {
                mapa.add(linea);
            }

        } catch (FileNotFoundException fnfe) {
            System.out.println("Error, el fichero no existe");
        } catch (IOException ex) {
            System.err.println(ex.toString());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar");
                }
            }
        }

        System.out.println("Introduce una opcion...");
        int opcion = 0;
        do {
            System.out.println("1- Añadir un nuevo nombre\n"
                    + "        2- Borrar un nombre\n"
                    + "        3- Salir");
            System.out.println("Introduce una opcion");
            opcion = new Scanner(System.in).nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduce el nombre del nuevo socio..");
                    String nombre = new Scanner(System.in).nextLine();
                    mapa.add(nombre);
                }
                case 2 -> {
                    System.out.println("Introduce el nombre del socio que quieres eliminar..");
                    String nombre = new Scanner(System.in).nextLine();

                    if (mapa.remove(nombre)) {
                        System.out.println("Socio borrado");
                    } else {
                        System.out.println("Error algo ha salido mal");
                    }
                }
                case 3 -> {
                    BufferedWriter brw = null;
                    try {
                        brw = new BufferedWriter(new FileWriter(fichero));

                        for (String cadena : mapa) {
                            brw.write(cadena);
                            brw.write(System.lineSeparator());
                        }

                        System.out.println("Adios...");
                    } catch (IOException ex) {
                        System.err.println(ex.toString());
                    } finally {
                        if (brw != null) {
                            try {
                                brw.close();
                            } catch (IOException ex) {
                                System.out.println("Error al cerrar");
                            }
                        }
                    }
                }

                default -> {
                    System.out.println("Opcion no valida...");
                }
            }

        } while (opcion != 3);
    }
}
