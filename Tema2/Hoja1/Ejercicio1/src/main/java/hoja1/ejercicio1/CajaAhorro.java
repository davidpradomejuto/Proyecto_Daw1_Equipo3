/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio1;

/**
 *@author DAW118
 */
public class CajaAhorro {
    private int saldo,transacciones;
    
    //creo un objeto con el construcctor por defecto
    //y declaro la variable saldo y transacciones a 0
    public CajaAhorro()
    {
    saldo = 0;
    transacciones = 0;
    }
    
    //creo un objeto con el construcctor con parametros
    //y declaro la variable saldo con el saldo que sea y transacciones lo
    //pongo en 1
    public CajaAhorro(int saldo)
    {
    this.saldo = saldo;
    transacciones=1;
    }
    
    
    public void depositar(int cantidad){
        this.saldo +=cantidad;
        transacciones++;
    }
    
    public void girar(int cantidad){
        this.saldo -=cantidad;
        transacciones++;
    }
    
    public int obtenerSaldo(){
        return saldo;
    }
    
    public int obtenerTransacciones() {
        return transacciones;
    }    
}
