/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio1;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author david
 */
public class EntidadBancaria {

    Map<String, CuentaBancaria> matriz;

    public EntidadBancaria() {
        matriz = new HashMap(); //mapa sin duplicados y sin ordes, por que no necesito guardar ningun orden de insercion solo que no sean duplicados
    }

    public void aniadirCuenta() {

        //pido los datos de la persona
        String nombre = Teclado.pedirNombreRegex("Introduce el nombre del titular (La primera letra en mayuscula).");
        String apellidos = Teclado.pedirNombreRegex("Introduce el apellido del titular (La primera letra en mayuscula).");
        LocalDate fechaNacimiento = Funciones.pedirFecha();

        //creo la persona
        Persona auxPersona = new Persona(nombre, apellidos, fechaNacimiento);

        //hago un menu para elegir el tipo de cuenta
        int opcion = 0;
        boolean opcionvalida = false;
        do {
            System.out.println("Menú: ");
            System.out.println("1- Cuenta  de ahorro.");
            System.out.println("2- Cuenta corriente personal.");
            System.out.println("3- Cuenta corriente empresarial..");

            opcion = Teclado.pedirIntPositivo("Introduce la opcion...");

            switch (opcion) {
                case 1 -> {
                    //pido los datos de la cuenta
                    System.out.println("Introduce la CCC");
                    String ccc = Teclado.pedirCCC();
                    double tipoInteres = Teclado.pedirDouble("Introduce el tipo de interes , debe estar entre 0.5 y 8.5..");
                    try {
                        //creo la cuenta 
                        CuentaAhorro auxCuenta = new CuentaAhorro(tipoInteres, auxPersona, ccc);

                        //introduzco la cuenta en el mapa del banco
                        matriz.put(ccc, auxCuenta);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    opcionvalida = true;
                }
                case 2 -> {
                    //pido los datos de la cuenta
                    System.out.println("Introduce la CCC");
                    String ccc = Teclado.pedirCCC();
                    double tipoInteres = Teclado.pedirIntPositivo("Introduce la comision de mantenimiento , debe estar entre 0 y 30....");
                    try {
                        //creo la cuenta 
                        CuentaCorrientePersonal auxCuenta = new CuentaCorrientePersonal(tipoInteres, auxPersona, ccc);

                        //introduzco la cuenta en el mapa del banco
                        matriz.put(ccc, auxCuenta);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    opcionvalida = true;
                }
                case 3 -> {
                    //pido los datos de la cuenta
                    System.out.println("Introduce la CCC");
                    String ccc = Teclado.pedirCCC();

                    try {
                        //creo la cuenta 
                        CuentaCorrienteEmpresa auxCuenta = new CuentaCorrienteEmpresa(auxPersona, ccc);

                        //introduzco la cuenta en el mapa del banco
                        matriz.put(ccc, auxCuenta);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    opcionvalida = true;
                }
                default -> {
                    System.out.println("Error, opcion no valida");
                }
            }
        } while (!opcionvalida);
    }

    public String listarCuentas() {
        String result = "";
        for (Map.Entry<String, CuentaBancaria> mapa : matriz.entrySet()) {
            String clave = mapa.getKey();
            CuentaBancaria valor = mapa.getValue();

            Map<String, String> auxmap = valor.listaOjeto();
            //recorro el mapa de cada cuenta que esta dentro
            for (Map.Entry entry : auxmap.entrySet()) {
                result = result.concat(entry.getKey() + " = " + entry.getValue() + " ");
            }
            result = result.concat("\n");
        }
        return result;
    }

    public String buscarCuenta(String ccc) {

        String result = "";
        try {
            if (Funciones.validarCuenta(ccc)) {

                for (Map.Entry<String, CuentaBancaria> mapa : matriz.entrySet()) {
                    if (ccc.equalsIgnoreCase(mapa.getKey())) {
                        CuentaBancaria valor = mapa.getValue();

                        Map<String, String> auxmap = valor.listaOjeto();
                        //recorro el mapa de cada cuenta que esta dentro
                        for (Map.Entry entry : auxmap.entrySet()) {
                            result = result.concat(entry.getKey() + " = " + entry.getValue() + " ");
                        }
                        result = result.concat("\n");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return result;
    }

    public void ingresarDinero(String ccc) {
        boolean cuentaExiste = false;
        try {

            if (Funciones.validarCuenta(ccc)) {
                for (Map.Entry<String, CuentaBancaria> mapa : matriz.entrySet()) {
                    String clave = mapa.getKey();
                    CuentaBancaria valor = mapa.getValue();
                    if (clave.equalsIgnoreCase(ccc)) {
                        cuentaExiste = true;
                        double cantidad = Teclado.pedirDouble("Introduce la cantidad que quieras ingresar...");

                        if (valor instanceof CuentaCorrienteEmpresa cuentaaux) {
                            cuentaaux.ingresar(cantidad);

                        } else {
                            valor.ingresar(cantidad);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if (!cuentaExiste) {
            System.out.println("La cuenta no existe...");
        }
    }

    public void retirarDinero(String ccc) {
        boolean cuentaExiste = false;
        try {

            if (Funciones.validarCuenta(ccc)) {
                for (Map.Entry<String, CuentaBancaria> mapa : matriz.entrySet()) {
                    String clave = mapa.getKey();
                    CuentaBancaria valor = mapa.getValue();
                    if (clave.equalsIgnoreCase(ccc)) {
                        cuentaExiste = true;
                        double cantidad = Teclado.pedirDouble("Introduce la cantidad que quieras retirar...");
                        valor.retirar(cantidad);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if (!cuentaExiste) {
            System.out.println("La cuenta no existe...");
        }
    }
}
