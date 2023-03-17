/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author atres
 */
public class Curso {
    private int codigo;
    private String descripcion;
    private int nHoras;

    public Curso(int codigo, String descripcion, int nHoras) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.nHoras = nHoras;
    }
    
    public Curso(){
       
        codigo=Teclado.pedirIntPositivo("Introduce el codigo del curso:");
        descripcion=Teclado.pedirNombre("Introduce la descripcion:");
        nHoras=Teclado.pedirIntPositivo("Introduce el numero de horas:");
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getnHoras() {
        return nHoras;
    }

    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }

    @Override
    public String toString() {
        System.out.println("");
        return "Codigo del Curso=" + codigo + " Descripción del Curso=" + descripcion + " Número de Horas=" + nHoras;
    }
    
}
