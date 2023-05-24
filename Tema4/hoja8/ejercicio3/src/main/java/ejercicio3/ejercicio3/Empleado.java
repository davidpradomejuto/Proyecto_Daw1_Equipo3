/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.ejercicio3;

/**
 *
 * @author DAW118
 */
public class Empleado {
    private String nombre;
    private int sueldo;

    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    public void imprimir(){
        System.out.println("El nombre es : "+nombre+" el sueldo es : "+sueldo+"€");
    }
    
    public void pagar(){
        if(sueldo >= 3000){
            System.out.println("Debe pagar impuestos");
        } else{
            System.out.println("No debe pagar impuestos");
        }
    }
}
