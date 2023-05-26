/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipo3.proyecto_intermodular;

import java.sql.Connection;
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

    public Cliente seleccionCliente(String uuid) {
        Cliente cliente = null;
        String sql = "SELECT UUID,dni,nombre,apellidos,telefono,direccion,localidad,fechaNacimiento FROM clientes WHERE UUID=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, uuid);
            try ( ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    cliente = crearCliente(rs);
                }
            }

        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return cliente;
    }

    private CuentaBancaria seleccionCuentaBancaria(String uuid) {
        CuentaBancaria cuenta = null;
        String sql = "SELECT IBAN,clientes,tipoCuenta,tipoCuenta,saldo,nominaMes,mediaNominaFROM cuentabancarias WHERE UUID=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, uuid);
            try ( ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    cuenta = crearCuenta(rs);
                }
            }

        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return cuenta;

    }

    

    public Cliente pedirClientePorUuidd(String uuidd) {

        Cliente result = null;

        //esta es la sentencia del prepare
        String sql = "SELECT dni,nombre,telefono FROM pacientes WHERE dni=?";

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
        return new Cliente(rs.getString("UUID"),
                rs.getString("dni"),
                rs.getString("nombre"),rs.getString("apellidos"), rs.getInt("telefono"), 
                rs.getString("direccion"), rs.getString("localidad"), rs.getString("fechaNacimiento"),
                seleccionCuentaBancaria(rs.getString("UUID")),null);
    }

    
    //hay que modificar este metodo y donde esta null poner el seleccionCliente(uuid)
    private CuentaBancaria crearCuenta(final ResultSet rs) throws SQLException {
        return new CuentaBancaria(rs.getString("IBAN"),  null,
                rs.getString("tipoCuenta"), rs.getDouble("saldo"), 
                rs.getDouble("nominaMes"), rs.getDouble("mediaNomina"),null
        );
    }
}
