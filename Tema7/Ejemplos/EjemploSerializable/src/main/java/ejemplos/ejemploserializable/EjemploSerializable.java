/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos.ejemploserializable;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author cic
 */
public class EjemploSerializable {

   public static void main(String[] args) {
        File f = new File("coches.dat");
        Escribir(f);
        Leer(f);
    }

    public static void Escribir(File f) {
        ObjectOutputStream fo = null;
        String marca="";
        double velocidad;
        int gasolina;
        try {
            if(f.exists()){
                fo=new MiObjectOutputStream(new FileOutputStream(f,true));
               
            }else{
                fo = new ObjectOutputStream(new FileOutputStream(f));
            }
            marca=Teclado.pedirMarca();
            velocidad=Teclado.pedirVelocidad();
            gasolina=Teclado.pedirGasolina();
            Coche c = new Coche(marca,velocidad,gasolina);
            fo.writeObject(c);
        } catch (IOException ex) {
            System.err.println(ex.toString());
        } finally {
            if (fo != null) {
                try {
                    fo.close();
                } catch (IOException ex) {
                    System.out.println("Error de lectura");
                }
            }
        }
    }
    // el final de la lectura lo detecta saltando la excepcion EOFException
    public static void Leer(File f) {
        ObjectInputStream os = null;
        boolean fin = false;
        try {
            os = new ObjectInputStream(new FileInputStream(f));
            Coche c;
            while (!fin) {
                c = (Coche) os.readObject();//Casting necesario 
                System.out.println(c.toString());
            }
        } catch (EOFException e) {
            fin=true;
        } catch (ClassNotFoundException e) {
            System.out.println("Error el tipo de objeto no es compatible");
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar");
                }
            }
        }
    }

}
