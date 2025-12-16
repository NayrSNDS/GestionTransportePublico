import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class CrearBoleto extends JFrame{

    public static String ubicacionFinal;
    public static String destinoFinal;
    public static String turnoFinal;
    public static String horarioFinal;
    public static int pasajerosFinal;
    public static float precioFinal;

    public CrearBoleto(String nombreUsuario){

        getContentPane().setBackground(Color.decode("#FEF9E1"));  
        setUndecorated(false);
        getRootPane().setBorder(
            BorderFactory.createMatteBorder(6, 6, 6, 6, Color.decode("#E5D0AC"))
        );
        
        setSize(700, 900);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        JLabel titulo = new JLabel("NUEVO BOLETO");
        titulo.setFont(new Font("Times New Roman", Font.BOLD, 23));
        titulo.setBounds(240, 18, 250, 35);
        titulo.setForeground(Color.decode("#FEF9E1"));

        ImageIcon cuadrado1 = new ImageIcon("imagenes\\rojos.png");
        JLabel deco = new JLabel(cuadrado1);
        deco.setBounds(123, 10, 423, 48);

        JLabel fecha = new JLabel("Fecha de emisión");
        fecha.setFont(new Font("Times New Roman", Font.BOLD, 23));
        fecha.setBounds(28, 78, 250, 33);
        fecha.setForeground(Color.BLACK);

        LocalDate fechahoy = LocalDate.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String feFormateada = fechahoy.format(f);

        JLabel fechaf = new JLabel(feFormateada);
        fechaf.setFont(new Font("Times New Roman", Font.BOLD, 19));
        fechaf.setBounds(38, 120, 350, 50);
        fechaf.setForeground(Color.BLACK);

        ImageIcon cuadrado2 = new ImageIcon("imagenes\\fondo.png");
        JLabel deco2 = new JLabel(cuadrado2);
        deco2.setBounds(28, 120, 350, 45);

        JLabel origen = new JLabel("Ubicación");
        origen.setFont(new Font("Times New Roman", Font.BOLD, 23));
        origen.setBounds(28, 180, 250, 33);
        origen.setForeground(Color.BLACK);

        JLabel destino = new JLabel("Destino");
        destino.setFont(new Font("Times New Roman", Font.BOLD, 23));
        destino.setBounds(28, 330, 250, 33);
        destino.setForeground(Color.BLACK);

        JLabel pasajeros = new JLabel("Número de personas");
        pasajeros.setFont(new Font("Times New Roman", Font.BOLD, 23));
        pasajeros.setBounds(350, 500, 250, 33);
        pasajeros.setForeground(Color.BLACK);

        JTextField numpasajeros = new JTextField();
        numpasajeros.setFont(new Font("Times New Roman", Font.BOLD, 15));
        numpasajeros.setForeground(Color.BLACK);
        numpasajeros.setBounds(350, 540, 250,25);

        JLabel turno = new JLabel("Turno");
        turno.setFont(new Font("Times New Roman", Font.BOLD, 23));
        turno.setBounds(28, 500, 250, 33);
        turno.setForeground(Color.BLACK); 

        JRadioButton manaña = new JRadioButton("Mañana");
        manaña.setFont(new Font("Times New Roman", Font.BOLD, 12));
        manaña.setForeground(Color.BLACK);
        manaña.setBorderPainted(true);
        manaña.setBorder(new LineBorder(Color.decode("#57564F"),4));
        manaña.setBackground(Color.decode("#DDDAD0"));
        manaña.setBounds(38, 540, 250, 25);
        manaña.setActionCommand("Mañana");

        JRadioButton tarde = new JRadioButton("Tarde");
        tarde.setFont(new Font("Times New Roman", Font.BOLD, 12));
        tarde.setForeground(Color.BLACK);
        tarde.setBorderPainted(true);
        tarde.setBorder(new LineBorder(Color.decode("#57564F"),4));
        tarde.setBackground(Color.decode("#DDDAD0"));
        tarde.setBounds(38, 570, 250, 25);
        tarde.setActionCommand("Tarde");
        
        JRadioButton noche = new JRadioButton("Noche");
        noche.setFont(new Font("Times New Roman", Font.BOLD, 12));
        noche.setForeground(Color.BLACK);
        noche.setBorderPainted(true);
        noche.setBorder(new LineBorder(Color.decode("#57564F"),4));
        noche.setBackground(Color.decode("#DDDAD0"));
        noche.setBounds(38, 600, 250, 25);
        noche.setActionCommand("Noche");

        ButtonGroup grupoTurno = new ButtonGroup();
        grupoTurno.add(manaña);
        grupoTurno.add(tarde);
        grupoTurno.add(noche);

    

        JRadioButton darienU = new JRadioButton("Darien (La Palma)");
        darienU.setFont(new Font("Times New Roman", Font.BOLD, 12));
        darienU.setBounds(38, 218, 210, 25);
        darienU.setForeground(Color.BLACK);
        darienU.setBorderPainted(true);
        darienU.setBorder(new LineBorder(Color.decode("#57564F"),4));
        darienU.setBackground(Color.decode("#DDDAD0"));
        darienU.setActionCommand("Darién");

        JRadioButton colonU = new JRadioButton("Colón (Colón)");
        colonU.setFont(new Font("Times New Roman", Font.BOLD, 12));
        colonU.setBounds(38, 244, 210, 25);
        colonU.setForeground(Color.BLACK);
        colonU.setBorderPainted(true);
        colonU.setBorder(new LineBorder(Color.decode("#57564F"),4));
        colonU.setBackground(Color.decode("#DDDAD0"));
        colonU.setActionCommand("Colón");

        JRadioButton santosU = new JRadioButton("Los Santos (Las Tablas)");
        santosU.setFont(new Font("Times New Roman", Font.BOLD, 12));
        santosU.setBounds(38, 270, 210, 25);
        santosU.setForeground(Color.BLACK);
        santosU.setBorderPainted(true);
        santosU.setBorder(new LineBorder(Color.decode("#57564F"),4));
        santosU.setBackground(Color.decode("#DDDAD0"));
        santosU.setActionCommand("Los Santos");

        JRadioButton veraguasU = new JRadioButton("Veraguas (Santiago de Veraguas)");
        veraguasU.setFont(new Font("Times New Roman", Font.BOLD, 12));
        veraguasU.setBounds(38, 296, 210, 25);
        veraguasU.setForeground(Color.BLACK);
        veraguasU.setBorderPainted(true);
        veraguasU.setBorder(new LineBorder(Color.decode("#57564F"),4));
        veraguasU.setBackground(Color.decode("#DDDAD0"));
        veraguasU.setActionCommand("Veraguas");

        JRadioButton chiriquiU = new JRadioButton("Chiriquí (David)");
        chiriquiU.setFont(new Font("Times New Roman", Font.BOLD, 12));
        chiriquiU.setBounds(260, 218, 210, 25);
        chiriquiU.setForeground(Color.BLACK);
        chiriquiU.setBorderPainted(true);
        chiriquiU.setBorder(new LineBorder(Color.decode("#57564F"),4));
        chiriquiU.setBackground(Color.decode("#DDDAD0"));
        chiriquiU.setActionCommand("Chiriquí");

        JRadioButton cocleU = new JRadioButton("Coclé (Penonomé)");
        cocleU.setFont(new Font("Times New Roman", Font.BOLD, 12));
        cocleU.setBounds(260, 244, 210, 25);
        cocleU.setForeground(Color.BLACK);
        cocleU.setBorderPainted(true);
        cocleU.setBorder(new LineBorder(Color.decode("#57564F"),4));
        cocleU.setBackground(Color.decode("#DDDAD0"));
        cocleU.setActionCommand("Coclé");

        JRadioButton herreraU = new JRadioButton("Herrera (Chitré)");
        herreraU.setFont(new Font("Times New Roman", Font.BOLD, 12));
        herreraU.setBounds(260, 270, 210, 25);
        herreraU.setForeground(Color.BLACK);
        herreraU.setBorderPainted(true);
        herreraU.setBorder(new LineBorder(Color.decode("#57564F"),4));
        herreraU.setBackground(Color.decode("#DDDAD0"));
        herreraU.setActionCommand("Herrera");

        JRadioButton bocasU = new JRadioButton("Bocas del Toro (Bocas del Toro)");
        bocasU.setFont(new Font("Times New Roman", Font.BOLD, 12));
        bocasU.setBounds(260, 296, 210, 25);
        bocasU.setForeground(Color.BLACK);
        bocasU.setBorderPainted(true);
        bocasU.setBorder(new LineBorder(Color.decode("#57564F"),4));
        bocasU.setBackground(Color.decode("#DDDAD0"));
        bocasU.setActionCommand("Bocas Del Toro");


        JRadioButton oesteU = new JRadioButton("Panamá Oeste (Chorrera)");
        oesteU.setFont(new Font("Times New Roman", Font.BOLD, 12));
        oesteU.setBounds(480, 258, 170,25);
        oesteU.setForeground(Color.BLACK);
        oesteU.setBorderPainted(true);
        oesteU.setBorder(new LineBorder(Color.decode("#57564F"),4));
        oesteU.setBackground(Color.decode("#DDDAD0"));
        oesteU.setActionCommand("Panamá Oeste");

        JRadioButton panamaU = new JRadioButton("Panamá (Albrook)");
        panamaU.setFont(new Font("Times New Roman", Font.BOLD, 12));
        panamaU.setBounds(480, 284, 170, 25); 
        panamaU.setForeground(Color.BLACK);
        panamaU.setBorderPainted(true);
        panamaU.setBorder(new LineBorder(Color.decode("#57564F"),4));
        panamaU.setBackground(Color.decode("#DDDAD0"));
        panamaU.setActionCommand("Panamá");


        ButtonGroup grupoUbicacion = new ButtonGroup();
        grupoUbicacion.add(darienU);
        grupoUbicacion.add(colonU);
        grupoUbicacion.add(santosU);
        grupoUbicacion.add(veraguasU);
        grupoUbicacion.add(chiriquiU);
        grupoUbicacion.add(cocleU);
        grupoUbicacion.add(herreraU);
        grupoUbicacion.add(bocasU);
        grupoUbicacion.add(oesteU);
        grupoUbicacion.add(panamaU);

        JRadioButton darienD = new JRadioButton("Darien (La Palma)");
        darienD.setFont(new Font("Times New Roman", Font.BOLD, 12));
        darienD.setBounds(38, 368, 210, 25); // mismo x que darienU, y desplazado
        darienD.setForeground(Color.BLACK);
        darienD.setBorderPainted(true);
        darienD.setBorder(new LineBorder(Color.decode("#57564F"),4));
        darienD.setBackground(Color.decode("#DDDAD0"));
        darienD.setActionCommand("Darién");

        JRadioButton colonD = new JRadioButton("Colón (Colón)");
        colonD.setFont(new Font("Times New Roman", Font.BOLD, 12));
        colonD.setBounds(38, 394, 210, 25); // mismo x que colonU
        colonD.setForeground(Color.BLACK);
        colonD.setBorderPainted(true);
        colonD.setBorder(new LineBorder(Color.decode("#57564F"),4));
        colonD.setBackground(Color.decode("#DDDAD0"));
        colonD.setActionCommand("Colón");

        JRadioButton santosD = new JRadioButton("Los Santos (Las Tablas)");
        santosD.setFont(new Font("Times New Roman", Font.BOLD, 12));
        santosD.setBounds(38, 420, 210, 25);
        santosD.setForeground(Color.BLACK);
        santosD.setBorderPainted(true);
        santosD.setBorder(new LineBorder(Color.decode("#57564F"),4));
        santosD.setBackground(Color.decode("#DDDAD0"));
        santosD.setActionCommand("Los Santos");

        JRadioButton veraguasD = new JRadioButton("Veraguas (Santiago de Veraguas)");
        veraguasD.setFont(new Font("Times New Roman", Font.BOLD, 12));
        veraguasD.setBounds(38, 446, 210, 25);
        veraguasD.setForeground(Color.BLACK);
        veraguasD.setBorderPainted(true);
        veraguasD.setBorder(new LineBorder(Color.decode("#57564F"),4));
        veraguasD.setBackground(Color.decode("#DDDAD0"));
        veraguasD.setActionCommand("Veraguas");

        JRadioButton chiriquiD = new JRadioButton("Chiriquí (David)");
        chiriquiD.setFont(new Font("Times New Roman", Font.BOLD, 12));
        chiriquiD.setBounds(260, 368, 210, 25); // mismo x que chiriquiU
        chiriquiD.setForeground(Color.BLACK);
        chiriquiD.setBorderPainted(true);
        chiriquiD.setBorder(new LineBorder(Color.decode("#57564F"),4));
        chiriquiD.setBackground(Color.decode("#DDDAD0"));
        chiriquiD.setActionCommand("Chiriquí");

        JRadioButton cocleD = new JRadioButton("Coclé (Penonomé)");
        cocleD.setFont(new Font("Times New Roman", Font.BOLD, 12));
        cocleD.setBounds(260, 394, 210, 25);
        cocleD.setForeground(Color.BLACK);
        cocleD.setBorderPainted(true);
        cocleD.setBorder(new LineBorder(Color.decode("#57564F"),4));
        cocleD.setBackground(Color.decode("#DDDAD0"));
        cocleD.setActionCommand("Coclé");

        JRadioButton herreraD = new JRadioButton("Herrera (Chitré)");
        herreraD.setFont(new Font("Times New Roman", Font.BOLD, 12));
        herreraD.setBounds(260, 420, 210, 25);
        herreraD.setForeground(Color.BLACK);
        herreraD.setBorderPainted(true);
        herreraD.setBorder(new LineBorder(Color.decode("#57564F"),4));
        herreraD.setBackground(Color.decode("#DDDAD0"));
        herreraD.setActionCommand("Herrera");

        JRadioButton bocasD = new JRadioButton("Bocas del Toro (Changinola)");
        bocasD.setFont(new Font("Times New Roman", Font.BOLD, 12));
        bocasD.setBounds(260, 446, 210, 25);
        bocasD.setForeground(Color.BLACK);
        bocasD.setBorderPainted(true);
        bocasD.setBorder(new LineBorder(Color.decode("#57564F"),4));
        bocasD.setBackground(Color.decode("#DDDAD0"));
        bocasD.setActionCommand("Bocas Del Toro");

        JRadioButton oesteD = new JRadioButton("Panamá Oeste (Chorrera)");
        oesteD.setFont(new Font("Times New Roman", Font.BOLD, 12));
        oesteD.setBounds(480, 408, 170, 25); 
        oesteD.setForeground(Color.BLACK);
        oesteD.setBorderPainted(true);
        oesteD.setBorder(new LineBorder(Color.decode("#57564F"),4));
        oesteD.setBackground(Color.decode("#DDDAD0"));
        oesteD.setActionCommand("Panamá Oeste");

        JRadioButton panamaD = new JRadioButton("Panamá (Albrook)");
        panamaD.setFont(new Font("Times New Roman", Font.BOLD, 12));
        panamaD.setBounds(480, 434, 170, 25); 
        panamaD.setForeground(Color.BLACK);
        panamaD.setBorderPainted(true);
        panamaD.setBorder(new LineBorder(Color.decode("#57564F"),4));
        panamaD.setBackground(Color.decode("#DDDAD0"));
        panamaD.setActionCommand("Panamá");



        ButtonGroup grupoDestinos = new ButtonGroup();
        grupoDestinos.add(darienD);
        grupoDestinos.add(colonD);
        grupoDestinos.add(santosD);
        grupoDestinos.add(veraguasD);
        grupoDestinos.add(chiriquiD);
        grupoDestinos.add(cocleD);
        grupoDestinos.add(herreraD);
        grupoDestinos.add(bocasD);
        grupoDestinos.add(oesteD);
        grupoDestinos.add(panamaD);


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

        JLabel precio = new JLabel("");
        precio.setFont(new Font("Times New Roman", Font.BOLD, 18));
        precio.setForeground(Color.decode("#8E1616"));
        precio.setBounds(38, 700, 400, 30);

        

        aplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (grupoDestinos.getSelection() == null && grupoUbicacion.getSelection()== null){
                      JOptionPane.showMessageDialog(null,
                        "Debe proporcionar los datos solicitados", "Error",
                        JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (grupoUbicacion.getSelection() == null) {
                    JOptionPane.showMessageDialog(null,
                        "Debe proporcionar su Ubicación", "Error",
                        JOptionPane.WARNING_MESSAGE);
                    return;
                }

                if (grupoDestinos.getSelection() == null) {
                    JOptionPane.showMessageDialog( null,
                        "Debe elegir un Destino", "Error",
                        JOptionPane.WARNING_MESSAGE);
                    return;
                }
                

                if (grupoTurno.getSelection() == null){
                      JOptionPane.showMessageDialog(null,
                        "Debe especificar un turno", "Error",
                        JOptionPane.WARNING_MESSAGE);
                    return;
                }

                int pasajeros;
                try {

                    pasajeros = Integer.parseInt(numpasajeros.getText());
                    if(pasajeros <= 0){
                        JOptionPane.showConfirmDialog(null, 
                            "El número de pasajeros debe ser mayor que 0",
                            "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,
                        "Debe ingresar un número válido de pasajeros",
                        "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String ubicacion = grupoUbicacion.getSelection().getActionCommand();
                String destino = grupoDestinos.getSelection().getActionCommand();

                if (ubicacion.equals(destino)) {
                    JOptionPane.showMessageDialog(null,
                        "La Ubicación y el Destino no pueden ser iguales",
                        "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String turno = grupoTurno.getSelection().getActionCommand();
                String horario = "";

                if (turno.equals("Mañana")) {
                    String[] opciones = {"7am", "8am", "10am"};
                    horario = (String) JOptionPane.showInputDialog(
                        null,
                        "Seleccione el horario:",
                        "Horario - Turno Mañana",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]
                    );
                } else if (turno.equals("Tarde")) {
                    String[] opciones = {"12pm", "2pm", "3pm"};
                    horario = (String) JOptionPane.showInputDialog(
                        null,
                        "Seleccione el horario:",
                        "Horario - Turno Tarde",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]
                    );
                } else if (turno.equals("Noche")) {
                    String[] opciones = {"5pm", "8pm", "10pm"};
                    horario = (String) JOptionPane.showInputDialog(
                        null,
                        "Seleccione el horario:",
                        "Horario - Turno Noche",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]
                    );
                }

                if (horario == null || horario.isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                        "Debe seleccionar un horario válido.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }


                SVentas sisventa = new SVentas();
                float precio_final = sisventa.sistema(ubicacion,destino, pasajeros);


                precio.setText("Precio total a cancelar: $" + precio_final );

                ubicacionFinal = ubicacion;
                destinoFinal = destino;
                turnoFinal = turno;
                horarioFinal = horario;
                pasajerosFinal = pasajeros;
                precioFinal = precio_final;

                new Boleto(ubicacion, destino, turno, horario, pasajeros, precio_final);
            }
        });

        cancelar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                CrearBoleto.this.dispose();
                new Pasajero(nombreUsuario);
            }
        });
        
        add(titulo);
        add(turno);
        add(destino);
        add(origen);
        add(fecha);
        add(fechaf);
        add(deco);
        add(deco2);
        add(manaña);
        add(tarde);
        add(noche);
        add(aplicar);
        add(cancelar);
        add(precio);
        add(pasajeros);
        add(numpasajeros);


        add(darienU);
        add(colonU);
        add(santosU);
        add(veraguasU);
        add(chiriquiU);
        add(cocleU);
        add(herreraU);
        add(bocasU);
        add(oesteU);
        add(panamaU);
        

        add(darienD);
        add(colonD);
        add(santosD);
        add(veraguasD);
        add(chiriquiD);
        add(cocleD);
        add(herreraD);
        add(bocasD);
        add(oesteD);
        add(panamaD);


    }

}
