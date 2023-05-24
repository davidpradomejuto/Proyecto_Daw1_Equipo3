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
public class Empleado {

    protected String nombre;
    protected String departamento;
    protected int edad = 0;
    protected boolean casado;
    protected double salario;

    public Empleado(String nombre, String departamento, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    public Empleado() {
        System.out.println("Introduce el nombre: ");
        String newnombre = new Scanner(System.in).nextLine();
        this.nombre = newnombre;

        System.out.println("Introduce el departamento: ");
        String newdepartamento = new Scanner(System.in).nextLine();
        this.departamento = newdepartamento;

        System.out.println("Introduce la edad entre 18 y 65: ");
        int newedad = new Scanner(System.in).nextInt();
        this.edad = newedad;

        System.out.println("El empelado esta casado? (true/false)");
        boolean newcasado = new Scanner(System.in).nextBoolean();
        this.casado = newcasado;

        System.out.println("Introduce el salario del empleado: ");
        double newsalario = new Scanner(System.in).nextDouble();
        this.salario = newsalario;

    }

    public void mostrar() {
        System.out.print("nombre: " + this.nombre + " departamento: " + this.departamento + "\n");
        System.out.print("edad : " + this.edad + " casado : " + this.casado + "\n");
        System.out.println("salario : " + this.salario + " €");
    }

    public void clasificar() {
        if (edad <= 21) {
            System.out.println(this.nombre + " es principiante");
        }
        if (edad >= 22 && edad <= 35) {
            System.out.println(this.nombre + " es intermedio");
        }
        if (edad > 35) {
            System.out.println(this.nombre + " es senior");
        }
    }

    public void aumentarSalario(int porcentaje) {
        this.salario += this.salario * porcentaje / 100;
        System.out.println("Salario aumentado en un " + porcentaje + "%");
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getEdad() {
        return edad;
    }

    public boolean esCasado() {
        return casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
