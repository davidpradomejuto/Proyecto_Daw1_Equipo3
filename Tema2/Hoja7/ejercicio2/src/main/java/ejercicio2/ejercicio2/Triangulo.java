/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;
/**
 * @author DAW118
 */
public class Triangulo {
    private int lado1,lado2,lado3;
    
    public Triangulo (int newlado1,int newlado2,int newlado3){
    this.lado1 = newlado1;
    this.lado2 = newlado2;
    this.lado3 = newlado3;
    }
    
    public boolean esIsosceles (){
        boolean result;
        //si dos lados son iguales y el tercero no, se cumple
        if (lado1 == lado2 && lado3 != lado1 || lado1 == lado3 && lado2 != lado3 || lado2 == lado3 && lado1 != lado3){
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
    public boolean esEquilatero () {
        boolean result;
        if (lado1 == lado2 && lado1 == lado3 ){
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
    
    public int perimetro () {
        int result = 0;
        result = this.lado1+this.lado2+this.lado3;
        return result;
    }
}//fin de la clase
