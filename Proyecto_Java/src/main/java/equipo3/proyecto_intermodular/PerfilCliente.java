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
public class PerfilCliente {
    private Cliente cliente;
    private String credenciales;
    private SituacionLaboral situacionLaboral;
    private EstadoCivil estadoCivil;
    private boolean morosidad;
    private boolean procesoJudicial;
    private String Pareja;
    private boolean enGananciales;

    public PerfilCliente(Cliente cliente, String credenciales, SituacionLaboral situacionLaboral, EstadoCivil estadoCivil, boolean morosidad,
        boolean procesoJudicial, String Pareja, boolean enGananciales) {
        this.cliente = cliente;
        this.credenciales = credenciales;
        this.situacionLaboral = situacionLaboral;
        this.estadoCivil = estadoCivil;
        this.morosidad = morosidad;
        this.procesoJudicial = procesoJudicial;
        this.Pareja = Pareja;
        this.enGananciales = enGananciales;
    }

    public Cliente getUuid() {
        return cliente;
    }

    public void setUuid(Cliente uuid) {
        this.cliente = uuid;
    }

    public String getCredenciales() {
        return credenciales;
    }

    public void setCredenciales(String credenciales) {
        this.credenciales = credenciales;
    }

    public SituacionLaboral getSituacionLaboral() {
        return situacionLaboral;
    }

    public void setSituacionLaboral(SituacionLaboral situacionLaboral) {
        this.situacionLaboral = situacionLaboral;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public boolean isMorosidad() {
        return morosidad;
    }

    public void setMorosidad(boolean morosidad) {
        this.morosidad = morosidad;
    }

    public boolean isProcesoJudicial() {
        return procesoJudicial;
    }

    public void setProcesoJudicial(boolean procesoJudicial) {
        this.procesoJudicial = procesoJudicial;
    }

    public String getUuidPareja() {
        return Pareja;
    }

    public void setUuidPareja(String uuidPareja) {
        this.Pareja = uuidPareja;
    }

    public boolean isEnGananciales() {
        return enGananciales;
    }

    public void setEnGananciales(boolean enGananciales) {
        this.enGananciales = enGananciales;
    }

    @Override
    public String toString() {
        return "PerfilCliente{"  + ", credenciales=" + credenciales + ", situacionLaboral=" + situacionLaboral.name() + ", estadoCivil=" + estadoCivil.name() + ", morosidad=" + morosidad + ", procesoJudicial=" + procesoJudicial + "enGananciales=" + enGananciales + '}';
    }
}
