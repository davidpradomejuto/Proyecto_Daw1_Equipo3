/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6.ejercicio6;

/**
 * @author DAW118
 */
public class Taller {//inicio de la clase

    //genero las variables
    private int aceite, ruedas, contadorCambioTotales, contadorCambiosParciales;

//genero el constructor
    public Taller(int inicialesBidonesAceite, int inicialesRuedas) { 
        //cambio los bidones pasados por teclado a litros y meto los parametros a las variables principales
        this.aceite = inicialesBidonesAceite * 5;
        this.ruedas = inicialesRuedas;
        //dejo los contadores a 0
        contadorCambioTotales = 0;
        contadorCambiosParciales = 0;
    }
    
    // Constructor copia
    public Taller(Taller objTaller){
        //referenciamos lo que tiene el objeto taller a la copia
        this.aceite=objTaller.aceite;
        this.ruedas=objTaller.ruedas;
        //dejo los contadores a 0
        contadorCambioTotales = 0;
        contadorCambiosParciales = 0;
    }
  
    public void addAceite(int newBidonesAceite) {
        //convierto lo nuevos bidones de aceite a los litros de aceite
        int newLitrosaceite = newBidonesAceite * 5;
        //meto los litros de aceite nuevos en la variable principa
        this.aceite += newLitrosaceite;
        System.out.println("Se han añadido "+newLitrosaceite+" litros ahora hay "+ this.aceite+" litros.");
    }

    public void addRuedas(int newRuedas) {
        //meto las ruedas nuevas en la variable principal
        this.ruedas += newRuedas;
        System.out.println("Se han añadido "+newRuedas+" ruedas ahora hay "+ this.ruedas+" ruedas.");
    }

    public int getcambioCompletos() {
        //divido los datos que tengo entre lo que necesito para cada cambio, y saco por
        //el resultado el menor de los dos
        int resultcambios = this.aceite/3 >= this.ruedas/4 ? this.ruedas/4 : this.aceite/3;
        return resultcambios;
    }

    public int getcambioParciales() {
        //divido los datos que tengo entre lo que necesito para cada cambio, y saco por
        //el resultado el menor de los dos
        int resultcambios = this.aceite/3 >= this.ruedas/2 ? this.ruedas/2 : this.aceite/3;
        return resultcambios;
    }

    public void cambioCompleto() {
        //hago un if para ver si tengo ruedas y aceite suficiente para realizar el cambio
        if (this.ruedas >= 4 && this.aceite >= 3) {
            this.ruedas -= 4;
            this.aceite -= 3;
            this.contadorCambioTotales++;
            System.out.println("Se ha realizado un cambio completo");
        }else{
            System.out.println("No tienes material suficiente");
        }
    }

    public void cambioParcial() {
        //hago un if para ver si tengo ruedas y aceite suficiente para realizar el cambio
        if (this.ruedas >= 2 && this.aceite >= 3) {
            this.ruedas -= 2;
            this.aceite -= 3;
            this.contadorCambiosParciales++;
            System.out.println("Se ha realizado un cambio parcial");
        }else{
            System.out.println("No tienes material suficiente");
        }
    }
    
    public int getRuedas(){
        return this.ruedas;
    }
    
    public int getAceite(){
        return this.aceite;
    }
    
    private double getIngresos (){
        //calculo primero los ingresos por cada tipo decambio
        double ingresosParciales=135*this.contadorCambiosParciales;
        double ingresosCompletos=213.5*this.contadorCambioTotales;
        
        //genero la variable total que guarda los dos tipos de ingresos
        double total;
        //retorno los ingresos totales
        return total = ingresosCompletos+ingresosParciales;
    }
    @Override
    public String toString(){
        
        String cadenafinal = String.format("TALLER\nEXISTENCIAS:\n\tRuedas: "+this.ruedas+" Unidades. \n\tAceite: "+this.aceite+
        " litros.\nINGRESOS: Total: "+getIngresos()+" €");
        
        return cadenafinal;
    }
}//fin de de la clase
