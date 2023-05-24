/*
 */
package ejemplo06.ejemplo07.lambda2;

/**
 * En este ejemplo usamos unas FUNCIONES pasadas como parametros una dentro de
 * otra.
 *
 * @author cic
 */
public class Lambda2 {

    // Método que usa como parámetros una función y los argumentos
    // que esta necesita para operar
    private static int operacion(int a, int b, Funcion1 fobj) {
        return fobj.operacion(a, b);
    }

    // prueba
    public static void main(String[] args) {
        // Me permite calcular la suma de dos parámeros
        // implemento la interface1
        Funcion1 suma = (int x, int y) -> x + y;

        // Me permite calcular la multiplicacion de dos parámetros 
        // implemento la interface1
        Funcion1 multiplicacion = (int x, int y) -> x * y;

        // Sumo dos numeros usando Lambda
        System.out.println("La suma es:" + Lambda2.operacion(6, 7, suma));

        // Multiplico dos numeros usando Lambda
        System.out.println("El producto es: " + Lambda2.operacion(6, 7, multiplicacion));

        //usando clase anónima
        Funcion2 fobj1 = new Funcion2() {
            @Override
            public void info(String mensaje) {
                System.out.println("Hola " + mensaje);
            }
        };

        // Uso de la interface 2
        Funcion2 fobj = mensaje -> System.out.println("Hola " + mensaje);
        fobj.info("estamos probando lambda");
    }

}
