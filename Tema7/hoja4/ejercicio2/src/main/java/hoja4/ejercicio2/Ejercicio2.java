/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja4.ejercicio2;

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
 * @author DAW118
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        File fichero = new File("D:\\Usuarios\\daw118\\Documents\\Pruebas\\donativos.dat");

        if (fichero.exists()) {

            int opcion = 0;

            do {
                System.out.println("1) Añadir un nuevo donativo \n"
                        + "2) Listado de donativos \n"
                        + "3) Salir ");

                System.out.println("Introduce la opcion:  ");
                opcion = new Scanner(System.in).nextInt();

                switch (opcion) {
                    case 1 -> {
                        escribirBinario(fichero);
                    }
                    case 2 -> {
                        leerBinario(fichero);
                    }
                    case 3 -> {
                        System.out.println("Adios");
                    }
                    default -> {

                    }
                }

            } while (opcion != 3);
        } else {
            System.out.println("El fichero doantivos.dat no existe");
        }
    }

    public static void escribirBinario(File fichero) {
        //datos que quiero escribir
        String dni;
        String nombre;
        int importe;

        //creo el flujo
        DataOutputStream fd = null;
        boolean resp = true;

        try {

            //inicio el flujo en el fichero
            fd = new DataOutputStream(new FileOutputStream(fichero));

            do {
                //pido los datos
                //dni = Teclado.introDni("Introduce Dni: ");
                System.out.println("Introduce el Dni");
                dni = new Scanner(System.in).nextLine();
                nombre = Teclado.introTexto("Introduce Nombre: ");
                importe = Teclado.introEntero("Introduce Importe: ");

                //lo grabamos en el fichero
                fd.writeUTF(dni);
                fd.writeUTF(nombre);
                fd.writeInt(importe);

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

    // el final de la lectura lo detecta saltando la excepcion EOFException
    public static void leerBinario(File fichero) {
        //datos que quiero leer
        String dni;
        String nombre;
        int importe;

        //creo el flujo
        DataInputStream fd = null;
        boolean fin = false;
        try {
            //creamos un flujo hacia el fichero

            fd = new DataInputStream(new FileInputStream(fichero));
            do {
                dni = fd.readUTF();
                nombre = fd.readUTF();
                importe = fd.readInt();

                System.out.println("dni = " + dni);
                System.out.println("Nombre = " + nombre);
                System.out.println("importe = " + importe + " €");
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
