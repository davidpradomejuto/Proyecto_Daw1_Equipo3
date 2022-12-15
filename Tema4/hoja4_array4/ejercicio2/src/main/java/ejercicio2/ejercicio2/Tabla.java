/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;

/**
 *
 * @author david
 */
public class Tabla {

    private int[][] matriz = new int[4][5];

    public Tabla() {
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                int random = (int) Math.floor(Math.random() * 100) + 1;
                matriz[i][j] = random;
            }

        }
    }

    public void mostrar() {
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + ",");
            }
            System.out.println("");
        }
    }

    public int mayorF(int fila) {
        int mayor = 0;
        if (fila < matriz.length) {//si la fila existe

            for (int i = 0; i < matriz[fila].length; i++) { //se repite en cada numero de esa fila
                if (matriz[fila][i] >= mayor) {
                    mayor = matriz[fila][i];
                }
            }

        } else {
            System.out.println("error, la fila es incorrecta");//si la fila no existe manda este mesaje
        }
        return mayor;
    }

    public int mayorC(int columna) {
        int mayor = 0;
        if (columna < matriz[1].length) {//si la fila existe
            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i][columna] >= mayor) {
                    mayor = matriz[i][columna];
                }
            }
        }

        return mayor;
    }

    public int media(){
        int sumamedia=0;
        int contador=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                contador++;
                sumamedia+=matriz[i][j];
            }
        }
        
        return sumamedia/contador;
    }
}
