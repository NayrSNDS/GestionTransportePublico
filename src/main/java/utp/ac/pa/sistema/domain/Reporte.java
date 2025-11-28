import java.util.*;
import java.text.SimpleDateFormat;

public class Reporte {
    private String idReporte;
    private Date fechaGeneracion;
    private String tipoReporte;
    private Map<String, Object> datos;
    private String periodo;
    private Administrador administradorGenera;
    private List<String> filtrosAplicados;
    
    public Reporte() {
        this.datos = new HashMap<>();
        this.filtrosAplicados = new ArrayList<>();
        this.fechaGeneracion = new Date();
    }
    
    public void generarReporteVentas(Date periodo) {
        this.tipoReporte = "Ventas";
        this.datos.put("totalVentas", 15000.0);
        this.datos.put("cantidadBoletos", 300);
        this.datos.put("ventaPromedio", 50.0);
    }
    
    public void generarReporteIncidentes() {
        this.tipoReporte = "Incidentes";
        this.datos.put("totalIncidentes", 15);
        this.datos.put("incidentesResueltos", 12);
        this.datos.put("tiempoPromedioResolucion", 45);
    }
    
    public void exportarPDF() {
        System.out.println("Exportando reporte " + idReporte + " a PDF...");
    }
    
    public void filtrarDatos(List<String> filtros) {
        this.filtrosAplicados = new ArrayList<>(filtros);
    }
    
    public Map<String, Object> calcularMetricas() {
        Map<String, Object> metricas = new HashMap<>();
        metricas.put("fechaGeneracion", fechaGeneracion);
        metricas.put("totalFiltros", filtrosAplicados.size());
        metricas.put("tipoReporte", tipoReporte);
        return metricas;
    }
    
    public Map<String, Object> compararPeriodos(String periodoAnterior) {
        Map<String, Object> comparacion = new HashMap<>();
        comparacion.put("periodoActual", periodo);
        comparacion.put("periodoAnterior", periodoAnterior);
        comparacion.put("variacion", 10.5);
        comparacion.put("tendencia", "Positiva");
        return comparacion;
    }
    
    public static void main(String[] args) {
        Reporte reporte = new Reporte();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ID Reporte: ");
        reporte.idReporte = scanner.nextLine();
        
        System.out.print("Tipo de Reporte (Ventas/Incidentes): ");
        reporte.tipoReporte = scanner.nextLine();
        
        System.out.print("Periodo: ");
        reporte.periodo = scanner.nextLine();
        
        System.out.print("¿Asignar administrador? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            reporte.administradorGenera = new Administrador();
        }
        
        System.out.print("¿Aplicar filtros? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            List<String> filtros = new ArrayList<>();
            System.out.print("Filtro 1: ");
            filtros.add(scanner.nextLine());
            System.out.print("Filtro 2: ");
            filtros.add(scanner.nextLine());
            reporte.filtrarDatos(filtros);
        }
        
        if ("Ventas".equalsIgnoreCase(reporte.tipoReporte)) {
            reporte.generarReporteVentas(new Date());
        } else if ("Incidentes".equalsIgnoreCase(reporte.tipoReporte)) {
            reporte.generarReporteIncidentes();
        }
        
        System.out.println("\nReporte generado:");
        System.out.println("ID: " + reporte.idReporte);
        System.out.println("Tipo: " + reporte.tipoReporte);
        System.out.println("Fecha: " + new SimpleDateFormat("dd/MM/yyyy").format(reporte.fechaGeneracion));
        System.out.println("Datos: " + reporte.datos);
        System.out.println("Filtros: " + reporte.filtrosAplicados);
        
        System.out.print("¿Exportar a PDF? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            reporte.exportarPDF();
        }
        
        System.out.println("\nMétricas:");
        System.out.println(reporte.calcularMetricas());
    }
}

class Administrador {}
