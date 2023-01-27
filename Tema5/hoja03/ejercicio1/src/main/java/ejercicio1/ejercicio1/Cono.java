/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

/**
 *
 * @author DAW118
 */
public class Cono extends Figura {

    public Cono(int radio, int altura) {
        super(radio, altura);
    }
    
    public double area(){
        double generatriz=Math.sqrt(Math.pow(altura,2)+Math.pow(radio,2));
        double result = Math.PI*radio*generatriz;
        return result;
    }
    
    public double volumen(){  //ok
        double result = Math.PI*Math.pow(radio,2)*altura;
        return result/3;
    }
}
