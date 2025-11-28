import java.util.*;

public class Horario {
    private String idHorario;
    private String horaSalida;
    private String horaLlegada;
    private String diaSemana;
    private String frecuencia;
    private String rutaAsociada;
    
    public boolean verificarDisponibilidad() {
        return horaSalida != null && horaLlegada != null && diaSemana != null;
    }
    
    public void ajustarHorario(String nuevaHoraSalida) {
        this.horaSalida = nuevaHoraSalida;
    }
    
    public String obtenerFrecuencia() {
        return frecuencia;
    }
    
    public void asignarRuta(String ruta) {
        this.rutaAsociada = ruta;
    }
    
    public boolean verificarConflicto(Horario otroHorario) {
        return this.diaSemana.equals(otroHorario.diaSemana) && 
               this.rutaAsociada.equals(otroHorario.rutaAsociada);
    }
    
    public int calcularDuracion() {
        if (horaSalida == null || horaLlegada == null) return 0;
        
        try {
            String[] salida = horaSalida.split(":");
            String[] llegada = horaLlegada.split(":");
            
            int horaSal = Integer.parseInt(salida[0]);
            int minSal = Integer.parseInt(salida[1]);
            int horaLleg = Integer.parseInt(llegada[0]);
            int minLleg = Integer.parseInt(llegada[1]);
            
            int totalMinSal = horaSal * 60 + minSal;
            int totalMinLleg = horaLleg * 60 + minLleg;
            
            return totalMinLleg - totalMinSal;
        } catch (Exception e) {
            return 0;
        }
    }
    
    public static void main(String[] args) {
        Horario horario = new Horario();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ID Horario: ");
        horario.idHorario = scanner.nextLine();
        
        System.out.print("Hora Salida (HH:mm): ");
        horario.horaSalida = scanner.nextLine();
        
        System.out.print("Hora Llegada (HH:mm): ");
        horario.horaLlegada = scanner.nextLine();
        
        System.out.print("Día de la semana: ");
        horario.diaSemana = scanner.nextLine();
        
        System.out.print("Frecuencia: ");
        horario.frecuencia = scanner.nextLine();
        
        System.out.print("Ruta asociada: ");
        horario.rutaAsociada = scanner.nextLine();
        
        System.out.println("\nInformación del horario:");
        System.out.println("Duración del viaje: " + horario.calcularDuracion() + " minutos");
        System.out.println("Disponible: " + horario.verificarDisponibilidad());
        System.out.println("Frecuencia: " + horario.obtenerFrecuencia());
    }
}
