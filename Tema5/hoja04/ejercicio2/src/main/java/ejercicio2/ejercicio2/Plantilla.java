/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;


/**
 *
 * @author DAW118
 */
public class Plantilla {

    Empleado[] matriz;
    private int contador;

    public Plantilla() {
        matriz = new Empleado[99];
        this.contador = 0;
    }

    public void insertar(Empleado empleado) {
        matriz[contador] = empleado;
        contador++;
    }

    @Override
    public String toString() {

        String result = "";
        for (int i = 0; i < contador; i++) {
            if (matriz[i] instanceof Programador progaux) {
                result = result.concat("nombre : " + progaux.nombre + " departamento : " + progaux.departamento
                        + " edad : " + progaux.edad + " casado? : " + progaux.casado
                        + " salario : " + progaux.salario + "€ Lineas por hora: " + progaux.getLineasDeCodigoPorHora()
                        + " Lenguaje principal: " + progaux.getLenguajeDominante() + " \n");
            } else {
                result = result.concat("nombre : " + matriz[i].nombre + " departamento : " + matriz[i].departamento
                        + " edad : " + matriz[i].edad + " casado? : " + matriz[i].casado
                        + " salario : " + matriz[i].salario + "€" + " \n");
            }
        }

        return result;
    }

    public Programador masLineasPorHora() {
        int mayorlineas = 0;
        int posicionmayor = 0;

        for (int i = 0; i < contador; i++) {
            if (matriz[i] instanceof Programador progaux) {
                if (progaux.getLineasDeCodigoPorHora() >= mayorlineas) {
                    posicionmayor = i;
                }
            }
        }

        return (Programador) matriz[posicionmayor];
    }

    public String devolverSenio() {
        String result = "";
        for (int i = 0; i < contador; i++) {
            if (matriz[i] instanceof Programador progaux) {
                if (progaux.getEdad() > 35) {
                    result = result.concat("nombre : " + progaux.nombre + " departamento : " + progaux.departamento
                            + " edad : " + progaux.edad + " casado? : " + progaux.casado
                            + " salario : " + progaux.salario + "€ Lineas por hora: " + progaux.getLineasDeCodigoPorHora()
                            + " Lenguaje principal: " + progaux.getLenguajeDominante() + " \n");
                }
            }
        }

        return result;
    }
    
    public void incrementar20(){
        for (int i = 0; i < contador; i++) {
            if (matriz[i] instanceof Programador progaux) {
                if (progaux.getEdad() >=22 && progaux.getEdad()<=35 && progaux.getLenguajeDominante().equalsIgnoreCase("java")) {
                    matriz[i].aumentarSalario(20);
                }
            }
        }
        System.out.println("Salario subido a los programadores intermedios de Java");
    }

}
