/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio2.teclado;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Teclado {
    
    public static double pedirDouble() {
        boolean valido = false;
        double n = 0;

        while (!valido) {
            try {
                System.out.println("Introduce el Numero: ");
                n = new Scanner(System.in).nextDouble();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error No es un numero");
            } catch (Exception e) {
                System.out.println("Error Indeterminado");
            }
        }

        return n;
    }

    public static int pedirIntPositivo() {
        boolean valido = false;
        int n = 0;

        while (!valido) {
            try {
                System.out.println("Introduce el Numero: ");
                n = new Scanner(System.in).nextInt();
                if (n > 0) {
                    valido = true;
                    
                }else{
                    System.out.println("Has introducido un numero negativo,repite");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error No es un numero");
            } catch (Exception e) {
                System.out.println("Error Indeterminado");
            }
        }

        return n;
    }
        public static String introString(String mensaje) {
        System.out.print(mensaje);
        return new Scanner(System.in).nextLine();
    }
        
        
        public static String pedirNombre() {

        int contCaracteres;
        boolean exitFor;
        String nombre;

        do {

            contCaracteres = 0;
            exitFor = false;
            nombre = introString("Introduce el nombre del guerrero: ");

            for (int i = 0; i < nombre.length() && !exitFor; i++) {

                try {

                    if (Character.isLetter(nombre.charAt(i)) || nombre.charAt(i) == ' ') {
                        contCaracteres++;
                    } else {
                        exitFor = true;
                        throw new Exception("El nombre '" + nombre + "' no es válido. Caracteres válidos: letras y espacio. Vuelve a intentarlo.");
                    }

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }

        } while (contCaracteres != nombre.length());

        return nombre;

    }
        
        public static LocalDate pedirFecha() { // este metodo pide el dia,mes y anio en numeros  y lo convierte en fecha, se que el rango de fecha de los dias cambia dependiendo del mes
        //yo le he puesto de 0 a 31 , por que no queria poner otra capa mas de complejidad

        int dia = 0, mes = 0, anio = 0;
        boolean validodia = false;
        boolean validomes = false;
        boolean validoanio = false;

        do {
            try {

                System.out.print("Introduce el dia en numero: ");
                dia = new Scanner(System.in).nextInt();

                if (dia > 0 && dia <= 31) { // este rango se que no es correcto deberia variar segun el mes elegido
                    validodia = true;

                } else {
                    throw new Exception("El dia introducido no es valido");
                }

            } catch (InputMismatchException ime) {
                System.out.println("Error No es un numero");
            } catch (Exception e) {
                System.out.println("Error indeterminado");
                System.out.println(e.getMessage());
            }

        } while (!validodia);

        do { //pido el mes y miro si es correcto el rango
            try {

                System.out.print("Introduce el mes en numero: ");
                mes = new Scanner(System.in).nextInt();

                if (mes > 0 && mes <= 12) {
                    validomes = true;

                } else {
                    throw new Exception("El mes introducido no es valido");
                }

            } catch (InputMismatchException ime) {
                System.out.println("Error No es un numero");
            } catch (Exception e) {
                System.out.println("Error indeterminado");
                System.out.println(e.getMessage());
            }

        } while (!validomes);
        
        do {//pido el anio, yo he puesto un rango del anio 0 al actual
            try {

                System.out.print("Introduce el anio en numero: ");
                anio = new Scanner(System.in).nextInt();

                if (anio > 0 && anio <= 2023) {
                    validoanio = true;

                } else {
                    throw new Exception("El anio introducido no es valido");
                }

            } catch (InputMismatchException ime) {
                System.out.println("Error No es un numero");
            } catch (Exception e) {
                System.out.println("Error indeterminado");
                System.out.println(e.getMessage());
            }

        } while (!validoanio);

        return LocalDate.of(anio, mes, dia); //devuelvo la fecha formateada en LocalDate

    }
}
