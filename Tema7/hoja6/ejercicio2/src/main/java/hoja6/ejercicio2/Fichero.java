/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DAW118
 */
public class Fichero implements Serializable {

    private File f = new File("D:\\Usuarios\\daw118\\Documents\\Pruebas\\Ejercicios de serializados\\agenda.dat");

    public void escribir(Persona obj) {
        ObjectOutputStream fo = null;

        try {
            if (f.exists()) {
                fo = new MiObjectOutputStream(new FileOutputStream(f, true));

            } else {
                fo = new ObjectOutputStream(new FileOutputStream(f));
            }
            fo.writeObject(obj);
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

    public void leer() {
        ObjectInputStream os = null;
        boolean fin = false;
        try {
            os = new ObjectInputStream(new FileInputStream(f));
            Persona c;
            while (!fin) {
                c = (Persona) os.readObject();//Casting necesario 
                System.out.println(c.toString());

            }
        } catch (EOFException e) {
            fin = true;
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

    public void Buscar(String nombre) {
        ArrayList<Persona> lista = new ArrayList();
        ObjectInputStream os = null;
        boolean fin = false;
        try {
            os = new ObjectInputStream(new FileInputStream(f));
            Persona c;
            System.out.println("Buscando...");
            while (!fin) {
                c = (Persona) os.readObject();//Casting necesario 
                //añado el objeto al array list     
                lista.add(c);

            }

            //hago el iterator para buscar a la persona
            Iterator<Persona> it = lista.iterator();
            boolean encontrado = false;
            while (it.hasNext() && !encontrado) {
                Persona persona = it.next();

                if (persona.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println(persona.toString());
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("La persona no ha sido encontrada...");
            }

        } catch (EOFException e) {
            fin = true;
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

    public void Borrar(String nombre) {
        ArrayList<Persona> lista = new ArrayList();
        ObjectInputStream os = null;
        boolean fin = false;
        try {
            os = new ObjectInputStream(new FileInputStream(f));
            boolean encontrado = false;

            Persona c;
            while (!fin) {
                c = (Persona) os.readObject();//Casting necesario 
                if (c.getNombre().equalsIgnoreCase(nombre)) {
                    encontrado = true;
                } else {//añado el objeto al array list     
                    lista.add(c);
                }

            }

            if (!encontrado) {
                System.out.println("La persona no ha sido encontrada y eliminada...");
            } else {
                for (Persona a : lista) {
                    escribir(a);
                }
            }

        } catch (EOFException e) {
            fin = true;
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

    public void BorrarFichero() {
        try {
            f.delete();
            System.out.println("Fichero Eliminado");
        } catch (SecurityException SE) {

            System.out.println("Error de Security exception");
            System.out.println(SE.toString());
        }
    }
}
