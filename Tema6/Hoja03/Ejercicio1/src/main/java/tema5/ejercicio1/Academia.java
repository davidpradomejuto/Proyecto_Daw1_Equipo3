/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.ejercicio1;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author atres
 */
public class Academia {

    private LinkedList<Curso> lista;

    public Academia() {
        lista = new LinkedList<>();

    }

    public void añadirCursoFinal(Curso c) {
        lista.addLast(c);
        System.out.println("Curso añadido al final de la lista");
    }

    public void insertarCurso(Curso c, int pos) {
        lista.add(pos, c);
        System.out.println("Curso añadido correctamente");
    }

    public void borrarCurso(int cod) {
        for (Curso c : lista) {
            if (c.getCodigo() == cod) {
                lista.remove();
                System.out.println("Curso borrado correctamente");
            }
        }
    }

    public void modificarnHoras(int cod, int nHoras) {
        for (Curso c : lista) {
            if (c.getCodigo() == cod) {
                c.setnHoras(nHoras);
            }
        }
    }

    public void mostrar() {
        for (Curso c : lista) {
            System.out.println(c.toString());
        }
    }

}
