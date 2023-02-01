/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio1.ejercicio1;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Publicacion[] matriz = new Publicacion[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("Que quieres insertar un disco (1) o un libro (2)");
            int opcion = new Scanner(System.in).nextInt();

            if (opcion == 1) {
                System.out.println("Quieres insertar un disco...........");

                System.out.println("introduce el titulo: ");
                String titulo = new Scanner(System.in).nextLine();
                System.out.println("introduce el autor: ");
                String autor = new Scanner(System.in).nextLine();
                System.out.println("introduce el dia: ");
                int dia = new Scanner(System.in).nextInt();
                System.out.println("introduce el mes: ");
                int mes = new Scanner(System.in).nextInt();
                System.out.println("introduce el año: ");
                int anio = new Scanner(System.in).nextInt();
                System.out.println("introduce el duracion minutos: ");
                int duracion = new Scanner(System.in).nextInt();

                matriz[i] = new Disco(duracion, titulo, autor, dia, mes, anio);
            } else {
                System.out.println("Quieres insertar un libro.......");

                System.out.println("introduce el titulo: ");
                String titulo = new Scanner(System.in).nextLine();
                System.out.println("introduce el autor: ");
                String autor = new Scanner(System.in).nextLine();
                System.out.println("introduce el dia: ");
                int dia = new Scanner(System.in).nextInt();
                System.out.println("introduce el mes: ");
                int mes = new Scanner(System.in).nextInt();
                System.out.println("introduce el año: ");
                int anio = new Scanner(System.in).nextInt();
                System.out.println("introduce el numero de paginas: ");
                int npaginas = new Scanner(System.in).nextInt();

                matriz[i] = new Libro(titulo, autor, dia, mes, anio, npaginas);
            }
        }

        System.out.println("Muestro los datos de todos las publicaciones");

        for (int i = 0; i < 5; i++) {
            if (matriz[i] instanceof Libro) { // esta es una forma para castear objetos
                Libro libroaux = (Libro) matriz[i];
                System.out.println(libroaux.toString());
            }
            if (matriz[i] instanceof Disco discaux) { // una forma para castear un objeto
                System.out.println(discaux.toString());
            }
        }

        
            System.out.println("Muestro los datos del disco con mas duracion");
        int mayortiempo = 0;
        int posicionmayor=0;
        for (int i = 0; i < 5; i++) {
            if (matriz[i] instanceof Disco discaux) {
                if (discaux.getDuracionMinutos() >= mayortiempo) {
                    mayortiempo = discaux.getDuracionMinutos();
                    posicionmayor=i;
                }
            }
        }
        
        if(matriz[posicionmayor]  instanceof Disco discaux){
            if(discaux.getAutor().length()>=3){
                System.out.println(" 3 primeras letras del autor: "+discaux.getAutor().substring(0, 3));
            }
            if(discaux.getTitulo().length()>=3){
                System.out.println(" 3 primeras letras del titulo: "+discaux.getTitulo().substring(0, 3));
            }
        }
        
        System.out.println("Muestro los libros editados en febrero que tengan mas de 1000 paginas");
        for (int i = 0; i < 5; i++) {
            if (matriz[i] instanceof Libro libroaux) { 
                if (libroaux.getFecha().getMonthValue()==LocalDate.now().getMonthValue() && libroaux.getNumPaginas()>=1000) {
                    System.out.println("Titulo: "+libroaux.getTitulo()+" Autor: "+libroaux.getAutor());
                }
            }
            
        }
        
        for (int i = 0; i < 5; i++) {
            if (matriz[i] instanceof Disco discoaux) { 
               if(discoaux.getFecha().isAfter(LocalDate.now().minusYears(2))){//la fecha actual menos 2 años
                    System.out.println("Titulo: "+discoaux.getTitulo()+" Autor: "+discoaux.getAutor());
               }
            }
            
        }
        
        
        
        
        
    }
}
