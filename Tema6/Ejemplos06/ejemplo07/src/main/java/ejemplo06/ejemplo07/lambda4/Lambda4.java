/*
 */
package ejemplo06.ejemplo07.lambda4;

import java.util.Arrays;
import java.util.List;

/**
 * En este ejemplo lo que vamos a hacer es crear una sencilla lista y recorrerla
 * usando un for each, pero a través de expresiones lambdas
 *
 * @author cic
 */
public class Lambda4 {

    public static void main(String[] args) {
        List<String> alumnos = Arrays.asList("Luis", "Maria", "Pedro", "Lucia");

        //Imprimimos como lo haciamos con la programación imperativa
        System.out.println("Con for each==============");
        for (String a : alumnos) {
            System.out.println(a);
        }
        System.out.println("Con for each y lambda==========");
        //Imprimimos con expresiones lambda
        alumnos.forEach(a -> System.out.println(a));

        System.out.println("Con for each y (lambda operador) más simplificado==========");
        //Imprimimos con expresiones lambda
        alumnos.forEach(System.out::println);

        //Supongamos ahora que quiero mostrar los elementos en cuya inicial es la P
        System.out.println("Con for each y condición==========");
        for (String a : alumnos) {
            if (a.startsWith("P")) {
                System.out.println(a);
            }
        }

        System.out.println("Con for each y lambda con condicion==========");
        //Con lambda
        alumnos.forEach(a -> {
            if (a.startsWith("P")) {
                System.out.println(a);
            }
        });
        
        //Todavia puedo ir más allá si lo combino con la api stream.
        //La veremos después
        System.out.println("Con stream usando filter y api stream==========");
        alumnos.stream().filter(a -> (a.startsWith("P"))).forEachOrdered(a -> {
            System.out.println(a);
        });

        System.out.println("Con stream usando filter y api stream y operador==========");
        alumnos.stream().filter(a -> (a.startsWith("P"))).forEachOrdered(System.out::println);
    }
}
