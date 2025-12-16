import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class Interfaz extends JFrame {


    private static int boletointento = 0; 
    private static int incidenteintento = 0; 

   public Interfaz(){
        getContentPane().setBackground(Color.decode("#38052A"));  
        setUndecorated(false);
        getRootPane().setBorder(
            BorderFactory.createMatteBorder(5, 4, 5, 4, Color.decode("#979797"))
        );
        
        setSize(809, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        JLabel titulo = new JLabel("TERMINAL DE BUSES");
        titulo.setFont(new Font("Times New Roman", Font.BOLD, 25));
        titulo.setForeground(Color.decode("#758DAE"));
        titulo.setBounds(259,35, 350, 35);

        JLabel InterfazTitu = new JLabel("INICIAR SESIÓN");
        InterfazTitu.setFont(new Font("Times New Roman", Font.BOLD, 19));
        InterfazTitu.setForeground(Color.WHITE);
        InterfazTitu.setBounds(310, 146, 150, 20);

        JLabel enunciado = new JLabel("¿Quién eres?");
        enunciado.setFont(new Font("Times New Roman", Font.BOLD, 19));
        enunciado.setForeground(Color.WHITE);
        enunciado.setBounds(330, 190, 150, 20);


        ImageIcon iconosup = new ImageIcon("imagenes\\kim.jpg");
        JLabel separadorsup = new JLabel(iconosup);
        separadorsup.setBounds(28, 88, 738, 29);

        ImageIcon iconoinf = new ImageIcon("imagenes\\kim.jpg");
        JLabel separadorinf = new JLabel(iconoinf);
        separadorinf.setBounds(28, 548, 738, 29);

        JButton admin = new JButton("Administrador");
        admin.setFont(new Font("Times New Roman", Font.BOLD, 20));
        admin.setForeground(Color.decode("#EFB810"));
        admin.setBorderPainted(true);
        admin.setBorder(new LineBorder(Color.orange,4));
        admin.setBackground(Color.decode("#758DAE"));
        admin.setBounds(98, 299, 180, 80);

        JButton usuario = new JButton("Pasajero");
        usuario.setFont(new Font("Times New Roman", Font.BOLD, 20));
        usuario.setForeground(Color.decode("#EFB810"));
        usuario.setBorderPainted(true);
        usuario.setBorder(new LineBorder(Color.orange,4));
        usuario.setBackground(Color.decode("#758DAE"));
        usuario.setBounds(298, 299, 180, 80);

        JButton cond = new JButton("Conductor");
        cond.setFont(new Font("Times New Roman", Font.BOLD, 20));
        cond.setForeground(Color.decode("#EFB810"));
        cond.setBorderPainted(true);
        cond.setBorder(new LineBorder(Color.orange,4));
        cond.setBackground(Color.decode("#758DAE"));
        cond.setBounds(498, 299, 180, 80);

        JButton salir = new JButton("Salir");
        salir.setFont(new Font("Times New Roman", Font.BOLD, 20));
        salir.setForeground(Color.decode("#EFB810"));
        salir.setBorderPainted(true);
        salir.setBorder(new LineBorder(Color.orange,4));
        salir.setBackground(Color.decode("#758DAE"));
        salir.setBounds(298, 399, 180, 50);

        admin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usurvalido = "admin123";
                String contravalida = "qwerty123";
                String usuadmin = JOptionPane.showInputDialog("Ingrese su nombre de usuario:");
                if(usuadmin == null ){
                    JOptionPane.showMessageDialog(null, "Operación cancelada", 
                    "Cancelado", 
                    JOptionPane.INFORMATION_MESSAGE);
                    return;
                                    
                }

                String contra = JOptionPane.showInputDialog("Ingrese su contraseña:");
                if(contra == null ){
                    JOptionPane.showMessageDialog(null, "Operación cancelada", 
                    "Cancelado", 
                    JOptionPane.INFORMATION_MESSAGE);
                    return;                 
                }

                usuadmin = usuadmin.trim();
                contra = contra.trim();

          
                if(usuadmin.isEmpty() == false && contra.isEmpty() == false ){
                    if (usurvalido.equals(usuadmin) && contravalida.equals(contra)){
                        usurvalido = usurvalido.toUpperCase();
                        new Administrador(usurvalido, boletointento, incidenteintento);
                    }
                    else {
                    JOptionPane.showMessageDialog(null,
                        "El usuario o contraseña es inválida para continuar. Pruebe nuevamente.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null,
                    "Debe ingresar usuario y contraseña para continuar.",
                    "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        });

        usuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");

                if(nombre != null){
                    nombre = nombre.trim();
                    if(nombre.isEmpty() == false){
                        if(nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")){
                            boletointento = 1;
                            incidenteintento = 1;
                            Interfaz.this.dispose();
                            nombre = nombre.toUpperCase();
                            new Pasajero(nombre);
                        } 
                        else {
                            JOptionPane.showMessageDialog(null,
                            "El nombre solo puede contener letras (sin números ni caracteres especiales).",
                            "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null, 
                            "Debe ingresar un nombre para continuar.", 
                            "Error", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Operación cancelada", 
                    "Cancelado", 
                    JOptionPane.INFORMATION_MESSAGE);
                }
                
            }
        });

        cond.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usurvalido = "conductor_1";
                String contravalida = "qwerty123";

                String usuconductor = JOptionPane.showInputDialog("Ingrese su nombre de usuario:");
                if (usuconductor == null) {
                    JOptionPane.showMessageDialog(null, "Operación cancelada",
                    "Cancelado",
                    JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                String contra = JOptionPane.showInputDialog("Ingrese su contraseña:");
                if (contra == null) {
                    JOptionPane.showMessageDialog(null, "Operación cancelada",
                    "Cancelado",
                    JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                usuconductor = usuconductor.trim();
                contra = contra.trim();

                if (usuconductor.isEmpty() == false && contra.isEmpty() == false) {
                    if (usurvalido.equals(usuconductor) && contravalida.equals(contra)) {
                        new Conductor("José Alberto", boletointento, incidenteintento);
                    } 
                    else {
                        JOptionPane.showMessageDialog(null,
                        "El usuario o contraseña es inválida para continuar. Pruebe nuevamente.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                } 
                else {
                    JOptionPane.showMessageDialog(null,
                    "Debe ingresar usuario y contraseña para continuar.",
                    "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        });

        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        
        add(titulo);
        add(InterfazTitu);
        add(separadorsup);
        add(enunciado);
        add(admin);
        add(usuario);
        add(cond);
        add(separadorinf);
        add(salir);
        
        setVisible(true);
        
   } 

   public static void main(String[] args) {
        new Interfaz();
     }  
}