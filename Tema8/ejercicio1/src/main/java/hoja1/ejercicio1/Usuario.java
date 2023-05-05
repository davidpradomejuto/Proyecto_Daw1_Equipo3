/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Usuario {
    
    private int id;
    private String username;
    private String password;
    private String email;

    public Usuario(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Usuario() {
        this.username = Teclado.pedirNombreRegex("Introduce el nombre del usuario (primera mayuscula)....");
        System.out.println("Introduce la contraseña del usuario...");
        this.password = new Scanner(System.in).nextLine();
        this.email = Teclado.pedirEmailRegex("Introduce el Email del usuario...");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + '}';
    }
    
    
    
    
    
}
