/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author DAW118
 */
public class Almacen {

    Set<Articulo> matriz;

    public Almacen() {
        matriz = new HashSet<>();
    }

    public void insertar() {

        Articulo o = new Articulo();

        if (matriz.add(o)) {
            System.out.println("Articulo Introducido.");
        } else {
            System.out.println("Articulo no introducido, puede que este repetido.");
        }
    }

    //recibe un código y nos devuelve un artículo
    public Articulo buscar() {
        int codigoBuscado = Teclado.pedirIntPositivo("Introduce el codigo que quieras buscar: ");
        Articulo result=null;
        
        boolean encontrado = false;
        
        for (Articulo o : matriz) {
            if (o.getCodigo() == codigoBuscado && !encontrado) {
                encontrado = false;
                result = o;
            }

        }
        
        
        if (!encontrado){System.out.println("Articulo no encontrado.");}
        
        return result;
    }

    //devuelva una cadena con los datos de los artículos que tienen existencias por debajo de 5 unidades.
    public String pedidos() {
        String result = "";

        for (Articulo o : matriz) {
            if (o.getExistencias() < 5) {
                result = result.concat(o.toString());
            }

        }

        return result;
    }
}
