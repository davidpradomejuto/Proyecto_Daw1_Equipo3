/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio1;

import java.io.Serializable;

/**
 *
 * @author DAW118
 */
public class Factura implements Serializable {
    private int nFactura;
    private String nombreCliente;
    private double importe;
    private boolean pagado;

    public Factura(int nFactura, String nombreCliente, double importe, boolean pagado) {
        this.nFactura = nFactura;
        this.nombreCliente = nombreCliente;
        this.importe = importe;
        this.pagado = pagado;
    }

    public Factura() {
        this.nFactura = Teclado.pedirIntPositivo("Introduce el numero de factura...");
        this.nombreCliente = Teclado.pedirNombre("Introduce el nombre del cliente...");
        this.importe = Teclado.pedirDouble("introduce el importe...");
        this.pagado = Teclado.introBoolean("Introduce si esta pagado (S/N)...");
    }
    
    

    public int getnFactura() {
        return nFactura;
    }

    public void setnFactura(int nFactura) {
        this.nFactura = nFactura;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Factura{" + "nFactura=" + nFactura + ", nombreCliente=" + nombreCliente + ", importe=" + importe + "€ , pagado=" + pagado + '}';
    }
    
    
    
    
    
    
}
