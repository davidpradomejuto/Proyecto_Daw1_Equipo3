/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;
/**
 * @author david
 */
public class Persona {
    //creo las variables 
        private String nombre, apellido1, apellido2, dni;
        
        public Persona (String newnombre,String newapellido1,String newapellido2,String newdni){
        this.nombre = newnombre;
        this.apellido1 = newapellido1;
        this.apellido2 = newapellido2;
        this.dni = newdni;
        }
        
        public String clave (){
        String contrasena = this.nombre.substring(0,1) + this.apellido1.substring(0,3) + this.apellido2.substring(this.apellido2.length() - 1);  
        return contrasena;
        }
        
        public boolean dniValido ()  {
            boolean result; 
            if (this.dni.length() == 9 ) {
                // tengo que convertir los numeros del dni que estan en formato string en numero formato int para poder calcular que letra es la correcta 

                //saco la cadena que tiene los numeros
                String numerosString = this.dni.substring(0,8);
                //convierto esa cadena en un Int
                int numerosDniInt = Integer.parseInt(numerosString);
                //calculo el restro de dividir esos numeros entre 23
                int posicionLetraDni = numerosDniInt%23;
                //creo un string con las letras que llevan los DNIs
                String letrasPosibles = "TRWAGMYFPDXBNJZSQVHLCKE";
                //ahora saco la letra que llevaria mi DNI en base al resto que me ha dado anteriormente
                String letraDniCalculado = letrasPosibles.substring(posicionLetraDni,posicionLetraDni+1);
                //tambien saco en otra string la letra del DNI que el usuario ha dado
                String letraDniDado = this.dni.substring(8,9);
                //comparo las dos cadenas de texto, si son iguales result = true, si son diferentes result = false
                result = letraDniCalculado.equalsIgnoreCase(letraDniDado);     
            }else{
            result = false;
            }
            return result;
        } 
}
