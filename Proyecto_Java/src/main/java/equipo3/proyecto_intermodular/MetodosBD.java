/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipo3.proyecto_intermodular;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DAW118
 */
public class MetodosBD {

    private Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }

    public Cliente seleccionCliente(String UUID) {
        Cliente p = null;
        String sql = "Select UUID,dni,nombre,apellidos,telefono,direccion,localidad,fechaNacimiento from clientes where UUID=?";
        try ( PreparedStatement sentencia = conn.prepareStatement(sql);) {
            sentencia.setString(1, UUID);
            try ( ResultSet rs = sentencia.executeQuery();) {
                if (rs.next()) {
                    p = new Cliente(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getDate(8), null, null);
                    System.out.println(p.toString());
                }
            }
        } catch (SQLException ex) {
            System.out.println("error al consultar seleccion propietario" + ex.toString());
        }
        return p;
    }

    private CuentaBancaria seleccionCuentaBancaria(String uuidCliente) {

        CuentaBancaria cb = null;
        String sql = "Select IBAN, clientes, tipoCuenta, saldo, nominaMes, mediaNomina from cuentasbancarias where clientes = ?";

        try ( PreparedStatement sentencia = conn.prepareStatement(sql);) {
            sentencia.setString(1, uuidCliente);
            try ( ResultSet rs = sentencia.executeQuery();) {
                if (rs.next()) {

                    cb = new CuentaBancaria(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getDouble(5), rs.getDouble(6),);
                }
            }
        } catch (SQLException e) {
            System.out.println("error al consultar seleccion de cuenta bancaria del cliente" + e.toString());
        }
        return cb;
    }

    public boolean insertarCliente(Cliente cliente) {
        boolean result = false;
        String sql = "INSERT INTO clientes(uuidd,dni,nombre,apellido,telefono,direccion,localidad,fechanacimiento) VALUES (?,?,?,?,?,?,?,?)";
        if (pedirClientePorUuidd(cliente.getUuidd()) == null) {

            try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {

                stmt.setString(1, cliente.getUuidd());
                stmt.setString(2, cliente.getDni());
                stmt.setString(3, cliente.getNombre());
                stmt.setString(4, cliente.getApellido());
                stmt.setInt(5, cliente.getTelefono());
                stmt.setString(6, cliente.getDireccion());
                stmt.setString(7, cliente.getLocalización());
                stmt.setDate(8, Date.valueOf(cliente.getFechaNacimiento()));
                
                int salida = stmt.executeUpdate();
                if (salida != 1) {
                    throw new Exception(" No se ha insertado/modificado un solo registro");
                } else {
                    result = true;
                }

            } catch (SQLException ex) {
                // errores
                System.out.println("SQLException: " + ex.getMessage());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("El cliente ya existe, no se puede crear otro con el mismo UUIDD");
        }

        return result;
    }

    public Cliente pedirClientePorUuidd(String uuidd) {

        Cliente result = null;

        //esta es la sentencia del prepare
        String sql = "SELECT dni,nombre,telefono FROM pacientes WHERE uuidd=?";

        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {

            //en el prepare sustituyo el UUIDD
            stmt.setString(1, uuidd);

            try ( ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    //genero el objeto cliente si existe
                    result = crearCliente(rs);

                } else {
                    System.out.println("Cliente no encontrado...");
                }
            }

        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return result;
    }
    private Cliente crearCliente(final ResultSet rs) throws SQLException {
        return new Cliente(rs.getString("dni"),
                rs.getString("nombre"),
                rs.getString("telefono"),
                rs.getString("nombre"),
                rs.getString("nombre"),
                rs.getString("nombre"),
                rs.getString("nombre"),
                rs.getString("nombre"),
                rs.getString("nombre"),
                rs.getString("nombre"),
                rs.getString("nombre"),);
    }
}
