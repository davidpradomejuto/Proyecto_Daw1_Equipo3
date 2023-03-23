/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author david
 */
public class Equipo {

    Set<Jugador> matriz;

    public Equipo() {
        matriz = new HashSet<>();
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

        for (Jugador o : matriz) {
            if (o.getNombre().equalsIgnoreCase(codigoBuscado) && !encontrado) {
                encontrado = true;
                try{
                if (matriz.remove(o)) {
                    System.out.println("jugador borrado...");
                }
                }catch (UnsupportedOperationException uoe){
                        System.out.println("error...");
                        System.out.println(uoe.getMessage());
                        }} 
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
        int minAltura = 9999;

        Iterator<Jugador> it = matriz.iterator();
        while (it.hasNext()) {
            Jugador aux = it.next();
            if (aux.getEstatura() <= minAltura) {
                minAltura = aux.getEstatura();
                result = aux;
            }
        }

        return result;
    }

    public Jugador jugadorMasAlto() {
        int maxAltura = 0;
        Jugador result = null;
        
        Iterator<Jugador> it = matriz.iterator();
        while (it.hasNext()) {
            Jugador aux = it.next();
            if (aux.getEstatura() >= maxAltura) {
                maxAltura = aux.getEstatura();
                result = aux;
            }
        }
        
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
