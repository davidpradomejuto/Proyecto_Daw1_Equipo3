/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW118
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
    
     public static String pedirDNIRegex(String mensaje) { // este metodo me sirve para recoger un nombre, tambien lo uso para pedir los apellidos del alumno, hace lo mismo que el del pedir un color
        // pero recibiendo la frase que va a mostrar por pantalla mediante parametros

        String regex = "[0-9]{7,8}[A-Za-z]";
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
    
    public static LocalDate pedirFechaDDMMYYY() throws DateTimeParseException {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fecha = null;
        boolean fechaValida = false;

        while (!fechaValida) {
            try {
                System.out.print("Introduce una fecha (dd-mm-yyyy): ");
                String input = scanner.nextLine();
                fecha = LocalDate.parse(input, formatter);
                fechaValida = true;
            } catch (DateTimeParseException e) {
                System.out.println("Fecha no válida. Introduce una fecha con el formato dd-mm-yyyy.");
            }
        }

        return fecha;
    }

    public static int pedirIntPositivo(String frase) { // este metodo recibe una String que va a ser la frase que pida el numero entero y mira que sea un numero entero lo que recibe la
        //clase scanner, si no lo es, da un error y lo repite
        boolean valido = false;
        int n = 0;

        while (!valido) {
            try {
                System.out.println(frase); // aqui muestro por pantalla la frase que me ha venido por parametros
                n = new Scanner(System.in).nextInt();
                if (n >= 0) { // si es positivo salgo del bucle, si es negativo doy un error
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

    public static String pedirNombre(String mensaje) { // este metodo me sirve para recoger un nombre, tambien lo uso para pedir los apellidos del alumno, hace lo mismo que el del pedir un color
        // pero recibiendo la frase que va a mostrar por pantalla mediante parametros

        int contCaracteres;
        boolean exitFor;
        String nombre;

        do {

            contCaracteres = 0;
            exitFor = false;

            System.out.print(mensaje);
            nombre = new Scanner(System.in).nextLine();

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

    public static int pedirTlf(String frase) { // este metodo recibe una String que va a ser la frase que pida el numero entero y mira que sea un numero entero lo que recibe la
        //clase scanner, si no lo es, da un error y lo repite
        boolean valido = false;
        int n = 0;

        while (!valido) {
            try {
                System.out.println(frase); // aqui muestro por pantalla la frase que me ha venido por parametros
                n = new Scanner(System.in).nextInt();
                if (n >= 0 && String.valueOf(n).length() >= 9) { // si es positivo salgo del bucle, si es negativo doy un error
                    valido = true;

                } else {
                    System.out.println("Has introducido un numero negativo o tiene un tamaño menor de 9. ,Repite");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error No es un numero");
            } catch (Exception e) {
                System.out.println("Error Indeterminado");
            }
        }

        return n;
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

    public static LocalDateTime pedirFechayHora() { // este metodo pide el dia,mes y anio en numeros  y lo convierte en fecha, se que el rango de fecha de los dias cambia dependiendo del mes
        //yo le he puesto de 0 a 31 , por que no queria poner otra capa mas de complejidad
        int dia = 0, mes = 0, anio = 0, hora = 0, minuto = 0, segundo = 0;
        LocalDateTime fecha = LocalDateTime.now();
        boolean fechaValida = false;
        do {

            dia = PedirFecha("dia", 1, 31);
            mes = PedirFecha("mes", 1, 12);
            anio = PedirFecha("anio", 0, 2023);
            hora = PedirFecha("hora", 0, 23);
            minuto = PedirFecha("minuto", 0, 59);
            segundo = PedirFecha("segundo", 0, 59);

            try {
                fecha = LocalDateTime.of(anio, mes, dia, hora, minuto, segundo);
                fechaValida = true;
            } catch (DateTimeException DTE) {
                System.out.println("Fecha no valida. repite");
            }

        } while (!fechaValida);
        return fecha; //devuelvo la fecha formateada en LocalDate

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

    public static boolean validarDni(String dni) {
        String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
        boolean result = false;
        try {
            if (dni.length() == 9) {

                if (dni.substring(0, 8).matches("[0-9]+")) {
                    int resultDivision = Integer.parseInt(dni.substring(0, 8)) % 23;
                    if (dni.substring(8, 9).toUpperCase().contentEquals(letrasDni.substring(resultDivision, resultDivision + 1))) {
                        result = true;
                    } else {
                        throw new Exception("La letra no es correcta");
                    }

                } else {
                    throw new Exception("los primeros 8 caracteres del Dni no son numeros");
                }

            } else {
                throw new Exception("El Dni tiene menos de 9 caracteres");
            }

        } catch (Exception e) {
            System.out.println("Error indeterminado...");
            System.out.println(e.getMessage());
        }

        return result;
    }
}
