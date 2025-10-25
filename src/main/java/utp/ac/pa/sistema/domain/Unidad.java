package utp.ac.pa.sistema.domain;

public class Unidad {
    private String placa;
    private String modelo;
    private int capacidadPasajeros;
    private String estado;
    private String tipoCombustible;
    private double kilometraje;
    private String conductorAsignado;

    public Unidad() {
        this.estado = "DISPONIBLE";
    }

    // Getters y Setters
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getCapacidadPasajeros() { return capacidadPasajeros; }
    public void setCapacidadPasajeros(int capacidadPasajeros) { this.capacidadPasajeros = capacidadPasajeros; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getTipoCombustible() { return tipoCombustible; }
    public void setTipoCombustible(String tipoCombustible) { this.tipoCombustible = tipoCombustible; }

    public double getKilometraje() { return kilometraje; }
    public void setKilometraje(double kilometraje) { this.kilometraje = kilometraje; }

    public String getConductorAsignado() { return conductorAsignado; }
    public void setConductorAsignado(String conductorAsignado) { this.conductorAsignado = conductorAsignado; }

    // Métodos
    public boolean verificarDisponibilidad() {
        return "DISPONIBLE".equals(estado);
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("Unidad " + placa + " cambió a estado: " + nuevoEstado);
    }

    public boolean asignarConductor(String conductor) {
        if (verificarDisponibilidad()) {
            this.conductorAsignado = conductor;
            this.estado = "ASIGNADA";
            return true;
        }
        return false;
    }

    public void programarMantenimiento() {
        this.estado = "MANTENIMIENTO";
        System.out.println("Unidad " + placa + " programada para mantenimiento.");
    }

    public String verificarEstadoGeneral() {
        return "Unidad: " + placa + " | Estado: " + estado + " | Conductor: " + 
               (conductorAsignado != null ? conductorAsignado : "Sin asignar");
    }
}
