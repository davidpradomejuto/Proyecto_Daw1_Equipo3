/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

/**
 *
 * @author DAW118
 */
public abstract class Guerrero implements Comparable<Guerrero> {

    private final String NOMBRE;
    private int edad, fuerza;
    private boolean herido, muerto;

    //genero el primer constructor
    public Guerrero(String newnombre, int newedad, int newfuerza) {
        this.NOMBRE = newnombre;
        if (comprobarEdad(newedad)) {
            this.edad = newedad;
        } else {
            this.edad = 25;
        }
        
        if (comprobarFuerza(newfuerza)) {
            this.fuerza = newfuerza;
        } else {
            this.fuerza = 5;
        }
    }
    
    //genero el segundo constructor
    public Guerrero() {
        System.out.println("Introduce el nombre");
        this.NOMBRE = Teclado.pedirNombre();
        System.out.println("Introduce la edad");
        this.edad = Teclado.pedirIntPositivo();
        System.out.println("Introduce la fuerza");
        this.fuerza = Teclado.pedirIntPositivo();
        this.herido=false;
        this.muerto = false;
        
    }
    
    //genero el tercer constructor
    public Guerrero(Guerrero g,String newnombre){
        this.NOMBRE = newnombre;
        this.edad = g.getEdad();
        this.fuerza = g.getFuerza();
        this.herido = g.getHerido();
        this.muerto = g.getMuerto();
    }

    //genero el metodo retirarse();
    public abstract boolean retirarse();
    
    //genero los metodos de comprobar edad y fuerza
    protected static boolean comprobarEdad(int e) {
        boolean result;
        if (e >= 15 && e <= 60) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    protected static boolean comprobarFuerza(int f) {
        boolean result;
        if (f >= 1 && f <= 10) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    @Override
    public int compareTo(Guerrero o) {
        return o.getFuerza();
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return NOMBRE;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean getHerido() {
        return herido;
    }

    public void setHerido(boolean herido) {
        this.herido = herido;
    }

    public boolean getMuerto() {
        return muerto;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

}
