/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja5.ejercicio1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        File fichero = new File("D:\\Usuarios\\daw118\\Documents\\Pruebas\\hoja5ej1.dat");

        escribirByteAByte(fichero);
        leerFicheroYContarMinusMayusNums(fichero);
    }

    public static void escribirByteAByte(File fichero) {

        int caracter;
        FileOutputStream f = null;
        System.out.println("escribe lo que quieras grabar en una línea");
        try {
            //genero la salida hacia el fichero
            f = new FileOutputStream(fichero);

            //Escribe hasta que encuentre un salto de linea
            while ((caracter = System.in.read()) != '*') {
                f.write((char) caracter);
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException ex) {

                }
            }
        }
    }

    // el final de la lectura lo detecta con -1
    public static void leerFicheroYContarMinusMayusNums(File fichero) {
        int caracter;
        FileInputStream f = null;

        int mayus = 0;
        int minus = 0;
        int nums = 0;

        try {
            f = new FileInputStream(fichero);

            while ((caracter = f.read()) != -1) {

                if (Character.isDigit(caracter)) {
                    nums++;
                }else if (Character.isUpperCase(caracter)){
                    mayus++;
                }else if (Character.isLowerCase(caracter)){
                    minus++;
                }
            }
            
            System.out.println("El fichero tiene "+nums + " numeros");
            System.out.println("El fichero tiene "+mayus + " mayusculas");
            System.out.println("El fichero tiene "+minus+ " Minusculas");
            
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error, el fichero no existe");
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el fichero.");
                }
            }
        }
    }

}
