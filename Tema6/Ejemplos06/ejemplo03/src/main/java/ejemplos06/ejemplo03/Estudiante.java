/*
 * Crea una una clase llamada Estudiante con 3 campos (atributos). 
 * Estos serán nombre es un String, edad un int y curso un int 
 * con valores entre 1 y 5 que representan desde primer curso hasta quinto curso.
 */
package ejemplos06.ejemplo03;

/**
 *
 * @author cic
 */
public class Estudiante implements Comparable<Estudiante> {

    private String nombre;
    private int edad;
    private int curso;

    public Estudiante(String nombre, int edad, int curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", edad=" + edad + ", curso=" + curso + '}';
    }

    // la lista estará ordenada por nombre
    @Override
    // Indica en base a que atributos se compara el objeto 
    // Devuelve número positivo si this es > que objeto 
    // Devuelve número negativo si this es < que objeto 
    // Devuelve 0 si son iguales 
    public int compareTo(Estudiante o) {
        return this.nombre.compareTo(o.nombre);
    }
}
