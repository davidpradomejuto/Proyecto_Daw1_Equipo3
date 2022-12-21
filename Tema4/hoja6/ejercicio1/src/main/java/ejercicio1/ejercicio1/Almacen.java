/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

/**
 *
 * @author david
 */
public class Almacen {
    private int contador = 0;
    private Articulo matriz[];

    Almacen(int tamano) {
        matriz = new Articulo[tamano];
    }

    public void llenar(Articulo objeto) {          
            matriz[contador] = objeto;
            this.contador++;
    }
    
    public void pedidos(){
        for (int i = 0; i < contador-1; i++) {

                System.out.println("Informacion del producto "+matriz[i].getCodigo());
                System.out.println("descripcion: "+matriz[i].getDescripcion());
                System.out.println("stock: "+matriz[i].getStock());
                
            
        }
    }
}
