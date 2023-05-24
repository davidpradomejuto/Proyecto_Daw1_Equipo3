/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio4;

/**
 *
 * @author DAW118
 */
enum Meses {
    ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE,
    NOVIEMBRE, DICIEMBRE}

public class ejercicio4 {

    public static void main(String[] args) {

        Meses mes = Meses.MARZO;
        mes=Meses.valueOf("MARZO"); //asigno a esta variable la seleccion enum marzo
        //a atraves de un string, es lo mismo que lo anterior pero en forma de texto
        System.out.println(mes);
    }

}
