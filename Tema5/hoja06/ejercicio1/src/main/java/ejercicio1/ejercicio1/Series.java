/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ejercicio1.ejercicio1;

/**
 *
 * @author DAW118
 */
public interface Series {
    int inicio = 0;    
    
    public int getSiguiente();
    public void reiniciar();
    public void setComenzar(int x);
    public static void nombreInterfaz(){System.out.println(" Interfaz Series ");};
    default public void mostrarInicio(){System.out.println("Muestro inicio :"+inicio);}
}
