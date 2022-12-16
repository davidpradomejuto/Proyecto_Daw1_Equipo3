/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;

/**
 *
 * @author DAW118
 */
public class Sopa {

    private char[][] matriz;

    public Sopa() {
        matriz = new char[10][20];
    }

    public Sopa(int filas, int columnas) {
        matriz = new char[filas][columnas];
    }

    public void mostrar() {
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);    //muestro el caracter que haya
            }
            System.out.println(""); //salto de linea

        }
    }

    public void setPalabra(String palabra,int x,int y,int d){
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if (d !=1) {
                    
                    for (int k = 0,contador=0; k <= palabra.length(); k++,contador++) {
                        char letra = palabra.charAt(contador);
                        matriz[x][y] = letra;
                    }
                    
                }else{
                    for (int k = 0,contador=0; k <= palabra.length(); k++,contador++) {
                        char letra = palabra.charAt(contador);
                        matriz[y][x] = letra;
                    }
                }
            }
            

        }
    
    }
    
    
}
