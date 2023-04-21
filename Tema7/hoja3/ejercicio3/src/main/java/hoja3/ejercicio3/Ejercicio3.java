/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja3.ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author DAW118
 */
public class Ejercicio3 {
    //copiar un fichero linea a linea

    public static void main(String[] args) {
        File fichero = new File("D:\\Usuarios\\daw118\\Desktop\\FicheroDePrueba.txt");

        File ficherocopia = new File("D:\\Usuarios\\daw118\\Desktop\\FicheroDePrueba1.txt");

        BufferedReader brr = null;
        String lineaLeida;

        BufferedWriter brw = null;

        try {
            //hago los dos ficheros uno que se lee y otro que  se escribe
            brr = new BufferedReader(new FileReader(fichero));
            brw = new BufferedWriter(new FileWriter(ficherocopia, true));

            while ((lineaLeida = brr.readLine()) != null) {
                //cogo la linea que he leido y la escribo
                brw.write(lineaLeida);
                brw.write(System.lineSeparator());
            }

        } catch (FileNotFoundException fnfe) {
            System.out.println("Error, el fichero no existe");
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            //cierro los dos ficheros
            if (brr != null) {
                try {
                    brr.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar");
                }
            }
            if (brw != null) {
                try {
                    brw.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar");
                }
            }
        }
    }
}
