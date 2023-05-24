/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;

/**
 *
 * @author david
 */
public class Baraja {

    private int numero;
    private int palo;

    public Baraja() {
        this.numero = (int) Math.floor(Math.random() * 10) + 1;
        this.palo = (int) Math.floor(Math.random() * 4) + 1;
    }

    public String mostrar() {
        String nompalo ="";
        String Stringfinal;
        switch (this.palo) {
            case 1 -> nompalo="oros";
            case 2 -> nompalo="copas";
            case 3 -> nompalo="espadas";
            case 4 -> nompalo="bastos";
            default -> {
            }
        }
        Stringfinal = String.valueOf(this.numero)+" de "+nompalo;
        return Stringfinal;
    }

    public int getNumero() {
        return numero;
    }

    public int getPalo() {
        return palo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPalo(int palo) {
        this.palo = palo;
    }
    
    

}
