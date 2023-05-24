
package ejercicio8;
import java.util.Scanner;

/**
 * @author david
 */
public class Ejercicio8 {
     public static void main(String[] args) {
         
        Scanner teclado = new Scanner(System.in);
        //recogida de variables
        System.out.println("Escribe el numero de entradas infantiles: ");
        int infantiles = teclado.nextInt();
        
        System.out.println("Escribe el numero de entradas adultos: ");
        int adultos = teclado.nextInt();
        
        //calculo del total de precio
        float total = (float) (infantiles*15.50)+(adultos*20);
        
        //calculo del descuento si lo tuviese
        float totaldescuento = total>=100 ? total-(total*(float)0.05) : total;
        //muestro el importe total
        System.out.println("El total del importe para todas las entradas es de: "+totaldescuento);
     }
}
