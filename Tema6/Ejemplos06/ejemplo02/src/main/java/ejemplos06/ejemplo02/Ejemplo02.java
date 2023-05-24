
package ejemplos06.ejemplo02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cic
 */
public class Ejemplo02 {

    public static void main(String[] args) {
       // defino una lista de cadenas de texto como contenedor ArrayList
        List<String> lista=new ArrayList<>();
        // los elementos llevan un indice
        lista.add("Hola");
        lista.add("Adios");
        //inserto el objeto en la posición cero, es decir, el primer elemento
        lista.add(0,"que pasa");
        // recorro la lista puedo utilizar for each e iterator
        
        for(Object objeto:lista){
            String palabra=(String)objeto;
            System.out.println(palabra);
        }
        // otra forma como nuestro List utiliza genérico String puedo utilizar directamente
        //String en vez de Object
        for(String palabra:lista){
            System.out.println(palabra);
        }
        
        // además me permite borrar por indice del elemento
        String elementoBorrado=lista.remove(0);
        System.out.println("elemento borrado "+elementoBorrado);
        //además me permite buscar por indice del elemento
        String elementoBuscado=lista.get(0);
        System.out.println("elemento buscado "+elementoBuscado);
        // además me devuelve la posicion de un elemento a buscar
        int posicion=lista.indexOf("Hola");
        if (posicion!=-1)
            System.out.println("existe el elemento Hola y esta en la posicion "+ posicion);
        int posicion1=lista.indexOf("prueba");
        if (posicion1==-1)
            System.out.println("el elemento no existe y devuelve -1");
    }
}
