/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;

/**
 * David Prado Mejuto, DAW118 Ejercicio 2 del examen de programacion unidad 3
 */
public class Bola {
    
    public static int descuento() {
        int descuento = 0;
        int x = (int) Math.floor(Math.random() * 4); //genero un numero aleatorio entre 0 y 3, dependiendo de lo que de, descuento sera uno de los 4 tipos de porcentajes
        switch (x) {
            case 0 -> {descuento = 0;}
            case 1-> {descuento = 5;}
            case 2-> {descuento = 7;}
            case 3-> {descuento = 10;}
            default -> {descuento = 0;}
        }
        return descuento;
    }
    
    public static String color(int descuento){ //este metodo recibe por argumentos el descuento que se le hace al producto y lo combierte en una String con el color de la bola sacada
        String color = "";
            switch (descuento) {
                case 0-> {color = "blanco";}
                case 5-> {color = "amarillo";}
                case 7-> {color = "azul";}
                case 10 -> {color = "rojo";}
                default -> {color = "algo ha ido mal";} 
            }
            return color;
    }
}
