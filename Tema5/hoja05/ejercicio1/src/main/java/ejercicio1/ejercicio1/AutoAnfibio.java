/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

/**
 *
 * @author DAW118
 */
public class AutoAnfibio implements transporteMaritimo, TransporteTerrestre {
    private String marca;
    private String modelo;

    public AutoAnfibio(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void nadar(){System.out.println("El auto esta nadando");}
    @Override
    public void andar(){System.out.println("El auto esta andando");}
}
