package utp.ac.pa.sistema.domain;

public class Conductor extends Usuario {
    private String licencia;
    private String idEmpleado;
    private int añosExperiencia;
    private boolean estado;
    private String unidadAsignada;

    public Conductor() {
        this.tipoUsuario = "CONDUCTOR";
    }

    // Getters y Setters
    public String getLicencia() { return licencia; }
    public void setLicencia(String licencia) { this.licencia = licencia; }

    public String getIdEmpleado() { return idEmpleado; }
    public void setIdEmpleado(String idEmpleado) { this.idEmpleado = idEmpleado; }

    public int getAñosExperiencia() { return añosExperiencia; }
    public void setAñosExperiencia(int añosExperiencia) { this.añosExperiencia = añosExperiencia; }

    public boolean isEstado() { return estado; }
    public void setEstado(boolean estado) { this.estado = estado; }

    public String getUnidadAsignada() { return unidadAsignada; }
    public void setUnidadAsignada(String unidadAsignada) { this.unidadAsignada = unidadAsignada; }

    // Métodos específicos
    public void manejarUnidad(String unidad) {
        System.out.println("Conductor " + nombre + " manejando unidad: " + unidad);
    }

    public String reportarProblema(String descripcion, String tipo) {
        return "Incidente reportado: " + descripcion + " - Tipo: " + tipo;
    }

    public void consultarHorario() {
        System.out.println("Consultando horario del conductor: " + nombre);
    }

    @Override
    public boolean login(String usuario, String contraseña) {
        // Lógica de autenticación para conductor
        return usuario.equals(this.email) && contraseña.length() >= 6;
    }

    @Override
    public void logout() {
        System.out.println("Conductor " + nombre + " ha cerrado sesión.");
    }
}
