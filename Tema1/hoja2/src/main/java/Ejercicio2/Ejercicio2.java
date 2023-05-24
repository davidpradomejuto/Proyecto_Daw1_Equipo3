/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author david
 */
public class Ejercicio2 {
    public static void main(String[] args) {
    boolean w, x=true, y=true,z=false;
    w=x && y || x && z || y && z;
    // los && son and y los || son or, si se cumple se pone true en W
    System.out.println("el resultado es:"+w);
    }
}
