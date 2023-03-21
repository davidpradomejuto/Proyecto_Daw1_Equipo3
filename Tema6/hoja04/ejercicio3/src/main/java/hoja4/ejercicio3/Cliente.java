/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio3;

/**
 *
 * @author david
 */
public class Cliente {

    private int codigo;
    private String nombre;
    private String apellidos;
    private int telefono;
    private int saldo;

    public Cliente(int codigo, String nombre, String apellidos, int telefono, int saldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    public Cliente() {
        this.codigo = Teclado.pedirCodigo("Introduce le codigo de 4 digitos:");
        this.nombre = Teclado.pedirNombreRegex("Introduce el nombre del cliente:");
        this.apellidos = Teclado.pedirNombre("Introduce el apellido del cliente:");
        this.telefono = Teclado.pedirTlf("Introduce el telfono del cliente:");
        this.saldo = Teclado.pedirIntPositivo("Introduce el saldo del cliente:");

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.codigo;
        return hash;
    }
    
     public boolean equals(Object obj) {
        if (obj instanceof Cliente c) {
            return c.codigo == codigo;
        } else {
            return false;
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", saldo=" + saldo + '}';
    }

}
