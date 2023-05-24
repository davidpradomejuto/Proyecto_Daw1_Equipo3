/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;

/**
 *
 * @author DAW118
 */
public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void imprimir(){
        System.out.println("nombre: "+nombre+" edad: "+edad);
    }
    
    public void esMayorEdad(){
        if(edad >=18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("no es mayor de edad");
        }
    }
}
