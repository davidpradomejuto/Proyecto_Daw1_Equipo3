/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author david
 */
public class Modulo {

    private String nombreModulo;
    private LinkedList<Alumno> lista;

    public Modulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
        lista = new LinkedList();
    }

    public boolean aniadirAlumno() {
        boolean result = false;
        Alumno aux = new Alumno();
        try {

            if (lista.add(aux)) {
                result = true;
            }
        } catch (Exception e) {
            System.out.println("Error al añadir el alumno");
            System.out.println(e.toString());
        }

        return result;

    }

    public void mostrarIniciales() {
        DataOutputStream fd = null;
        String nombre;
        int nota;
        File fichero = new File("D:\\Usuarios\\daw118\\Documents\\Pruebas\\hoja7ej2\\iniciales.dat");

        try {
            Iterator<Alumno> it = lista.iterator();
            while (it.hasNext()) {
                Alumno aux = it.next();
                System.out.println(aux.getNombreAlumno().substring(0, 3) + " , " + aux.getNota());

                //inicio el flujo en el fichero
                fd = new DataOutputStream(new FileOutputStream(fichero));

                nombre = aux.getNombreAlumno().substring(0, 3);
                nota = aux.getNota();

                fd.writeUTF(nombre);
                fd.writeInt(nota);

            }
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

    public void mostrarFichero(File fichero) {

        //datos que quiero escribir
        String nombre;
        int nota;

        //creo el flujo
        DataInputStream fd = null;
        boolean fin = false;
        try {
            //creamos un flujo hacia el fichero

            fd = new DataInputStream(new FileInputStream(fichero));
            do {
                nombre = fd.readUTF();
                nota = fd.readInt();

                System.out.println("nombre = " + nombre);
                System.out.println("nota = " + nota);

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
        }
    }
    
     // el final de la lectura lo detecta con -1
    public void leerLineaALinea(File fichero) {
        BufferedReader br = null;
        String linea;
        try {
            br = new BufferedReader(new FileReader(fichero));
            //mientras el string que viene por el buffer no sea null se sigue
            while ((linea = br.readLine()) != null) {
                //muestra la linea
                System.out.println(linea);
            }
        } catch (IOException ex) {
            System.err.println(ex.toString());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar");
                }
            }
        }
    }

    public void mostrarSuspensosYAprobados() {
        DataOutputStream fd = null;
        BufferedWriter br = null;
        String nombre;
        int nota;
        File ficheroAprobados = new File("D:\\Usuarios\\daw118\\Documents\\Pruebas\\hoja7ej2\\aprobados.txt");
        File ficheroSuspensos = new File("D:\\Usuarios\\daw118\\Documents\\Pruebas\\hoja7ej2\\suspensos.dat");

        try {
            fd = new DataOutputStream(new FileOutputStream(ficheroSuspensos));
            br = new BufferedWriter(new FileWriter(ficheroAprobados));

            Iterator<Alumno> it = lista.iterator();
            while (it.hasNext()) {
                Alumno aux = it.next();
                if (aux.getNota() > 5) {
                    System.out.println("aprobado: " + aux.getNombreAlumno() + " , " + aux.getNota());
                    br.write("aprobado: " + aux.getNombreAlumno() + " , " + aux.getNota());
                    br.write(System.lineSeparator());
                } else {
                    System.out.println("Suspenso: " + aux.getNombreAlumno() + " , " + aux.getNota());
                    nombre = aux.getNombreAlumno();
                    nota = aux.getNota();

                    fd.writeUTF(nombre);
                    fd.writeInt(nota);
                }

            }
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

            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar");
                }
            }
        }
    }

    public void grabarDescendente() {
        DataOutputStream fd = null;
        File fichero = new File("D:\\Usuarios\\daw118\\Documents\\Pruebas\\hoja7ej2\\descendente.dat");

        LinkedList<Alumno> listaaux = lista;

        try {
            fd = new DataOutputStream(new FileOutputStream(fichero));

            Iterator<Alumno> it = listaaux.iterator();
            while (it.hasNext()) {
                Alumno aux = it.next();

                fd.writeUTF(aux.getNombreAlumno());
                fd.writeInt(aux.getNota());
            }

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
