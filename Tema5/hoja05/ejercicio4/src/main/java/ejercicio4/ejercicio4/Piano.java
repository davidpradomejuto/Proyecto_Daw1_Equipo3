/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.ejercicio4;

/**
 *
 * @author DAW118
 */
public class Piano extends Instrumento {
     @Override
    public void tocarNota(String nota) {
        System.out.printf("Piano: tocar nota %s.\n", nota);
    }
}
