/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

/**
 * @author DAW118
 */
public class Rectangulo {
    
    private double largo,ancho;
    //genero el constructor por parametros
    public Rectangulo(double newlargo, double newancho) {
        this.largo = newlargo;
        this.ancho = newancho;
    }
    //genero el constructor sin parametros
    public Rectangulo() {
    }
    //creo el metodo para mostrar el ancho
    public void getAncho (){
        System.out.println("El largo de este rectangulo es de :"+this.ancho);
    }
    //creo el metodo para mostrar el largo
    public void getLargo (){
        System.out.println("El largo de este rectangulo es de :"+this.largo);
    }
    //creo el metodo para mostrar dar ancho
    public void setAncho (double newAncho){
    this.ancho = newAncho;
        System.out.println("Nuevo ancho asignado");
    }
    //creo el metodo para mostrar dar largo
    public void setLargo (double newLargo){
    this.largo = newLargo;
        System.out.println("Nuevo largo asignado");
    }
    //creo el metodo para tener el area, (base*altura) / 2
    public double area () {
        double result = (this.largo * this.ancho) / 2;
        return result;
    }
    // creo el metodo para sacar la diagonal 
    public double diagonal () {
        double result = Math.sqrt(Math.pow(largo, 2)+Math.pow(ancho, 2));
        return result;
    }   
}//fin de la clase
