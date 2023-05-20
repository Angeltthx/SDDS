package co.edu.unbosque.view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.util.Properties;

public class VistaVentana {
    private VistaIngresar Vi;
    private JPanel panel = new JPanel();
    private JPanel panel2 = new JPanel();
    private JFrame ventana;
    
    public void JFrame() {
	   this.ventana = new JFrame("Mi ventana"); 
    }

    public void ventana() {
    	JFrame();
        panel.setBackground(new Color(0, 0, 1));
        panel.setLayout(null);

        JLabel titulo = new JLabel("Bienvenido");
        titulo.setFont(new Font("Arial", Font.BOLD, 48));
        titulo.setForeground(Color.white);
        titulo.setBounds(350, 50, 500, 50);

        JButton ingresar = new JButton("INGRESAR");
        ingresar.setBounds(270, 230, 180, 30);
        ingresar.setBackground(new Color(234, 190, 17));
        ingresar.setForeground(Color.BLACK);
        ingresar.setFont(new Font("Arial", Font.BOLD, 18));

        ingresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	ingresar();
            }
        });

        JButton registrarse = new JButton("REGISTRARSE");
        registrarse.setBounds(485, 230, 180, 30);
        registrarse.setBackground(new Color(234, 190, 17));
        registrarse.setForeground(Color.BLACK);
        registrarse.setFont(new Font("Arial", Font.BOLD, 18));
        
        registrarse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	registrarse();
            }
        });
        
        // Agrega los componentes al JPanel
        panel.add(titulo);
        panel.add(ingresar);
        panel.add(registrarse);
        // Agrega el JPanel a la ventana y configura la ventana
        ventana.add(panel);
        ventana.setSize(1000, 500);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }

    public void ingresar() {
    	 panel.removeAll();
         JLabel nuevoTitulo = new JLabel("Sistema Academico en Linea");
         nuevoTitulo.setFont(new Font("Arial", Font.BOLD, 20));
         nuevoTitulo.setForeground(Color.white);
         nuevoTitulo.setBounds(300, 110, 1000, 100);
         
         JTextField campoUsuario = new JTextField("USUARIO");
         JTextField campoContraseña = new JTextField("CONTRASEÑA");
         campoUsuario.setBounds(250, 200, 400, 30);
         campoUsuario.setOpaque(false);
         campoUsuario.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseClicked(MouseEvent e) {
            	 
            	 campoUsuario.setText("");
             }
         });
         
         campoContraseña.setBounds(250, 240, 400, 30);
         campoContraseña.setOpaque(false); 
         campoContraseña.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseClicked(MouseEvent e) {
            	 
                 campoContraseña.setText("");
             }
         });
         
         JButton botonEntrar = new JButton("ENTRAR");
         botonEntrar.setBounds(500, 290, 140, 30);
         botonEntrar.setBackground(new Color(234, 190, 17));
         botonEntrar.setForeground(Color.BLACK);
         botonEntrar.setFont(new Font("Arial", Font.BOLD, 18));
         botonEntrar.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
            	 String usuario = campoUsuario.getText();
                 String contraseña = campoContraseña.getText();

                 // Aquí puedes realizar la verificación de usuario y contraseña
                 if (usuario.equals("laura123") && contraseña.equals("123456789")) {
                     // Las credenciales son correctas, puedes continuar con la lógica deseada
                     Sistema_Academico();
                 } else {
                     // Las credenciales son incorrectas, muestra un mensaje de error
                     JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectas", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
                 }
               
             }
         });
         JButton botonAtras = new JButton("ATRAS");
   	     botonAtras.setBounds(10, 10, 95, 20);
   	     botonAtras.setBackground(new Color(234, 190, 17));
   	     botonAtras.setForeground(Color.BLACK);
   	     botonAtras.setFont(new Font("Arial", Font.BOLD, 15));
   	     botonAtras.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
        	panel.removeAll();
        	ventana.dispose();
        	ventana();
          	ventana.revalidate();
            ventana.repaint();
           }
         });
         

         // Agrega la barra de búsqueda y el botón al panel
         panel.add(campoUsuario);
         panel.add(campoContraseña);
         panel.add(botonEntrar);
         panel.add(botonAtras);
         panel.add(nuevoTitulo);
         // Actualiza la ventana para mostrar los cambios
         ventana.revalidate();
         ventana.repaint();
    }
   
    public void registrarse() {
    	panel.removeAll();
    	  JLabel t_registrar = new JLabel("Sistema Academico en Linea");
    	  t_registrar.setFont(new Font("Arial", Font.BOLD, 20));
    	  t_registrar.setForeground(Color.white);
    	  t_registrar.setBounds(300, 20, 1000, 100);
    	  
    	  JTextField campoGmail = new JTextField("CORREO ELECTRONICO");
    	  JTextField campoGmailAlternativo = new JTextField("CORREO ALTERNATIVO");
    	  JTextField campoUser = new JTextField("USUARIO");
    	  JTextField CampoGenero = new JTextField("GENERO");
    	  JTextField CampoJornada = new JTextField("JORNADA");
    	  JTextField CampoLNacimiento = new JTextField("LUGAR DE NACIMIENTO");
          JTextField campoContraseña = new JTextField("CONTRASEÑA");
          JTextField campoReContraseña = new JTextField("REPETIR CONTRASEÑA");
          campoGmail.setBounds(250, 90, 400, 25);
          campoGmailAlternativo.setBounds(250, 125, 400, 25);
          campoUser.setBounds(250, 160, 400, 25);
          CampoGenero.setBounds(250, 195, 400, 25);
          CampoJornada.setBounds(250, 230, 400, 25);
          CampoLNacimiento.setBounds(250, 265, 400, 25);
          campoContraseña.setBounds(250, 300, 400, 25);
          campoReContraseña.setBounds(250, 335, 400, 25);
          
          
    	  JButton botonRegistrarse = new JButton("REGISTRASE");
    	  botonRegistrarse.setBounds(350, 370, 170, 30);
    	  botonRegistrarse.setBackground(new Color(234, 190, 17));
    	  botonRegistrarse.setForeground(Color.BLACK);
    	  botonRegistrarse.setFont(new Font("Arial", Font.BOLD, 18));
    	  botonRegistrarse.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
            	
            	Sistema_Academico();
                
              }
          });
    	  
    	  JButton botonAtras = new JButton("ATRAS");
    	  botonAtras.setBounds(10, 10, 95, 20);
    	  botonAtras.setBackground(new Color(234, 190, 17));
    	  botonAtras.setForeground(Color.BLACK);
    	  botonAtras.setFont(new Font("Arial", Font.BOLD, 15));
    	  botonAtras.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
            	panel.removeAll();
            	ventana.dispose();
            	ventana();
              	ventana.revalidate();
                ventana.repaint();
                
              }
          });
          
    	  panel.add(botonAtras);
    	  panel.add(t_registrar);
    	  panel.add(campoGmail);
    	  panel.add(campoGmailAlternativo);	
          panel.add(campoUser);
          panel.add(CampoGenero);
          panel.add(CampoJornada);
          panel.add(CampoLNacimiento);
          panel.add(campoContraseña);
          panel.add(campoReContraseña);
          panel.add(botonRegistrarse);
          ventana.revalidate();
          ventana.repaint();
    }
    
    public void Sistema_Academico() {
    	panel.removeAll();
    	 JLabel Cursos = new JLabel("NOMBRE DEL ESTUDIANTE");
    	 Cursos.setFont(new Font("Arial", Font.BOLD, 20));
    	 Cursos.setForeground(Color.white);
    	 Cursos.setBounds(20, 20, 500, 100);
    	 
    	 JLabel materia1 = new JLabel("ALGEBRA LINEAL");
    	 materia1.setFont(new Font("Arial", Font.BOLD, 20));
    	 materia1.setForeground(Color.white);
    	 materia1.setBounds(20, 60, 500, 100);
    	 
    	 JLabel materia2 = new JLabel("CALCULO");
    	 materia2.setFont(new Font("Arial", Font.BOLD, 20));
    	 materia2.setForeground(Color.white);
    	 materia2.setBounds(20, 90, 500, 100);
    	 
    	 JLabel materia3 = new JLabel("PROGRAMACION I");
    	 materia3.setFont(new Font("Arial", Font.BOLD, 20));
    	 materia3.setForeground(Color.white);
    	 materia3.setBounds(20, 120, 500, 100);
    	 
         panel.add(Cursos);
         panel.add(materia1);
         panel.add(materia2);
         panel.add(materia3);
         ventana.revalidate();
         ventana.repaint();
    }
}