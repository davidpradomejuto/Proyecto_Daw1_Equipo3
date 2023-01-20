/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        //generos dos array con dos tipos diferente de objeto(esto no deberia ser asi)
        Perecedero matriz[] = new Perecedero[5];
        EnPromocion matriz1[] = new EnPromocion[5];

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
            matriz1[i] = new EnPromocion(codigop, descripcionp, preciop, descuentop);
        }
        for (int i = 0; i < 5; i++) {

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

        System.out.println("Saco los datos de todos los produtos perecederos");

        for (int i = 0; i < 5; i++) {
            System.out.print("Codigo del producto " + matriz[i].getCodigo() + "\t");
            System.out.print("Precio :" + matriz[i].getPrecio() + "\t");
            System.out.print("Descripcion : " + matriz[i].getDescripcion() + "\n");
            System.out.print("Mes de caducidad: " + matriz[i].getMes() + "\t");
            System.out.print("Año de caducidad" + matriz[i].getaCaducidad() + "\n");
        }
        
        System.out.println("Saco los datos de todos los produtos de promocion");

        for (int i = 0; i < 5; i++) {
            System.out.print("Codigo del producto " + matriz1[i].getCodigo() + "\t");
            System.out.print("Precio :" + matriz1[i].getPrecio() + "\t");
            System.out.print("Descripcion : " + matriz1[i].getDescripcion() + "\n");
            System.out.print("Descuento: " + matriz1[i].getDescuento() + "% \t");
            System.out.print("Precio despues del descuento " + (matriz1[i].getPrecio()*matriz1[i].getPrecio())/100 + "\n");
        }
        
        System.out.println("Codigo y descripcion de todos los productos caducados");
        
        for (int i = 0; i < 5; i++) {
            
            if (matriz[i].getMes() <=1 && matriz[i].getaCaducidad() <=2023){
            System.out.print("Codigo del producto " + matriz[i].getCodigo() + "\t");
            System.out.print("Descripcion : " + matriz[i].getDescripcion() + "\n");

            }
        }
    }
}
