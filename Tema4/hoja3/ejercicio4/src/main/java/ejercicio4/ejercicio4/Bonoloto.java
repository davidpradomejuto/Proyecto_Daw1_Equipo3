/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.ejercicio4;

/**
 *
 * @author david
 */
public class Bonoloto {

    int[] lista = new int[6];   //creo el array

    public Bonoloto() {
        for (int i = 0; i < lista.length; i++) {

            int random = (int) Math.floor(Math.random() * 49) + 1; //genero un numer aleatorio

            if (i == 0) {
                lista[0] = random;
            } //si estoy en el primer elemento del array, le asigno el valor random directamente
            else { //si no estoy en el primer elemento del array ejecuto lo siguiente->

                for (int j = 0; j <= i; j++) { //genero un for que compare el numero random por cada numero que ya tengo introducido en el array

                    if (lista[j] == random) { //si el numero random es igual al elemento en la posicion J, repito el for con otro numero random
                        j = -1;
                        random = (int) Math.floor(Math.random() * 49) + 1; //genero el aleatorio   
                    } else if (j == i && lista[j] != random) { //si he llegado al final del for y el elemento al final del for es diferente al random , le asigno
                        lista[i] = random;
                    }
                }
            }
        }
    }

    public String mostrar() {
        String result = "";
        for (int i = 0; i < lista.length; i++) {

            if (i == lista.length - 1) {
                result = result.concat(String.valueOf(lista[i])); // si es el ultimo elemento del String no pongo la coma final
            } else {
                result = result.concat(String.valueOf(lista[i] + ",")); // si no es el ultimo elemento del String el pongo la coma final
            }
        }
        return result;
    }
}
