/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio1;

/**
 *
 * @author DAW118
 */
public class Ejercicio1 {
    public static void main (String [] args) {
        //creo el objeto con el contructor por defecto
        CajaAhorro david = new CajaAhorro();
        //añado 100 euros
        david.depositar(100);
        // muestro el saldo de la cartera
        System.out.println("el saldo de la cartera es de "+david.obtenerSaldo());
        //retiro 33 euros
        david.girar(33);
        //muestro el saldo y las transacciones
        System.out.println("el saldo de la cartera es de "+david.obtenerSaldo());
        System.out.println("Las transacciones de la cartera son "+david.obtenerTransacciones()+"\n");
        
        //invoco el otro objeto y le pongo la cantidad de dinero inicial que quiero depositar
        CajaAhorro juan = new CajaAhorro(200);
        System.out.println("el saldo de la cartera es de "+juan.obtenerSaldo());
        System.out.println("Las transacciones de la cartera son "+juan.obtenerTransacciones());
    }
}
