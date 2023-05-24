/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio5.ejercicio5;
/**
 * @author DAW118
 */
public class Ejercicio5 {

public static void main(String[] args) {//inicio del main
    int docenasiniciales = 34;
    double kilosiniciales = 12d;

    // creo el objeto con el constructor por defecto
    Restaurante restaurante1 = new Restaurante(docenasiniciales, kilosiniciales);
    
    System.out.println("ALIMENTOS INICIALES");
    System.out.println("Huevos: " + restaurante1.getHuevos()+" huevos.");
    System.out.println("Chorizo: " + restaurante1.getChorizo()+" kilos.");

    // Se añaden huevos y chorizo
    System.out.println("AÑADIMOS DATOS");
    restaurante1.addHuevos(1);
    restaurante1.addChorizo(1.2);

    // alimentos despues de añadir huevos y chorizo
    System.out.println("ALIMENTOS DESPUES DE AÑADIR");
    System.out.println("Huevos: " + restaurante1.getHuevos()+" huevos.");
    System.out.println("Chorizo: " + restaurante1.getChorizo()+" kilos.");
    
    System.out.println("Numeros de platos que se pueden servir: "+ restaurante1.getNumPlatos());
    // se sirve un plato
    restaurante1.sirvePlato();
    
    //alimentos despues de servir un plato
    System.out.println("ALIMENTOS DESPUES DE SERVIR UN PLATO");
    System.out.println("Huevos: " + restaurante1.getHuevos()+" huevos.");
    System.out.println("Chorizo: " + restaurante1.getChorizo()+" kilos.");

}//fin del main

}