/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Agenda {
    private Persona matriz[];
    private int contador;
    
    public Agenda(int nPersonas){
        this.contador=0;
        matriz = new Persona[nPersonas];
    }
    
    public void insertar(){
        if(contador+1 <= matriz.length){
        System.out.println("introduce el nombre de la persona: ");
        String nombrePersona = new Scanner(System.in).nextLine();
        
        System.out.println("introduce el telefono de la persona:");
        int telefonoPersona = new Scanner(System.in).nextInt();
        
        Persona persona = new Persona(nombrePersona,telefonoPersona);
        matriz[contador]=persona;
        }else{
            System.out.println("esta persona no cabe en la agenda");
        }
    }
    
    public void mostrar() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Nombre y telefono :" + matriz[i].getNombre() + " " + matriz[i].getTelefono());
        }
    }
    
    public void buscar() {
        System.out.println("Introduce el nombre de la persona que quieras buscar: ");
        String nPersona = new Scanner(System.in).nextLine();

        for (int i = 0; i < contador; i++) {
            if (matriz[i].getNombre().equalsIgnoreCase(nPersona)) {
                 System.out.println("Nombre y telefono :" + matriz[i].getNombre() + " " + matriz[i].getTelefono());   
            }
        }
    }
    public void modificar(String personanombre){
        
        for (int i = 0; i < contador; i++) {
            if(matriz[i].getNombre().equalsIgnoreCase(personanombre)){
                System.out.println("Introduce el telefono nuevo de esa persona");
                int newTelefono = new Scanner(System.in).nextInt();
                matriz[i].setTelefono(newTelefono);
            }else{
                System.out.println("usuario no encontrador");
            }
        }
    }
}
