/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.ejemploserializable;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author cic
 */
public class Teclado {

    public static String pedirMarca() {
        String nombre;
        do {//pedir nombre
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce marca:");
            nombre = teclado.nextLine();
            //validar nombre
        } while (!validarNombre(nombre)); //no sale del bucle hasta que no sea válido el nombre

        return nombre; //devuelve nombre
    }

    public static boolean validarNombre(String nombre) {

        if (!nombre.matches("[A-ZÑ][A-ZÑa-zñ ]{2,14}")) {
            System.out.println("Nombre no valido");
            return false;
        }
        return true;

    }

    public static double pedirVelocidad() {
        double importe = 0;
        boolean rep;
        Scanner teclado;
        do {//pedir numero
            teclado = new Scanner(System.in);
            rep = false;
            try {
                System.out.println("Introduce Velocidad: ");
                importe = teclado.nextDouble();
            } catch (InputMismatchException e) {
                rep = true;
                System.out.println("Tipo de dato erróneo");
            }

        } while (rep); //no sale del bucle hasta que no sea válido el num
        return importe;
    }

    public static int pedirGasolina() {
        int opc = 0;
        boolean rep;
        Scanner teclado;
        do {//pedir numero
            rep = false;
            teclado = new Scanner(System.in);
            try {
                System.out.println("Introduce gasolina: ");
                opc = teclado.nextInt();
            } catch (InputMismatchException e) {
                rep = true;
                System.out.println("Tipo de dato erróneo");
            }

        } while (rep); //no sale del bucle hasta que no sea válido el num
        return opc;
    }
}
