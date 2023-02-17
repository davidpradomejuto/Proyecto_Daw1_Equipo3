/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio5.ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        boolean verificado = false;
        int contador = 0;

        System.out.println("Genero el numero");
        int numero = (int) Math.floor(Math.random() * 500) + 1; //genero el numero

        System.out.println("Numero generado = " + numero);

        while (!verificado) {
            //pido en numero mediante la clase estatica
            int numerointroducido = pedirInt(); 
            contador++; //aumento el contador en cada bucle
            try {
                verificarNumero(numero, numerointroducido); // verifico el numero para que haga saltar la excepcion si no salta ninguna significa que el numero se ha encontrado
                System.out.println("Numero encontrado");
                verificado = true; //salgo del bucle
            } catch (Exception e) {
                System.out.println(e.getMessage()); //enseño el mensaje de la excepcion
                System.out.println("Llevas " + contador + " intentos."); //muestro el contador
            }
        }
    }

    public static void verificarNumero(int NumeroGenerado, int NumeroIntroducido) throws Exception {
        if (NumeroIntroducido < NumeroGenerado) {
            throw new Exception(" El numero esta por debajo del generado");
        } else if (NumeroIntroducido > NumeroGenerado) {
            throw new Exception(" El numero esta por encima del generado");
        }

    }

    public static int pedirInt() {
        boolean valido = false;
        int n = 0;

        while (!valido) {
            try {
                System.out.println("Introduce el Numero: ");
                n = new Scanner(System.in).nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error No es un numero");
            } catch (Exception e) {
                System.out.println("Error Indeterminado");
            }
        }

        return n;
    }
}
