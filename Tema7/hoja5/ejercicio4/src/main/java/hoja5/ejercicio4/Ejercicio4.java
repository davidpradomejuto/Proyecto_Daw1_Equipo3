/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja5.ejercicio4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *Realiza un programa en JAVA en el que le pidas al usuario su DNI y:
• En caso de que el DNI sea correcto lo introducirás en un fichero llamado dni.bin.
• En caso de que el DNI sea incorrecto avisaras al usuario del error y no lo meterás en el
fichero.
• Cuando vuelvas a ejecutar el programa no se sobrescribirá el fichero, sino que se
seguirán añadiendo DNIs validos al final del fichero dni.bin. Ejemplos de ejecución:
Después de grabar o no el DNI, se muestra todo el contenido del fichero.
 * @author david
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        File fichero = new File("C:\\Users\\david\\Desktop\\pruebasficheros\\dni.bin");
        escribirBinario(fichero);
        leerBinario(fichero);
        
    }
    
     public static void escribirBinario(File fichero) {
        //datos que quiero escribir
        String dni;


        //creo el flujo
        DataOutputStream fd = null;
        boolean resp = true;

        try {

            //inicio el flujo en el fichero
            fd = new DataOutputStream(new FileOutputStream(fichero,true));

            do {
                //pido los datos
                //dni = Teclado.introDni("Introduce Dni: ");
                
                dni = Teclado.pedirDNIRegex("Introduce el DNI...");
                if(Teclado.validarDni(dni)){
                    //lo grabamos en el fichero
                fd.writeUTF(dni);
                //pregunto si quiere agregar otro fichero
                resp = Teclado.introBoolean("Otro registro:S/N ");
                }else{
                    //pregunto si quiere agregar otro fichero
                resp = Teclado.introBoolean("Otro registro:S/N ");
                }
                

            } while (resp); //si resp es true sigue pidiendo registros

        } catch (IOException ex) {
            System.out.println("error " + ex.toString());
        } finally {
            //cierro el flujo
            if (fd != null) {
                try {
                    fd.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar" + ex.toString());
                }
            }
        }
    }

    // el final de la lectura lo detecta saltando la excepcion EOFException
    public static void leerBinario(File fichero) {
        //datos que quiero leer
        String dni;


        //creo el flujo
        DataInputStream fd = null;
        boolean fin = false;
        try {
            //creamos un flujo hacia el fichero

            fd = new DataInputStream(new FileInputStream(fichero));
            do {
                dni = fd.readUTF();
                

                System.out.println("dni = " + dni);
                
            } while (!fin);

        } catch (EOFException eof) { // al saltar la excepcio de fin de leectura se cambia fin a true
            fin = true;
        } catch (IOException ex) {
            System.out.println("error " + ex.toString());
        } finally {
            if (fd != null) {
                try {
                    fd.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar" + ex.toString());
                }
            }
        }
    }
}
