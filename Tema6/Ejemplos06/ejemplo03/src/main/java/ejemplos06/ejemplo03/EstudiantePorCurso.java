/*
 * ordenar estudiantes por curso
 */
package ejemplos06.ejemplo03;

import java.util.Comparator;

/**
 *
 * @author cic
 */
public class EstudiantePorCurso implements Comparator<Estudiante> {
    @Override
    public int compare(Estudiante o1, Estudiante o2) {
    return o1.getCurso() - o2.getCurso(); 
    }
}
