/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja3.ejercicio2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        File fichero = new File("D:\\Usuarios\\daw118\\Desktop\\FicheroDePrueba.txt");
        System.out.println("creando el fichero linea a linea");
        escribirLineaALinea(fichero);
    }

    public static void escribirLineaALinea(File fichero) {

        BufferedWriter br = null;
        String frase;
        System.out.println("introduce la información que quieres grabar en el fichero");
        frase = new Scanner(System.in).nextLine();
        try {

            br = new BufferedWriter(new FileWriter(fichero, true));
            br.write(frase);
            br.write(System.lineSeparator());
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
    }
}
