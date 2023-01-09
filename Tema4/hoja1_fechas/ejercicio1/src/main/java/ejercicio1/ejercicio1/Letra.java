/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author DAW118
 */
public class Letra {

    private int  numLetra ;
    private String titular;
    private double importe;
    private LocalDate fechaVencimiento;
    
    public Letra(){
        Scanner teclado = new Scanner(System.in);

        
            System.out.println("Introduce el numero de la letra: ");
            numLetra = teclado.nextInt();
            
            System.out.println("Introduce el titular: ");
            titular = teclado.next();
            
            System.out.println("Introduce el importe: ");
            importe = teclado.nextDouble();
            
            System.out.println("Introduce la fecha de vencimiento de la letra en formato dd-mm-yyyy: ");
            DateTimeFormatter fechaformateada = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            fechaVencimiento = LocalDate.parse(teclado.next(),fechaformateada);
                         
    }
    
    public boolean vencida(){
        return fechaVencimiento.isBefore(LocalDate.now());
    }
    
    public void demora(long alargarDias){
        fechaVencimiento=fechaVencimiento.plusDays(alargarDias);       
    }
    
    public long diasFaltan(){
       
       return ChronoUnit.DAYS.between( LocalDate.now(), fechaVencimiento);
        
    }
    
    public void mostrar(){
        System.out.println("El numero de letra es: "+this.numLetra);
        System.out.println("El titular es: "+this.titular);
        System.out.printf("El importe de la letra es de : %,.2f €\n",this.importe);
        System.out.println("La fecha de vencimiento de la letra es el: "+this.fechaVencimiento);
    }
    
    public int devuelveMeses(){
        return fechaVencimiento.getMonthValue();
    }

    public String getTitular() {
        return titular;
    }
    
    
}
