/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio5;

import java.time.LocalDate;
import java.util.LinkedHashSet;
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

            matriz.add(new Disco(duracion, titulo, autor, dia, mes, anio));
        } else if (opcion == 2) {
            System.out.println("Quieres insertar un libro.......");

            String titulo = Teclado.pedirNombre("introduce el titulo: ");
            String autor = Teclado.pedirNombre("introduce el autor: ");
            int dia = Teclado.pedirIntPositivo("introduce el dia: ");
            int mes = Teclado.pedirIntPositivo("introduce el mes: ");
            int anio = Teclado.pedirIntPositivo("introduce el anio: ");
            int npaginas = Teclado.pedirIntPositivo("introduce el numero de paginas: ");

            matriz.add(new Libro(titulo, autor, dia, mes, anio, npaginas));
        } else {
            System.out.println("Opcion no valida.");
        }
    }

    public void borrar() {
        String tituloBuscado = "";
        tituloBuscado = Teclado.pedirNombre("introduce el titulo del a publicacion: ");;
        boolean encontrado = false;

        for (Publicacion o : matriz) {
            if (o.getTitulo() == tituloBuscado && !encontrado) {
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

    public void mayorDuracion() {
        System.out.println("Disco con mayor duracion...");
        int mayortiempo = 0;
        String titulo = "";
        for (Publicacion o : matriz) {
            if (o instanceof Disco discaux) {
                if (discaux.getDuracionMinutos() >= mayortiempo) {
                    mayortiempo = discaux.getDuracionMinutos();
                    titulo = o.getTitulo();
                }
            }
        }

        for (Publicacion o : matriz) {
            if (o instanceof Disco discaux) {
                if (o.getTitulo().equalsIgnoreCase(titulo)) {
                    System.out.println(discaux.toString());
                }
            }
        }

    }

    public void editadosYMes() {
        int mes = Teclado.PedirFecha("mes", 1, 12);

        System.out.println("Muestro los libros editados en febrero que tengan mas de 1000 paginas");
        for (Publicacion o : matriz) {
            if (o instanceof Libro libroaux) {
                if (libroaux.getFecha().getMonthValue() == LocalDate.now().getMonthValue()
                        && libroaux.getFecha().getYear() == LocalDate.now().getYear()
                        && libroaux.getNumPaginas() >= 1000) {
                    if (libroaux.getFecha().isAfter(LocalDate.now().minusYears(2))) {//la fecha actual menos 2 años
                        System.out.println("Titulo: " + libroaux.getTitulo() + " Autor: " + libroaux.getAutor());
                    }

                }
            }
        }
    }

}
