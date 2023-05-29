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


    public static double concesionPrestamo(Cliente cliente) {
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
                    // comprobar si el cónyuge es cliente...
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
