import java.util.*;
import java.text.SimpleDateFormat;

public class Administrador {
    private String nivelAcceso;
    private String departamento;
    private Date fechaContratacion;
    
    public boolean solicitarAsignacionRuta(Conductor conductor, Ruta ruta, Horario horario, GestorAsignaciones gestor) {
        return true;
    }
    
    public Turno solicitarCreacionTurno(Conductor conductor, Unidad unidad, Date fecha, String horaInicio, String horaFin, String tipo, GestorAsignaciones gestor) {
        return new Turno();
    }
    
    public Reporte solicitarReporteVentas(Date fechaInicio, Date fechaFin, String rutaFiltro, GestorReportes gestor) {
        return new Reporte();
    }
    
    public void registrarIncidente(Incidente incidente, GestorReportes gestor) {
        System.out.println("Incidente registrado");
    }
    
    public List<Turno> consultarTurnosConductor(Conductor conductor, GestorAsignaciones gestor) {
        return new ArrayList<>();
    }
    
    public static void main(String[] args) {
        Administrador admin = new Administrador();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nivel de acceso: ");
        admin.nivelAcceso = scanner.nextLine();
        
        System.out.print("Departamento: ");
        admin.departamento = scanner.nextLine();
        
        admin.fechaContratacion = new Date();
        
        System.out.println("Administrador registrado exitosamente");
        System.out.println("Fecha de contratación: " + new SimpleDateFormat("dd/MM/yyyy").format(admin.fechaContratacion));
    }
}

class Conductor {}
class Ruta {}
class Horario {}
class GestorAsignaciones {}
class Unidad {}
class Turno {}
class Reporte {}
class Incidente {}
class GestorReportes {}
