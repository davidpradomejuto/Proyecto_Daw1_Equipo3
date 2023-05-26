/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipo3.proyecto_intermodular;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author DAW118
 */
public class MetodosBD {

    public Cliente seleccionCliente(String UUID) {
        Cliente p = null;
        String sql = "Select UUID,dni,nombre,apellidos,telefono,direccion,localidad,fechaNacimiento from clientes where UUID=?";
        try ( PreparedStatement sentencia = conn.prepareStatement(sql);) {
            sentencia.setString(1, UUID);
            try ( ResultSet rs = sentencia.executeQuery();) {
                if (rs.next()) {
     
                    p = new Cliente(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7),sqlDate.toLocalDate(rs.getDate(8)),null,null);
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

}
