import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class Pasajero extends JFrame {
    
    private static int intento = 0; 
    
    public static String nombreUsuario;
    public Pasajero(String nombre){
        
        nombreUsuario = nombre;
        getContentPane().setBackground(Color.decode("#FAF3E1"));  
        setUndecorated(false);
        getRootPane().setBorder(
            BorderFactory.createMatteBorder(5, 4, 5, 4, Color.decode("#FF6D1F"))
        );

        

        JLabel bienvenida = new JLabel("Hola, " + nombre);
        bienvenida.setFont(new Font("Times New Roman", Font.ITALIC, 30));
        bienvenida.setForeground(Color.decode("#7642ED"));
        bienvenida.setBounds(58, 47, 700, 50);

        JLabel enunciado = new JLabel("¿Qué desea hacer?");
        enunciado.setFont(new Font("Times New Roman", Font.BOLD, 19));
        enunciado.setForeground(Color.BLACK);
        enunciado.setBounds(58, 107, 180, 20);



        JButton cboleto = new JButton("Cotizar Boleto");
        cboleto.setFont(new Font("Times New Roman", Font.BOLD, 20));
        cboleto.setForeground(Color.decode("#222222")); //letra
        cboleto.setBorderPainted(true);
        cboleto.setBorder(new LineBorder(Color.orange,4));  //lineas
        cboleto.setBackground(Color.decode("#F5E7C6")); //fondo boton
        cboleto.setBounds(78, 170, 180, 60);

        JButton vboleto = new JButton("Ver Boleto");
        vboleto.setFont(new Font("Times New Roman", Font.BOLD, 20));
        vboleto.setForeground(Color.decode("#222222")); //letra
        vboleto.setBorderPainted(true);
        vboleto.setBorder(new LineBorder(Color.orange,4));  //lineas
        vboleto.setBackground(Color.decode("#F5E7C6")); //fondo boton
        vboleto.setBounds(279, 170, 180, 60);

        JButton incidentes = new JButton("Reporte de Incidente");
        incidentes.setFont(new Font("Times New Roman", Font.BOLD, 20));
        incidentes.setForeground(Color.decode("#222222")); //letra
        incidentes.setBorderPainted(true);
        incidentes.setBorder(new LineBorder(Color.orange,4));  //lineas
        incidentes.setBackground(Color.decode("#F5E7C6")); //fondo boton
        incidentes.setBounds(479, 170, 210, 60);

        JButton salir = new JButton("Salir");
        salir.setFont(new Font("Times New Roman", Font.BOLD, 20));
        salir.setForeground(Color.decode("#222222")); //letra
        salir.setBorderPainted(true);
        salir.setBorder(new LineBorder(Color.YELLOW,4));  //lineas
        salir.setBackground(Color.decode("#F7B980")); //fondo boton
        salir.setBounds(279, 250, 180, 60);


        cboleto.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                Pasajero.this.dispose();
                intento = 1;
                new CrearBoleto(nombreUsuario);
                
            }
        });    

        vboleto.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {

                if ( intento != 0){
                    Pasajero.this.dispose();
                    new Pasajero(nombre);
                    new Boleto(
                        CrearBoleto.ubicacionFinal,
                        CrearBoleto.destinoFinal,
                        CrearBoleto.turnoFinal,
                        CrearBoleto.horarioFinal,
                        CrearBoleto.pasajerosFinal,
                        CrearBoleto.precioFinal
                    );
                }
                else {
                    JOptionPane.showMessageDialog(null,
                        "Debe crear un Boleto primero.",
                        "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        incidentes.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                Pasajero.this.dispose();
                new CrearIncidente(nombre);
            }
        });

        salir.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                Pasajero.this.dispose();
                new Interfaz();
            }
        });
        
        add(bienvenida);
        add(enunciado);
        add(cboleto);
        add(vboleto);
        add(incidentes);
        add(salir);


        setSize(780, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

    }

    
}
