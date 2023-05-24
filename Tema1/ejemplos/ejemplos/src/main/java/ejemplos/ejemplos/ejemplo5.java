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
public class ejemplo5 {
    public static void main(String[] args) {     
        String texto; //variable para almacenar los datos recogidos por la caja de texto
        int edad;
        texto = JOptionPane.showInputDialog("Escriba un numero");
        edad = Integer.parseInt(texto);
       boolean mayor;
       
       if (edad > 18) 
       { mayor = true;}
       else
       {mayor = false;}
       
       if (mayor == true)
       {System.out.println("es mayor de edad");} 
       else 
       {System.out.println("es menor de edad");}
    }
    
}
