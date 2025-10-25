package utp.ac.pa.sistema.domain;

import java.util.List;

public class Administrador extends Usuario {
    private String nivelAcceso;
    private String departamento;
    
    public boolean asignarRuta(Conductor conductor, Ruta ruta) {
        // Lógica de asignación
        return true;
    }
    
    public Reporte generarReporte(String tipoReporte) {
        // Lógica de generación de reportes
        return new Reporte();
    }
    
    // Getters y Setters
    public String getNivelAcceso() { return nivelAcceso; }
    public void setNivelAcceso(String nivelAcceso) { this.nivelAcceso = nivelAcceso; }
    
    @Override
    public boolean login(String usuario, String contraseña) {
        // Lógica de login para administrador
        return true;
    }
    
    @Override
    public void logout() {
        // Lógica de logout
        System.out.println("Administrador " + nombre + " ha cerrado sesión.");
    }
}
