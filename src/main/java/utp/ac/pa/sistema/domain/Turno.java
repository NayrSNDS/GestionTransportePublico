package utp.ac.pa.sistema.domain;

import java.sql.Time;
import java.util.Date;

public class Turno {
    private String idTurno;
    private String tipo;
    private Time horaInicio;
    private Time horaFin;
    private String conductorAsignado;
    private String unidadAsignada;
    private Date fecha;
    private String estado;

    public Turno() {
        this.estado = "PENDIENTE";
        this.fecha = new Date();
    }

    // Getters y Setters
    public String getIdTurno() { return idTurno; }
    public void setIdTurno(String idTurno) { this.idTurno = idTurno; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public Time getHoraInicio() { return horaInicio; }
    public void setHoraInicio(Time horaInicio) { this.horaInicio = horaInicio; }

    public Time getHoraFin() { return horaFin; }
    public void setHoraFin(Time horaFin) { this.horaFin = horaFin; }

    public String getConductorAsignado() { return conductorAsignado; }
    public void setConductorAsignado(String conductorAsignado) { this.conductorAsignado = conductorAsignado; }

    public String getUnidadAsignada() { return unidadAsignada; }
    public void setUnidadAsignada(String unidadAsignada) { this.unidadAsignada = unidadAsignada; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    // Métodos
    public void asignarConductor(String conductor) {
        this.conductorAsignado = conductor;
        this.estado = "ASIGNADO";
    }

    public boolean verificarSuperposicion(Turno otroTurno) {
        return this.fecha.equals(otroTurno.fecha) &&
               this.conductorAsignado.equals(otroTurno.conductorAsignado) &&
               this.horaInicio.before(otroTurno.horaFin) &&
               this.horaFin.after(otroTurno.horaInicio);
    }

    public String getTipoTurno() {
        return tipo;
    }

    public boolean validarAsignacion() {
        return conductorAsignado != null && unidadAsignada != null;
    }

    public void finalizarTurno() {
        this.estado = "FINALIZADO";
        System.out.println("Turno " + idTurno + " finalizado.");
    }

    public String generarReporteTurno() {
        return "Reporte Turno: " + idTurno + " | Conductor: " + conductorAsignado + 
               " | Unidad: " + unidadAsignada + " | Estado: " + estado;
    }
}
