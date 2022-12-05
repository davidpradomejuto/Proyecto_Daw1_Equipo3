package hoja1.ejercicio2;
import java.util.Scanner;

/**@author DAW118*/
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //creo el objeto c1 con el constructor por defecto sin parametros
        Circulo c1 = new Circulo();
        
        //creo el objeto c2 con el parametro de radio a 10
        Circulo c2 = new Circulo(10);
        
        //pido el radio de c3 por teclado en forma de double
        System.out.println("Introduce el radio para el circulo c3: ");
        double radioc3 = teclado.nextDouble();
        
        //creo el circulo c3 con el radio que hemos pedido por teclado
        Circulo c3 = new Circulo(radioc3);
        
        //cambio el valor del radio de c1 a 5
        c1.setRadio(5);
        
        //muestro por pantalla el radio de c1
        System.out.printf("el valor del radio de c1 es de: %,.4f \n",c1.getRadio());
        //muestro por pantalla el radio de c3
        System.out.printf("el valor del radio de c3 es de: %,.4f \n",c3.getRadio());
        //muestro por pantalla el area de c2
        System.out.printf("el valor del area de c2 es de: %,.4f \n",c2.area());
        //muestro por pantalla la longitud y el area de c3
        System.out.printf("el area y la longitud son:  %,.4f de area y %,.4f y de longitud \n",c3.longitud(),c3.area());
    }
}
