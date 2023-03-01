/*
 */
package ejemplo06.ejemplo08.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author cic
 */
public class Stream1 {
    public static void main(String[] args) {
        List<String> capitales = Arrays.asList("Jaén", "Córdoba", "Sevilla", 
                "Huelva", "Cádiz", "Málaga", "Granada","Almería");
         
        System.out.println("\nTodas las capitales");
        capitales.stream().forEach(System.out::println);
        
        
        
        // Obtenemos las capitales de Andalucía que empiezan por C
        System.out.println("\nCapitales que empiezan por C");
        capitales
                .stream()
                .filter(s -> s.startsWith("C"))
                .forEach(System.out::println);
        
        
        
        System.out.println("\nCapitales no repetidas");
        List<String> capitalesRepetidas = Arrays.asList("Sevilla", "Huelva", "Sevilla");
         
        // Obtenemos un stream con todas las capitales sin repetir.
        capitalesRepetidas
                .stream()
                .distinct()
                .filter(s->s.contains("S"))
                .forEach(System.out::println);
        
        
        System.out.println("\nSolo las 5 primeras capitales");
        // Obtenemos un stream cuyo tamaño no es mayor que un número
        capitales.stream().limit(5).forEach(System.out::println);
        
        
        System.out.println("\nSaltamos todas hasta las últimas cinco");
        // Obtenemos un stream que descarta una serie de elementos iniciales
        capitales.stream().skip(capitales.size() - 5).forEach(System.out::println);
        
        // utilización de peek y map ,crear una lista de las cadenas que tengan
        // más de 3 elementos
        System.out.println("\n peek visualiza un valor intermedio, map aplica la función UpperCase");
        List<String> mayor3=Stream.of("uno", "dos", "tres", "cuatro","cinco")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Muestro valor filtrado: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Valor mapeado: " + e))
                .collect(Collectors.toList());
        
        System.out.println("\n salida de la lista es "+ mayor3.toString());
    }
}
