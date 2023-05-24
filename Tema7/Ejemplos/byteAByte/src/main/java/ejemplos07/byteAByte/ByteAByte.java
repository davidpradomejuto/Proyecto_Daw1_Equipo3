/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejemplos07.byteAByte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author cic
 */
public class ByteAByte {
    
    public static void main(String[] args) {
        
        File fichero =new File("mifichero.txt");
        System.out.println("creando el fichero");
        escribirByteAByte(fichero);
        System.out.println("Leyendo fichero");
        leerByteAByte(fichero);
    }
    
    public static void escribirByteAByte(File fichero){
        
        int caracter;
        FileOutputStream f = null;
        System.out.println("escribe lo que quieras graba una línea");
        try {
            f = new FileOutputStream(fichero);
           
            while ((caracter = System.in.read()) != '\n') {
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
    public static void leerByteAByte(File fichero){
        int caracter;
        FileInputStream f = null;
        try {
            f = new FileInputStream(fichero); 
            
            while ((caracter = f.read()) != -1) {
                System.out.print((char) caracter);
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            if (f != null){
                try {
                    f.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el fichero.");
                }
            }
        }
    }
    
}
