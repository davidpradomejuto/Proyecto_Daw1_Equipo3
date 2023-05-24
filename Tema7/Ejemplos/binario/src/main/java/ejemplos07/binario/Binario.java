/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejemplos07.binario;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author cic
 */
public class Binario {

    public static void main(String[] args) {
        File fichero = new File("Fichero.dat");
        System.out.println("Creando el fichero pidiendo los datos");
       escribirBinario(fichero);
        System.out.println("Leyendo el fichero creado");
        leerBinario(fichero);
    }

    public static void escribirBinario(File fichero) {
        String nombre;
        int edad;

        DataOutputStream fd = null;
        boolean resp = true;
        try {

            fd = new DataOutputStream(new FileOutputStream(fichero));
            do {
                nombre = Teclado.introTexto("Introduce nombre: ");
                edad = Teclado.introEntero("Introduce edad: ");
                //lo grabamos en el fichero
                fd.writeUTF(nombre);
                fd.writeInt(edad);
                resp = Teclado.introBoolean("Otro registro:S/N ");
            } while (resp);
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
    // el final de la lectura lo detecta saltando la excepcion EOFException
    public static void leerBinario(File fichero) {
        String nombre;
        int edad;
        DataInputStream fd = null;
        boolean fin = false;
        try {
            //creamos un flujo hacia el fichero

            fd = new DataInputStream(new FileInputStream(fichero));
            do {
                nombre = fd.readUTF();
                edad = fd.readInt();
                System.out.println("Nombre = " + nombre);
                System.out.println("Edad = " + edad);
            } while (!fin);
        } catch (EOFException eof) {
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
