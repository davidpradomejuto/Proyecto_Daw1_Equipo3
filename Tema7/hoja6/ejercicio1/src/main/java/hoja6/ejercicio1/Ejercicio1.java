/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja6.ejercicio1;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author DAW118
 */
public class Ejercicio1 implements Serializable {

    public static void main(String[] args) {
        File fichero = new File("D:\\Usuarios\\daw118\\Documents\\Pruebas\\Ejercicios de serializados\\facturas.dat");

        int opcion = 0;
        do {
            System.out.println("1.- Añadir factura.\n"
                    + "2.-Listado mororos\n"
                    + "3.- Eliminar fichero\n"
                    + "4.- Salir");

            opcion = Teclado.pedirIntPositivo("Introduce la opcion deseada..");

            switch (opcion) {
                case 1 -> {
                    Factura factura = new Factura();
                    escribir(fichero, factura);
                    System.out.println("Factura añadida....");
                }
                case 2 -> {
                    System.out.println("Lista de morosos....");
                    leerMorosos(fichero);
                }
                case 3 -> {
                    try {
                        fichero.delete();
                        System.out.println("Fichero Eliminado");
                    } catch (SecurityException SE) {

                        System.out.println("Error de Security exception");
                        System.out.println(SE.toString());
                    }

                }
                case 4 -> {
                    System.out.println("Adios....");
                }
                default -> {
                    System.out.println("Opcion no valida....");
                }
            }
        } while (opcion != 4);

    }

    public static void escribir(File f, Factura obj) {
        ObjectOutputStream fo = null;

        try {
            if (f.exists()) {
                fo = new MiObjectOutputStream(new FileOutputStream(f, true));

            } else {
                fo = new ObjectOutputStream(new FileOutputStream(f));
            }
            fo.writeObject(obj);
        } catch (IOException ex) {
            System.err.println(ex.toString());
        } finally {
            if (fo != null) {
                try {
                    fo.close();
                } catch (IOException ex) {
                    System.out.println("Error de lectura");
                }
            }
        }
    }

    public static void leerMorosos(File f) {
        ObjectInputStream os = null;
        boolean fin = false;
        try {
            os = new ObjectInputStream(new FileInputStream(f));
            Factura c;
            while (!fin) {
                c = (Factura) os.readObject();//Casting necesario 
                if (!c.isPagado()) {
                    System.out.println(c.toString());
                }
            }
        } catch (EOFException e) {
            fin = true;
        } catch (ClassNotFoundException e) {
            System.out.println("Error el tipo de objeto no es compatible");
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar");
                }
            }
        }
    }
}
