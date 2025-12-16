import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Conductor extends JFrame {

    public Conductor(String nombre, int boletointento, int incidenteintento) {

        getContentPane().setBackground(Color.decode("#CFE8D5"));
        setUndecorated(false);
        getRootPane().setBorder(
            BorderFactory.createMatteBorder(7, 4, 5, 4, Color.decode("#2E7D32"))
        );

        setSize(750, 350);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel bienvenida = new JLabel("Hola, " + nombre);
        bienvenida.setFont(new Font("Times New Roman", Font.ITALIC, 30));
        bienvenida.setForeground(Color.decode("#1B5E20"));
        bienvenida.setBounds(58, 47, 700, 50);

        JLabel enunciado = new JLabel("Opciones disponibles:");
        enunciado.setFont(new Font("Times New Roman", Font.BOLD, 19));
        enunciado.setForeground(Color.BLACK);
        enunciado.setBounds(58, 107, 250, 20);

        JButton boleto = new JButton("Ver Boletos");
        boleto.setFont(new Font("Times New Roman", Font.BOLD, 20));
        boleto.setForeground(Color.decode("#222222"));
        boleto.setBorderPainted(true);
        boleto.setBorder(new LineBorder(Color.orange, 4));
        boleto.setBackground(Color.decode("#F5E7C6"));
        boleto.setBounds(78, 170, 180, 60);

        JButton turnos = new JButton("Ver Turnos");
        turnos.setFont(new Font("Times New Roman", Font.BOLD, 20));
        turnos.setForeground(Color.decode("#222222"));
        turnos.setBorderPainted(true);
        turnos.setBorder(new LineBorder(Color.orange, 4));
        turnos.setBackground(Color.decode("#F5E7C6"));
        turnos.setBounds(279, 170, 180, 60);

        JButton salir = new JButton("Salir");
        salir.setFont(new Font("Times New Roman", Font.BOLD, 20));
        salir.setForeground(Color.decode("#222222"));
        salir.setBorderPainted(true);
        salir.setBorder(new LineBorder(Color.YELLOW, 4));
        salir.setBackground(Color.decode("#F7B980"));
        salir.setBounds(479, 170, 180, 60);

        boleto.addActionListener(e -> {
            if (boletointento == 0) {
                JOptionPane.showMessageDialog(null, "No hay ningún boleto aún.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                new Boleto(
                        CrearBoleto.ubicacionFinal,
                        CrearBoleto.destinoFinal,
                        CrearBoleto.turnoFinal,
                        CrearBoleto.horarioFinal,
                        CrearBoleto.pasajerosFinal,
                        CrearBoleto.precioFinal
                );
            }
        });

        turnos.addActionListener(e -> {
            if (incidenteintento == 0) {
                JOptionPane.showMessageDialog(null, "No hay turnos asignados aún.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Turno asignado: " + CrearBoleto.turnoFinal +
                        " - Horario: " + CrearBoleto.horarioFinal,
                        "Turno del Conductor", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        salir.addActionListener(e -> {
            Conductor.this.dispose();
            new Interfaz(); 
        });

        add(bienvenida);
        add(enunciado);
        add(boleto);
        add(turnos);
        add(salir);
    }
}
