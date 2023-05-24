/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.ejercicio4;

/**
 *
 * @author DAW118
 */
public class Digitos {

    public static int numeroDigitos(int numero) {

     /*   if (numero / 10 == 0) {
            digitos++;
            System.out.println(digitos);
            return digitos;
        } else {
            digitos++;
            return numeroDigitos(numero / 10, digitos);
        }
    */
      
     if (numero <=0){
         return 0;
     }else{
         return 1+numeroDigitos(numero / 10);
     }
    }

}
