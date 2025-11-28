import java.util.*;
import java.text.SimpleDateFormat;

public class Boleto {
    private String idBoleto;
    private Date fechaEmision;
    private double precio;
    private String asiento;
    private String estado;
    private String rutaAsignada;
    private Pasajero pasajero;
    private Date fechaViaje;
    
    public boolean validar() {
        return "Activo".equals(estado) && fechaViaje.after(new Date());
    }
    
    public void anular() {
        this.estado = "Anulado";
    }
    
    public boolean verificarVigencia() {
        return fechaViaje.after(new Date());
    }
    
    public boolean cambiarAsiento(String nuevoAsiento) {
        if (nuevoAsiento != null && !nuevoAsiento.isEmpty()) {
            this.asiento = nuevoAsiento;
            return true;
        }
        return false;
    }
    
    public String obtenerInformacion() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return "ID Boleto: " + idBoleto + "\nFecha Emisión: " + sdf.format(fechaEmision) + 
               "\nPrecio: $" + precio + "\nAsiento: " + asiento + "\nEstado: " + estado + 
               "\nRuta: " + rutaAsignada + "\nFecha Viaje: " + sdf.format(fechaViaje);
    }
    
    public static void main(String[] args) {
        Boleto boleto = new Boleto();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ID Boleto: ");
        boleto.idBoleto = scanner.nextLine();
        
        boleto.fechaEmision = new Date();
        
        System.out.print("Precio: ");
        boleto.precio = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Asiento: ");
        boleto.asiento = scanner.nextLine();
        
        System.out.print("Estado: ");
        boleto.estado = scanner.nextLine();
        
        System.out.print("Ruta asignada: ");
        boleto.rutaAsignada = scanner.nextLine();
        
        boleto.pasajero = new Pasajero();
        
        System.out.print("Fecha viaje (dd/MM/yyyy): ");
        try {
            String fechaStr = scanner.nextLine();
            boleto.fechaViaje = new SimpleDateFormat("dd/MM/yyyy").parse(fechaStr);
        } catch (Exception e) {
            boleto.fechaViaje = new Date();
        }
        
        System.out.println("\nInformación del boleto:");
        System.out.println(boleto.obtenerInformacion());
        System.out.println("Válido: " + boleto.validar());
        System.out.println("Vigente: " + boleto.verificarVigencia());
    }
}

class Pasajero {
    private String documentoIdentidad;
    
    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }
}
