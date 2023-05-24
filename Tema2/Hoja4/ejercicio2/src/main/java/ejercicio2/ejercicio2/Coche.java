/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;
/**
 * @author DAW118
 */
public class Coche {

    private String Matricula;
    private int velocidad;

    //creo un objeto con el constructor de la velocidad a 0
    public Coche(String newmatricula) {
        this.Matricula = newmatricula;
        this.velocidad = 0;
}

    //creo un objeto con el constructor con los dos paremtros
    public Coche(String newmatricula, int newvelocidad) {
        this.Matricula = newmatricula;
        this.velocidad = newvelocidad;
 }

    public int acelera(int newvelocidad) {
        //si la suma de la velocidad es menor a 120 hago la suma, si no nada
        if ((this.velocidad + newvelocidad) <= 120) {
            this.velocidad += newvelocidad;
            return this.velocidad;
} else {
            System.out.println("la velocidad seria mayor a 120, se queda a 120");
            this.velocidad = 120 ;
            return this.velocidad;}
}

    public int frena(int newvelocidad) {
        //si la resta de la velocidad es mayor a 0 hago la resta, si no nada
        if ((this.velocidad - newvelocidad) >= 0) {
            this.velocidad -= newvelocidad;
            return this.velocidad;
} else {
            System.out.println("la velocidad seria menor a 0, se frena hasta 0");
            this.velocidad = 0 ;
            return this.velocidad;
        }
}

    public String mostrarMatricula() {
        //muestro con uan substring las letras de la matricula
        String Letrasmatricula = this.Matricula.substring(4, 7);
        return Letrasmatricula;}
}
