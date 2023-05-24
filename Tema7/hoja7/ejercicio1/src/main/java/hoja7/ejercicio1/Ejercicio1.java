/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja7.ejercicio1;

import java.io.*;

/**
 *
 * @author david
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        // Comprobamos que se han proporcionado los argumentos necesarios
        if (args.length != 3) {
            System.out.println("Uso: java Principal fichero1 fichero2 fichero_salida");
            return;
        }

        // Comprobamos que los ficheros de entrada existen
        File f1 = new File(args[0]);
        File f2 = new File(args[1]);
        if (!f1.exists() || !f2.exists()) {
            System.out.println("Los ficheros de entrada no existen");
            return;
        }

        // Comprobamos que el fichero de salida no existe
        File f3 = new File(args[2]);
        if (f3.exists()) {
            System.out.println("El fichero de salida ya existe");
            return;
        }

        try {
            // Copiamos el contenido del primer fichero
            FileReader fr = new FileReader(f1);
            FileWriter fw = new FileWriter(f3);
            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
            fr.close();

            // Añadimos el contenido del segundo fichero
            BufferedReader br = new BufferedReader(new FileReader(f2));
            String linea;
            while ((linea = br.readLine()) != null) {
                fw.write(linea + "\n");
            }
            br.close();

            // Pedimos un texto desde teclado y lo añadimos al fichero de salida
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribe un texto para añadir al fichero (escribe FIN para terminar):");
            String texto;
            while ((texto = teclado.readLine()) != null && !texto.equals("FIN")) {
                fw.write(texto + "\n");
            }
            fw.close();

            // Leemos el fichero de salida y lo mostramos por pantalla
            FileReader fr2 = new FileReader(f3);
            while ((c = fr2.read()) != -1) {
                System.out.print((char)c);
            }
            fr2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
