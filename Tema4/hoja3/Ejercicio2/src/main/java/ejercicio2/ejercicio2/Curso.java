/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class Curso {

    private String nombreCurso = "123123daw12";
    private String[] lista;

    public Curso(int nPruebas) {
        lista = new String[nPruebas];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Introduce el nombre del alumno " + i + ": ");
            lista[i] = teclado.next();
        }
    }

    public void iniciales() {
        String result="alumnos: ";
        
        for (int i = 0; i < lista.length; i++) {
            String nombre = lista[i];

            String ini = nombre.substring(0, 1);
            
            ini  = ini.concat(". , ");
            result = result.concat(ini);
            
        }
        System.out.println(result);
    }
    
    public void desplaza(){
        String aux;
        
        //Cojo el último elemento del array y lo guardo en aux
        aux=lista[lista.length-1];
        //desplazo todos los elementos a la derecha
        for(int i=lista.length-1; i>0; i--){
            lista[i]=lista[i-1];
        }
        //pongo en la primera posición "ultimo" que rescaté al principio
        lista[0]=aux;
    }
    
    public String verNombre(int pos){
        
        return lista[pos-1];
        
    }
    
    public boolean esDaw(){
        boolean result = false;
        String nombre=nombreCurso.toLowerCase();
        
        if(nombre.contains("daw")){
            result=true;
        }
        
        return result;
    }
}
