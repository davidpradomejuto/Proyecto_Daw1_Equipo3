/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio1.ejercicio1;

/**
 *
 * @author DAW118
 */
public class Ejercicio1 {

    public static void main(String[] args) {
       int n1,n2,n3,total,result;
       total =  Integer.valueOf(args[0]);
       n1 = Integer.valueOf(args[0].substring(0, 1));
       n2 = Integer.valueOf(args[0].substring(1, 2));
       n3 = Integer.valueOf(args[0].substring(2, 3));
       result = (int) (Math.pow(n1,3)+Math.pow(n2,3)+Math.pow(n3,3));
        if(result == total){
            System.out.println("Es un numero armstrong");
        }else{
            System.out.println("No lo es");
        }
    }
}
