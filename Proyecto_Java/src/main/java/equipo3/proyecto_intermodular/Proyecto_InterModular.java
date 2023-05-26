/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package equipo3.proyecto_intermodular;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.UUID;

/**
 *
 * @author daw118
 */
public class Proyecto_InterModular {

    public static void main(String[] args) {
        MetodosBD mysql = new MetodosBD();

        try ( Connection conn = AccesoBaseDatos.getInstance().getConn();) {
            System.out.println("");
                   //Cliente prueba= new Cliente("1112","72197202H","david","prado",618020202,"barrio la redonda","pielagos",LocalDate.now(),null,null);
                   //mysql.insertarCliente(prueba);
                    
                    
                    System.out.println("Mostrando cliente");
                    Cliente busqueda = null;
                     busqueda = mysql.seleccionClientePorDni("72197202H");
                   System.out.println(busqueda.toString());
            
        } catch (SQLException ex) {
            System.out.println("error sql" + ex.getMessage());
        }

    }
}
