/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.ejercicio4;

/**
 *
 * @author DAW118
 */
public class Operaciones {
    private int n1;
    private int n2;

    public Operaciones(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public void suma(){
        System.out.println("el resultado de la suma es "+(n1+n2));
    }
    
    public void resta(){
        System.out.println("el resultado de la resta es "+(n1-n2));
    }
    
    public void multiplicacion(){
        System.out.println("el resultado de la multiplicacion es "+(n1*n2));
    }
    
    public void division(){
        System.out.println("el resultado de la division es "+(n1/n2));
    }
}
