/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos06.ejemplo04;

import java.util.Objects;

/**
 *
 * @author cic
 */
public class Alumno {
      private String nombre;
    private double nota;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre +"-"+ nota;
    }

    @Override
    //generado por defecto
    /*public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.nota) ^ (Double.doubleToLongBits(this.nota) >>> 32));
        return hash;
    }
     */
    public int hashCode() {
        int hash =5;
        return 37* hash+nombre.hashCode() + (int) nota ;
    }
    
    @Override
    //generado por defecto
    /*public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (Double.doubleToLongBits(this.nota) != Double.doubleToLongBits(other.nota)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
     */
    public boolean equals(Object obj) {
        if (obj instanceof Alumno alumno) {
            return alumno.nombre.equals(nombre) && alumno.nota == nota;
        } else {
            return false;
        }
    }
}
