/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.ejercicio3;

/**
 * @author david
 */
public class Monedero {

    private double dinero;

    //creo el constructor por parametros
    public Monedero(double newdinero) {
        this.dinero = newdinero;
    }

    //creo el metodo para añadir dinero
    public double addDinero(double newdinero) {
        //sumo el dinero que tengo al dinero que voy a meter
        this.dinero += newdinero;
        return this.dinero;
    }

    //creo el metodo para sacar dinero
    public String drawDinero(double newdinero) {
        //si la resta del dinero que tengo menos el que voy a sacar es mayor a 0 lo saco, si no nada
        String mensaje="";
        
        if ((this.dinero - newdinero) >= 0) {
            this.dinero -= newdinero;
            //muestro por pantalla el mensaje que he sacado el dinero
            mensaje = String.format("El saldo es de : %,.2f euros", this.dinero);

        } else {
            mensaje= "no hay saldo suficiente";
            // como la resta da menor a 0 muestro un mensaje para mostrar que no hay saldo suficiento y no hago nada
        }
        return mensaje;
    }

    //este metodo es lo mismo que el anterio pero con ternarios
        public String drawDinero1(double newdinero) {
        String mensaje1="";   
        mensaje1 = (this.dinero-newdinero) >=0 ? String.format("El saldo es de : %,.2f euros",this.dinero-newdinero):"no hay suficiente saldo";
        this.dinero = (this.dinero-newdinero) >=0 ? this.dinero-=newdinero : this.dinero;
        return mensaje1;
        }
        
    //creo el metodo para consultar el dinero
    public double getDinero() {
        //muestro el dinero
        return this.dinero;
    }
}
