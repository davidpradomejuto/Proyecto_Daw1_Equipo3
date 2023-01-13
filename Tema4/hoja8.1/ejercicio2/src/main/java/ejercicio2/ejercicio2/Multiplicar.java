/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;

/**
 *
 * @author DAW118
 */
public class Multiplicar {
    private int [][] matriz = new int[10][10];

    public Multiplicar() {
        for (int i = 0; i < matriz.length; i++) {
            matriz[0][i] = i;
            matriz[i][0] = i;
        }
    }
    
    public void multiplica(){
        for (int x = 1; x < 10; x++) {
            for (int y = 1; y < 10; y++) {
                matriz[x][y] = x*y;
            }     
        }
    }
    
    public void muestra(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public void valoresAspa(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == i){
                System.out.print(matriz[i][j]);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
    public int[] tablaMultiplicar(int numero){
        int[] result = new int[10];
        for (int i = 0; i < result.length; i++) {
            result[i]=numero*i;
        }
        return result;
    }
    
    
}
