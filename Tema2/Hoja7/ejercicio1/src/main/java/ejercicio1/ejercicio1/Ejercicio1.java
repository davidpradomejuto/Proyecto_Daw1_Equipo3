/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio1.ejercicio1;
/**
 * @author DAW118
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        //creo los dos objetos
        Rectangulo r1 = new Rectangulo(2.3,4);  
        Rectangulo r2 = new Rectangulo();
        
        //doy un largo y ancho a r2
        r2.setAncho(32);
        r2.setLargo(5.6);
        
        //recogo el ancho de r1
        r1.getAncho();
        
        //muestro el area de r1 y r2
        System.out.printf("La area de R2 es: %,.2f \n",r2.area());
        System.out.printf("La area de R1 es: %,.2f  \n",r1.area());
        
        //muestro la diagona lde r1 y r2
        System.out.printf("La diagonal de R2 es: %,.2f \n",r2.diagonal());
        System.out.printf("La diagonal de R1 es: %,.2f \n",r1.diagonal());        
    }
}
