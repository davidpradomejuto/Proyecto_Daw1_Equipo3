/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja3.ejercicio9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author DAW118 9.- Programa que partiendo del archivo “canción.txt” del ejercicio 5 grabe la misma canción, pero con las estrofas al revés. Utiliza para ello una pila.
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        File cancion = new File("D:\\Usuarios\\daw118\\Documents\\Pruebas\\cancion.txt");

        BufferedReader brr = null;
        String lineaLeida;

        BufferedWriter brw = null;
        
        LinkedList<String> mapa = new LinkedList();

        try {
            //hago los dos ficheros uno que se lee y otro que  se escribe
            brr = new BufferedReader(new FileReader(cancion));
            brw = new BufferedWriter(new FileWriter(cancion, true));

            while ((lineaLeida = brr.readLine()) != null) {
                //cogo la linea que he leido y la escribo
                mapa.addLast(lineaLeida);
            }
            
            while(mapa.size()!=0){
                brw.write(mapa.pollLast());
                brw.newLine();
            }
            

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
