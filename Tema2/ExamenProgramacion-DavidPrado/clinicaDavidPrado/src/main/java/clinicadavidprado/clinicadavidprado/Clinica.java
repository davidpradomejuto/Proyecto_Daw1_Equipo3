/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicadavidprado.clinicadavidprado;

/**
 *
 * @author DAW118 (David Prado Mejuto)
 */
public class Clinica {

    private int consultas; //contador del numero de consultas realizadas
    private int ingresos; //contador del numero de ingresos realizados
    private int camas; //numero de camas libres actual
    private double beneficios; //cantidad de dinero que tiene la clinica 

    //genero el constructor por defecto
    public Clinica() {
        //inicializo los atributos como si la clinica estuviera vacia
        this.consultas = 0;
        this.ingresos = 0;
        this.camas = 5;
        this.beneficios = 0d;
    }

    //genero el constructor copia
    public Clinica(Clinica objClinica) {
        //referncio lo que tiene el objeto clinica
        this.consultas = objClinica.consultas;
        this.ingresos = objClinica.ingresos;
        this.camas = objClinica.camas;
        this.beneficios = objClinica.beneficios;
    }

    public boolean recibirMascota(String descripcion) {

        boolean resultado = false;

        //busco en la cadena de texto la palabra consulta, si es verdadero el resultado es 0, si es falso -1
        int consultaTrue = descripcion.indexOf("consulta");

        if (consultaTrue == 0 ) {
            //si es una consulta incremento el numero de consulta,aumento en 20 los benficios y el resultado del metodo es true
            this.consultas++;
            this.beneficios += 20;

            //muestro la infomacion del coste de la consulta
            System.out.println("CONSULTA EN LA CLÍNICA\n\tCoste de la consulta: 20€");

            resultado = true;
        }

        ////busco en la cadena de texto la palabra ingreso, si es verdadero el resultado es 0, si es falso -1
        int ingresoTrue = descripcion.indexOf("ingreso");

        if (ingresoTrue == 0) {

            //si hay camas disponibles quito una cama , incremento un ingreso y el resultado del metodo es true
            if (this.camas >= 1) {
                this.ingresos++;
                this.camas--;
                resultado = true;

            } else {
                //si no hay camas disponibles de debe rechazar el ingreso y el resultado del metodo es false
                resultado = false;
            }

        }
        return resultado;
    }

    public void altaIngreso(int dias) {
        
        //correction!! public String altaIngreso(int dias)
        
        //aumento el numero de camas libre
        this.camas++;

        //calculo el coste de la ocupacion de la cama y se lo sumo a los beneficios.
        int costeCama = dias * 25;
        this.beneficios += costeCama;
        //muestro por pantalla el mensaje de alta, con los dias y el coste del ingreso
        System.out.println("ALTA DE INGRESO HOSPITALARIO.\n\tNúmero de días ingresado: " + dias + " días.\n\tCoste de ocupación de la cama: " + costeCama + "€.\n");
        
        //correction!! return "ALTA DE INGRESO HOSPITALARIO.\n\tNúmero de días ingresado: " + dias + " días.\n\tCoste de ocupación de la cama: " + costeCama + "€.\n";
    }

    @Override
    public String toString() {

        //creo una string especifica para los beneficios para formatearlos en tipo castellano
        String beneficiosFormat = String.format("%,.2f €", this.beneficios);

        //muestro la String con los datos de la clinica
        return "DATOS GENERALES DE LA CLÍNICA\n\tConsultas realizadas: " + consultas + "\n\tIngresos realizados: " + ingresos + "\n\tCamas libres: " + camas
                + "\n\tBeneficios totales de la clinica: " + beneficiosFormat;
    }

}
