/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package equipo3.proyecto_intermodular;

import java.time.LocalDate;
import java.util.LinkedList;

/**
 *
 * @author daw118
 */
public class Proyecto_InterModular {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("23434556456", "72197202H", "david", "prado", 654789021, "barrio covadonga", "torrelavega", LocalDate.now(), null, null, null);

        CuentaBancaria cuenta = new CuentaBancaria("es 86 12312312", cliente, "cuentaCorriente", 3000, 1200, 3001, null);

        PerfilCliente perfil = new PerfilCliente(cliente, "contrania", SituacionLaboral.empleado,
                EstadoCivil.casado, false, false, null, false);

        cliente.setCuentaBancaria(cuenta);
        cliente.setPerfil(perfil);
        
        MetodosBanco metodos = new MetodosBanco();
        
        System.out.println(metodos.concesionPrestamo(cliente));

    }
}
