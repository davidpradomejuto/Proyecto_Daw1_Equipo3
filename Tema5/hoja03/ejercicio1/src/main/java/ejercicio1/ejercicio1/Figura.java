/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

/**
 *
 * @author DAW118
 */
public class Figura {
    protected int radio;
    protected int altura;

    public Figura(int radio, int altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public int getRadio() {
        return radio;
    }

    public int getAltura() {
        return altura;
    }
    
    public abstract class area{};
    public abstract class volumen{};
}
