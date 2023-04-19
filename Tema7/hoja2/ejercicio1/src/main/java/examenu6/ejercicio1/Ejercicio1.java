/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package examenu6.ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author DAW118
 */
public class Ejercicio1 {
  
public static void main(String[] args) {
        
        File fichero =new File("D:\\Usuarios\\daw118\\Desktop\\FicheroDePrueba.txt");

        System.out.println("Leyendo fichero");
        leerByteAByte(fichero);
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
        }catch(FileNotFoundException fnfe){
                    System.out.println("Error, el fichero no existe");
        }catch (IOException e) {
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

