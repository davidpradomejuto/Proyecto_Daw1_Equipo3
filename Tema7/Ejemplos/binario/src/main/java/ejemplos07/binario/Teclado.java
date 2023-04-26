/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos07.binario;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author cic
 */
public class Teclado {
     /**
     * valida que la entrada por teclado sea una cadena de texto
     * @param mensaje - para indicar al usuario que dato tiene que introducir
     * @return  devuelve una cadena de texto válida
     */
    public static String introTexto(String mensaje){
        String cadena="";
        boolean valido=false;
        do{
            System.out.println(mensaje);
            cadena=new Scanner(System.in).nextLine();
            if(cadena.matches("[A-ZÑa-zñ ]*")){
                valido=true;
            }else{
                System.out.println("Error. Solo caracteres.");
            }
        }while(!valido);
        return cadena;
    }

    /**
     * valida que la entrada por teclado sea un número entero
     * @param mensaje - para indicar al usuario que dato tiene que introducir
     * @return devuelve un número entero
     */
    public static int introEntero(String mensaje){
        int entero=0;
        boolean valido=false;
        do{
            try{
            System.out.println(mensaje);
            entero=new Scanner(System.in).nextInt();
            valido=true;
            }catch(InputMismatchException e){
                System.out.println("Error, introduce un numero");
            }
        }while(!valido);
        return entero;
    }
    
    /**
     * valida que la entrada por teclado sea una fecha válida
     * @param mensaje - para indicar al usuario que dato tiene que introducir
     * @return devuelve una fecha LocalDate
     */
    public static LocalDate introFecha(String mensaje){
       
        LocalDate fecha=null;
        int dia, mes, anio;
        boolean valido=false;
        do{
            try{
            System.out.println(mensaje);
                
                dia=introEntero("Introduce el día: ");
                mes=introEntero("Introduce el mes: ");
                anio=introEntero("Introduce el año: ");
                fecha=LocalDate.of(anio,mes,dia);
                valido=true;
            }catch(DateTimeException e){
                System.out.println(e.getMessage());
            }
        }while(!valido);
        return fecha;
    }
    
    /**
     * valida que la entrada de datos sea un número real 
     * @param mensaje - para indicar al usuario que dato tiene que introducir
     * @return - devuelve un dato real
     */
    public static double introDouble(String mensaje){
        double decimal=0;
        boolean valido=false;
        do{
            try{
            System.out.println(mensaje);
            decimal=new Scanner(System.in).nextDouble();
            valido=true;
            }catch(InputMismatchException e){
                System.out.println("Error, introduce un numero");
               
            }
        }while(!valido);
        return decimal;
    }

    /**
     * valida que la entrada del dato sea SI/NO o S/N 
     * @param mensaje - para indicar al usuario que dato tiene que introducir
     * @return -devuelve un dato boolean
     */
    public static boolean introBoolean(String mensaje) {
        boolean campo = false;
        char opcion;
        do {
            System.out.println(mensaje);
            opcion = new Scanner(System.in).nextLine().charAt(0);
        } while (opcion != 'S' && opcion != 's' && opcion != 'N' && opcion != 'n');
        if (opcion == 'S' || opcion == 's') {
            campo = true;
        }
        return campo;
    }
}
