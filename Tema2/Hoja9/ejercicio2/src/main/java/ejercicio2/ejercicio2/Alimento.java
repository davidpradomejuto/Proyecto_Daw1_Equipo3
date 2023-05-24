package ejercicio2.ejercicio2;
/**
  * @author DAW118
 */
public class Alimento {
    private String nombre;
    private int grasas,hidratos;
    private boolean origenAnimal;

    public Alimento(String nombre, int grasas, int hidratos, boolean origenAnimal) {
        this.nombre = nombre;
        this.grasas = grasas;
        this.hidratos = hidratos;
        this.origenAnimal = origenAnimal;
    }

    public int getGrasas() {
        return grasas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHidratos() {
        return hidratos;
    }

    public boolean isOrigenAnimal() {
        return origenAnimal;
    }
    
    public void getTodos(){
        System.out.println("El nombre del alimento es :"
        +this.nombre+" sus grasas son : "+this.grasas+" sus hidratos son : "+this.hidratos);
        System.out.println("Es de Origen animal ? : "+this.origenAnimal);
    }
    
    public boolean esDietetico (){
        //si las grasas del alimento es menor de 12 y no es de origen animal significa que es dietetico
        boolean dietetico = this.grasas < 12 && !this.origenAnimal;  
        return dietetico;
    }
    
    public double calorias (double newGramos) {
     //calculo las calorias con uan formula
    double cals =  newGramos*(this.grasas*5.3+this.hidratos*2.1);
    return cals;
    } 
}
