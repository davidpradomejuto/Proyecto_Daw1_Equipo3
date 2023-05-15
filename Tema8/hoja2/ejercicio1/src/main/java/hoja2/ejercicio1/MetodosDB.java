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
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class MetodosDB {

    public static void insertarPaciente() {
        PreparedStatement ps = null;
        Connection conn = AccesoBaseDatos.getInstance().getConn();
        String sql = "INSERT INTO pacientes (dni,nombre,telefono) VALUES (?,?,?)";

        try {
            ///recogo los datos que quiero sustituir
            System.out.println("Introduce los datos del paciente que quieres añadir....");
            String dni = Teclado.pedirDNIRegex("Intoduce el DNI del paciente....");
            String nombre = Teclado.pedirNombre("Introduce el nombre del paciente....");
            String telefono = String.valueOf(Teclado.pedirTlf("Introduce el telefono del paciente..."));

            //creo el prepare
            ps = conn.prepareStatement(sql);

            //sustituyo los valores
            ps.setString(1, dni);
            ps.setString(2, nombre);
            ps.setString(3, telefono);

            //ejecuto la sentencia
            int salida = ps.executeUpdate();

            //si la salida es 1 significica que se ha insertado
            if (salida == 1) {
                System.out.println("Ha sido insertado el paciente");
            } else {
                throw new Exception("Error no se ha realizado la inserción");
            }

        } catch (SQLException ex) {
            System.out.println("Error en la inserción de datos " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                //cierro la prepare
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la sentencia ");
            }
        }
    }

    public static Paciente pedirPacientePorDni(String dni) {
        Connection conn = AccesoBaseDatos.getInstance().getConn();

        Paciente result = null;

        String sql = "SELECT dni,nombre,telefono FROM pacientes  WHERE dni=?";

        try ( PreparedStatement stmt = conn.prepareStatement(sql);) {

            stmt.setString(1, dni);
            try ( ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    result = new Paciente(rs.getString("dni"), rs.getString("nombre"), rs.getString("telefono"));
                } else {
                    System.out.println("Paciente no encontrado...");
                }
            }

        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return result;
    }

    public static void insertarVisita() {
        PreparedStatement ps = null;
        Connection conn = AccesoBaseDatos.getInstance().getConn();
        String sql = "INSERT INTO visitas (dni,fecha,tratamiento,observaciones) VALUES (?,?,?,?)";
        try {

            Paciente aux = pedirPacientePorDni(Teclado.pedirDNIRegex("introduce el DNI del paciente al que quieras añadir la visita...."));
            if (aux != null) {
                String dni = Teclado.pedirDNIRegex("introduce el DNI del paciente al que quieras añadir la visita....");
                LocalDate fecha = Teclado.pedirFechaDDMMYYYMayorQueHoy();
                System.out.println("Introduce el tratamiento...");
                String tratamiento = new Scanner(System.in).nextLine();
                System.out.println("Introduce las observaciones...");
                String observaciones = new Scanner(System.in).nextLine();

                //creo el prepare
                ps = conn.prepareStatement(sql);

                //sustituyo los valores
                ps.setString(1, dni);
                ps.setString(2, fecha.toString());
                ps.setString(3, tratamiento);
                ps.setString(4, observaciones);

                //ejecuto la sentencia
                int salida = ps.executeUpdate();

                //si la salida es 1 significica que se ha insertado
                if (salida == 1) {
                    System.out.println("Ha sido insertado la visita");
                } else {
                    throw new Exception("Error no se ha realizado la inserción");
                }

            } else {
                boolean opcion = Teclado.introBoolean("Quieres insertar el paciente?");
                if (opcion) {
                    insertarPaciente();
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error en la inserción de datos " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                //cierro la prepare
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la sentencia ");
            }
        }
    }

    public static void ListarDia() {
        LocalDate fechaBuscada = Teclado.pedirFechaDDMMYYY();
        // dentro de executeQuery Codigo de la select
        String sql = "select id,nombre,cantidad from productos";
        Connection conn = AccesoBaseDatos.getInstance().getConn();
        try (
                 Statement sentencia = conn.createStatement();  ResultSet rs = sentencia.executeQuery(sql);) {
            while (rs.next()) {
//cada columna se indica, el tipo en el get, y que posicion o
//que nombre tiene en el argumento
                System.out.print(rs.getInt(1) + " ");
                System.out.print(rs.getString("nombre") + " ");
                System.out.println(rs.getInt(3));
            }
        } catch (SQLException ex) {
            System.out.println("Error en la consulta " + ex.getMessage());
        }

    }

    public static void ListarPaciente(Paciente paciente) {

    }

}
