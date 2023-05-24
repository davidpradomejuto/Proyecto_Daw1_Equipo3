/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5.ejercicio5;
/**
 * @author DAW118
 */
public class Restaurante {
//Creo las variables
private int docenaHuevos; 
private double kilosChorizo;

//genero el constructor
public Restaurante(int docenaHuevos, double kilosChorizo){
    this.docenaHuevos = docenaHuevos;
    this.kilosChorizo = kilosChorizo;
}

//creo el metodo para recoger los huevos
public int getHuevos(){
    return this.docenaHuevos * 12;
}

//creo el metodo para recoger los chorizos
public double getChorizo(){
    return this.kilosChorizo;
}

//creo el metodo para añadir los huevos
public void addHuevos(int newDocenas){
    this.docenaHuevos = this.docenaHuevos + newDocenas;
    System.out.println("añadimos "+newDocenas+" docenas de huevos, se quedan en "+this.docenaHuevos+" docenas.");
}

//creo el metodo para recoger los chorizos
public void addChorizo(double newKilosChori){
    this.kilosChorizo = this.kilosChorizo + newKilosChori; 
    System.out.println("añadimos "+newKilosChori+" kilos de chorizo, se quedan en "+this.kilosChorizo+" kilos.");
}

public int getNumPlatos(){
    int n1 = (this.docenaHuevos *12)/2;
    double n2 = this.kilosChorizo/0.2;
    int resultplatos = (int) (n2 >= n1 ? n1 : n2);
    return resultplatos;
    
}
//creo el metodo para sacar un plato
public void sirvePlato(){
    
    if ( getNumPlatos() >= 1 ){
        int huevos = this.docenaHuevos*12;
        this.docenaHuevos = (huevos - 2)/12;
        this.kilosChorizo = this.kilosChorizo - 0.2;
        System.out.println("Se ha servidor un plato");
    } else {
        System.out.println("No hay material para un plato");}
}

}//fin de la clase