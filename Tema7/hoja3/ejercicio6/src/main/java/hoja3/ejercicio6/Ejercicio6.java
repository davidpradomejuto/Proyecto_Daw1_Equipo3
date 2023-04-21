/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja3.ejercicio6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author DAW118
 */
public class Ejercicio6 {

    public static void main(String[] args) {
       
           File uno = new File(args[0]);
           File dos = new File(args[1]);
           File tres = new File(args[2]);
           concatenarTresFicheros(uno,dos,tres);
       
    }
    
    public static void concatenarTresFicheros(File uno,File dos,File tres){
        if(tres.exists()){
            System.out.println("El tercer fichero existe");
        }else{
            System.out.println("El tercer no fichero existe");
        }
        
        System.out.println("La ruta del primer fichero es : "+uno.getAbsolutePath());
        System.out.println("El primer fichero tiene de tamanio : "+uno.length()+" Bytes");
        System.out.println("La ruta del segundo fichero es : "+dos.getAbsolutePath());
        System.out.println("El segundo fichero tiene de tamanio : "+dos.length()+" Bytes");
        
        CopiarFichero(uno,tres);
        CopiarFichero(dos,tres);
        
        if(uno.delete()){System.out.println("Primer archivo eliminado correctamente");}
        if(dos.delete()){System.out.println("Segundo archivo eliminado correctamente");}
        
        tres.setReadOnly();
        
        
    }
    
    public static void CopiarFichero(File fichero,File ficherocopia){
        BufferedReader brr = null;
        String lineaLeida;

        BufferedWriter brw = null;

        try {
            //hago los dos ficheros uno que se lee y otro que  se escribe
            brr = new BufferedReader(new FileReader(fichero));
            brw = new BufferedWriter(new FileWriter(ficherocopia, true));

            while ((lineaLeida = brr.readLine()) != null) {
                //cogo la linea que he leido y la escribo
                brw.write(lineaLeida);
                brw.write(System.lineSeparator());
            }
            
            System.out.println("Fichero copiado satisfactoriamente");

        } catch (FileNotFoundException fnfe) {
            System.out.println("Error, el fichero no existe");
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            //cierro los dos ficheros
            if (brr != null) {
                try {
                    brr.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar");
                }
            }
            if (brw != null) {
                try {
                    brw.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar");
                }
            }
        }
    }
}
