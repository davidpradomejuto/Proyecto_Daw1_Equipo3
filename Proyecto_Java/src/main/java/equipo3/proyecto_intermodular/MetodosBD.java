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
import java.time.LocalDate;
import java.util.LinkedList;

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
        String sql = "SELECT uuid,dni,nombre,apellidos,telefono,direccion,localidad,fecha_nacimiento FROM clientes WHERE uuid=?";
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
    
    public Cliente seleccionClientePorDni(String dni) {
        Cliente cliente = null;
        String sql = "SELECT uuid,dni,nombre,apellidos,telefono,direccion,localidad,fecha_nacimiento FROM clientes WHERE dni = ?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, dni);
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
        String sql = "SELECT iban,id_cliente,tipo_cuenta,saldo,nomina_ultimo_mes,nomina_media FROM cuentas_bancarias WHERE id_cliente=?";
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
    
    private PerfilCliente seleccionPerfil(String uuid) {
        PerfilCliente perfil = null;
        String sql = "SELECT uuid,credenciales,estado_civil,situacion_laboral,morosidad,proceso_judicial,uuid_pareja,en_gananciales FROM perfiles WHERE uuid=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, uuid);
            try ( ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    perfil = crearPerfil(rs);
                }
            }

        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return perfil;
    }
    
    private PrestamoPrecondedido seleccionPreconcedido(String uuid) {
        PrestamoPrecondedido prestamo = null;
        String sql = "SELECT id,uuid,fecha_oferta,cantidad,periodo,tipo_interes,plazo_para_aceptar FROM prestamos_preconcedidos WHERE uuid=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, uuid);
            try ( ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    prestamo = crearPrestamoPreconcedido(rs);
                }
            }

        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: " + ex.getMessage());
        }
        return prestamo;
    }


    public boolean insertarCliente(Cliente cliente) {
        boolean result = false;
        String sql = "INSERT INTO clientes(uuid,dni,nombre,apellidos,telefono,direccion,localidad,fecha_nacimiento) VALUES (?,?,?,?,?,?,?,?)";
        if (seleccionCliente(cliente.getUuidd()) == null) {

            try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {

                stmt.setString(1, cliente.getUuidd());
                stmt.setString(2, cliente.getDni());
                stmt.setString(3, cliente.getNombre());
                stmt.setString(4, cliente.getApellido());
                stmt.setInt(5, cliente.getTelefono());
                stmt.setString(6, cliente.getDireccion());
                stmt.setString(7, cliente.getLocalidad());
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
    
    public boolean insertarPerfil(PerfilCliente perfil) {
        boolean result = false;
        String sql = "INSERT INTO perfiles(uuid,credenciales,estado_civil,situacion_laboral,morosidad,proceso_judicial,uuid_pareja,en_gananciales) VALUES (?,?,?,?,?,?,?,?)";
        if (seleccionPerfil(perfil.getUuid()) == null) {

            try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {

                stmt.setString(1, perfil.getUuid());
                stmt.setString(2, perfil.getCredenciales());
                stmt.setString(3, String.valueOf(perfil.getEstadoCivil()));
                stmt.setString(4, String.valueOf(perfil.getSituacionLaboral()));
                stmt.setBoolean(5, perfil.isMorosidad());
                stmt.setBoolean(6, perfil.isProcesoJudicial());
                stmt.setString(7, perfil.getUuidPareja());
                stmt.setBoolean(8, perfil.isEnGananciales());

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

    public LinkedList ListarCliente(Cliente cliente) {

        LinkedList<Cliente> lista = new LinkedList();

        // dentro de executeQuery Codigo de la select
        String sql = "select uuid,dni,nombre,apellidos,telefono,direccion,localidad,fecha_nacimiento from clientes";

        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, cliente.getDni());

            try ( ResultSet rs = stmt.executeQuery();) {

                //mientras en el resultado de la sentencia queden registros los vas guardando en la lista
                while (rs.next()) {
                    //creo el objeto y lo guardo
                    Cliente clienteAux = crearCliente(rs);
                    if (!lista.add(clienteAux)) {
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

    private Cliente crearCliente(final ResultSet rs) throws SQLException {
        return new Cliente(rs.getString("uuid"),
                rs.getString("dni"),
                rs.getString("nombre"), rs.getString("apellidos"), rs.getInt("telefono"),
                rs.getString("direccion"), rs.getString("localidad"),
                rs.getDate("fecha_nacimiento").toLocalDate(),
                seleccionCuentaBancaria(rs.getString("uuid")), seleccionPerfil(rs.getString("uuid")));
    }

    private PerfilCliente crearPerfil(final ResultSet rs) throws SQLException {
        return new PerfilCliente(rs.getString("uuid"),
                rs.getString("credenciales"),
                SituacionLaboral.valueOf(rs.getString("estado_civil")),
                EstadoCivil.valueOf(rs.getString("situacion_laboral")),
                rs.getBoolean("morosidad"),
                rs.getBoolean("proceso_judicial"), rs.getString("uuid_pareja"), rs.getBoolean("en_ganaciales"));
    }

    private PrestamoPrecondedido crearPrestamoPreconcedido(final ResultSet rs) throws SQLException {
        return new PrestamoPrecondedido(rs.getInt("id"),
                rs.getString("uuid"),
                rs.getDate("fecha_oferta").toLocalDate(),
                rs.getInt("cantidad"), rs.getInt("periodo"),
                rs.getDouble("tipo_interes"), rs.getInt("plazo_para_aceptar"));
    }

    //hay que modificar este metodo y donde esta null poner el seleccionCliente(uuid)
    private CuentaBancaria crearCuenta(final ResultSet rs) throws SQLException {
        return new CuentaBancaria(rs.getString("iban"), rs.getString("id_cliente"),
                rs.getString("tipo_cuenta"), rs.getDouble("saldo"),
                rs.getDouble("nomina_ultimo_mes"), rs.getDouble("nomina_media"), null
        );
    }
}
