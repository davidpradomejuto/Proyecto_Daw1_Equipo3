/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

/**
 *
 * @author DAW118
 */
public class Figura {

    private char[][] matriz;
    private char letra;

    public Figura(char newLetra, int n) {
        matriz = new char[n][n];
        letra = newLetra;
    }

    public String cuadrado() {
        String result = "";
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = letra;
                result = result.concat(String.valueOf(matriz[i][j]));
            }

            result = result.concat("\n");
        }
        return result;
    }

    public String cuadradoVacio() {
        String result = "";
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (i != 0 && i != (matriz.length - 1)) {

                    // son las filas del medio
                    if (j != 0 && j != (matriz[i].length - 1)) {
                        //si son los hueco del medio meto un espacio
                        matriz[i][j] = ' ';
                        result = result.concat(String.valueOf(matriz[i][j]));
                    } else {
                        //si no son los hueco del medio
                        matriz[i][j] = letra;
                        result = result.concat(String.valueOf(matriz[i][j]));
                    }

                } else {
                    //si no son las filas del medio
                    matriz[i][j] = letra;
                    result = result.concat(String.valueOf(matriz[i][j]));
                }

            }

            result = result.concat("\n");
        }
        return result;
    }

    public String aspa() {
        String result = "";
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if ( i == j || j+i ==(matriz.length-1)) {

                    matriz[i][j] = letra;
                    result = result.concat(String.valueOf(matriz[i][j]));

                } else {

                    matriz[i][j] = ' ';
                    result = result.concat(String.valueOf(matriz[i][j]));

                }

            }

            result = result.concat("\n");
        }
        return result;
    }

}
