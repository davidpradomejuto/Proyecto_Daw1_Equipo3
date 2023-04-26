/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja4.ejercicio3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        /*
        3.- Se dispone de un fichero binario ya creado llamado “Alumnos.dat” con la información de
los datos de los alumnos de un curso de informática con las correspondientes notas en los tres
módulos: no matrícula (int), nombre (String), nota1 (int), nota2 (int), nota3 (int).
Se pide:
        
a) Un programa que a partir de él genere otro fichero llamado “Promocionan.dat” con
los datos: (no matrícula, nombre y nota media) con todos los alumnos que pasen de
curso.
        
Para pasar de curso hay que tener las 3 notas aprobadas.
A la vez que los grabas los debes visualizar por pantalla para comprobar los resultados. 
         */
        File fichero = new File("D:\\Usuarios\\daw118\\Documents\\Pruebas\\alumnos.dat");
        File ficheroFinal = new File("D:\\Usuarios\\daw118\\Documents\\Pruebas\\promocion.dat");
        
        plantilla(fichero);//este metodo se encarga de recargar cada vez que se ejecuta el programa 
        //el archivo con datos nuevos
        
        if (fichero.exists()) {

            int matricula;
            String nombre;
            int nota1;
            int nota2;
            int nota3;

            //creo el flujo
            DataInputStream fd = null;
            
            DataOutputStream fdo = null;
            
            boolean fin = false;
            try {
                //creamos un flujo hacia el fichero

                fd = new DataInputStream(new FileInputStream(fichero));
                fdo = new DataOutputStream(new FileOutputStream(ficheroFinal));
                do {
                    matricula = fd.readInt();
                    nombre = fd.readUTF();
                    nota1 = fd.readInt();
                    nota2 = fd.readInt();
                    nota3 = fd.readInt();
                
                    int notamedia = (nota1+nota2+nota3)/3;
                    System.out.println("La nota media de "+nombre + " es "+notamedia);
                    if (notamedia >= 5){
                        fdo.writeInt(matricula);
                        fdo.writeUTF(nombre);
                        fdo.write(notamedia);
                    }else{
                        System.out.println(nombre+" no promociona");
                    }
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
                
                if (fdo != null) {
                    try {
                        fdo.close();
                    } catch (IOException ex) {
                        System.out.println("Error al cerrar" + ex.toString());
                    }
                }
            }

        } else {
            System.out.println("El fichero no existe");
            
        }
    }
    
    public static void plantilla(File fichero){
    //datos que quiero escribir
            int matricula;
            String nombre;
            int nota1;
            int nota2;
            int nota3;

            //creo el flujo
            DataOutputStream fd = null;

            try {

                //inicio el flujo en el fichero
                fd = new DataOutputStream(new FileOutputStream(fichero));

                matricula = 1;
                nombre = "david";
                nota1 = 7;
                nota2 = 8;
                nota3 = 9;

                fd.writeInt(matricula);
                fd.writeUTF(nombre);
                fd.writeInt(nota1);
                fd.writeInt(nota2);
                fd.writeInt(nota3);
                
                matricula = 2;
                nombre = "Pedro";
                nota1 = 7;
                nota2 = 6;
                nota3 = 2;

                fd.writeInt(matricula);
                fd.writeUTF(nombre);
                fd.writeInt(nota1);
                fd.writeInt(nota2);
                fd.writeInt(nota3);
                
                matricula = 3;
                nombre = "Luis";
                nota1 = 3;
                nota2 = 6;
                nota3 = 1;

                fd.writeInt(matricula);
                fd.writeUTF(nombre);
                fd.writeInt(nota1);
                fd.writeInt(nota2);
                fd.writeInt(nota3);

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
