/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio4;

/**
 *
 * @author DAW118
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Jornada hoy = new Jornada();
        
        Partido a = new Partido("madrid","betis",1,1);
        Partido b = new Partido("racing","barsa",1,0);
        Partido c = new Partido("osasuna","celta",3,2);
        hoy.insertar(a);
        hoy.insertar(b);
        hoy.insertar(c);
        
        hoy.mostrar();
        hoy.toString();
        
        hoy.borrarEmpates();
        
        System.out.println("----------------------");
        hoy.mostrar();
    }
}
