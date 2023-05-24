/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;
import javax.swing.JOptionPane;
/**
 *
 * @author david
 */
public class Ejercicio5 {
    public static void main(String[] args) {    
        String texto; //variable para almacenar los datos recogidos por la caja de texto
        float precio;
        texto = JOptionPane.showInputDialog("Escriba el precio");
        precio = Float.parseFloat(texto);
        
  //o precio = Float.parseFloat(JOptionPane.showInputDialog("pon el precio"));
       
        System.out.printf("el precio sin iva es: %.2f\n",precio);
        System.out.printf("el precio con el procentaje del 21 de IVA es: %.2f\n",precio*1.21);
        System.out.printf("el precio despues de aplicar un porcentaje de 10 de descuento es: %.2f\n",(precio*1.21)-(precio*1.21)*0.10);
        
        
    }
    
    
    
}
