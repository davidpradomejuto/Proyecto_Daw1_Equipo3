package ejercicio1.ejercicio1;
/**
 * @author DAW118
 */
public class Ejercicio1 {

    public static void main(String[] args) {
       
        //creo el objeto alarma
        Alarma a1 = new Alarma(36.3d);
        
        //muestro la temperatura
        System.out.println("La temperatura es de "+a1.getTemperatura()+" grados");
        //muestro el estado del timbre
        System.out.println("El tiembre es :"+a1.getTimbre());
        //si el metodo comprueba da true la temperatura se normaliza
        if (a1.comprueba() == true) {
        a1.normaliza();
        }
        //muestro la temperatura
        System.out.println("La temperatura es de "+a1.getTemperatura()+" grados");
        //y muestro el estado del timbre
        System.out.println("El tiembre es :"+a1.getTimbre());
    }
}
