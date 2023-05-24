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

    public void aniadirCursoFinal() {
        int tamanio = lista.size();
        try {
            lista.addLast(new Curso());

            if (tamanio < lista.size()) {
                System.out.println("El curso se ha añadido correctamente");
            } else {
                System.out.println("El curso no se ha añadido...");
            }
        } catch (Exception e) {
            System.out.println("Error indeterminado..");
            System.out.println(e.getMessage());
        }

    }

    public void insertarCurso() {

        int tamanio = lista.size();

        try {

            int pos = Teclado.pedirIntPositivo("Introduce la posicion en la que quieras meter el curso;");
            Curso c = new Curso();

            lista.add(pos, c);

            if (tamanio < lista.size()) {

                System.out.println("El curso se ha añadido correctamente");
            } else {
                System.out.println("El curso no se ha añadido...");
            }
        } catch (Exception e) {
            System.out.println("Error indeterminado..");
            System.out.println(e.getMessage());
        }

    }

    public void borrarCurso() {
        int cod = Teclado.pedirIntPositivo("Introduce le codigo del curso que quieres borrar");
        boolean encontrado = false;
        try {
            for (Curso c : lista) {
                if (c.getCodigo() == cod && !encontrado) {
                    encontrado = true;

                    if (lista.remove(c)) {
                        System.out.println("Curso borrado correctamente");
                    } else {
                        System.out.println("Error al borrar el curso");
                    }
                }
            }
            
            if (!encontrado){
                System.out.println("El curso no ha sido encontrado...");
            }
        } catch (Exception e) {
            System.out.println("Error indeterminado..");
            System.out.println(e.getMessage());
        }
    }

    public void modificarnHoras() {
        boolean encontrado = false;
        int cod = Teclado.pedirIntPositivo("Introduce el codigo del curso: ");

        for (Curso c : lista) {
            if (c.getCodigo() == cod && !encontrado) {
                int nHoras = Teclado.pedirIntPositivo("Introduce el numero de horas a modificar: ");
                encontrado = true;
                try {
                    c.setnHoras(nHoras);
                    System.out.println("Horas modificadas");
                } catch (Exception e) {
                    System.out.println("Error indeterminado");
                    System.out.println(e.getMessage());
                }
            }
        }

        if (!encontrado) {
            System.out.println("El curso no ha sido encontrado");
        }
    }

    public void mostrar() {
        System.out.println("Mostrando datos de los cursos");
        for (Curso c : lista) {
            System.out.println(c.toString());
        }
    }

}
