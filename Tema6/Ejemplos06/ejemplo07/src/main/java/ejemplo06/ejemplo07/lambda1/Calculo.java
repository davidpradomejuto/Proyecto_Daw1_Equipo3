/*

 */
package ejemplo06.ejemplo07.lambda1;

/**
 * Esta es una Interfaz funcional, porque solo tiene un método abstracto propio
 * podría tener otros como un default.
 * @author cic
 */
public interface Calculo {
    
    public abstract Integer suma(Integer a, Integer b);
    
    public default void info(){
        System.out.println("Este es un método default");
    }
}
