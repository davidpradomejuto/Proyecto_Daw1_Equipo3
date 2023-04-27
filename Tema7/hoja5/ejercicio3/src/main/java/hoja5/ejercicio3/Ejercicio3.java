/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja5.ejercicio3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio3 {

    /*
    Realiza un programa en JAVA en el que muestres un menú que te permita 3 opciones:
1. Grabación en un fichero binario (con el nombre que tú quieras) en el que indiques en cada
línea:
• Tu Nombre.
• Tu Edad.
• Tu Ciudad de Nacimiento.
No tiene que borrar los datos anteriores si existieran.

     */
    public static void main(String[] args) {

        int opcion = 0;
        String ruta = "C:\\Users\\david\\Desktop\\pruebasficheros";

        do {
            System.out.println("1. Grabar en el fichero.");
            System.out.println("2. Mostrar por pantalla.");
            System.out.println("3. Salir.");

            
            opcion = Teclado.introEntero("Introduce La opcion: ");

            switch (opcion) {
                case 1 -> {
                    String archivo = Teclado.introTexto("Introduce el nombre del fichero que quieres escribir sin extension: ");
                    String ficheroruta = "";
                    ficheroruta = ficheroruta.concat(ruta + "\\" + archivo + ".dat");
                    
                    System.out.println(ficheroruta);
                    File fichero = new File(ficheroruta);
                    escribirBinario(fichero);

                }
                case 2 -> {
                   
                    String archivo = Teclado.introTexto("Introduce el nombre del fichero que quieres leer sin extension: ");
                    String ficheroruta = "";
                    ficheroruta = ficheroruta.concat(ruta + "\\" + archivo + ".dat");
                    File fichero = new File(ficheroruta);
                    leerBinario(fichero);

                }
                case 3 -> {
                    System.out.println("Adios..");
                }

                default -> {
                    System.out.println("Opcion no valida...");
                }
            }
        } while (opcion != 3);
    }

    public static void leerBinario(File fichero) {
        //datos que quiero leer

        String nombre;
        int edad;
        String ciudadNacimiento;

        //creo el flujo
        DataInputStream fd = null;
        boolean fin = false;
        try {
            //creamos un flujo hacia el fichero

            fd = new DataInputStream(new FileInputStream(fichero));
            do {

                nombre = fd.readUTF();
                edad = fd.readInt();
                ciudadNacimiento = fd.readUTF();

                System.out.println("Nombre = " + nombre);
                System.out.println("edad = " + edad + " años");
                System.out.println("ciudadNacimiento = " + ciudadNacimiento);
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

    public static void escribirBinario(File fichero) {
        //datos que quiero escribir
        String nombre;
        int edad;
        String ciudadNacimiento;

        //creo el flujo
        DataOutputStream fd = null;
        boolean resp = true;

        try {

            //inicio el flujo en el fichero
            fichero.createNewFile();
            
            fd = new DataOutputStream(new FileOutputStream(fichero,true));

            do {
                //pido los datos
                
                nombre = Teclado.introTexto("Introduce Nombre: ");
                edad = Teclado.introEntero("Introduce edad: ");
                ciudadNacimiento = Teclado.introTexto("Introduce ciudad de nacimiento: ");

                //lo grabamos en el fichero
                fd.writeUTF(nombre);
                fd.writeInt(edad);
                fd.writeUTF(ciudadNacimiento);

                //pregunto si quiere agregar otro fichero
                resp = Teclado.introBoolean("Otro registro:S/N ");

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

}
