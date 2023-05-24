/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja5.ejercicio5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Realizar un programa que lea de teclado (la entrada estándar) los siguientes datos: Nombre y apellido de un supuesto becario. Sexo (H/M) Edad (20/60) Numero de suspensos del curso anterior (0/4). Residencia familiar (SI/NO) Ingresos anuales de la familia.
 *
 * Los datos se almacenan en un fichero binario llamado “datosbeca.bin".
 *
 * @author david
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        File fichero = new File("C:\\Users\\david\\Desktop\\pruebasficheros\\datosbeca.bin");
        escribirBinario(fichero);
        leerBinario(fichero);
    }

    public static void escribirBinario(File fichero) {
        //datos que quiero escribir
        String nombre;
        String sexo;
        int edad;
        int nSuspensos;
        String residencia;
        int ingresosAnuales;

        //creo el flujo
        DataOutputStream fd = null;
        boolean resp = true;

        try {

            //inicio el flujo en el fichero
            fd = new DataOutputStream(new FileOutputStream(fichero, true));

            do {
                //pido los datos

                nombre = Teclado.pedirNombre("Introduce el nombre y el apellido...");
                sexo = Teclado.introSexo("Introduce tu sexo...(H/M)");
                edad = Teclado.pedirIntRango("Introduce tu edad...", 20, 60);
                nSuspensos = Teclado.pedirIntPositivo("Introduce tu numero de suspensos(0/4)...");
                residencia = Teclado.introResidencia("Introduce si tienes una residencia(S/N)...");
                ingresosAnuales =  Teclado.pedirIntPositivo("Introduce tus ingresos anuales...");

                fd.writeUTF(nombre);
                fd.writeUTF(sexo);
                fd.writeInt(edad);
                fd.writeInt(nSuspensos);
                fd.writeUTF(residencia);
                fd.writeInt(ingresosAnuales);

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
        //datos que quiero escribir
        String nombre;
        String sexo;
        int edad;
        int nSuspensos;
        String residencia;
        int ingresosAnuales;

        //creo el flujo
        DataInputStream fd = null;
        boolean fin = false;
        try {
            //creamos un flujo hacia el fichero

            fd = new DataInputStream(new FileInputStream(fichero));
            do {
                nombre= fd.readUTF();
                sexo =fd.readUTF();
                edad=fd.readInt();
                nSuspensos=fd.readInt();
                residencia= fd.readUTF();
                ingresosAnuales = fd.readInt();

                System.out.println("nombre = " + nombre);
                System.out.println("sexo = " + sexo);
                System.out.println("edad = " + edad+" años");
                System.out.println("nSuspensos = " + nSuspensos+ " suspensos");
                System.out.println("residencia = " + residencia);
                System.out.println("ingresosAnuales = " + ingresosAnuales+" €");

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
