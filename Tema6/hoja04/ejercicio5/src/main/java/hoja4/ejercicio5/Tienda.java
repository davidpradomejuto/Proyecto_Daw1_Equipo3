/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author DAW118
 */
public class Tienda {

    Set<Publicacion> matriz;

    public Tienda() {
        matriz = new LinkedHashSet<>();
    }

    public void insertar() {
        int opcion = Teclado.pedirIntPositivo("introduce el la opcion que quieras 1. Disco / 2. Libro: ");

        if (opcion == 1) {
            System.out.println("Quieres insertar un disco...........");

            String titulo = Teclado.pedirNombre("introduce el titulo: ");
            String autor = Teclado.pedirNombre("introduce el autor: ");
            int dia = Teclado.pedirIntPositivo("introduce el dia: ");
            int mes = Teclado.pedirIntPositivo("introduce el mes: ");
            int anio = Teclado.pedirIntPositivo("introduce el anio: ");
            int duracion = Teclado.pedirIntPositivo("introduce la duracion: ");
            if (matriz.add(new Disco(duracion, titulo, autor, dia, mes, anio))) {
                System.out.println("Disco introducido");
            } else {
                System.out.println("Disco no introducido");
            }

        } else if (opcion == 2) {
            System.out.println("Quieres insertar un libro.......");

            String titulo = Teclado.pedirNombre("introduce el titulo: ");
            String autor = Teclado.pedirNombre("introduce el autor: ");
            int dia = Teclado.pedirIntPositivo("introduce el dia: ");
            int mes = Teclado.pedirIntPositivo("introduce el mes: ");
            int anio = Teclado.pedirIntPositivo("introduce el anio: ");
            int npaginas = Teclado.pedirIntPositivo("introduce el numero de paginas: ");

            if (matriz.add(new Libro(titulo, autor, dia, mes, anio, npaginas))) {
                System.out.println("libro introducido");
            } else {
                System.out.println("libro no introducido");
            }
        } else {
            System.out.println("Opcion no valida.");
        }
    }

    public void borrar() {
        String tituloBuscado = "";
        tituloBuscado = Teclado.pedirNombre("introduce el titulo del a publicacion: ");;
        boolean encontrado = false;

        for (Publicacion o : matriz) {
            if (o.getTitulo().equalsIgnoreCase(tituloBuscado) && !encontrado) {
                encontrado = true;
                if (matriz.remove(o)) {
                    System.out.println("Publicacion borrada...");
                }

            }
        }
        if (!encontrado) {
            System.out.println("Publicacion no encontrada.");
        }
    }

    public void mostrar() {
        System.out.println("Mostrando dato de la tienda..");
        for (Publicacion o : matriz) {
            if (o instanceof Disco discaux) {
                System.out.println(discaux.toString());
            }
            if (o instanceof Libro libaux) {
                System.out.println(libaux.toString());
            }
        }
    }

    public Disco mayorDuracion() {
        System.out.println("Disco con mayor duracion...");
        int mayortiempo = 0;
        Disco result = null;

        Iterator<Publicacion> it = matriz.iterator();
        while (it.hasNext()) {
            Publicacion aux = it.next();
            
            if (aux instanceof Disco discaux) {
                if (discaux.getDuracionMinutos() >= mayortiempo) {
                    mayortiempo = discaux.getDuracionMinutos();
                    result = discaux;
                }
            }
        }
        
        return result;

    }

    public List<Libro> novedades() {
        int mes = Teclado.PedirFecha("mes", 1, 12);
        List<Libro> libros = new ArrayList<>(); 
        
        System.out.println("Muestro los libros editados en febrero que tengan mas de 1000 paginas");
        for (Publicacion o : matriz) {
            if (o instanceof Libro libroaux) {
                if (libroaux.getFecha().getMonthValue() == mes
                        && libroaux.getFecha().getYear() == LocalDate.now().getYear()
                        && libroaux.getNumPaginas() >= 400) {
                   libros.add(libroaux);
                }
            }
        }
        
        return libros;
    }

}
