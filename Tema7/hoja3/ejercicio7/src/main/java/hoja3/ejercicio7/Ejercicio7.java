/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja3.ejercicio7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        File fichero = new File("C:\\Users\\david\\Desktop\\pruebasficheros\\poema.txt");
        File ficheroencriptado = new File("C:\\Users\\david\\Desktop\\pruebasficheros\\encriptado.txt");
        File ficherodesencriptado = new File("C:\\Users\\david\\Desktop\\pruebasficheros\\desencriptado.txt");
        if (fichero.exists()) {
            encriptarLineaALinea(fichero, ficheroencriptado);

            desencriptarLineaALinea(ficheroencriptado, ficherodesencriptado);
        } else {
            System.out.println("El fichero que quieres encriptar no existe");
        }
    }

    public static void encriptarLineaALinea(File fichero, File ficheroencriptado) {
        BufferedReader br = null;
        String linea;

        BufferedWriter brw = null;
        try {
            br = new BufferedReader(new FileReader(fichero));
            brw = new BufferedWriter(new FileWriter(ficheroencriptado));
            int i = 1;
            //mientras el string que viene por el buffer no sea null se sigue
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                String lineaEncriptada = "";

                for (char caracter : linea.toCharArray()) {
                    //modifico los caracteres
                    caracter = (char) (caracter + i);
                    lineaEncriptada = lineaEncriptada.concat(String.valueOf(caracter));

                }
                //escribo la linea
                System.out.println(lineaEncriptada);
                brw.write(lineaEncriptada);
                brw.write(System.lineSeparator());
                i++;
            }

            System.out.println("Fichero Encriptado...");
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

            if (brw != null) {
                try {
                    brw.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar");
                }
            }
        }
    }

    public static void desencriptarLineaALinea(File ficheroencriptado, File ficherodesencriptado) {
        BufferedReader br = null;
        String linea;

        BufferedWriter brw = null;
        try {
            br = new BufferedReader(new FileReader(ficheroencriptado));
            brw = new BufferedWriter(new FileWriter(ficherodesencriptado));
            //mientras el string que viene por el buffer no sea null se sigue
            int i = 1;

            while ((linea = br.readLine()) != null) {

                String lineadesencriptada = "";
                for (char caracter : linea.toCharArray()) {
                    caracter = (char) (caracter - i);

                    lineadesencriptada = lineadesencriptada.concat(String.valueOf(caracter));
                }

                brw.write(lineadesencriptada);
                brw.write(System.lineSeparator());
                i++;
            }

            System.out.println("Fichero Desencriptado...");
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
