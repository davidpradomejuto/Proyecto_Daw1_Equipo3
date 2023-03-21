/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio3;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author david
 */
public class Banco {

    Set<Cliente> matriz;

    public Banco() {
        matriz = new LinkedHashSet<>();
    }

    public void insertar() {

        Cliente o = new Cliente();

        if (matriz.add(o)) {
            System.out.println("Articulo Introducido.");
        } else {
            System.out.println("Articulo no introducido, puede que este repetido.");
        }
    }

    public void buscar() {
        int codigoBuscado = Teclado.pedirIntPositivo("Introduce el codigo que quieras buscar: ");

        boolean encontrado = false;

        for (Cliente o : matriz) {
            if (o.getCodigo() == codigoBuscado && !encontrado) {
                encontrado = true;
                System.out.println(o.toString());
            }
        }
        if (!encontrado) {
            System.out.println("Cliente no encontrado.");
        }
    }

    public void eliminar() {
        int codigoBuscado = Teclado.pedirIntPositivo("Introduce el codigo del cliente que eliminar: ");

        boolean encontrado = false;

        for (Cliente o : matriz) {
            if (o.getCodigo() == codigoBuscado && !encontrado) {
                encontrado = true;
                if (matriz.remove(o)) {
                    System.out.println("Cliente borrado...");
                }

            }
        }
        if (!encontrado) {
            System.out.println("Cliente no encontrado.");
        }
    }

    public void SalarioMayor() {
        int salariomayor = 0;
        Cliente c = null;

        for (Cliente o : matriz) {
            if (o.getSaldo() >= salariomayor) {
                c = o;
            }
        }
        if (c != null){
        System.out.println(c.toString());
        }else{
            System.out.println("No hay ningun cliente");
        }
    }

}
