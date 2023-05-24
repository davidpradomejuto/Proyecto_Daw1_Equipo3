/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */
public class MetodosDB {

    // metodo privado que nos devuelve la conexión
    private Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }

    //consultar una actividad,,mostrar el nombe de las actividades, selecciona una actividad y a continuación mostramos el horario de la
    //actividad, el número de plazas libres que quedan y los participantes en la actividad.
    public List<Actividad> listarActividades() {
        List<Actividad> actividades = new ArrayList<>();
        try ( Statement stmt = getConnection().createStatement();  ResultSet rs = stmt.executeQuery("SELECT id,nombre,plazasLibres,dia,hora FROM actividades");) {
            while (rs.next()) {
                Actividad actividad = crearActividad(rs);
                if (!actividades.add(actividad)) {
                    throw new Exception("error no se ha insertado el objeto en la colección");
                }
            }

        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return actividades;
    }

    public Actividad listarActividadPorId(int id) {
        Actividad actividad = null;
        String sql = "SELECT id,nombre,plazasLibres,dia,hora FROM actividades where id = ?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setInt(1, id);
            try ( ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    actividad = crearActividad(rs);
                }
            }
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return actividad;
    }

    public List<Participante> listarParticipantesPorActividad(int idActividad) {
        List<Participante> participantes = new ArrayList<>();
        String sql = "SELECT dni,nombre,idActividad FROM participantes where idActividad = ?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setInt(1, idActividad);
            try ( ResultSet rs = stmt.executeQuery();) {

                //mientras en el resultado de la sentencia queden registros los vas guardando en la lista
                while (rs.next()) {
                    //creo el objeto y lo guardo
                    Participante participante = crearParticipante(rs);
                    if (!participantes.add(participante)) {
                        throw new Exception("error no se ha insertado el objeto en la colección");
                    }
                }
            }
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return participantes;
    }

    public Participante listarParticipantePorDNI(String dni) {
        Participante participante = null;
        String sql = "SELECT dni,nombre,idActividad FROM participantes where dni = ?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, dni);
            try ( ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    participante = crearParticipante(rs);
                }
            }

        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return participante;
    }

    public boolean eliminarParticipante(int dni) {
        boolean borrado = false;
        String sql = "DELETE FROM participantes WHERE dni = ?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setInt(1, dni);
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha borrado un solo registro");
            } else {
                borrado = true;
            }
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return borrado;
    }

    public void insertarParticipante(Participante participante) {
        String sql = null;
        sql = "INSERT INTO participantes(dni,nombre,idActividad) VALUES (?,?,?)";

        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {

            stmt.setString(1, participante.getDni());
            stmt.setString(2, participante.getNombre());
            stmt.setInt(3, participante.getIdActividad());
            
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha insertado un solo registro");
            }else{
                System.out.println("Participante insertado");
            }

        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void eliminar(String dni) {

        String sql = "DELETE FROM participantes WHERE dni=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, dni);
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha borrado un solo registro");
            }
        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private Actividad crearActividad(final ResultSet rs) throws SQLException {
        return new Actividad(rs.getInt("id"),
                rs.getString("nombre"),
                rs.getInt("plazasLibres"),
                rs.getString("dia"),
                rs.getString("hora"));
    }

    private Participante crearParticipante(final ResultSet rs) throws SQLException {
        return new Participante(rs.getString("dni"),
                rs.getString("nombre"),
                rs.getInt("idActividad"));
    }
}
