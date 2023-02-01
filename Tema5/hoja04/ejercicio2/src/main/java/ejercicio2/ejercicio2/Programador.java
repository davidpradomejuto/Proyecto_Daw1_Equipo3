/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Programador extends Empleado {
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    public Programador(String nombre, String departamento, int edad, boolean casado, double salario,int lineasDeCodigoPorHora, String lenguajeDominante) {
        super(nombre, departamento, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    public Programador() {
        super();
        System.out.println("Introduce la lineas por hora de codigo que hace le empleado");
        this.lineasDeCodigoPorHora = new Scanner(System.in).nextInt();
        
        System.out.println("Introduce el lenguaje dominante del empleado");
        this.lenguajeDominante = new Scanner(System.in).nextLine();
    }
    
    

    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }
    
    

    
    
    
}
