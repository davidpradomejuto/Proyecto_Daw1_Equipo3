/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package clinicadavidprado.clinicadavidprado;

/**
 *
 * @author DAW118
 */
public class ClinicaDavidPrado {

    public static void main(String[] args) {
        
        //creo el objeto david, que es mi clinica
        Clinica david = new Clinica();
        
        //hago una consulta
        System.out.println("El resultado de la consulta es: "+david.recibirMascota("consulta a una mascota"));
        
        //hago 3 ingresos
        System.out.println("El resultado del ingreso es: "+david.recibirMascota("ingreso a una mascota"));
        System.out.println("El resultado del ingreso es: "+david.recibirMascota("ingreso a una mascota"));
        System.out.println("El resultado del ingreso es: "+david.recibirMascota("ingreso a una mascota"));
        
        //hago otra consulta
        System.out.println("El resultado de la consulta es: "+david.recibirMascota("consulta a una mascota"));
        
        //hago otros 3 ingresos, ya llevariamos 6 ingresos, como el cupo de camas esta compreto en el quinto ingreso , el sexto da false
        System.out.println("El resultado del ingreso es: "+david.recibirMascota("ingreso a una mascota"));
        System.out.println("El resultado del ingreso es: "+david.recibirMascota("ingreso a una mascota"));
        //despues de este ingreso las camas estan completas y da false
        System.out.println("El resultado del ingreso es: "+david.recibirMascota("ingreso a una mascota"));
        
        //doy de alta a una mascota que llevaba 4 dias ingresada
        david.altaIngreso(4);
        
        //muestro los datos de la clinica
        System.out.println(david.toString());
        
        //creo el objeto copiaDavid (que es mi segunda clinica)
        Clinica copiaDavid = new Clinica(david); 
        //hago una consulta
        System.out.println("El resultado de la consulta es: "+copiaDavid.recibirMascota("consulta a una mascota"));
        
        //muestro los datos de las dos clinicas
        System.out.println(david.toString());
        System.out.println(copiaDavid.toString());
        
        
  
        }
}
