/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio1;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Funciones {

    public static int calcularDigitosControl(int entidad, int oficina, int cuenta) {
        String entidadStr = String.format("%02d", entidad);
        String oficinaStr = String.format("%04d", oficina);
        String cuentaStr = String.format("%010d", cuenta);
        String iban = entidadStr + oficinaStr + cuentaStr + "00";

        // Convertir letras a números
        StringBuilder ibanNumerico = new StringBuilder();
        for (int i = 0; i < iban.length(); i++) {
            char c = iban.charAt(i);
            if (Character.isLetter(c)) {
                int n = c - 'A' + 10;
                ibanNumerico.append(n);
            } else {
                ibanNumerico.append(c);
            }
        }

        // Calcular los dígitos de control
        BigInteger num = new BigInteger(ibanNumerico.toString());
        BigInteger mod97 = num.mod(new BigInteger("97"));
        int dc = 98 - mod97.intValue();

        return dc;
    }

    public static boolean validarCuenta(String cuentaStr) throws Exception {
        
            return true;
            //throw new Exception("Numero de cuenta invalido");
        
        
    }

    public static LocalDate pedirFecha() throws DateTimeParseException {
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
}
