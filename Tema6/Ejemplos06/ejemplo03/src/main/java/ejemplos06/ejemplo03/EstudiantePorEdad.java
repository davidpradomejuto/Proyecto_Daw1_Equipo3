/*
 * para cambiar el critero de ordenacion por edad
 */
package ejemplos06.ejemplo03;

import java.util.Comparator;

/**
 *
 * @author cic
 */
public class EstudiantePorEdad implements Comparator<Estudiante> {

    @Override
    public int compare(Estudiante o1, Estudiante o2) {
        return o1.getEdad() - o2.getEdad();
// Devuelve un entero positivo si la edad de o1 es mayor que la de o2
    }
}
