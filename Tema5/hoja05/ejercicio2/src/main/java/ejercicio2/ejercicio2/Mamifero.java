/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;


/**
 *
 * @author DAW118
 */
public class Mamifero  {
    private String raza;
    private int npatas;
    private String alimento;

    public Mamifero(String raza, int npatas, String alimento) {
        this.raza = raza;
        this.npatas = npatas;
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "mamifero{" + "raza=" + raza + ", npatas=" + npatas + ", alimento=" + alimento + '}';
    }

}
