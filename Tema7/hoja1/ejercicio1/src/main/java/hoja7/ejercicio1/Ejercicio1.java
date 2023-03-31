/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja7.ejercicio1;

import java.io.File;
import java.io.IOException;

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
                + "a) Su nombre : "+fichero.getName()+"\n"
                + "b) Su ruta de acceso: \n"+fichero.getAbsoluteFile()+"\n"
                + "c) Si es de lectura: \n"+fichero.canRead()+"\n"
                + "d) Si es de escritura\n"+fichero.canWrite()+"\n"
                + "e) Su tamaño."+fichero.getTotalSpace()+"\n");
        
        System.out.println("-----Creacion del fichero----");
        
        File FicheroDePrueba = new File("D:\\Usuarios\\daw118\\Desktop\\FicheroDePrueba.txt");
        try{
            if (FicheroDePrueba.createNewFile()){
                System.out.println("Fichero creado");
            }else {
                System.out.println("Error, no se puede crear el fichero");
            }
        
        }catch(IOException IOE){
            System.out.println(IOE.getMessage());
        }
        
        System.out.println("Introduce la ruta absoluta");
    }
}
