import java.util.*;

public class Conductor {
    private String documentoIdentidad;
    private List<String> historialRutas;
    private List<Boleto> boletosComprados;
    private Map<String, String> preferencias;
    
    public Conductor() {
        this.historialRutas = new ArrayList<>();
        this.boletosComprados = new ArrayList<>();
        this.preferencias = new HashMap<>();
    }
    
    public Boleto comprarBoleto(Ruta ruta, String asiento, SistemaVenta sistemaVenta) {
        Boleto boleto = new Boleto();
        boletosComprados.add(boleto);
        return boleto;
    }
    
    public boolean validarBoleto(String idBoleto, SistemaVenta sistemaVenta) {
        return idBoleto != null && !idBoleto.isEmpty();
    }
    
    public List<Ruta> consultarRutas(String origen, String destino) {
        return new ArrayList<>();
    }
    
    public boolean cancelarBoleto(Boleto boleto) {
        return boletosComprados.remove(boleto);
    }
    
    public List<String> verificarHistorial() {
        return new ArrayList<>(historialRutas);
    }
    
    public static void main(String[] args) {
        Conductor conductor = new Conductor();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Documento de identidad: ");
        conductor.documentoIdentidad = scanner.nextLine();
        
        System.out.print("¿Agregar ruta al historial? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            System.out.print("Ruta: ");
            conductor.historialRutas.add(scanner.nextLine());
        }
        
        System.out.print("¿Agregar preferencia? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            System.out.print("Clave de preferencia: ");
            String clave = scanner.nextLine();
            System.out.print("Valor de preferencia: ");
            String valor = scanner.nextLine();
            conductor.preferencias.put(clave, valor);
        }
        
        System.out.println("Conductor registrado exitosamente");
    }
}

class Boleto {}
class Ruta {}
class SistemaVenta {}
