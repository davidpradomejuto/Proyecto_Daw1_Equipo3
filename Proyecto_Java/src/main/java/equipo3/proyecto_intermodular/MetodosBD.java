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

    public PerfilCliente seleccionPerfil(String uuid) {
        PerfilCliente perfil = null;
        String sql = "SELECT uuid,credenciales,situacion_laboral,estado_civil,morosidad,proceso_judicial,uuid_pareja,en_gananciales FROM perfiles WHERE uuid= ? ";
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

    public PrestamoPreconcedido seleccionPreconcedido(String uuid) {
        PrestamoPreconcedido prestamo = null;
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

    public PrestamoPreconcedido seleccionPreconcedidoPorId(int id) {
        PrestamoPreconcedido prestamo = null;
        String sql = "SELECT id,uuid,fecha_oferta,cantidad,periodo,tipo_interes,plazo_para_aceptar FROM prestamos_preconcedidos WHERE id=?";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setInt(1, id);
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

    public Object[][] consultaClientes() {
        Object[][] obj = null;
        PreparedStatement sentencia;
        try {
            String contador = "Select count(*) from clientes";
            sentencia = getConnection().prepareStatement(contador);
            ResultSet rs = sentencia.executeQuery();
            if (rs.next()) {

                int filas = rs.getInt(1);//devuelve cuantas filas tendra nuestra matriz
                rs.close();
                obj = new Object[filas][8];

                String sql = "SELECT uuid,dni,nombre,apellidos,telefono,direccion,localidad,fecha_nacimiento FROM clientes";
                sentencia = getConnection().prepareStatement(sql);
                rs = sentencia.executeQuery();
                int i = 0;
                while (rs.next()) {
                    obj[i][0] = rs.getString("uuid");
                    obj[i][1] = rs.getString("dni");
                    obj[i][2] = rs.getString("nombre");
                    obj[i][3] = rs.getString("apellidos");
                    obj[i][4] = rs.getString("telefono");
                    obj[i][5] = rs.getString("direccion");
                    obj[i][6] = rs.getString("localidad");
                    obj[i][7] = rs.getString("fecha_nacimiento");
                    i++;
                }
            }
            rs.close();
            sentencia.close();
        } catch (SQLException ex) {
            System.out.println(" error en la consulta de Clientes" + ex.toString());
        }
        return obj;
    }

    public Object[][] consultaClientesAptos() {
        Object[][] obj = null;
        PreparedStatement sentencia;
        Cliente auxCliente = null;
        try {
            String contador = "Select count(*) from clientes";
            sentencia = getConnection().prepareStatement(contador);
            ResultSet rs = sentencia.executeQuery();
            if (rs.next()) {

                int filas = rs.getInt(1);//devuelve cuantas filas tendra nuestra matriz
                rs.close();
                obj = new Object[filas][9];

                String sql = "SELECT uuid,dni,nombre,apellidos,telefono,direccion,localidad,fecha_nacimiento FROM clientes";
                sentencia = getConnection().prepareStatement(sql);
                rs = sentencia.executeQuery();
                int i = 0;
                while (rs.next()) {
                    //genero el objeto del cliente que he recogido para calcular si es apto o no para tener un prestamo
                    auxCliente = crearCliente(rs);
                    double prestamo = MetodosBanco.concesionPrestamo(auxCliente);
                    //si puede obtener un prestamo lo meto en el array
                    if (prestamo > 0) {
                        System.out.println(prestamo);
                    
                    obj[i][0] = (double) prestamo;
                    obj[i][1] = rs.getString("uuid");
                    obj[i][2] = rs.getString("dni");
                    obj[i][3] = rs.getString("nombre");
                    obj[i][4] = rs.getString("apellidos");
                    obj[i][5] = rs.getString("telefono");
                    obj[i][6] = rs.getString("direccion");
                    obj[i][7] = rs.getString("localidad");
                    obj[i][8] = rs.getString("fecha_nacimiento");
                    i++;
                    }
                }
            }
            rs.close();
            sentencia.close();
        } catch (SQLException ex) {
            System.out.println(" error en la consulta de Clientes" + ex.toString());
        }
        return obj;
    }

    public Object[][] consultaClientesNoAptos() {
        Object[][] obj = null;
        PreparedStatement sentencia;
        Cliente auxCliente = null;
        try {
            String contador = "Select count(*) from clientes";
            sentencia = getConnection().prepareStatement(contador);
            ResultSet rs = sentencia.executeQuery();
            if (rs.next()) {

                int filas = rs.getInt(1);//devuelve cuantas filas tendra nuestra matriz
                rs.close();
                obj = new Object[filas][8];

                String sql = "SELECT uuid,dni,nombre,apellidos,telefono,direccion,localidad,fecha_nacimiento FROM clientes";
                sentencia = getConnection().prepareStatement(sql);
                rs = sentencia.executeQuery();
               
                int i = 0;
               
                while (rs.next()) {
                    //genero el objeto del cliente que he recogido para calcular si es apto o no para tener un prestamo
                    auxCliente = crearCliente(rs);
                    double prestamo = MetodosBanco.concesionPrestamo(auxCliente);
                    //si puede obtener un prestamo lo meto en el array
                    if (prestamo == 0) {
                        obj[i][0] = rs.getString("uuid");
                    
                    obj[i][1] = rs.getString("dni");
                    obj[i][2] = rs.getString("nombre");
                    obj[i][3] = rs.getString("apellidos");
                    obj[i][4] = rs.getString("telefono");
                    obj[i][5] = rs.getString("direccion");
                    obj[i][6] = rs.getString("localidad");
                    obj[i][7] = rs.getString("fecha_nacimiento");

                    i++;
                    }
                }
            }
            rs.close();
            sentencia.close();
        } catch (SQLException ex) {
            System.out.println(" error en la consulta de Clientes" + ex.toString());
        }
        return obj;
    }

    public Object[][] consultaClientesPorDni(String dni) {
        Object[][] obj = null;
        PreparedStatement sentencia;
        try {
            String contador = "Select count(*) from clientes";
            sentencia = getConnection().prepareStatement(contador);

            ResultSet rs = sentencia.executeQuery();

            if (rs.next()) {

                int filas = rs.getInt(1);//devuelve cuantas filas tendra nuestra matriz
                rs.close();
                obj = new Object[filas][8];

                String sql = "SELECT uuid,dni,nombre,apellidos,telefono,direccion,localidad,fecha_nacimiento FROM clientes where dni = ?";
                sentencia = getConnection().prepareStatement(sql);
                sentencia.setString(1, dni);
                rs = sentencia.executeQuery();
                int i = 0;
                while (rs.next()) {
                    obj[i][0] = rs.getString("uuid");
                    obj[i][1] = rs.getString("dni");
                    obj[i][2] = rs.getString("nombre");
                    obj[i][3] = rs.getString("apellidos");
                    obj[i][4] = rs.getString("telefono");
                    obj[i][5] = rs.getString("direccion");
                    obj[i][6] = rs.getString("localidad");
                    obj[i][7] = rs.getString("fecha_nacimiento");
                    i++;
                }
            }
            rs.close();
            sentencia.close();
        } catch (SQLException ex) {
            System.out.println(" error en la consulta de Clientes" + ex.toString());
        }
        return obj;
    }

    public Object[][] consultaCuentasPorUUID(String uuid) {
        Object[][] obj = null;
        PreparedStatement sentencia;
        try {
            String contador = "Select count(*) from cuentas_bancarias";
            sentencia = getConnection().prepareStatement(contador);

            ResultSet rs = sentencia.executeQuery();

            if (rs.next()) {

                int filas = rs.getInt(1);//devuelve cuantas filas tendra nuestra matriz
                rs.close();
                obj = new Object[filas][5];

                String sql = "SELECT iban,tipo_cuenta,saldo,nomina_ultimo_mes,nomina_media FROM cuentas_bancarias where id_cliente = ?";
                sentencia = getConnection().prepareStatement(sql);
                sentencia.setString(1, uuid);
                rs = sentencia.executeQuery();
                int i = 0;
                while (rs.next()) {
                    obj[i][0] = rs.getString("iban");
                    obj[i][1] = rs.getString("tipo_cuenta");
                    obj[i][2] = rs.getDouble("saldo");
                    obj[i][3] = rs.getDouble("nomina_ultimo_mes");
                    obj[i][4] = rs.getDouble("nomina_media");
                    i++;
                }
            }
            rs.close();
            sentencia.close();
        } catch (SQLException ex) {
            System.out.println(" error en la consulta de Clientes" + ex.toString());
        }
        return obj;
    }

    public Object[][] consultaPrestamosPreconcedidosPorUUID(String uuid) {
        Object[][] obj = null;
        PreparedStatement sentencia;
        try {
            String contador = "Select count(*)  from prestamos_preconcedidos left join prestamos_concedidos on  prestamos_preconcedidos.id = prestamos_concedidos.id_preconcedido";
            sentencia = getConnection().prepareStatement(contador);

            ResultSet rs = sentencia.executeQuery();

            if (rs.next()) {

                int filas = rs.getInt(1);//devuelve cuantas filas tendra nuestra matriz
                rs.close();
                obj = new Object[filas][7];

                String sql = "select id,uuid,fecha_oferta,cantidad,periodo,tipo_interes,plazo_para_aceptar from prestamos_preconcedidos left join prestamos_concedidos on  prestamos_preconcedidos.id = prestamos_concedidos.id_preconcedido where id_preconcedido is null and uuid = ?;";
                sentencia = getConnection().prepareStatement(sql);
                sentencia.setString(1, uuid);
                rs = sentencia.executeQuery();
                int i = 0;
                while (rs.next()) {
                    obj[i][0] = rs.getString("id");
                    obj[i][1] = rs.getString("uuid");
                    obj[i][2] = rs.getDate("fecha_oferta");
                    obj[i][3] = rs.getInt("cantidad");
                    obj[i][4] = rs.getInt("periodo");
                    obj[i][5] = rs.getDouble("tipo_interes");
                    obj[i][6] = rs.getInt("plazo_para_aceptar");
                    i++;
                }
            }
            rs.close();
            sentencia.close();
        } catch (SQLException ex) {
            System.out.println(" error en la consulta de Clientes" + ex.toString());
        }
        return obj;
    }

    public Object[][] consultaPrestamosConcedidosPorUUID(String uuid) {
        Object[][] obj = null;
        PreparedStatement sentencia;
        try {
            String contador = "Select count(*) from prestamos_concedidos inner join proyecto.prestamos_preconcedidos on  proyecto.prestamos_preconcedidos.id = proyecto.prestamos_concedidos.id_preconcedido where uuid = ?";

            sentencia = getConnection().prepareStatement(contador);

            sentencia.setString(1, uuid);

            ResultSet rs = sentencia.executeQuery();

            if (rs.next()) {

                int filas = rs.getInt(1);//devuelve cuantas filas tendra nuestra matriz
                rs.close();
                obj = new Object[filas][6];

                String sql = "select id_preconcedido,fecha_confirmacion,pago_mensual,cantidad,periodo,tipo_interes from proyecto.prestamos_concedidos "
                        + "inner join proyecto.prestamos_preconcedidos "
                        + "on  proyecto.prestamos_preconcedidos.id = proyecto.prestamos_concedidos.id_preconcedido where uuid = ?";
                sentencia = getConnection().prepareStatement(sql);
                sentencia.setString(1, uuid);
                rs = sentencia.executeQuery();
                int i = 0;
                while (rs.next()) {
                    obj[i][0] = rs.getInt("id_preconcedido");
                    obj[i][1] = rs.getDate("fecha_confirmacion");
                    obj[i][2] = rs.getDouble("pago_mensual");
                    obj[i][3] = rs.getInt("cantidad");
                    obj[i][4] = rs.getInt("periodo");
                    obj[i][5] = rs.getDouble("tipo_interes");
                    i++;
                }
            }
            rs.close();
            sentencia.close();
        } catch (SQLException ex) {
            System.out.println(" error en la consulta de prestamos concedidos " + ex.toString());
        }
        return obj;
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
                System.out.println("SQLException: En metodo insertarCliente  " + ex.getMessage());
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
                System.out.println("SQLException: En metodo insertarPerfil " + ex.getMessage());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("El cliente ya existe, no se puede crear otro con el mismo UUIDD");
        }

        return result;
    }

    public boolean insertarCuenta(CuentaBancaria cuenta) {
        boolean result = false;
        String sql = "INSERT INTO cuentas_bancarias(iban,id_cliente,tipo_cuenta,saldo,nomina_ultimo_mes,nomina_media) VALUES (?,?,?,?,?,?)";
        if (seleccionCuentaBancaria(cuenta.getCliente()) == null) {

            try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {

                stmt.setString(1, cuenta.getIban());
                stmt.setString(2, cuenta.getCliente());
                stmt.setString(3, cuenta.getTipocuenta());
                stmt.setDouble(4, cuenta.getSaldo());
                stmt.setDouble(5, cuenta.getNominaMes());
                stmt.setDouble(6, cuenta.getMediaNomina());

                int salida = stmt.executeUpdate();
                if (salida != 1) {
                    throw new Exception(" No se ha insertado/modificado un solo registro");
                } else {
                    result = true;
                }

            } catch (SQLException ex) {
                // errores
                System.out.println("SQLException: En metodo InsertarCuenta " + ex.getMessage());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("La cuenta ya existe, no se puede crear otra con elmismo UUIDD");
        }

        return result;
    }

    public boolean insertarPreconcedido(PrestamoPreconcedido prestamo) {
        boolean result = false;
        String sql = "INSERT INTO prestamos_preconcedidos(uuid,fecha_oferta,cantidad,periodo,tipo_interes,plazo_para_aceptar) values(?,?,?,?,?,?)";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            System.out.println("Datos del prestamos dado");
            System.out.println(prestamo.toString());

            stmt.setString(1, prestamo.getUuid());
            stmt.setDate(2, Date.valueOf(prestamo.getFechaOferta()));
            stmt.setInt(3, prestamo.getCantidad());
            stmt.setInt(4, prestamo.getPeriodo());
            stmt.setDouble(5, prestamo.getTipoInteres());
            stmt.setInt(6, prestamo.getPlazoParaAceptar());
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha insertado/modificado un solo registro");
            } else {
                result = true;
            }

        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: En metodo insertarPerfil " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }

    public boolean insertarConcedido(PrestamoPreconcedido prestamo) {
        boolean result = false;

        //creo el objeto concedido con los datos recogo del preconcedido
        double cutoaMensual = prestamo.getCantidad() / prestamo.getPeriodo();
        PrestamoConcedido concedido = new PrestamoConcedido(LocalDate.now(), cutoaMensual, prestamo.getId(), null);

        String sql = "INSERT INTO prestamos_concedidos(id_preconcedido,fecha_confirmacion,pago_mensual) values(?,?,?)";
        try ( PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            System.out.println("Datos del prestamos dado");
            System.out.println(prestamo.toString());

            stmt.setInt(1, concedido.getIdPreconcedido());
            stmt.setDate(2, Date.valueOf(concedido.getFechaConfimacion()));
            stmt.setDouble(3, concedido.getPagoMensual());

            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha insertado/modificado un solo registro");
            } else {
                result = true;
            }

        } catch (SQLException ex) {
            // errores
            System.out.println("SQLException: En metodo insertarPerfil " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
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
                seleccionCuentaBancaria(rs.getString("uuid")),
                seleccionPerfil(rs.getString("uuid")));
    }

    private PerfilCliente crearPerfil(final ResultSet rs) throws SQLException {
        return new PerfilCliente(rs.getString("uuid"),
                rs.getString("credenciales"),
                SituacionLaboral.valueOf(rs.getString("situacion_laboral")),
                EstadoCivil.valueOf(rs.getString("estado_civil")),
                rs.getBoolean("morosidad"),
                rs.getBoolean("proceso_judicial"),
                rs.getString("uuid_pareja"),
                rs.getBoolean("en_gananciales"));
    }

    private PrestamoPreconcedido crearPrestamoPreconcedido(final ResultSet rs) throws SQLException {
        return new PrestamoPreconcedido(rs.getInt("id"),
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

    private PrestamoConcedido crearConcedido(final ResultSet rs) throws SQLException {
        return new PrestamoConcedido(
                rs.getDate("fecha_confirmacion").toLocalDate(),
                rs.getDouble("pago_mensual"), rs.getInt("id_preconcedido"), null);
    }

    private PrestamoPreconcedido crearPrecondedido(final ResultSet rs) throws SQLException {
        return new PrestamoPreconcedido(rs.getInt("id"), rs.getString("uuid"),
                rs.getDate("fecha_oferta").toLocalDate(),
                rs.getInt("cantidad"), rs.getInt("periodo"),
                rs.getDouble("tipo_interes"), rs.getInt("plazo_para_aceptar"));
    }

}
