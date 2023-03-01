/*
 */
package ejemplo06.ejemplo08.stream2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author cic
 */
public class Stream2 {
    public static void main(String[] args) {
        //obtener un stream a partir de una tabla(array) con el método estático of
        // de la interfaz stream
        Cliente[] tClientes={ new Cliente(111,"Marta",LocalDate.of(2001,02,12)),
            new Cliente(112,"Jorge",LocalDate.of(1999,03,16)),
            new Cliente(98,"Ana",LocalDate.of(2002,10,12))};
        //podemos obtener un streamn por  of
        Stream<Cliente> sCliente=Stream.of(tClientes);
        //otra forma con Arrays.Stream
        Stream<Cliente> sCliente1=Arrays.stream(tClientes);
        
        // como los Stream no son reutilizable, tiene poco sentido crea las variables
        // sCliente o sCliente1
        
        System.out.println("Mostrar clientes ordenados por Número de cliente ");
        Arrays.stream(tClientes)
                .sorted()
                .forEach(System.out::println);
        System.out.println("\nRealizamos el cambio de ordenación");
        System.out.println("Mostrar clientes ordenados por Nombre de cliente ");
        Arrays.stream(tClientes)
                .sorted((x,y)->x.getNombre().compareTo(y.getNombre()))
                .forEach(System.out::println);
        
        System.out.println("\nOtrasConsutas");
        System.out.println("Devolver el número de clientes que nacen después del 2000 ");
        long n=Arrays.stream(tClientes)
                .filter(c->c.getFechaNacimiento().isAfter(LocalDate.of(2000,12,31)))
                .count();        
        System.out.println("Numero de clientes: "+n);
        
        
        // crear un mapa de los número de clientes-Claves sobre los nombres -valores
        // usaremos Collectors.toMap() y deberemos especificar los atributos clave y valor
        // , por ese orden
        
        Map<Integer,String> mapaClientes= Stream.of(tClientes)
                .collect(Collectors.toMap(c ->c.getNumcliente(),c->c.getNombre())) ;
        System.out.println("\nMapa de clientes" + mapaClientes.toString());
                
         
        
                
            
                
                
                
                
                        
        
    }
    
}
