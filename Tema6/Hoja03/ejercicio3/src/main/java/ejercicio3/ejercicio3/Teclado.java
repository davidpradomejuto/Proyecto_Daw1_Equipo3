/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.ejercicio3;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Teclado {

    public static double pedirDouble(String frase) {
        boolean valido = false;
        double n = 0;

        while (!valido) {
            try {
                System.out.println(frase);
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

    public static int pedirIntPositivo(String frase) { // este metodo recibe una String que va a ser la frase que pida el numero entero y mira que sea un numero entero lo que recibe la
        //clase scanner, si no lo es, da un error y lo repite
        boolean valido = false;
        int n = 0;

        while (!valido) {
            try {
                System.out.println(frase); // aqui muestro por pantalla la frase que me ha venido por parametros
                n = new Scanner(System.in).nextInt();
                if (n > 0) { // si es positivo salgo del bucle, si es negativo doy un error
                    valido = true;

                } else {
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

    public static int pedirCodigo4Digitos(String frase) { // este metodo recibe una String que va a ser la frase que pida el numero entero y mira que sea un numero entero lo que recibe la
        //clase scanner, si no lo es, da un error y lo repite
        boolean valido = false;
        int n = 0;

        while (!valido) {
            try {
                System.out.println(frase); // aqui muestro por pantalla la frase que me ha venido por parametros
                n = new Scanner(System.in).nextInt();
                if (n >= 0 && String.valueOf(n).length() >= 4) { // si es positivo salgo del bucle, si es negativo doy un error
                    valido = true;

                } else {
                    System.out.println("Has introducido un numero negativo o tiene un tamaño menor de 4. ,Repite");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error No es un numero");
            } catch (Exception e) {
                System.out.println("Error Indeterminado");
            }
        }

        return n;
    }

    public static String pedirOrigen(String mensaje) { // este metodo me sirve para recoger un a frase con mayuscula y de mas de X caracteres
        int contCaracteres;
        boolean exitFor;
        String nombre;

        do {

            contCaracteres = 0;
            exitFor = false;

            System.out.print(mensaje);
            nombre = new Scanner(System.in).nextLine();
            if (nombre.length() <= 16 && Character.isUpperCase(nombre.charAt(0))) {
                for (int i = 0; i < nombre.length() && !exitFor; i++) {

                    try {

                        if (Character.isLetter(nombre.charAt(i)) || nombre.charAt(i) == ' ' && Character.isLowerCase(nombre.charAt(i))) {
                            contCaracteres++;
                        } else {
                            exitFor = true;
                            throw new Exception("La frase '" + nombre + "' no es válida. Caracteres válidos: letras y espacio. Vuelve a intentarlo.");
                        }

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                }
            } else {
                System.out.println("La primera palabra de la frase no es mayuscula");
            }

        } while (contCaracteres != nombre.length());

        return nombre;

    }

    public static LocalDateTime pedirFechayHora() { // este metodo pide el dia,mes y anio en numeros  y lo convierte en fecha, se que el rango de fecha de los dias cambia dependiendo del mes
        //yo le he puesto de 0 a 31 , por que no queria poner otra capa mas de complejidad

        int dia = 0, mes = 0, anio = 0, hora = 0, minuto = 0, segundo = 0;
        boolean validodia = false;
        boolean validomes = false;
        boolean validoanio = false;
        boolean validohora = false;
        boolean validominuto = false;
        boolean validosegundo = false;

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

        do {
            try {

                System.out.print("Introduce el la hora: ");
                hora = new Scanner(System.in).nextInt();

                if (hora >= 0 && hora <= 23) {
                    validohora = true;

                } else {
                    throw new Exception("la hora introducida no es valida");
                }

            } catch (InputMismatchException ime) {
                System.out.println("Error No es un numero");
            } catch (Exception e) {
                System.out.println("Error indeterminado");
                System.out.println(e.getMessage());
            }

        } while (!validohora);

        do {
            try {

                System.out.print("Introduce el minuto: ");
                minuto = new Scanner(System.in).nextInt();

                if (minuto >= 0 && minuto <= 59) {
                    validominuto = true;

                } else {
                    throw new Exception("El minuto introducido no es valido");
                }

            } catch (InputMismatchException ime) {
                System.out.println("Error No es un numero");
            } catch (Exception e) {
                System.out.println("Error indeterminado");
                System.out.println(e.getMessage());
            }

        } while (!validominuto);

        do {//pido el anio, yo he puesto un rango del anio 0 al actual
            try {

                System.out.print("Introduce el segundo: ");
                segundo = new Scanner(System.in).nextInt();

                if (segundo >= 0 && segundo <= 59) {
                    validosegundo = true;

                } else {
                    throw new Exception("El segundo introducido no es valido");
                }

            } catch (InputMismatchException ime) {
                System.out.println("Error No es un numero");
            } catch (Exception e) {
                System.out.println("Error indeterminado");
                System.out.println(e.getMessage());
            }

        } while (!validosegundo);

        try {
            LocalDateTime fechavalida = LocalDateTime.of(anio, mes, dia, hora, minuto, segundo);
            
        } catch (DateTimeException dte) {
            System.out.println("Error...");
            System.out.println(dte.getMessage());
        }catch (Exception e){
            System.out.println("Error...");
            System.out.println(e.getMessage());
        }
        return LocalDateTime.of(anio, mes, dia, hora, minuto, segundo); //devuelvo la fecha formateada en LocalDate

    }
}
