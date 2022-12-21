/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Banco {

    private Cliente matriz[];
    private int nClientes;
    private int contador = 1;

    public Banco(int nMaximo) {
        this.nClientes = nMaximo;
        matriz = new Cliente[this.nClientes];
    }

    public void ingresar() {

        Cliente usuario = new Cliente();

        System.out.println("Introduce el nombre del cliente");
        String nombreCliente = new Scanner(System.in).nextLine();
        usuario.setNombre(nombreCliente);

        System.out.println("Introduce los apellidos del cliente");
        String apellidosCliente = new Scanner(System.in).nextLine();
        usuario.setApellidos(apellidosCliente);

        System.out.println("Introduce saldo del cliente");
        int saldoCliente = new Scanner(System.in).nextInt();
        usuario.setSaldo(saldoCliente);

        usuario.setCodigo(contador);

        matriz[contador - 1] = usuario;
        this.contador++;
    }

    public String buscar() {
        System.out.println("Introduce el codigo del cliente que quieras buscar: ");
        int idCliente = new Scanner(System.in).nextInt();

        String result = "";
        for (int i = 0; i < contador - 1; i++) {
            if (matriz[i].getCodigo() == idCliente) {
                result = result.concat( "El nombre  y apellidos del usuario son " + matriz[i].getNombre() + " " + matriz[i].getApellidos());
                result = result.concat("El saldo del usuario es " + matriz[i].getSaldo());
            }
        }
        return result;
    }

    public void mostrar() {
        for (int i = 0; i < contador - 1; i++) {
            System.out.println("El nombre  y apellidos del usuario son " + matriz[i].getNombre() + " " + matriz[i].getApellidos());
            System.out.println("El saldo del usuario es " + matriz[i].getSaldo() + " y su codigo es " + matriz[i].getCodigo());
            
        }
    }

    public void eliminar(int idUsuario) {
        int id = idUsuario - 1;
        
        for (int i = id; i < contador-2; i++) {
            matriz[i] = matriz[i+1];
            matriz[i].setCodigo(i+1);
            
        }
        this.contador--;
    }

}
