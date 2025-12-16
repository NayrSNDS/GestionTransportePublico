
import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Boleto extends JFrame {

    public Boleto(String ubicacion, String destino, String turno, String horario, int personas, float precioFinal) {
        
        setTitle("Boleto");
        setSize(500, 450);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(Color.decode("#E7DEAF"));
        setUndecorated(false);
        getRootPane().setBorder(
            BorderFactory.createMatteBorder(7, 7, 8, 8, Color.decode("#007E6E"))
        );

        LocalDate hoy = LocalDate.now();
        String fecha = hoy.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        String id = UUID.randomUUID().toString().substring(0, 8).toUpperCase();

        int bus = asignarBus(turno, horario);

        JLabel Titulo = new JLabel("BOLETO");
        Titulo.setFont(new Font("Times New Roman", Font.BOLD, 26));
        Titulo.setForeground(Color.decode("#A72703"));
        Titulo.setBounds(180, 20, 200, 30);
    

        JLabel ID = new JLabel("ID: " + id);
        ID.setFont(new Font("Times New Roman", Font.BOLD, 18));   
        ID.setForeground(Color.decode("#84994F"));
        ID.setBounds(30, 70, 300, 25);

        JLabel Fecha = new JLabel("Fecha: " + fecha);
        Fecha.setFont(new Font("Times New Roman", Font.BOLD, 18));   
        Fecha.setForeground(Color.decode("#84994F"));
        Fecha.setBounds(30, 100, 300, 25);

        JLabel Ubicacion = new JLabel("Ubicación: " + ubicacion);
        Ubicacion.setFont(new Font("Times New Roman", Font.BOLD, 18));   
        Ubicacion.setForeground(Color.decode("#84994F"));
        Ubicacion.setBounds(30, 130, 300, 25);

        JLabel Destino = new JLabel("Destino: " + destino);
        Destino.setFont(new Font("Times New Roman", Font.BOLD, 18));   
        Destino.setForeground(Color.decode("#84994F"));
        Destino.setBounds(30, 160, 300, 25);

        JLabel Turno = new JLabel("Turno: " + turno);
        Turno.setFont(new Font("Times New Roman", Font.BOLD, 18));   
        Turno.setForeground(Color.decode("#84994F"));
        Turno.setBounds(30, 190, 300, 25);

        JLabel Horario = new JLabel("Horario: " + horario);
        Horario.setFont(new Font("Times New Roman", Font.BOLD, 18));   
        Horario.setForeground(Color.decode("#84994F"));
        Horario.setBounds(30, 220, 300, 25);

        JLabel Personas = new JLabel("Persona(s): " + personas);
        Personas.setFont(new Font("Times New Roman", Font.BOLD, 18));   
        Personas.setForeground(Color.decode("#84994F"));
        Personas.setBounds(30, 250, 300, 25);

        JLabel Bus = new JLabel("Bus asignado: " + bus);
        Bus.setFont(new Font("Times New Roman", Font.BOLD, 18));   
        Bus.setForeground(Color.decode("#84994F"));
        Bus.setBounds(30, 280, 300, 25);

        JLabel Precio = new JLabel("Precio total: $" + precioFinal);
        Precio.setFont(new Font("Times New Roman", Font.BOLD, 18));
        Precio.setBounds(30, 320, 300, 30);



        add(Precio);
        add(Bus);
        add(Personas);
        add(Turno);
        add(Ubicacion);
        add(Horario);
        add(Destino);
        add(Fecha);
        add(ID);
        add(Titulo);

        setVisible(true);
    }

    private int asignarBus(String turno, String horario) {
        if (turno.equals("Mañana")) {
            switch (horario) {
                case "7am": 
                return 1;
                case "8am": 
                return 2;
                case "10am": 
                return 3;
            }
        }
        if (turno.equals("Tarde")) {
            switch (horario) {
                case "12pm": 
                return 4;
                case "1pm": 
                return 5;
                case "2pm": 
                return 6;
            }
        }
        if (turno.equals("Noche")) {
            switch (horario) {
                case "5pm": 
                return 7;
                case "8pm": 
                return 8;
                case "10pm": 
                return 9;
            }
        }
        return 0; 


    }
}
