/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio1.ejercicio1;

/**
 *
 * @author DAW118
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        try {
            
                throw new Exception("Exception del string");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Fin del string");
        }
    }
}
