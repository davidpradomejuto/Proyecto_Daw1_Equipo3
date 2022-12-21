/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Articulo {
    private int codigo;
    private String descripcion;
    private int stock;
    
    Articulo(){
    Scanner teclado = new Scanner(System.in);
    
        System.out.println("Introduce el ID de articulo");
        this.codigo = teclado.nextInt();
        
        System.out.println("Introduce al descripcion de articulo");
        this.descripcion = teclado.nextLine();
        
        System.out.println("Introduce el stock de articulo");
        this.stock = teclado.nextInt();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getStock() {
        return stock;
    }
    
}
