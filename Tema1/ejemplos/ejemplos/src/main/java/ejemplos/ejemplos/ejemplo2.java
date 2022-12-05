/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.ejemplos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
        
/**
 *
 * @author DAW118
 */
public class ejemplo2 {

        public static void main(String[] args) throws IOException{
    
    short anoactual = 2022;
    short anonacimiento;

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.print ("Introduce el año de nacimiento ");
    String cad = br.readLine();
    anonacimiento=Short.parseShort(cad);
    
    int resultado = anoactual - anonacimiento;

    System.out.println(resultado);

}
}
