import java.util.*;
import java.text.SimpleDateFormat;

public class Unidad {
    private String placa;
    private String modelo;
    private int capacidadPasajeros;
    private String estado;
    private String tipoCombustible;
    private double kilometraje;
    private Date fechaMantenimiento;
    
    public boolean verificarDisponibilidad() {
        return "Disponible".equals(estado) || "En servicio".equals(estado);
    }
    
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }
    
    public int obtenerCapacidad() {
        return capacidadPasajeros;
    }
    
    public boolean asignarConductor(Conductor conductor) {
        return conductor != null;
    }
    
    public void programarMantenimiento() {
        this.fechaMantenimiento = new Date();
    }
    
    public String verificarEstadoGeneral() {
        return "Placa: " + placa + "\nModelo: " + modelo + "\nEstado: " + estado + 
               "\nCapacidad: " + capacidadPasajeros + "\nKilometraje: " + kilometraje +
               "\nÚltimo mantenimiento: " + (fechaMantenimiento != null ? 
               new SimpleDateFormat("dd/MM/yyyy").format(fechaMantenimiento) : "No programado");
    }
    
    public static void main(String[] args) {
        Unidad unidad = new Unidad();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Placa: ");
        unidad.placa = scanner.nextLine();
        
        System.out.print("Modelo: ");
        unidad.modelo = scanner.nextLine();
        
        System.out.print("Capacidad de pasajeros: ");
        unidad.capacidadPasajeros = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Estado: ");
        unidad.estado = scanner.nextLine();
        
        System.out.print("Tipo de combustible: ");
        unidad.tipoCombustible = scanner.nextLine();
        
        System.out.print("Kilometraje: ");
        unidad.kilometraje = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("¿Programar mantenimiento? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            unidad.programarMantenimiento();
        }
        
        System.out.println("\nInformación de la unidad:");
        System.out.println(unidad.verificarEstadoGeneral());
        System.out.println("Disponible: " + unidad.verificarDisponibilidad());
    }
}

class Conductor {}
