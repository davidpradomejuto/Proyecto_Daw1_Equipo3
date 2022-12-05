/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.ejercicio3;

/**
 *
 * @author DAW118
 */
public class Llamada {
    private int duracion;
    
    public Llamada () {this.duracion= 0 ;}
    
    public float aPagar(int minutos, int segundos ) {
        //paso todo el tiempo a segundos 
        this.duracion = minutos * 60 + segundos;
        
        float coste ;
        if (this.duracion <=60) {
            //si la llamada es de menos de 1 minuto el coste de 0.25€
            coste = 0.25f;
        
        } else {
            //calculo el coste de la llamada de mas de 1 minuto
            coste = (float) ((((this.duracion - 60)/10)*0.1)+0.25); 
        }
        
        return coste; 
    }
            
}
