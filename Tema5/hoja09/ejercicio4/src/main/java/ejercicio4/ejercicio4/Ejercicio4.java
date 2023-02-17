/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio4.ejercicio4;

/**
 *
 * @author david
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        try{
            System.out.println("Genero la excepcion");
            throw new MiExcepcion("Esto es un error");
        }catch(MiExcepcion me){
            System.out.println(me.getMessage());
        }
    }
}
