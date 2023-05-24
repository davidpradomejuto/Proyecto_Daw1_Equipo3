/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja7.ejercicio1;

import java.time.LocalDate;
import java.util.Map;

/**
 *
 * @author DAW118
 */
public class Ejercicio1 {

    public static void main(String[] args) {
         EntidadBancaria entidad = new EntidadBancaria();
        int opcion = 0;
        
        do {
            System.out.println("Menú: ");
            System.out.println("1- añadir una cuenta.");
            System.out.println("2-  listar las cuentas bancarias del banco. \n"
                    + "\t1-cuentas de Ahorro, 2 – cuentas corrientes o 3 lista todas las cuentas.");
            System.out.println("3- Información sobre una cuenta concreta..");
            System.out.println("4- Ingreso de una cantidad en una cuenta..");
            System.out.println("5- 5: retirada de una cantidad en una cuenta.");
            System.out.println("6- Consultar los clientes del banco de cierta edad.");
            System.out.println("7- salir.");

            opcion = Teclado.pedirIntPositivo("Introduce la opcion...");

            switch (opcion) {
                case 1 -> {
                    entidad.aniadirCuenta();
                }
                case 2 -> {
                    System.out.println("Listando Cuentas....");
                    System.out.println(entidad.listarCuentas());  
                }
                case 3 -> {
                    String ccc = Teclado.pedirCCC();
                    System.out.println(entidad.buscarCuenta(ccc));          
                }
                case 4 -> {
                    String ccc = Teclado.pedirCCC();
                    entidad.ingresarDinero(ccc);
                }
                case 5 -> {
                    String ccc = Teclado.pedirCCC();
                    entidad.retirarDinero(ccc);
                }
                case 6 -> {
                }
                case 7 -> {
                }
                default -> {
                    System.out.println("Error, opcion no valida");
                }
            }

        } while (opcion != 7);

    }
}
