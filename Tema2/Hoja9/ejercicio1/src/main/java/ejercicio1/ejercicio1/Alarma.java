package ejercicio1.ejercicio1;
/**
 * @author DAW118
 */
public class Alarma {
    private double temperatura;
    private boolean timbre;
    
    public Alarma(double newtemp){
        this.temperatura = newtemp;
        timbre = false;
    }
    
    public boolean comprueba(){
        if (timbre == false && this.temperatura > 35 || this.temperatura < 10){
            this.timbre = true;         
        }
        return this.timbre;
    }
    
    public void normaliza(){
            this.temperatura = 25;
            this.timbre = false;
            System.out.println("La temperatura se ha normalizado ");
        }

    public void setTemperatura(double newtemp) {
        this.temperatura = newtemp;
        System.out.println("temperatura cambiada");
    }

    public double getTemperatura() {
        return temperatura;
    }

    public boolean getTimbre() {
        return timbre;
    }
}
