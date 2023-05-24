/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio1;

/**
 *
 * @author david
 */
public class Actividad {
    
    private int id;
    private String nombre;
    private int plazasLibres;
    private String dia;
    private String hora;

    public Actividad() {
        this.nombre = Teclado.pedirNombre("Introduce el nombre de la actividad...");
        this.plazasLibres = Teclado.pedirIntPositivo("Introduce las plazas libre....");
        this.dia = Teclado.pedirNombre("Introduce el dia de la actividad....");
        this.hora = Teclado.pedirNombre("Introduce la hora de la actividad....");
    }

    public Actividad(int id, String nombre, int plazasLibres, String dia, String hora) {
        this.id = id;
        this.nombre = nombre;
        this.plazasLibres = plazasLibres;
        this.dia = dia;
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPlazasLibres() {
        return plazasLibres;
    }

    public void setPlazasLibres(int plazasLibres) {
        this.plazasLibres = plazasLibres;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "actividad{" + "id=" + id + ", nombre=" + nombre + ", plazasLibres=" + plazasLibres + ", dia=" + dia + ", hora=" + hora + '}';
    }
    
    
    
}
