/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplo06.ejemplo07.lambda1;

/**
 *
 * @author cic
 */
public class Lambda1 {

    public static void main(String[] args) {
        //usemos ahora la intefaz funcional mediante lambda
        //Date cuenta que solo tiene un método, por eso no hace falta ni su nombre
        Calculo resultado=(a,b) -> a + b;
        System.out.println(resultado.suma(5, 10));
        
        //Imprimo el otro méodo para comprobar que no existe problema
        resultado.info();
    }
}
