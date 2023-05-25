/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package equipo3.proyecto_intermodular;

import java.time.LocalDate;

/**
 *
 * @author daw118
 */
public class Proyecto_InterModular {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("23434556456","72197202H","david","prado",654789021,"barrio covadonga","torrelavega",
                EstadoCivil.casado,SituacionLaboral.empleado,LocalDate.now());
    }
}
