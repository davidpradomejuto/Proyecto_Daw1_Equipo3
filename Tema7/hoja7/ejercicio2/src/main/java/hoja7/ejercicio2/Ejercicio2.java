/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja7.ejercicio2;

import java.io.File;

/**
 *
 * @author david
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Modulo modulo = new Modulo("asir");

        if (modulo.aniadirAlumno()) {
            System.out.println("Alumno añadido");
        } else {
            System.out.println("Error...alumno no añadido");
        }

        if (modulo.aniadirAlumno()) {
            System.out.println("Alumno añadido");
        } else {
            System.out.println("Error...alumno no añadido");
        }

        if (modulo.aniadirAlumno()) {
            System.out.println("Alumno añadido");
        } else {
            System.out.println("Error...alumno no añadido");
        }

        System.out.println("");
        System.out.println("lista de alumnos en forma descendente");
        modulo.grabarDescendente();

        System.out.println("Mostrando descendente.dat");
        File fichero = new File("D:\\Usuarios\\daw118\\Documents\\Pruebas\\hoja7ej2\\descendente.dat");
        modulo.mostrarFichero(fichero);
        
        System.out.println("");
        System.out.println("lista de alumnos solo iniciales");
        modulo.mostrarIniciales();
        
        System.out.println("");
        System.out.println("lista de suspensos y aprobado");
        modulo.mostrarSuspensosYAprobados();
        
        System.out.println("-------------listandos los dos ficheros-------------");
        File ficheroAprobados = new File("D:\\Usuarios\\daw118\\Documents\\Pruebas\\hoja7ej2\\aprobados.txt");
        File ficheroSuspensos = new File("D:\\Usuarios\\daw118\\Documents\\Pruebas\\hoja7ej2\\suspensos.dat");
        
        System.out.println("Listando aprobados........");
        modulo.leerLineaALinea(ficheroAprobados);
        
        System.out.println("Listando suspensos........");
        modulo.mostrarFichero(ficheroSuspensos);
        
    }
}
