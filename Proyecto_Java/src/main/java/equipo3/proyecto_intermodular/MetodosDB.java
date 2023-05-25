/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipo3.proyecto_intermodular;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DAW118
 */
public class MetodosDB {
    
    public Cliente seleccionPropietario(String dni) {
        Cliente p = null;
        String sql = "Select DNItitular,nombre,telefono from propietarios where DNItitular=?";
        try ( PreparedStatement sentencia = conn.prepareStatement(sql);) {
            sentencia.setString(1, dni);
            try ( ResultSet rs = sentencia.executeQuery();) {
                if (rs.next()) {
                    p = new Propietario(rs.getString(1), rs.getString(2), rs.getString(3));
                    System.out.println(p.toString());
                }
            }
        } catch (SQLException ex) {
            System.out.println("error al consultar seleccion propietario" + ex.toString());
        }
        return p;
    }
    
    
    
}
