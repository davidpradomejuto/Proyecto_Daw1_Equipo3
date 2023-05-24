/*
 */
package ejemplo06.ejemplo07.lambda3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author cic
 */
public class Lambda3 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//1ª Forma: una clase que implementa comparator
		//lista.sort(new MayorAMenor());
		
		//2ª Forma: una clase "anónima" 
		
//		lista.sort(new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return -(o1.compareTo(o2));
//			}
//			
//		});
		
		//3ª Forma: una expresion lambda
		//Los tipos de datos ¡no son obligatorios! Se infieren del contexto
                //Si es una única sentencia y devuelve un valor, la orden return se puede omitir, 
                //ya que java devuelve automáticamente el resultado de la operación
//		lista.sort((Integer n1, Integer n2) -> {return -(n1.compareTo(n2));}); 
		lista.sort((n1, n2) -> -(n1.compareTo(n2)));
		
		for (Integer i : lista)
			System.out.println(i);
    }
    
    //es una clase privada para ordenar
    private static class MayorAMenor implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            return -(o1.compareTo(o2));
        }
    }
}
