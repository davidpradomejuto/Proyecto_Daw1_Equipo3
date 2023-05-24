/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;

/**
 * @author david
 */
public class Veterinario {

    private Mascota[] mascotas;
    private int contador;

    public Veterinario() {
        // Inicializamos el array con un tamaño amplio
        this.mascotas = new Mascota[100];
        this.contador = 0;
    }

    public void añadir(Mascota mascota) {
        if (contador < mascotas.length) {
            mascotas[contador] = mascota;
            contador++;
        } else {
            System.out.println("ERROR: el array veterinario esta lleno");
        }
    }

    public String mostrar() {
        String resultado = "";
        for (int i = 0; i < contador; i++) {
            resultado += mascotas[i].toString() + "\n";
        }
        return resultado;
    }

    public String mostrarMayor5() {
        String resultado = "";
        for (int i = 0; i < contador; i++) {
            if (mascotas[i].getEdad() > 5) {
                resultado += mascotas[i].toString() + "\n";
            }
        }
        return resultado;
    }
}
