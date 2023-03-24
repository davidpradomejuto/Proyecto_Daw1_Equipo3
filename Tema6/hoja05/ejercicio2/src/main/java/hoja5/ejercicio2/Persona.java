/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio2;

/**
 *
 * @author david
 */
public class Persona implements Comparable<Persona> {
    private String nombre;
    private String apellidos;
    private String DNI;

     public Persona() {
        boolean dnivalido = false;
        boolean nombrevalido = false;
        boolean apellidovalido=false;
        
        do{
        String posibleDni = Teclado.pedirDni("Introduce el Dni de la persona: ");
        if(ValidaDatos.validarDni(posibleDni)){
            dnivalido = true;
            System.out.println("Dni correcto");
            this.DNI=posibleDni;
        }else{
            System.out.println("Dni Invalido repite");
        }
        }while(!dnivalido);
        
        do {
        String posibleNombre = Teclado.pedirNombre("Introduce el nombre de la persona: ");
        
        if (ValidaDatos.validarNombre(posibleNombre)){
            nombrevalido = true;
            System.out.println("Nombre correcto");
            this.nombre=posibleNombre;
        }else{
            System.out.println("Nombre Invalido repite");
        }
        }while(!nombrevalido);
        
        do {
        String posibleApellido = Teclado.pedirNombre("Introduce el apellido de la persona: ");
        
        if (ValidaDatos.validarNombre(posibleApellido)){
            apellidovalido = true;
            System.out.println("apellido correcto");
            this.apellidos=posibleApellido;
        }else{
            System.out.println("apellido Invalido repite");
        }
        }while(!nombrevalido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
	public int compareTo(Persona o) {
    	int result;
    	if (this.nombre.compareTo(o.nombre) >= 1) {
        	result = 1;
    	} else if (this.nombre.compareTo(o.nombre) <= -1) {
        	result = -1;
    	} else {

        	if (this.apellidos.compareTo(o.apellidos) <= 1) {
            	result = 1;
        	} else if (this.apellidos.compareTo(o.apellidos) <= -1) {
            	result = -1;
        	} else {
            	result = 0;
        	}
    	}
    	return result;
	}

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + '}';
    }
     
     



}
