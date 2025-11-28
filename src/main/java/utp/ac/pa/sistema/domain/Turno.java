import java.util.*;
import java.sql.Time;
import java.text.SimpleDateFormat;

public class Turno {
    private String idTurno;
    private String tipo;
    private Time horaInicio;
    private Time horaFin;
    private Conductor conductorAsignado;
    private Unidad unidadAsignada;
    private Date fecha;
    private String estado;
    
    public void asignarConductor(Conductor conductor) {
        this.conductorAsignado = conductor;
    }
    
    public boolean verificarSuperposicion(Turno otroTurno) {
        return this.fecha.equals(otroTurno.fecha) && 
               this.conductorAsignado == otroTurno.conductorAsignado &&
               this.horaInicio.before(otroTurno.horaFin) && 
               this.horaFin.after(otroTurno.horaInicio);
    }
    
    public String getTipoTurno() {
        return tipo;
    }
    
    public boolean validarAsignacion() {
        return conductorAsignado != null && unidadAsignada != null && 
               horaInicio != null && horaFin != null && fecha != null;
    }
    
    public void finalizarTurno() {
        this.estado = "Finalizado";
    }
    
    public String generarReporteTurno() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "ID Turno: " + idTurno + "\nTipo: " + tipo + "\nFecha: " + sdf.format(fecha) +
               "\nHora Inicio: " + horaInicio + "\nHora Fin: " + horaFin + "\nEstado: " + estado +
               "\nConductor Asignado: " + (conductorAsignado != null ? "Sí" : "No") +
               "\nUnidad Asignada: " + (unidadAsignada != null ? "Sí" : "No");
    }
    
    public static void main(String[] args) {
        Turno turno = new Turno();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ID Turno: ");
        turno.idTurno = scanner.nextLine();
        
        System.out.print("Tipo de turno: ");
        turno.tipo = scanner.nextLine();
        
        try {
            System.out.print("Hora Inicio (HH:mm): ");
            turno.horaInicio = Time.valueOf(scanner.nextLine() + ":00");
            
            System.out.print("Hora Fin (HH:mm): ");
            turno.horaFin = Time.valueOf(scanner.nextLine() + ":00");
        } catch (Exception e) {
            System.out.println("Formato de hora incorrecto. Use HH:mm");
            return;
        }
        
        System.out.print("Fecha (dd/MM/yyyy): ");
        try {
            String fechaStr = scanner.nextLine();
            turno.fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fechaStr);
        } catch (Exception e) {
            turno.fecha = new Date();
        }
        
        System.out.print("Estado: ");
        turno.estado = scanner.nextLine();
        
        System.out.print("¿Asignar conductor? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            turno.conductorAsignado = new Conductor();
        }
        
        System.out.print("¿Asignar unidad? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            turno.unidadAsignada = new Unidad();
        }
        
        System.out.println("\nReporte del Turno:");
        System.out.println(turno.generarReporteTurno());
        System.out.println("Asignación válida: " + turno.validarAsignacion());
    }
}

class Conductor {}
class Unidad {}
