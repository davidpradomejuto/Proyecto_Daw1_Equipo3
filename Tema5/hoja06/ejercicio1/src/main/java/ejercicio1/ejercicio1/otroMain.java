/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

/**
 *
 * @author DAW118
 */
public class otroMain {
    public static void main(String[] args) {
        DeDos a = new DeDos();

        DeTres b = new DeTres();
        
        System.out.println("Pruebo con la clase DeDos");
        Series inter = a;
        for (int i = 0; i < 5; i++) {
          System.out.println(inter.getSiguiente());  
        }
        
        System.out.println("Pruebo con la clase DeTres");
        Series inter2 = b;
        for (int i = 0; i < 5; i++) {
          System.out.println(inter2.getSiguiente());  
          inter2.mostrarInicio();
        }
        
        Series.nombreInterfaz();
        inter2.mostrarInicio();
        
    }
    
}
