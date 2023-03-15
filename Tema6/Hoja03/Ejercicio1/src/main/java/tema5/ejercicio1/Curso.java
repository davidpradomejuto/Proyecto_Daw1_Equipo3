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
        System.out.println("Introduce el codigo: ");
        codigo=new Scanner(System.in).nextInt();
        descripcion=ValidarDatos.validarDescripcion();
        nHoras=ValidarDatos.validarHoras();
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
        return "Codigo del Curso=" + codigo + "\nDescripción del Curso=" + descripcion + "\nNúmero de Horas=" + nHoras;
    }
    
}
