package utp.ac.pa.sistema.domain;

import java.util.Date;

public class Incidente {
    private String idIncidente;
    private String descripcion;
    private String tipo;
    private Date fechaReporte;
    private String estado;
    private String conductorReporta;
    private String unidadInvolucrada;
    private String rutaAfectada;

    public Incidente() {
        this.fechaReporte = new Date();
        this.estado = "REPORTADO";
    }

    // Getters y Setters
    public String getIdIncidente() { return idIncidente; }
    public void setIdIncidente(String idIncidente) { this.idIncidente = idIncidente; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public Date getFechaReporte() { return fechaReporte; }
    public void setFechaReporte(Date fechaReporte) { this.fechaReporte = fechaReporte; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getConductorReporta() { return conductorReporta; }
    public void setConductorReporta(String conductorReporta) { this.conductorReporta = conductorReporta; }

    public String getUnidadInvolucrada() { return unidadInvolucrada; }
    public void setUnidadInvolucrada(String unidadInvolucrada) { this.unidadInvolucrada = unidadInvolucrada; }

    public String getRutaAfectada() { return rutaAfectada; }
    public void setRutaAfectada(String rutaAfectada) { this.rutaAfectada = rutaAfectada; }

    // Métodos
    public void reportarIncidente(String descripcion, String tipo) {
        this.descripcion = descripcion;
        this.tipo = tipo;
        System.out.println("Incidente reportado: " + descripcion);
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("Incidente " + idIncidente + " actualizado a: " + nuevoEstado);
    }

    public String generarReporteDetallado() {
        return "INCIDENTE: " + idIncidente + 
               "\nTipo: " + tipo + 
               "\nDescripción: " + descripcion + 
               "\nConductor: " + conductorReporta + 
               "\nUnidad: " + unidadInvolucrada + 
               "\nEstado: " + estado + 
               "\nFecha: " + fechaReporte;
    }

    public String asignarPrioridad() {
        switch(tipo.toUpperCase()) {
            case "ACCIDENTE": return "ALTA";
            case "FALLA_MECANICA": return "MEDIA";
            default: return "BAJA";
        }
    }

    public void notificarAdministrador() {
        System.out.println("Notificando administrador sobre incidente: " + idIncidente);
    }

    public long calcularTiempoResolucion() {
        Date ahora = new Date();
        long diff = ahora.getTime() - fechaReporte.getTime();
        return diff / (60 * 1000); // diferencia en minutos
    }
}
