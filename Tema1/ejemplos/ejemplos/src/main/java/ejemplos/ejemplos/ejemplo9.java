/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.ejemplos;
import javax.swing.JOptionPane;
/**
 *
 * @author DAW118
 */
public class ejemplo9 {
    //convertir mostrar el valor absoluto de un numero
    public static void main(String[] args) {
        
    String texto; //variable para almacenar los datos recogidos por la caja de texto
    int a;
    texto = JOptionPane.showInputDialog("Escriba un numero");
    a = Integer.parseInt(texto);
    
    int b= a<0 ? (a*-1):a;
    
    System.out.println(b);
    
    }
    
}
