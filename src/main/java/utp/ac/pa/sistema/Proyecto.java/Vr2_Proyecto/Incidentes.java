import java.awt.Color;
import java.awt.Font;
import java.util.UUID;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Incidentes extends JFrame {

    public Incidentes(String fecha, String tipo, String lugar, String persona, String incidente){

        setTitle("Reporte de Incidente");
        setSize(500, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(Color.decode("#F4EAD5"));
        setUndecorated(false);
        getRootPane().setBorder(
            BorderFactory.createMatteBorder(7, 7, 8, 8, Color.decode("#8B5E3C"))
        );

        // Generar ID único
        String id = UUID.randomUUID().toString().substring(0, 8).toUpperCase();

        JLabel titulo = new JLabel("INCIDENTE", SwingConstants.CENTER);
        titulo.setFont(new Font("Times New Roman", Font.BOLD, 26));
        titulo.setForeground(Color.decode("#A72703"));
        titulo.setBounds(150, 20, 200, 30);

        JLabel lblID = new JLabel("ID: " + id);
        lblID.setFont(new Font("Arial", Font.BOLD, 16));
        lblID.setBounds(30, 70, 400, 25);

        JLabel lblFecha = new JLabel("Fecha: " + fecha);
        lblFecha.setFont(new Font("Arial", Font.BOLD, 16));
        lblFecha.setBounds(30, 100, 400, 25);

        JLabel lblTipo = new JLabel("Tipo: " + tipo);
        lblTipo.setFont(new Font("Arial", Font.BOLD, 16));
        lblTipo.setBounds(30, 130, 400, 25);

        JLabel lblLugar = new JLabel("Lugar: " + lugar);
        lblLugar.setFont(new Font("Arial", Font.BOLD, 16));
        lblLugar.setBounds(30, 160, 400, 25);

        JLabel lblPersona = new JLabel("Persona involucrada: " + persona);
        lblPersona.setFont(new Font("Arial", Font.BOLD, 16));
        lblPersona.setBounds(30, 190, 400, 25);

        JLabel lblIncidente = new JLabel("Incidente: " + incidente);
        lblIncidente.setFont(new Font("Arial", Font.BOLD, 16));
        lblIncidente.setBounds(30, 220, 450, 25);

        add(titulo);
        add(lblID);
        add(lblFecha);
        add(lblTipo);
        add(lblLugar);
        add(lblPersona);
        add(lblIncidente);

        setVisible(true);




    }
}


