/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja3.ejercicio1;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author DAW118
 */
public class Ejercicio1 {
    
    //Leer un fichero line a linea
    public static void main(String[] args) {
        File fichero = new File("D:\\Usuarios\\daw118\\Desktop\\FicheroDePrueba.txt");

        System.out.println("Leyendo fichero linea a linea");
        leerLineaALinea(fichero);
    }

    // el final de la lectura lo detecta con -1
    public static void leerLineaALinea(File fichero) {
        BufferedReader br = null;
        String linea;
        try {
            br = new BufferedReader(new FileReader(fichero));
            //mientras el string que viene por el buffer no sea null se sigue
            while ((linea = br.readLine()) != null) {
                //muestra la linea
                System.out.println(linea);
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
}
