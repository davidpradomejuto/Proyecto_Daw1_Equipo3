/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package bd.ejemplo03;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author cic
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        try ( Connection conn = AccesoBaseDatos.getInstance().getConn()) {
            // de la interfaz
            Repositorio<Producto> repositorio = new ProductoDAOImp();
            // funcional
            System.out.println("Listar los productos programacion Funcional");
            repositorio.listar().forEach(System.out::println);
            
            // programacion
        
            List<Producto> productos = repositorio.listar();
            if (productos.isEmpty()) {
                System.out.println("NO hay productos en la base de datos");
            } else {
                System.out.println("Listar de nuevo los productos");
                for (Producto produ : productos) {
                    System.out.println(produ.toString());

                }
            }
            
            // listar un producto por ejemplo el 13
            System.out.println("Listar producto con id= 13 es "+repositorio.porId(13));
            // probamos insertar 
            System.out.println("Probamos insertar un producto");
            Producto producto=new Producto();
            repositorio.guardar(producto);
            System.out.println("Probamos a modificar el producto de id=13");
            // primero recuperamos el producto
            Producto produAux=repositorio.porId(13);
            // modificamos el nombre del producto
            produAux.setNombre("cambiado nombre");
            repositorio.guardar(produAux);
            System.out.println("Mostramos el producto 13 una vez cambiado"+repositorio.porId(13));
            // borramos el producto 13
            System.out.println("eliminamos el producto 13");
            repositorio.eliminar(13);
            // listamos lo que al final queda en base de datos
                for (Producto produ : repositorio.listar()) {
                    System.out.println(produ.toString());

                }

        } catch (SQLException ex) {
            System.out.println("error sql" + ex.getMessage());
        }
    }
}
