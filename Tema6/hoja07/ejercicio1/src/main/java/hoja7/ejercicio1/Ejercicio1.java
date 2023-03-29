/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja7.ejercicio1;

import java.time.LocalDate;
import java.util.Map;

/**
 *
 * @author DAW118
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Persona david = new Persona("david","prado",LocalDate.now());
        
        CuentaCorrientePersonal a = new CuentaCorrientePersonal(5,david,"123");
        
        a.ingresar(200);
        Map aux = a.listaOjeto();
        
        for (Map.entry<String,>(, a))
        
    }
}
