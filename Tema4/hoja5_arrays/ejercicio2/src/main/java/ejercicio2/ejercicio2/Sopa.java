/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;

import java.util.Random;

/**
 * @author DAW118
 */
public class Sopa {

    private char[][] matriz;

    public Sopa() {
        Random random = new Random();

        matriz = new char[10][20];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                int aleatorio = random.nextInt(26);//0 ->25
                
                char letraAleatoria = (char) ('a' + aleatorio);
                
                matriz[i][j] = letraAleatoria;
            }
        }
    }

    public Sopa(int filas, int columnas) {
        matriz = new char[filas][columnas];

        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                int aleatorio = random.nextInt(26);

                char letraAleatoria = (char) ('a' + aleatorio);

                matriz[i][j] = letraAleatoria;
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);    //muestro el caracter que haya
            }
            System.out.println(""); //salto de linea

        }
    }

    public void setPalabra(String palabra, int x, int y, int d) {
        int fila = x;
        int columna = y;
        
        for (int i = 0; i < palabra.length(); i++) {

            matriz[fila][columna] = palabra.charAt(i);//asigno al letra a esa posicion
            
            if (d == 1) { //si es 1 o -1 sumo un eje u otro
                columna++;
            } else {
                fila++;
            }
        }
    
    }

}
