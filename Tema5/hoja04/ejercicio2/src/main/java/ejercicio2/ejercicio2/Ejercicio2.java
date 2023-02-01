/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio2.ejercicio2;

/**
 *
 * @author DAW118
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        //Empleado david = new Empleado();
        Empleado adrian = new Empleado("adrian","marketing",21,true,1200);
        
        System.out.println("clasificacion de david: ");
        //david.clasificar();
        
        adrian.mostrar();
        
        
        //Programador luis = new Programador();
        Programador asier = new Programador("asier","programacion",23,true,1200,134,"java");
        
        //System.out.println("Lenguaje dominante de luis: "+luis.getLenguajeDominante());
        
        System.out.println("Lineas por hora de asier: "+asier.getLineasDeCodigoPorHora());
        
        Plantilla empresa = new Plantilla();
        
        //empresa.insertar(david);
        empresa.insertar(adrian);
        //empresa.insertar(luis);
        empresa.insertar(asier);
        
        System.out.println(empresa.devolverSenio());
        
        
        System.out.println(empresa.toString());
        
        System.out.println("incremento lo salarios un 20%");
        
        empresa.incrementar20();
        
        empresa.masLineasPorHora().toString();
        
        System.out.println(empresa.toString());
        
        
            
        
    }
}
