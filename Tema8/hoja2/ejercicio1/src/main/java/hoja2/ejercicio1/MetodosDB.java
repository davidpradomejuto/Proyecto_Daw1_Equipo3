/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DAW118
 */
public class MetodosDB {
    
    public static void insertarPaciente(){
        
    }
    
    public static Paciente pedirPacientePorDni(String dni){
         Connection conn = AccesoBaseDatos.getInstance().getConn();
        
        Paciente result = null;
       
        String sql = "SELECT dni,nombre,telefono FROM usuarios WHERE dni=?";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql);) {
             
            stmt.setString(1, dni);
            try ( ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    result = new Paciente(rs.getString("dni"),rs.getString("nombre"),rs.getString("telefono"));
                }
            }

        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return result;
    }
    
    public static void insertarVisita(){
    
    }
    
    public static void ListarDia(){
    
    }
    
    public static void ListarPaciente(Paciente paciente){
    
    }
    
    
    
    
}
