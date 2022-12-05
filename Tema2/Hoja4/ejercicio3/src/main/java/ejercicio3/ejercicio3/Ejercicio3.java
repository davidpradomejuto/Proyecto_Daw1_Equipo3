/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio3.ejercicio3;
/**
 * @author david
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Monedero carteradavid = new Monedero(13.45);

        System.out.println("creo el monedero con 13,45 euros");

        System.out.println("añado al monedero 10,4 euros");
        System.out.printf("tienes = %,.2f euros \n", carteradavid.addDinero(10.4));

        System.out.println("intento sacar 50 euros");
        System.out.println(carteradavid.drawDinero1(100));

        System.out.println("Compruebo el saldo");
        System.out.printf("El saldo es de : %,.2f euros \n",carteradavid.getDinero());
        
        System.out.println("intento sacar 20 euros");
        System.out.println(carteradavid.drawDinero1(20));

        System.out.println("Compruebo el saldo");
        System.out.printf("El saldo es de : %,.2f euros \n",carteradavid.getDinero());
    }
}
