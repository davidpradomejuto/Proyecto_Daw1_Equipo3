/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio1.ejercicio1;

/**
 *
 * @author david
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Almacen a = new Almacen(7);
        Articulo leche=new Articulo();
        Articulo pan=new Articulo();
        Articulo miel=new Articulo();
         Articulo chocolate=new Articulo();
        
        a.llenar(miel);
        a.llenar(pan);
        a.llenar(leche);
        a.llenar(chocolate);
        
        a.pedidos();
    }
}
