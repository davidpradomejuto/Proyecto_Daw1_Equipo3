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
 * @author DAW107
 */
public class MetodosBanco {

    public Cliente seleccionCliente(String dni) {
        Cliente p = null;
        String sql = "Select UUID,dni,nombre,apellidos,telefono,direccion,localidad,fechaNacimiento from clientes where dni=?";
        try ( PreparedStatement sentencia = conn.prepareStatement(sql);) {
            sentencia.setString(1, dni);
            try ( ResultSet rs = sentencia.executeQuery();) {
                if (rs.next()) {
                    String uuid = rs.getString(1);
                    p = new Cliente(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getDate(8),);
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
                    
                    cb = new CuentaBancaria(rs.getString(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getDouble(5),rs.getDouble(6),);
                }
            }
        } catch (SQLException e) {
            System.out.println("error al consultar seleccion de cuenta bancaria del cliente" + e.toString());
        }
    }

    public double concesionPrestamo(Cliente cliente) {
        double prestamo = 0;
        if (cliente.getPerfil().isMorosidad() || cliente.getPerfil().isProcesoJudicial()) {
            System.out.println("No se puede realizar prestamos al cliente\n"
                    + "Cliente con problemas judiciales o casos de morosidad");
        } else {
            if (cliente.getPerfil().getSituacionLaboral().equals(SituacionLaboral.desempleado)
                    || cliente.getPerfil().getSituacionLaboral().equals(SituacionLaboral.estudiante)
                    || cliente.getPerfil().getSituacionLaboral().equals(SituacionLaboral.responsable_del_hogar)) {

                if (!cliente.getPerfil().isEnGananciales()) {
                    System.out.println("No se puede realizar prestamos al cliente\n"
                            + "Cliente ...");
                } else {
                    // comprobar si el cónyuge está cliente...
                }
            } else {
                double mediaNominas = cliente.getCuentaBancaria().getMediaNomina();
                double nominaMes = cliente.getCuentaBancaria().getNominaMes();
                if (mediaNominas < 1000) {
                    System.out.println("No se puede realizar prestamos al cliente\n"
                            + "No posee el minimo mensual de capital suficiente para el prestamo");
                } else if ((mediaNominas >= 1000 && mediaNominas <= 2000) && (nominaMes >= 1000 && nominaMes <= 2000)) {
                    prestamo = 5000;
                } else if (mediaNominas >= 2000 && mediaNominas <= 3000) {
                    prestamo = 10000;
                } else if (mediaNominas > 3000) {
                    prestamo = 15000;
                }
            }
        }
        return prestamo;
    }
}
