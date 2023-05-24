/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio2.ejercicio2;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        //generos dos array con dos tipos diferente de objeto(esto no deberia ser asi)

        /*Perecedero matriz[] = new Perecedero[5];
        EnPromocion matriz1[] = new EnPromocion[5];
         */
        Articulo matriz[] = new Articulo[10];

        for (int i = 0; i < 5; i++) {

            //pido los datos
            System.out.println("Introduce el codigo de producto");
            int codigop = new Scanner(System.in).nextInt();
            System.out.println("Introduce la descripcion");
            String descripcionp = new Scanner(System.in).nextLine();
            System.out.println("Introduce el precio");
            double preciop = new Scanner(System.in).nextDouble();
            System.out.println("Introduce el descuento");
            int descuentop = new Scanner(System.in).nextInt();

            //creo el objeto
            matriz[i] = new EnPromocion(codigop, descripcionp, preciop, descuentop);
        }
        for (int i = 5; i < 10; i++) {

            //pido los datos
            System.out.println("Introduce el mes de caducidad");
            int mescad = new Scanner(System.in).nextInt();
            System.out.println("Introduce el año de caducidad");
            int aniocad = new Scanner(System.in).nextInt();
            System.out.println("Introduce el codigo de producto");
            int codigop = new Scanner(System.in).nextInt();
            System.out.println("Introduce la descripcion");
            String descripcionp = new Scanner(System.in).nextLine();
            System.out.println("Introduce el precio");
            double preciop = new Scanner(System.in).nextDouble();

            //Creo el objeto 
            matriz[i] = new Perecedero(mescad, aniocad, codigop, descripcionp, preciop);
        }

        System.out.println("Saco los datos de todos los produtos ");

        for (int i = 0; i < 10; i++) {
            if (matriz[i] instanceof Perecedero) { // esta es una forma para castear objetos
                Perecedero pereaux = (Perecedero) matriz[i];
                System.out.print("Codigo del producto " + pereaux.getCodigo() + "\t");
                System.out.print("Precio :" + pereaux.getPrecio() + "\t");
                System.out.print("Descripcion : " + pereaux.getDescripcion() + "\n");
                System.out.print("Mes de caducidad: " + pereaux.getMes() + "\t");
                System.out.print("Año de caducidad" + pereaux.getaCaducidad() + "\n");
            }
            if (matriz[i] instanceof EnPromocion proaux) { // una forma para castear un objeto
                System.out.print("Codigo del producto " + proaux.getCodigo() + "\t");
                System.out.print("Precio :" + proaux.getPrecio() + "\t");
                System.out.print("Descripcion : " + proaux.getDescripcion() + "\n");
                System.out.print("Descuento: " + proaux.getDescuento() + "% \t");
                System.out.print("Precio despues del descuento " + (proaux.getPrecio() - proaux.getDescuento() * proaux.getPrecio()) / 100 + "\n");

            }
        }

        System.out.println("Codigo y descripcion de todos los productos caducados");

        for (int i = 0; i < 10; i++) {
            if (matriz[i] instanceof Perecedero) {
                Perecedero pereaux = (Perecedero) matriz[i];
                if (pereaux.getMes() <= LocalDate.now().getMonthValue() && pereaux.getaCaducidad() <= LocalDate.now().getYear()) {
                    System.out.print("Codigo del producto " + pereaux.getCodigo() + "\t");
                    System.out.print("Descripcion : " + pereaux.getDescripcion() + "\n");

                }
            }
        }

        System.out.println("Producto con maximo descuento");
        int mayor = 0;
        int codigomayor = 999;
        for (int i = 0; i < 5; i++) {
            if (matriz[i] instanceof EnPromocion) {
                 EnPromocion proaux = (EnPromocion) matriz[i];
                if (proaux.getDescuento() >= mayor) {
                    mayor = proaux.getDescuento();
                    codigomayor = proaux.getCodigo();
                }
            }
        }
        System.out.println("El producto con mas decuento ha sido el producto con codigo : " + codigomayor);
    }
}
