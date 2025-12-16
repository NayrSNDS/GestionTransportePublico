import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class Administrador extends JFrame{

    public static String usurvalido;

    public Administrador(String usurvalido, int boletointento, int incidenteintento){

        String nombre = usurvalido;

        getContentPane().setBackground(Color.decode("#84AE92"));  
        setUndecorated(false);
        getRootPane().setBorder(
            BorderFactory.createMatteBorder(7, 4, 5, 4, Color.decode("#EBF4DD"))
        );

        setSize(750, 350);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel bienvenida = new JLabel("Hola, " + nombre);
        bienvenida.setFont(new Font("Times New Roman", Font.ITALIC, 30));
        bienvenida.setForeground(Color.decode("#7642ED"));
        bienvenida.setBounds(58, 47, 700, 50);

        JLabel enunciado = new JLabel("¿Qué desea hacer?");
        enunciado.setFont(new Font("Times New Roman", Font.BOLD, 19));
        enunciado.setForeground(Color.BLACK);
        enunciado.setBounds(58, 107, 180, 20);

        JButton boleto = new JButton("Ver Boletos");
        boleto.setFont(new Font("Times New Roman", Font.BOLD, 20));
        boleto.setForeground(Color.decode("#222222")); 
        boleto.setBorderPainted(true);
        boleto.setBorder(new LineBorder(Color.orange,4));  
        boleto.setBackground(Color.decode("#F5E7C6")); 
        boleto.setBounds(78, 170, 180, 60);


        JButton incidentes = new JButton("Incidentes");
        incidentes.setFont(new Font("Times New Roman", Font.BOLD, 20));
        incidentes.setForeground(Color.decode("#222222")); 
        incidentes.setBorderPainted(true);
        incidentes.setBorder(new LineBorder(Color.orange,4));  
        incidentes.setBackground(Color.decode("#F5E7C6")); 
        incidentes.setBounds(279, 170, 180, 60);

        JButton salir = new JButton("Salir");
        salir.setFont(new Font("Times New Roman", Font.BOLD, 20));
        salir.setForeground(Color.decode("#222222")); 
        salir.setBorderPainted(true);
        salir.setBorder(new LineBorder(Color.YELLOW,4));  
        salir.setBackground(Color.decode("#F7B980")); 
        salir.setBounds(479, 170, 180, 60);

        boleto.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {

                if (boletointento == 0){
                    JOptionPane.showMessageDialog(null, "No hay ningún boleto aún.",
                     "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                else {
                    new Boleto(
                            CrearBoleto.ubicacionFinal,
                            CrearBoleto.destinoFinal,
                            CrearBoleto.turnoFinal,
                            CrearBoleto.horarioFinal,
                            CrearBoleto.pasajerosFinal,
                            CrearBoleto.precioFinal
                        );
                    }
                }
             });    


        incidentes.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (incidenteintento == 0){
                    JOptionPane.showMessageDialog(null, "No hay ningún boleto aún.",
                     "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                 else {
                    new Incidentes(
                        CrearIncidente.lugarFinal,
                        CrearIncidente.incidenteFinal,
                        CrearIncidente.fechaFinal,
                        CrearIncidente.personaFinal,
                        CrearIncidente.incidenteFinal

                    );
                    
                }
            }
        });

        salir.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                Administrador.this.dispose();
                new Interfaz();
            }
        });

        add(bienvenida);
        add(enunciado);
        add(boleto);
        add(incidentes);
        add(salir);




    }
}
