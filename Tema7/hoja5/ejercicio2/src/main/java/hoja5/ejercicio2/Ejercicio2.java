/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja5.ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        File fichero = new File("D:\\Usuarios\\daw118\\Documents\\pruebas\\hoja5ej2.txt");
        File ficherocopia = new File("D:\\Usuarios\\daw118\\Documents\\pruebas\\hoja5ej2segundaparte.txt");
        System.out.println("creando el fichero linea a linea");
        escribirLineaALinea(fichero);
        leerLineaALinea(fichero,ficherocopia);
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
    
    // el final de la lectura lo detecta con -1
    public static void leerLineaALinea(File fichero,File ficherocopia) {
        BufferedReader br = null;
        String linea;
        try {
            br = new BufferedReader(new FileReader(fichero));
            
            
            String caracter = Teclado.pedirVocal("Introduce una vocal...");
            
            //mientras el string que viene por el buffer no sea null se sigue
            while ((linea = br.readLine()) != null) {
                String[] vector = linea.split("");
                linea.replaceAll("[aeiou]*", caracter);
                escribirFraseSinVocales(fichero,linea);
            }
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
    
    public static void escribirFraseSinVocales(File fichero,String frase) {

        BufferedWriter br = null;
        
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
