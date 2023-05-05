/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos07.escribirnbytes;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author cic
 */
public class EscribirNBytes {

    public static void main(String[] args) {
        byte[] buffer = new byte[81];  //buffer de  longitud 81 bytes
        int nbytes;
        FileOutputStream f = null;
        System.out.println("Introduce al menos 81 caracteres");
        try {
            f = new FileOutputStream("otrofichero.txt", true);
            nbytes = System.in.read(buffer);
            f.write(buffer, 0, nbytes);
            //buffer=tabla que contiene los bytes
            //0= posisicon en la tabla del primer byte que se desea escribir
            //nbytes=numero de bytes a escribir
        } catch (IOException e) {
            System.err.println(e.toString());
        } finally {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
    }
}
