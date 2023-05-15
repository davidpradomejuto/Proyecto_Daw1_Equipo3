/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DAW118
 */
public class MetodosDB {

    // metodo privado que nos devuelve la conexión
    private Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }

    public boolean insertarPaciente(Paciente paciente) {
        boolean result = false;
        String sql = "INSERT INTO pacientes(dni,nombre,telefono) VALUES (?,?,?)";
        if (pedirPacientePorDni(paciente.getDni()) == null) {

            try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {

                stmt.setString(1, paciente.getDni());
                stmt.setString(2, paciente.getNombre());
                stmt.setString(3, paciente.getTelefono());

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
            System.out.println("El paciente ya existe, no se puede crear otro con el mismo DNI");
        }

        return result;
    }

    public Paciente pedirPacientePorDni(String dni) {

        Paciente result = null;

        //esta es la sentencia del prepare
        String sql = "SELECT dni,nombre,telefono FROM pacientes WHERE dni=?";

        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {

            //en el prepare sustituyo el DNI
            stmt.setString(1, dni);

            try ( ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    //genero el objeto paciente si existe
                    result = crearPaciente(rs);

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

    public boolean insertarVisita(Visita visita) {
        boolean result = false;

        String sql = "INSERT INTO visitas (dni,fecha,tratamiento,observaciones) VALUES (?,?,?,?)";

        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {

            stmt.setString(1, visita.getDni());
            stmt.setDate(2, Date.valueOf(visita.getFecha()));
            stmt.setString(3, visita.getTratamiento());
            stmt.setString(4, visita.getTratamiento());

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

        return result;
    }

    public ArrayList<Visita> ListarDia() {

        ArrayList lista = new ArrayList<Visita>();

        LocalDate fechaBuscada = Teclado.pedirFechaDDMMYYY();
        // dentro de executeQuery Codigo de la select
        String sql = "select id,dni,fecha,tratamiento, observaciones from visitas where fecha = ?";

        
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setDate(1, Date.valueOf(fechaBuscada));

            try ( ResultSet rs = stmt.executeQuery();) {
                
                //mientras en el resultado de la sentencia queden registros los vas guardando en la lista
                while (rs.next()) {
                    //creo el objeto y lo guardo
                    Visita visitaAux = crearVisita(rs);
                    if (!lista.add(visitaAux)) {
                        throw new Exception("error no se ha insertado el objeto en la colección");
                    }
                }
                
            }

        } catch (SQLException ex) {
            System.out.println("Error en la consulta " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return lista;

    }

    public LinkedList ListarPaciente(Paciente paciente) {
        
        LinkedList lista = new LinkedList();
        
        // dentro de executeQuery Codigo de la select
        String sql = "select id,dni,fecha,tratamiento, observaciones from visitas where dni = ? order by fecha asc";

        
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, paciente.getDni());

            try ( ResultSet rs = stmt.executeQuery();) {
                
                //mientras en el resultado de la sentencia queden registros los vas guardando en la lista
                while (rs.next()) {
                    //creo el objeto y lo guardo
                    Visita visitaAux = crearVisita(rs);
                    if (!lista.add(visitaAux)) {
                        throw new Exception("error no se ha insertado el objeto en la colección");
                    }
                }
                
            }

        } catch (SQLException ex) {
            System.out.println("Error en la consulta " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return lista;
        
    }

    private Visita crearVisita(final ResultSet rs) throws SQLException {
        return new Visita(rs.getInt("id"),
                rs.getString("dni"),
                rs.getDate("fecha").toLocalDate(),
                rs.getString("tratamiento"),
                rs.getString("observaciones"));
    }

    private Paciente crearPaciente(final ResultSet rs) throws SQLException {
        return new Paciente(rs.getString("dni"),
                rs.getString("nombre"),
                rs.getString("telefono"));
    }

}
