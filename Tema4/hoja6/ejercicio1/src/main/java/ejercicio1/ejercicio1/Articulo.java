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
        System.out.println("Introduce el ID de articulo");
        this.codigo = new Scanner(System.in).nextInt();
        
        System.out.println("Introduce al descripcion de articulo");
        this.descripcion = new Scanner(System.in).nextLine();
        
        System.out.println("Introduce el stock de articulo");
        this.stock = new Scanner(System.in).nextInt();
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
