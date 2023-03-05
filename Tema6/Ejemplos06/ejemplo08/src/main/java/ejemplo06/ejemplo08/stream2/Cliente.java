/*
 */
package ejemplo06.ejemplo08.stream2;

import java.time.LocalDate;

/**
 *
 * @author cic
 */
public class Cliente implements Comparable<Cliente>{
    private int numcliente;
    private String nombre;
    private LocalDate fechaNacimiento;

    public Cliente(int numcliente, String nombre, LocalDate fechaNacimiento) {
        this.numcliente = numcliente;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNumcliente() {
        return numcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    @Override
    public int compareTo(Cliente c){
        return numcliente - c.numcliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numcliente=" + numcliente + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
}
