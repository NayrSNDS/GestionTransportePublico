import java.util.*;
import java.text.SimpleDateFormat;

public class Incidente {
    private String idIncidente;
    private String descripcion;
    private String tipo;
    private Date fechaReporte;
    private String estado;
    private Conductor conductorReporta;
    private Unidad unidadInvolucrada;
    private Ruta rutaAfectada;
    
    public void reportarIncidente(String descripcion, String tipo) {
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.fechaReporte = new Date();
        this.estado = "Reportado";
    }
    
    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }
    
    public String generarReporteDetallado() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return "ID Incidente: " + idIncidente + "\nTipo: " + tipo + "\nDescripción: " + descripcion +
               "\nFecha Reporte: " + sdf.format(fechaReporte) + "\nEstado: " + estado +
               "\nConductor: " + (conductorReporta != null ? "Asignado" : "No asignado") +
               "\nUnidad: " + (unidadInvolucrada != null ? "Involucrada" : "No involucrada") +
               "\nRuta: " + (rutaAfectada != null ? "Afectada" : "No afectada");
    }
    
    public String asignarPrioridad() {
        if (tipo.equals("Accidente")) return "Alta";
        if (tipo.equals("Falla mecánica")) return "Media";
        if (tipo.equals("Retraso")) return "Baja";
        return "Normal";
    }
    
    public void notificarAdministrador() {
        System.out.println("Notificando al administrador sobre el incidente: " + idIncidente);
    }
    
    public long calcularTiempoResolucion() {
        if (fechaReporte == null) return 0;
        Date ahora = new Date();
        long diff = ahora.getTime() - fechaReporte.getTime();
        return diff / (60 * 1000);
    }
    
    public static void main(String[] args) {
        Incidente incidente = new Incidente();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ID Incidente: ");
        incidente.idIncidente = scanner.nextLine();
        
        System.out.print("Descripción: ");
        String desc = scanner.nextLine();
        
        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();
        
        incidente.reportarIncidente(desc, tipo);
        
        System.out.print("¿Asignar conductor? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            incidente.conductorReporta = new Conductor();
        }
        
        System.out.print("¿Asignar unidad involucrada? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            incidente.unidadInvolucrada = new Unidad();
        }
        
        System.out.print("¿Asignar ruta afectada? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            incidente.rutaAfectada = new Ruta();
        }
        
        System.out.println("\nReporte Detallado:");
        System.out.println(incidente.generarReporteDetallado());
        System.out.println("Prioridad: " + incidente.asignarPrioridad());
        System.out.println("Tiempo desde reporte: " + incidente.calcularTiempoResolucion() + " minutos");
        
        incidente.notificarAdministrador();
    }
}

class Conductor {}
class Unidad {}
class Ruta {}
