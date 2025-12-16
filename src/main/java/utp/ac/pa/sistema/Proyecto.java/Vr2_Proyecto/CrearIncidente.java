import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class CrearIncidente extends JFrame {

    public static String tipoFinal;
    public static String lugarFinal;
    public static String incidenteFinal;
    public static String fechaFinal;
    public static String personaFinal;
    
    public CrearIncidente(String nombre){
  
        getContentPane().setBackground(Color.decode("#FEF9E1"));
        setUndecorated(false);
        Border borde = BorderFactory.createMatteBorder(6, 6, 6, 6, Color.decode("#E5D0AC"));
        getRootPane().setBorder(borde);

        setSize(700, 900);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel titulo = new JLabel("INCIDENTE", SwingConstants.CENTER);
        titulo.setFont(new Font("Times New Roman", Font.BOLD, 30));
        titulo.setForeground(Color.decode("#007E6E"));
        titulo.setBounds(0, 20, 700, 40);

        JLabel Fecha = new JLabel("Fecha:");
        Fecha.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Fecha.setForeground(Color.decode("#E67E22"));
        Fecha.setBounds(50, 80, 200, 25);

        LocalDate fechahoy = LocalDate.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String feFormateada = fechahoy.format(f);

        JLabel fechaf = new JLabel(feFormateada);
        fechaf.setFont(new Font("Times New Roman", Font.BOLD, 12));
        fechaf.setBounds(210, 80, 250, 25);
        fechaf.setForeground(Color.BLACK);


        // Tipo de incidente
        JLabel Tipo = new JLabel("Tipo de incidente:");
        Tipo.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Tipo.setForeground(Color.decode("#E67E22"));
        Tipo.setBounds(50, 120, 200, 25);

        JRadioButton urgente = new JRadioButton("Urgente");
        urgente.setFont(new Font("Times New Roman", Font.BOLD, 12));
        urgente.setForeground(Color.BLACK);
        urgente.setBorderPainted(true);
        urgente.setBorder(new LineBorder(Color.decode("#57564F"),4));
        urgente.setBackground(Color.decode("#DDDAD0"));
        urgente.setBounds(210, 120, 80, 25);
        urgente.setActionCommand("Urgente");

        JRadioButton alta = new JRadioButton("Alta");
        alta.setFont(new Font("Times New Roman", Font.BOLD, 12));
        alta.setForeground(Color.BLACK);
        alta.setBorderPainted(true);
        alta.setBorder(new LineBorder(Color.decode("#57564F"),4));
        alta.setBackground(Color.decode("#DDDAD0"));
        alta.setBounds(310, 120, 80, 25);
        alta.setActionCommand("Alta");


        JRadioButton media = new JRadioButton("Media");
        media.setFont(new Font("Times New Roman", Font.BOLD, 12));
        media.setForeground(Color.BLACK);
        media.setBorderPainted(true);
        media.setBorder(new LineBorder(Color.decode("#57564F"),4));
        media.setBackground(Color.decode("#DDDAD0"));
        media.setBounds(410, 120, 80, 25);
        media.setActionCommand("Media");


        JRadioButton baja = new JRadioButton("Baja");
        baja.setFont(new Font("Times New Roman", Font.BOLD, 12));
        baja.setForeground(Color.BLACK);
        baja.setBorderPainted(true);
        baja.setBorder(new LineBorder(Color.decode("#57564F"),4));
        baja.setBackground(Color.decode("#DDDAD0"));
        baja.setBounds(510, 120, 80, 25);
        baja.setActionCommand("Baja");



        ButtonGroup grupoTipo = new ButtonGroup();
        grupoTipo.add(urgente);
        grupoTipo.add(alta);
        grupoTipo.add(media);
        grupoTipo.add(baja);


        JLabel Lugar = new JLabel("Lugar de incidente:");
        Lugar.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Lugar.setForeground(Color.decode("#E67E22"));
        Lugar.setBounds(50, 160, 200, 25);

        JRadioButton dentroBus = new JRadioButton("Dentro del Bus");
        dentroBus.setFont(new Font("Times New Roman", Font.BOLD, 12));
        dentroBus.setForeground(Color.BLACK);
        dentroBus.setBorderPainted(true);
        dentroBus.setBorder(new LineBorder(Color.decode("#57564F"),4));
        dentroBus.setBackground(Color.decode("#DDDAD0"));
        dentroBus.setBounds(210, 160, 110, 25);
        dentroBus.setActionCommand("Dentro del Bus");


        JRadioButton terminal = new JRadioButton("Terminal");
        terminal.setFont(new Font("Times New Roman", Font.BOLD, 12));
        terminal.setForeground(Color.BLACK);
        terminal.setBorderPainted(true);
        terminal.setBorder(new LineBorder(Color.decode("#57564F"),4));
        terminal.setBackground(Color.decode("#DDDAD0"));
        terminal.setBounds(330, 160, 100, 25);
        terminal.setActionCommand("Terminal");



        ButtonGroup grupoLugar = new ButtonGroup();
        grupoLugar.add(dentroBus);
        grupoLugar.add(terminal);

        
        JLabel Personas = new JLabel("Personas involucradas:");
        Personas.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Personas.setForeground(Color.decode("#E67E22"));
        Personas.setBounds(50, 200, 200, 25);

        JRadioButton conductor = new JRadioButton("Conductor");
        conductor.setFont(new Font("Times New Roman", Font.BOLD, 12));
        conductor.setForeground(Color.BLACK);
        conductor.setBorderPainted(true);
        conductor.setBorder(new LineBorder(Color.decode("#57564F"),4));
        conductor.setBackground(Color.decode("#DDDAD0"));
        conductor.setBounds(210, 200, 95, 25);

        JRadioButton pasajero = new JRadioButton("Otro pasajero");
        pasajero.setFont(new Font("Times New Roman", Font.BOLD, 12));
        pasajero.setForeground(Color.BLACK);
        pasajero.setBorderPainted(true);
        pasajero.setBorder(new LineBorder(Color.decode("#57564F"),4));
        pasajero.setBackground(Color.decode("#DDDAD0"));
        pasajero.setBounds(320, 200, 100, 25);

        JRadioButton externos = new JRadioButton("Externos");
        externos.setFont(new Font("Times New Roman", Font.BOLD, 12));
        externos.setForeground(Color.BLACK);
        externos.setBorderPainted(true);
        externos.setBorder(new LineBorder(Color.decode("#57564F"),4));
        externos.setBackground(Color.decode("#DDDAD0"));
        externos.setBounds(440, 200, 95, 25);
     

        
        JLabel QuePaso = new JLabel("¿Qué pasó?");
        QuePaso.setFont(new Font("Times New Roman", Font.BOLD, 15));
        QuePaso.setForeground(Color.decode("#A72703"));
        QuePaso.setBounds(50, 240, 200, 25);

        JPanel Pincidente = new JPanel();
        Pincidente.setFont(new Font("Times New Roman", Font.BOLD, 15));
        Pincidente.setForeground(Color.decode("#E67E22"));
        Pincidente.setBorder(new LineBorder(Color.decode("#CBF3BB"),4));
        Pincidente.setBackground(Color.decode("#FDE7B3"));        
        
        Pincidente.setBounds(50, 240, 200, 25);
        Pincidente.setLayout(new BoxLayout(Pincidente, BoxLayout.Y_AXIS));

         String[] incidentes = {        
            "1. Robo o hurto de pertenencias",
            "2. Acoso o amenazas",
            "3. Personas sospechosas",
            "4. Peleas o altercados",
            "5. Venta ilegal de boletos",
            "6. Tráfico/consumo drogas/alcohol",
            "7. Intrusión en áreas restringidas",
            "8. Paquetes sospechosos",
            "9. Retraso significativo buses",
            "10. Cancelación sin aviso",
            "11. Buses en mal estado",
            "12. Exceso de velocidad",
            "13. Estacionamiento no autorizado",
            "14. Conductores sin licencia/fatiga",
            "15. Malestar o desmayo",
            "16. Accidentes con lesiones",
            "17. Personas mayores sin asistencia",
            "18. Enfermedad contagiosa",
            "19. Fallas eléctricas",
            "20. Aire acondicionado dañado",
            "21. Baños insalubres",
            "22. Fugas agua/gas",
            "23. Equipos dañados",
            "24. Vidrios/puertas rotas",
            "25. Baches/pisos en mal estado",
            "26. Falta de información",
            "27. Personal negligente/grosero",
            "28. Cobro excesivo",
            "29. Sobreventa de asientos",
            "30. Pérdida de equipaje",
            "31. Mala señalización",
            "32. Basura acumulada",
            "33. Malos olores",
            "34. Plagas visibles",
            "35. Derrames combustibles",
            "36. Bloqueos de vías",
            "37. Protestas/manifestaciones",
            "38. Clima extremo",
            "39. Corte de servicios básicos"
        };

        ButtonGroup grupoIncidentes = new ButtonGroup();
        for (String inc : incidentes) {
            JRadioButton rb = new JRadioButton(inc);
            rb.setActionCommand(inc); 
            grupoIncidentes.add(rb);
            Pincidente.add(rb);
        }

        JScrollPane scroll = new JScrollPane(Pincidente);
        scroll.setBounds(50, 280, 600, 500);  
        

        JButton aplicar = new JButton("Aplicar");
        aplicar.setFont(new Font("Times New Roman", Font.BOLD, 20));
        aplicar.setForeground(Color.decode("#EFB810"));
        aplicar.setBorderPainted(true);
        aplicar.setBorder(new LineBorder(Color.orange,4));
        aplicar.setBackground(Color.decode("#758DAE"));
        aplicar.setBounds(530, 790, 120, 40);
        

        JButton cancelar = new JButton("Cancelar");
        cancelar.setFont(new Font("Times New Roman", Font.BOLD, 20));
        cancelar.setForeground(Color.decode("#EFB810"));
        cancelar.setBounds(38, 790, 120, 40);
        cancelar.setBorderPainted(true);
        cancelar.setBorder(new LineBorder(Color.orange,4));
        cancelar.setBackground(Color.decode("#758DAE"));


        aplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (grupoTipo.getSelection() == null || 
                    grupoLugar.getSelection() == null || 
                    grupoIncidentes.getSelection() == null) {
                    
                    JOptionPane.showMessageDialog(null,
                            "Debe proporcionar todos los datos solicitados",
                            "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                String persona = null;
                if (conductor.isSelected()) {
                    persona = "Conductor";
                } else if (pasajero.isSelected()) {
                    persona = "Otro pasajero";
                } else if (externos.isSelected()) {
                    persona = "Externos";
                }

                if (persona == null) {
                    JOptionPane.showMessageDialog(null,
                            "Debe seleccionar una persona involucrada",
                            "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                String tipo = grupoTipo.getSelection().getActionCommand();
                String lugar = grupoLugar.getSelection().getActionCommand();
                String incidente = grupoIncidentes.getSelection().getActionCommand();

                LocalDate hoy = LocalDate.now();
                String fecha = hoy.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                
                tipoFinal = tipo;
                lugarFinal = lugar;
                incidenteFinal = incidente;
                fechaFinal = fecha;
                personaFinal = persona;

                new Incidentes(fecha, tipo, lugar, persona, incidente);
            }
        });
        
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                CrearIncidente.this.dispose();
                new Pasajero(nombre);
            }
        });
    



        setVisible(true);

        add(Fecha);
        add(scroll);
        add(QuePaso);
        add(conductor);
        add(pasajero);
        add(externos);        
        add(Personas);
        add(dentroBus);
        add(terminal);        
        add(Lugar);
        add(Tipo);
        add(urgente);
        add(alta);
        add(media);
        add(cancelar);
        add(aplicar);
        add(baja);
        add(fechaf);
        add(titulo);
    }

}
    
