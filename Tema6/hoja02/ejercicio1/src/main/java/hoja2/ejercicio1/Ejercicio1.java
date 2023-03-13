/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja2.ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DAW118
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        ArrayList<Integer> matriz = new ArrayList<>();

        matriz = leeValores();
        
        double media = calcularMedia(matriz);
        int suma = calcularSuma(matriz);
        
        mostrarResultados(matriz,suma,media);

    }

    public static ArrayList<Integer> leeValores() {
        ArrayList<Integer> matriz = new ArrayList<>();

        boolean negativo = false;
        do {
            Integer numero = Teclado.pedirInt();
            if (numero != -99) {
                if (matriz.add(numero)) {
                    System.out.println("Numero añadido ");
                } else {
                    System.out.println("Numero no insertado ");
                }

            } else {
                System.out.println("Fin de la insercion...");
                negativo = true;
            }
        } while (!negativo);

        return matriz;
    }

    public static int calcularSuma(ArrayList<Integer> matriz) {
        int suma = 0;

        Iterator<Integer> iter = matriz.iterator();
        while (iter.hasNext()) {
            suma += iter.next();
        }

        return suma;
    }

    public static double calcularMedia(ArrayList<Integer> matriz) {
        int suma = 0;
        int media = 0;

        Iterator<Integer> iter = matriz.iterator();
        try{
        while (iter.hasNext()) {
            suma += iter.next();
        }
        
        media = suma / matriz.size();
        }catch(ArithmeticException ae){
            System.out.println("No habia nada en el array");
            System.out.println(ae.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return media;
    }

    public static void mostrarResultados(ArrayList<Integer> matriz, int suma, double media) {
        System.out.println("Resultados..............");
        
        System.out.print("[ ");
        for (int elemento : matriz) {
            System.out.print(elemento+",");
        }
        System.out.print(" ]\n");
        
        System.out.println("La suma es = "+suma);
        System.out.println("La media es = "+media);

    }
}
