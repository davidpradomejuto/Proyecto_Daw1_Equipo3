/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja7.ejercicio1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Ejercicio1 {

    public static void main(String[] args) throws IOException {
        File fichero = new File("D:\\Usuarios\\daw118\\Desktop\\Horario.txt");
        if (fichero.exists()) {
            System.out.println("El fichero existe");
        } else {
            System.out.println("El fichero no existe");
        }

        System.out.println("");
        System.out.println("Buscar un fichero en una ruta determinada y sacar por pantalla\n"
                + "\n"
                + "a) Su nombre : " + fichero.getName() + "\n"
                + "b) Su ruta de acceso: " + fichero.getAbsoluteFile() + "\n"
                + "c) Si es de lectura: " + fichero.canRead() + "\n"
                + "d) Si es de escritura: " + fichero.canWrite() + "\n"
                + "e) Su tamaño: " + fichero.length() + " Bytes \n");

        System.out.println(""
                + "");
        System.out.println("-----Creacion del fichero----");

        File FicheroDePrueba = new File("D:\\Usuarios\\daw118\\Desktop\\FicheroDePrueba.txt");
        try {
            if (FicheroDePrueba.createNewFile()) {
                System.out.println("Fichero creado");
            } else {
                System.out.println("Error, no se puede crear el fichero");
            }

        } catch (IOException IOE) {
            System.out.println(IOE.getMessage());
        }

        System.out.println("");

        System.out.println("Introduce la ruta absoluta");
        String StringRuta = new Scanner(System.in).nextLine();

        File ruta = new File(StringRuta);
        File[] matrizTodo = ruta.listFiles();

        for (File aux : matrizTodo) {

            if (aux.isFile()) {
                
                
                String soutFichero = "";
                soutFichero = soutFichero.concat("\tFichero -> " + aux.getName());
                System.out.println(soutFichero);
            } else {
                String directorioAux = "";
                String soutDir = "";
                soutDir = soutDir.concat("\t"+"\tDirectorio -> " + aux.getName());
                System.out.println(soutDir);              
                directorioAux = directorioAux.concat(StringRuta + "\\" + aux.getName());
                ListarSubdirectorio(directorioAux);
            }
        }

    }

    public static void ListarSubdirectorio(String ruta) {

        File rutaAux = new File(ruta);
        File[] matrizDirectorio = rutaAux.listFiles();

        System.out.println("Subdirectorio : " + rutaAux.getName());
        for (File auxFichero : matrizDirectorio) {
            if (auxFichero.isFile()) {
                String soutFichero = "";
                soutFichero = soutFichero.concat("\t"+"\tFichero -> " + auxFichero.getName());
                System.out.println(soutFichero);
            } else {
                String soutDir = "";
                soutDir = soutDir.concat("\t"+"\tDirectorio -> " + auxFichero.getName());
                System.out.println(soutDir);
                String directorioAux = "";
                directorioAux = directorioAux.concat(ruta + "\\" + auxFichero.getName());
                ListarSubdirectorio(directorioAux);
            }
        }
    }
}
