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
public class Pais {

    private String nombreP;
    private Ciudad[] ciudades;
    private int nCiudades;
    private int contadorCiudades = 0;

    public Pais() {
        ciudades = new Ciudad[25];
        nCiudades = 0;
    }

    public void addCiudad() {
        if (contadorCiudades < ciudades.length) {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Introduce el nombre de la ciudad: ");
            String nombreCiudad = teclado.nextLine();

            System.out.println("Introduce la latitud de la ciudad: ");
            double latitudCiudad = teclado.nextDouble();

            System.out.println("Introduce la longitud de la ciudad: ");
            double longitudCiudad = teclado.nextDouble();

            System.out.println("Introduce el numero de habitantes de la ciudad: ");
            int habitantesCiudad = teclado.nextInt();

            Ciudad a = new Ciudad(nombreCiudad, latitudCiudad, longitudCiudad, habitantesCiudad);
            ciudades[contadorCiudades] = a;
            
            System.out.println("Ciudad añadida");
        }
    }

    public Ciudad ciudadMasHabitada() {
        int mayor = 0, nciudad = 0;
        for (int i = 0; i < ciudades.length; i++) {
            if (ciudades[i].getHabitantes() >= mayor) {
                mayor = ciudades[i].getHabitantes();
                nciudad =i;
            }
        }
        return ciudades[nciudad];
    }

    public void ciudadExiste(String nombreCiudad){
        
        for (int i = 0; i < ciudades.length; i++) {
            String comparada = ciudades[i].getNombre().toUpperCase();
            if(comparada.equalsIgnoreCase(nombreCiudad)){
                System.out.println("La ciudad Existe ");
                i=ciudades.length;
            }  
        }       
    }
    
    public int mediaHabitantes(){
        int totalHabitantes=0;
        for (int i = 0; i <= contadorCiudades; i++) {
            totalHabitantes+=ciudades[i].getHabitantes();
        } 
        return totalHabitantes/contadorCiudades;
    }
    
    

    @Override
    public String toString() {
        String result="";
        for (int i = 0; i <= contadorCiudades; i++) {
            result.concat(ciudades.toString());
        }
        return result;
    }
    
    
}
