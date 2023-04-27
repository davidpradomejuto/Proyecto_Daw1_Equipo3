/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja5.ejercicio6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author david
 */
public class Ejercicio6 {

    /*
    beca=true

     */
    public static void main(String[] args) {
        File fichero = new File("C:\\Users\\david\\Desktop\\pruebasficheros\\datosbeca.bin");
        File ficherocopia = new File("C:\\Users\\david\\Desktop\\pruebasficheros\\datosbecacontotal.bin");
        calcularBecaBinario(fichero,ficherocopia);
        leerBinario(ficherocopia);
        
    }

    public static void calcularBecaBinario(File fichero,File ficherocopia) {
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
                nombre = fd.readUTF();
                sexo = fd.readUTF();
                edad = fd.readInt();
                nSuspensos = fd.readInt();
                residencia = fd.readUTF();
                ingresosAnuales = fd.readInt();
                
                escribirBinario(ficherocopia,nombre,sexo, edad, nSuspensos, residencia, ingresosAnuales);
                
                
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
    
     public static void leerBinario(File fichero) {
        //datos que quiero escribir
        String nombre;
        String sexo;
        int edad;
        int nSuspensos;
        String residencia;
        int ingresosAnuales;
        int basefija;

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
                basefija = fd.readInt();
                

                System.out.println("nombre = " + nombre);
                System.out.println("sexo = " + sexo);
                System.out.println("edad = " + edad+" años");
                System.out.println("nSuspensos = " + nSuspensos+ " suspensos");
                System.out.println("residencia = " + residencia);
                System.out.println("ingresosAnuales = " + ingresosAnuales+" €");
                System.out.println("Valor de la beca = " + basefija+" €");

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

    public static void escribirBinario(File fichero, String nombre, String sexo, int edad, int nSuspensos, String residencia, int ingresosAnuales) {
        //creo el flujo
        DataOutputStream fd = null;
        boolean resp = true;
        int basefija = 1500;

        try {

            //inicio el flujo en el fichero
            fd = new DataOutputStream(new FileOutputStream(fichero, true));

            nombre = nombre;
            sexo = sexo;
            edad = edad;
            nSuspensos = nSuspensos;
            residencia = residencia;
            ingresosAnuales = ingresosAnuales;

            if (nSuspensos < 2) {
                if (nSuspensos == 0) {
                    basefija += 500;
                } else if (nSuspensos == 1) {
                    basefija += 200;
                }
                if (residencia.equalsIgnoreCase("NO")) {
                    basefija += 1000;
                }
                if (ingresosAnuales <= 12000) {
                    basefija += 500;
                }
                if (edad < 23) {
                    basefija += 200;
                }

                fd.writeUTF(nombre);
                fd.writeUTF(sexo);
                fd.writeInt(edad);
                fd.writeInt(nSuspensos);
                fd.writeUTF(residencia);
                fd.writeInt(ingresosAnuales);
                fd.writeInt(basefija);
            }

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
