/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package conversortemperatura.conversortemperatura;

import java.util.Scanner;
/**
 * @author DAW118
 */
public class ConversorTemperatura {

    
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        
	System.out.println("\n\tBienvenido Temperature Converter\n");
	System.out.print("introduce el valor que quieras convertir: ");
	float value = scan.nextFloat();
        
	System.out.println("  Introduce 1 para el convertidor de Celsius a Fahrenheit....");
	System.out.println("  Introduce 2 para el convertidor de Fahrenheit a Celsius....");
	System.out.print("\nIntroduce el valor aqui...  ");
	int ans = scan.nextInt();
        
	if (ans == 1) {
		float value1 = (float) ((value*(1.8))+32);
		System.out.print("Tu conversion aqui.. "+value1+" F");
		}
	if (ans == 2) {
			float value2 = (float) (value-32);
			float value3 = (float) (value2*(5)/9);
			System.out.print("Tu conversion aqui.. "+value3+" C");
		}
	System.out.println("\n\tGracias!!..");
	}
}

    

