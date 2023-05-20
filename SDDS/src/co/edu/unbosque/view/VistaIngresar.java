package co.edu.unbosque.view;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VistaIngresar extends JPanel {
	
	    public VistaIngresar() {
	     ingresar();
	    }
	
	
	
	public void ingresar() {	  // Configura el JPanel con un layout y color de fondo
		   // Crea un layout de cuadrícula
        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);

        // Crea dos etiquetas de texto y dos campos de texto
        JLabel label1 = new JLabel("Etiqueta 1:");
        JLabel label2 = new JLabel("Etiqueta 2:");
        JTextField campo1 = new JTextField(20);
        JTextField campo2 = new JTextField(20);

        // Configura las restricciones del layout para la primera etiqueta
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0; // Posición horizontal
        c.gridy = 0; // Posición vertical
        c.anchor = GridBagConstraints.LINE_END; // Alinea la etiqueta a la derecha
        c.insets = new Insets(10, 10, 0, 10); // Espacio alrededor de la etiqueta
        add(label1, c); // Agrega la etiqueta al panel

        // Configura las restricciones del layout para el primer campo de texto
        c = new GridBagConstraints();
        c.gridx = 1; // Posición horizontal
        c.gridy = 0; // Posición vertical
        c.anchor = GridBagConstraints.LINE_START; // Alinea el campo de texto a la izquierda
        c.insets = new Insets(10, 0, 0, 10); // Espacio alrededor del campo de texto
        add(campo1, c); // Agrega el campo de texto al panel

        // Configura las restricciones del layout para la segunda etiqueta
        c = new GridBagConstraints();
        c.gridx = 0; // Posición horizontal
        c.gridy = 1; // Posición vertical
        c.anchor = GridBagConstraints.LINE_END; // Alinea la etiqueta a la derecha
        c.insets = new Insets(10, 10, 10, 10); // Espacio alrededor de la etiqueta
        add(label2, c); // Agrega la etiqueta al panel

        // Configura las restricciones del layout para el segundo campo de texto
        c = new GridBagConstraints();
        c.gridx = 1; // Posición horizontal
        c.gridy = 1; // Posición vertical
        c.anchor = GridBagConstraints.LINE_START; // Alinea el campo de texto a la izquierda
        c.insets = new Insets(10, 0, 10, 10); // Espacio alrededor del campo de texto
        add(campo2, c); // Agrega el campo de texto al panel
		
		
	}

}
