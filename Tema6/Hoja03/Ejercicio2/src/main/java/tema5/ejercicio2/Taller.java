/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio2;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.LinkedList;

/**
 *
 * @author atres
 */
public class Taller {
    private LinkedList<FichaVehiculo>enEspera;
    private LinkedList<FichaVehiculo>reparados;
    private LinkedList<FichaVehiculo>finalizados;

    public Taller() {
        enEspera=new LinkedList<>();
        reparados= new LinkedList<>();
        finalizados= new LinkedList<>();
    }
    public void insertarVehiculo(FichaVehiculo f){
          f.setFechaEntrada(LocalDateTime.of(Validacion.fecha(), Validacion.hora()));
          enEspera.add(f);
            System.out.println("Vehiculo añadido a Lista de Espera");
        
    }
    public void repararVehiculo(String matricula){
        for(FichaVehiculo f:reparados){
            if(f.getMatricula().equalsIgnoreCase(matricula)){
                f.setFechaReparacion(LocalDateTime.of(Validacion.fecha(), Validacion.hora()));
                reparados.add(f);
                System.out.println("Añadido correctamente a la Lista de Reparados");
                enEspera.remove(f);
            }
        }
    }
    
    public void darSalidaVehiculo(String matricula){
        for(FichaVehiculo f:finalizados){
            if(f.getMatricula().equalsIgnoreCase(matricula)){
                f.setFechaSalida(LocalDateTime.of(Validacion.fecha(), Validacion.hora()));
                finalizados.add(f);
            }
        }
    }
    
    
}
