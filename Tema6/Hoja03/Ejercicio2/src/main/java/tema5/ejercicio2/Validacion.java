/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author atres
 */
public class Validacion {

    public static LocalDate fecha() {
        Scanner teclado = new Scanner(System.in);
        int dia = 0, mes = 0, anio = 0;
        boolean valido = false;
        LocalDate fecha = null;

        while (!valido) {
            try {
                System.out.println("Introduce el dia: ");
                dia = teclado.nextInt();
                if (dia >= 1 && dia <= 31) {
                    System.out.println("Día introducido correctamente");
                } else {
                    System.out.println("Error, Día mal introducido, Valores correctos: 1-31");
                }
                System.out.println("Introduce el mes: ");
                mes = new Scanner(System.in).nextInt();
                if (mes >= 1 && mes <= 12) {
                    System.out.println("Mes introducido correctamente");
                } else {
                    System.out.println("Error, Mes mal introducido, Valores correctos: 1-12");
                }
                System.out.println("Introduce el año: ");
                if (anio > 1900 && anio < LocalDate.now().getYear()) {
                    System.out.println("Año introducido correctamente");
                    valido=true;
                }else{
                    System.out.println("Error, Año mal introducido");
                }
        }
            catch(InputMismatchException i){
                System.err.println("Error, has introducido letras.");
            }

    }
        fecha=LocalDate.of(anio, mes, dia);
        return fecha;
    }
    public static LocalTime hora(){
        Scanner teclado= new Scanner(System.in);
        boolean valido=false;
        int hora=0, min=0;
        LocalTime horas=null;
        while(!valido){
            try{
                System.out.println("Introduce las horas: ");
                hora=teclado.nextInt();
                if(hora<0 && hora>24){
                    System.out.println("Hora introducida correctamente");
                }
                else{
                    System.out.println("Error, Hora mal introducida, Valores correctos: 00-23");
                }
                System.out.println("Introduce los minutos: ");
                min=new Scanner(System.in).nextInt();
                if(min<00 && min>60){
                    System.out.println("Minutos introducidos correctamente");
                    valido= true;
                }else{
                    System.out.println("Error, Minutos mal introducidos, Valores correctos: 00-59");
                }
            }
            catch(InputMismatchException i){
                System.err.println("Error. Has introducido una letra.");
            }
        }
        horas=LocalTime.of(hora, min);
        return horas;
    }
   
}
