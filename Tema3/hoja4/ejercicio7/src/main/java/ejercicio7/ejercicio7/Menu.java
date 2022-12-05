/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7.ejercicio7;

/**
 *
 * @author DAW118
 */
public class Menu {

    private int numero;

    public Menu(int newNumero) {
        this.numero = newNumero;
    }

    public void metodo1() {
        String numeroString = String.valueOf(numero);
        System.out.println("este numero tiene : " + numeroString.length() + " digitos.");
    }

    public void metodo2() {
        System.out.println("Los multiplos de " + numero + " son");

        for (int i = 0; i <= 10; i++) {
            System.out.println("El multiplo de " + numero + " es : " + numero * i);
        }
    }

    public void metodo3() {
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                suma+=i;
            }
        }
        if (suma == numero){
            System.out.println("el numero es perfecto");}
        else{
            System.out.println("el numero no es perfecto");
        }
    }

}
