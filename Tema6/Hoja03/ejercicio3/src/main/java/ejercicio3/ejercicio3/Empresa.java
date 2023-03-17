/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.ejercicio3;

import java.time.LocalDateTime;
import java.util.LinkedList;

/**
 *
 * @author david
 */
public class Empresa {

    private LinkedList<Contenedor> matriz;

    public Empresa() {
        matriz = new LinkedList<>();
    }

    public Contenedor almacenar() {
        Contenedor c = new Contenedor();

        int size = matriz.size();
        try {
            matriz.addLast(c);
            if (size < matriz.size()) {
                System.out.println("Contenedor añadido");
            } else {
                System.out.println("Ha habido un error, el contenedor no se ha añadido");
            }
        } catch (Exception e) {
            System.out.println("Error...");
            System.out.println(e.getMessage());
        }
        return c;
    }

    public void listar() {
        System.out.println("Mostrando los contenedores de la pila");
        for (Contenedor c : matriz) {
            System.out.println(c.toString());
        }
    }
    
    public void retirar(){
        boolean encontrado = false;
        System.out.println("Introduce los datos del contenedor que quieres quitar:");
        int codigo = Teclado.pedirCodigo4Digitos("Introduce el codigo del contenedor:");
        
        LocalDateTime fecha = Teclado.pedirFechayHora();
        
         for (Contenedor c : matriz) {
             
             if (codigo == c.getCodigo() && fecha == c.getFecha() && !encontrado){
                 if(matriz.remove(c)){
                     System.out.println("Contenedor Eliminado");
                 }else{
                     System.out.println("El contenedor no se ha podido eliminar");
                 }
             }
             
        }
         
         if (!encontrado){
             System.out.println("El contenedor no ha sido encontrado...");
         }
    }
}
