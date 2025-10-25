package utp.ac.pa.sistema.domain;

import java.sql.Time;

public class Horario {
    private String idHorario;
    private Time horaSalida;
    private Time horaLlegada;
    private String diaSemana;
    private String frecuencia;
    private String rutaAsociada;
    private String unidadAsignada;

    // Getters y Setters
    public String getIdHorario() { return idHorario; }
    public void setIdHorario(String idHorario) { this.idHorario = idHorario; }

    public Time getHoraSalida() { return horaSalida; }
    public void setHoraSalida(Time horaSalida) { this.horaSalida = horaSalida; }

    public Time getHoraLlegada() { return horaLlegada; }
    public void setHoraLlegada(Time horaLlegada) { this.horaLlegada = horaLlegada; }

    public String getDiaSemana() { return diaSemana; }
    public void setDiaSemana(String diaSemana) { this.diaSemana = diaSemana; }

    public String getFrecuencia() { return frecuencia; }
    public void setFrecuencia(String frecuencia) { this.frecuencia = frecuencia; }

    public String getRutaAsociada() { return rutaAsociada; }
    public void setRutaAsociada(String rutaAsociada) { this.rutaAsociada = rutaAsociada; }

    public String getUnidadAsignada() { return unidadAsignada; }
    public void setUnidadAsignada(String unidadAsignada) { this.unidadAsignada = unidadAsignada; }

    // Métodos
    public boolean verificarDisponibilidad() {
        // Lógica simple de verificación
        return unidadAsignada != null && rutaAsociada != null;
    }

    public void ajustarHorario(Time nuevaHoraSalida) {
        this.horaSalida = nuevaHoraSalida;
        // Ajustar hora de llegada automáticamente
        long nuevosMs = nuevaHoraSalida.getTime() + (2 * 60 * 60 * 1000); // +2 horas
        this.horaLlegada = new Time(nuevosMs);
    }

    public String obtenerFrecuencia() {
        return frecuencia;
    }

    public void asignarRuta(String ruta) {
        this.rutaAsociada = ruta;
    }

    public boolean verificarConflicto(Horario otroHorario) {
        return this.diaSemana.equals(otroHorario.diaSemana) &&
               this.horaSalida.equals(otroHorario.horaSalida);
    }

    public int calcularDuracion() {
        if (horaSalida != null && horaLlegada != null) {
            long diff = horaLlegada.getTime() - horaSalida.getTime();
            return (int) (diff / (60 * 1000)); // diferencia en minutos
        }
        return 0;
    }
}
