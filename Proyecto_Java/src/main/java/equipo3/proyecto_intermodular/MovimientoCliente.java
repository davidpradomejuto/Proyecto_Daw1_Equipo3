/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo3.proyecto_intermodular;

/**
 *
 * @author DAW209
 */
public class MovimientoCliente {
    private int numOperacion;
    private String emisor;
    private String ibanOrigen;
    private String ibanDestino;
    private double cantidadOperacion;
    private String conceptoOperacion;

    public MovimientoCliente(int numOperacion, String emisor, String ibanOrigen, String ibanDestino, double cantidadOperacion, String conceptoOperacion) {
        this.numOperacion = numOperacion;
        this.emisor = emisor;
        this.ibanOrigen = ibanOrigen;
        this.ibanDestino = ibanDestino;
        this.cantidadOperacion = cantidadOperacion;
        this.conceptoOperacion = conceptoOperacion;
    }

    public int getNumOperacion() {
        return numOperacion;
    }

    public void setNumOperacion(int numOperacion) {
        this.numOperacion = numOperacion;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getIbanOrigen() {
        return ibanOrigen;
    }

    public void setIbanOrigen(String ibanOrigen) {
        this.ibanOrigen = ibanOrigen;
    }

    public String getIbanDestino() {
        return ibanDestino;
    }

    public void setIbanDestino(String ibanDestino) {
        this.ibanDestino = ibanDestino;
    }

    public double getCantidadOperacion() {
        return cantidadOperacion;
    }

    public void setCantidadOperacion(double cantidadOperacion) {
        this.cantidadOperacion = cantidadOperacion;
    }

    public String getConceptoOperacion() {
        return conceptoOperacion;
    }

    public void setConceptoOperacion(String conceptoOperacion) {
        this.conceptoOperacion = conceptoOperacion;
    }

    @Override
    public String toString() {
        return "MovimientosCliente{" + "numOperacion=" + numOperacion + ", emisor=" + emisor + ", ibanOrigen=" + ibanOrigen + ", ibanDestino=" + ibanDestino + ", cantidadOperacion=" + cantidadOperacion + ", conceptoOperacion=" + conceptoOperacion + '}';
    }
}
