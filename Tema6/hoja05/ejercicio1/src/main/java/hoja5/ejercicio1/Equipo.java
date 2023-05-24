/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio1;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author david
 */
public class Equipo {

    SortedSet<Jugador> matriz;

    public Equipo() {
        matriz = new TreeSet<>();
    }

    public void insertar() {
        Jugador o = new Jugador();

        if (matriz.add(o)) {
            System.out.println("Jugador Introducido.");
        } else {
            System.out.println("Jugador no introducido, puede que este repetido.");
        }

    }

    public void borrar() {
        String codigoBuscado = Teclado.pedirNombreRegex("Introduce el nombre del jugador que quieras borrar...");

        boolean encontrado = false;

        Iterator<Jugador> it = matriz.iterator();
        while (it.hasNext() && !encontrado) {
            Jugador aux = it.next();

            if (aux.getNombre().equalsIgnoreCase(codigoBuscado) && !encontrado) {
                encontrado = true;
                try {
                    it.remove();
                    System.out.println("Jugador Borrado");
                } catch (UnsupportedOperationException uoe) {
                    System.out.println("error...");
                    System.out.println(uoe.getMessage());
                } catch (Exception e) {
                    System.out.println("Error...");
                    System.out.println(e.getMessage());
                }
            }
        }
        if (!encontrado) {
            System.out.println("jugador no encontrado.");
        }
    }

    public String mostrar() {
        String result = "";
        for (Jugador a : matriz) {
            result = result.concat(a.toString());
        }
        return result;
    }

    public Jugador jugadorMasBajo() {
        Jugador result = null;
        //int minAltura = 9999;

        result = matriz.first();

        /*Iterator<Jugador> it = matriz.iterator();
        while (it.hasNext()) {
            Jugador aux = it.next();
            if (aux.getEstatura() <= minAltura) {
                minAltura = aux.getEstatura();
                result = aux;
            }
        }
         */
        return result;
    }

    public Jugador jugadorMasAlto() {
        //int maxAltura = 0;
        Jugador result = null;

        result = matriz.last();
        /*
        Iterator<Jugador> it = matriz.iterator();
        while (it.hasNext()) {
            Jugador aux = it.next();
            if (aux.getEstatura() >= maxAltura) {
                maxAltura = aux.getEstatura();
                result = aux;
            }
        }
         */

        return result;
    }

    public SortedSet MasDeDosMetros() {
        SortedSet<Jugador> lista;
        lista = new TreeSet<>();

        Iterator<Jugador> it = matriz.iterator();
        while (it.hasNext()) {
            Jugador aux = it.next();
            if (aux.getEstatura() >= 200) {
                lista.add(aux);
            }
        }
        return lista;
    }
}
