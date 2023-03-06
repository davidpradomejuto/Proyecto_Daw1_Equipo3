/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejercicio2.ejercicio2;

/**
 *
 * @author david
 */
public interface Pila<T> {
    public void apilar(T objeto);
    public T desapilar();
    public boolean estaVacia();
}
