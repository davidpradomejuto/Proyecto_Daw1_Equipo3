package ejercicio2.ejercicio2;

/**
 * @author DAW118
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        //creo el objeto platano con 5 de grasas,15 de hidratos y no es de origen animal
        Alimento platano = new Alimento ("Platano",5,15,false);
        //muestro las grasas del platano
        System.out.println("El platano tiene "+platano.getGrasas()+" Grasas");
        //muestro los hidratos del platano
        System.out.println("El platano tiene "+platano.getHidratos()+" Hidratos");
        //muestro si el platano es de origen animal
        System.out.println("El platano es de origen animal? "+platano.isOrigenAnimal());
        //muestro el nombre
        System.out.println("El alimento tiene este nombre: "+platano.getNombre());
        System.out.println("Muestro todo. ");
        platano.getTodos();
        //muestro si es dietetico
        System.out.println("El platano es dietetico? "+platano.esDietetico());
        //calculo las calorias
        System.out.printf("El platano tiene %,.2f calorias",platano.calorias(15));
        
    }
}
