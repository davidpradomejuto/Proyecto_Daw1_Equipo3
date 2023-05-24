/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo3.proyecto_intermodular;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author DAW209
 */
public class Metodos {
    
    private static Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }
    
    public static List<Cliente> mostrarClientes() {
        String sql = "SELECT UUID, dni, nombre, apellidos, telefono, direccion, localidad, fechaNacimiento FROM clientes";
        List<Cliente> clientes = new ArrayList<>();
        
        try (PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            try (ResultSet rs = stmt.executeQuery()) {
                while(rs.next()) {
                    Cliente c = crearCliente(rs);
                    if (!clientes.add(c)) {
                        throw new Exception("ERROR. No se ha podido insertar el objeto en la coleccion de pasajeros");
                    }
                }
            }
        }catch(SQLException ex) {
            System.out.println("SQLException: "+ex.getMessage());
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        return clientes;
    }
    
    public static Cliente crearCliente(final ResultSet rs)throws SQLException {
        Cliente c = new Cliente(rs.getString("UUID"), rs.getString("dni"), rs.getString("nombre"), rs.getString("apellidos"), rs.getInt("telefono"), rs.getString("direccion"), rs.getString("localidad"), rs.getDate("fechaNacimiento"));
        return c;
    }
    
    public static void buscarPrestamosCliente(String uuid) {
        String sentencia1 = "SELECT cliente, fechaConfirmacion, pagoMensual FROM prestamosconcedidos where cliente = ?";
        String sentencia2 = "SELECT cliente fechaOferta, cantidadPrestamo, periodoPrestamos, tipoInteres, plazoAceptar FROM prestamospreconcedido where cliente = ?";
        List prestamos = new LinkedList<>();
        
        try (PreparedStatement stmt = getConnection().prepareStatement(sentencia1);) {
            try (ResultSet rs = stmt.executeQuery()) {
                while(rs.next()) {
                    
                }
            }
        }catch(SQLException ex) {
            System.out.println("SQLException: "+ex.getMessage());
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        try (PreparedStatement stmt = getConnection().prepareStatement(sentencia2);) {
            try (ResultSet rs = stmt.executeQuery()) {
                while(rs.next()) {
                    
                }
            }
        }catch(SQLException ex) {
            System.out.println("SQLException: "+ex.getMessage());
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
