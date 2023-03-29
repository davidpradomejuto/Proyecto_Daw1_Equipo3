/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Teclado {
    
    public static String pedirNombreRegex(String mensaje) { // este metodo me sirve para recoger un nombre, tambien lo uso para pedir los apellidos del alumno, hace lo mismo que el del pedir un color
        // pero recibiendo la frase que va a mostrar por pantalla mediante parametros

        String regex = "[A-ZÉÁÍÓÚÑ][a-zéáíóúñ ]*";
        boolean valido = false;
        String nombre;

        do {

            System.out.print(mensaje);
            nombre = new Scanner(System.in).nextLine();
            if (nombre.matches(regex)) {
                valido = true;
            } else {
                System.out.println("Error. La cadena no cumple los requisitos");
            }

        } while (!valido);

        return nombre;

    }
    
    public static int PedirFecha(String mensaje, int min, int max) {
        boolean valido = false;
        int dato = 0;
        do {
            try {

                System.out.print("Introduce el/la " + mensaje + " :");
                dato = new Scanner(System.in).nextInt();

                if (dato > min && dato <= max) {
                    valido = true;

                } else {
                    throw new Exception("El " + mensaje + " introducido no es valido");
                }

            } catch (InputMismatchException ime) {
                System.out.println("Error No es un numero");
            } catch (Exception e) {
                System.out.println("Error indeterminado");
                System.out.println(e.getMessage());
            }

        } while (!valido);
        return dato;
    }
    
    public static LocalDate pedirFecha() { // este metodo pide el dia,mes y anio en numeros  y lo convierte en fecha, se que el rango de fecha de los dias cambia dependiendo del mes
        //yo le he puesto de 0 a 31 , por que no queria poner otra capa mas de complejidad

        int dia = 0, mes = 0, anio = 0;

        LocalDate fecha = LocalDate.now();
        boolean fechaValida = false;
        do {

            dia = PedirFecha("dia", 1, 31);
            mes = PedirFecha("mes", 1, 12);
            anio = PedirFecha("anio", 0, 2023);
            

            try {
                fecha = LocalDate.of(anio, mes, dia);
                fechaValida = true;
            } catch (DateTimeException DTE) {
                System.out.println("Fecha no valida. repite");
            }

        } while (!fechaValida);
        
        return fecha; //devuelvo la fecha formateada en LocalDate

    }
}
