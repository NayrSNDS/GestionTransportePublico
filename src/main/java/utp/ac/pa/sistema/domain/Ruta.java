import java.util.*;

public class Ruta {
    private String idRuta;
    private String nombre;
    private String origen;
    private String destino;
    private List<String> paradas;
    private double distanciaKm;
    private int tiempoEstimadoMin;
    private double precioBase;
    
    public Ruta() {
        this.paradas = new ArrayList<>();
    }
    
    public void agregarParada(String parada) {
        paradas.add(parada);
    }
    
    public int calcularTiempoEstimado() {
        return (int)(distanciaKm * 2) + (paradas.size() * 5);
    }
    
    public List<String> obtenerParadas() {
        return new ArrayList<>(paradas);
    }
    
    public double calcularPrecio() {
        return precioBase + (distanciaKm * 0.1) + (paradas.size() * 0.5);
    }
    
    public boolean verificarParada(String parada) {
        return paradas.contains(parada);
    }
    
    public String obtenerInformacionCompleta() {
        return "ID: " + idRuta + "\nNombre: " + nombre + "\nOrigen: " + origen + 
               "\nDestino: " + destino + "\nParadas: " + paradas.size() + 
               "\nDistancia: " + distanciaKm + " km\nTiempo estimado: " + 
               tiempoEstimadoMin + " min\nPrecio base: $" + precioBase;
    }
    
    public static void main(String[] args) {
        Ruta ruta = new Ruta();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ID Ruta: ");
        ruta.idRuta = scanner.nextLine();
        
        System.out.print("Nombre: ");
        ruta.nombre = scanner.nextLine();
        
        System.out.print("Origen: ");
        ruta.origen = scanner.nextLine();
        
        System.out.print("Destino: ");
        ruta.destino = scanner.nextLine();
        
        System.out.print("Distancia en km: ");
        ruta.distanciaKm = scanner.nextDouble();
        
        System.out.print("Tiempo estimado en minutos: ");
        ruta.tiempoEstimadoMin = scanner.nextInt();
        
        System.out.print("Precio base: ");
        ruta.precioBase = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("¿Agregar parada? (s/n): ");
        while (scanner.nextLine().equalsIgnoreCase("s")) {
            System.out.print("Parada: ");
            ruta.agregarParada(scanner.nextLine());
            System.out.print("¿Agregar otra parada? (s/n): ");
        }
        
        System.out.println("\nInformación de la ruta:");
        System.out.println(ruta.obtenerInformacionCompleta());
        System.out.println("Precio calculado: $" + ruta.calcularPrecio());
        System.out.println("Tiempo estimado calculado: " + ruta.calcularTiempoEstimado() + " min");
    }
}
