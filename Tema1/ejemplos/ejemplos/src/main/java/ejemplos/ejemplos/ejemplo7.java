/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.ejemplos;

/**
 *
 * @author DAW118
 */
public class ejemplo7 {
     public static void main(String[] args) {       
       boolean lluvia = false;
       boolean tareas = true;
       boolean biblio = false;
       boolean salir = (lluvia == false && !tareas)||(biblio);
       System.out.println(salir);
       
       if (lluvia == false && tareas == false && biblio == false){System.out.println("puedes salir");}
       if (lluvia == true || tareas == true && biblio == false){System.out.println("no puedes salir");}
       if (biblio == true){System.out.println("puedes salir");}
       
    }
}
