/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.ejercicio3;
/**
 * @author david
 */
public class Satelite {

    private double meridiano = 0d;
    private double paralelo = 0d;
    private double distancia = 0d;

    //creo el constructor por defecto
    public Satelite() {}
    
    //creo el constructor por parametros
    public Satelite(double meridiano, double paralelo, double distancia) {
    this.meridiano=meridiano;
    this.paralelo=paralelo;
    this.distancia=distancia;}
    
    public String printPosicion (){
        //con un  string convierto todos los datos en una cadena de texto
        String a=" El meridiano es: "+meridiano+" El paralelo es: "+paralelo+
                " La distancia es: "+distancia;
        return a;
    }
    
    //modifico la altura en KM
    public void variarAltura (double newaltura){
    distancia = newaltura;
    }
    
    //modifico el meridiano y el paralelo
    public void variarPosicion (double newmeridiano, double newparalelo){
    meridiano = newmeridiano;
    paralelo = newparalelo;
    }
    
    public boolean enOrbita () {
        //con ternarios controlo si la distancia es mayor a 16000 metros
        boolean result = (distancia*1000)>=1600;
        return result;
    }
      
}
