package utp.ac.pa.sistema.domain;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Reporte {
    private String idReporte;
    private Date fechaGeneracion;
    private String tipoReporte;
    private Map<String, Object> datos;
    private String periodo;
    private String administradorGenera;

    public Reporte() {
        this.fechaGeneracion = new Date();
        this.datos = new HashMap<>();
    }

    // Getters y Setters
    public String getIdReporte() { return idReporte; }
    public void setIdReporte(String idReporte) { this.idReporte = idReporte; }

    public Date getFechaGeneracion() { return fechaGeneracion; }
    public void setFechaGeneracion(Date fechaGeneracion) { this.fechaGeneracion = fechaGeneracion; }

    public String getTipoReporte() { return tipoReporte; }
    public void setTipoReporte(String tipoReporte) { this.tipoReporte = tipoReporte; }

    public Map<String, Object> getDatos() { return datos; }
    public void setDatos(Map<String, Object> datos) { this.datos = datos; }

    public String getPeriodo() { return periodo; }
    public void setPeriodo(String periodo) { this.periodo = periodo; }

    public String getAdministradorGenera() { return administradorGenera; }
    public void setAdministradorGenera(String administradorGenera) { this.administradorGenera = administradorGenera; }

    // Métodos
    public void generarReporteVentas(String periodo) {
        this.tipoReporte = "VENTAS";
        this.periodo = periodo;
        datos.put("totalVentas", 15000.0);
        datos.put("boletosVendidos", 300);
        datos.put("rutaMasPopular", "Ruta A - Centro");
        System.out.println("Reporte de ventas generado para: " + periodo);
    }

    public void generarReporteIncidentes() {
        this.tipoReporte = "INCIDENTES";
        datos.put("totalIncidentes", 12);
        datos.put("incidentesResueltos", 8);
        datos.put("tipoMasFrecuente", "Retraso");
        System.out.println("Reporte de incidentes generado.");
    }

    public void exportarPDF() {
        System.out.println("Exportando reporte " + idReporte + " a PDF...");
    }

    public void filtrarDatos(String[] filtros) {
        System.out.println("Aplicando filtros al reporte: " + String.join(", ", filtros));
    }

    public Map<String, Object> calcularMetricas() {
        Map<String, Object> metricas = new HashMap<>();
        metricas.put("eficiencia", 85.5);
        metricas.put("satisfaccion", 90.0);
        metricas.put("puntualidad", 78.2);
        return metricas;
    }

    public Map<String, Object> compararPeriodos(String periodoAnterior) {
        Map<String, Object> comparacion = new HashMap<>();
        comparacion.put("crecimientoVentas", 15.2);
        comparacion.put("reduccionIncidentes", -8.5);
        comparacion.put("mejoraPuntualidad", 5.7);
        return comparacion;
    }
}
