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
public class ejemplo6 {

    public static void main(String[] args) {
        String texto; //variable para almacenar los datos recogidos por la caja de texto
        int n;
        texto = JOptionPane.showInputDialog("Escriba un numero");
        n = Integer.parseInt(texto);
        boolean par = (n % 2) == 0;

        System.out.println(par);
    }
}
