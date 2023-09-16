package gui;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
	private JTextArea textArea;
	private boolean boton = false;
	
	public GUI(String tipo) {
		
			setTitle(tipo);
	        setSize(500, 600); // Set the desired size
	        setResizable(false); // Disable frame resizing
	        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	        setLocation(50, 60);
	        
	        JLabel label = new JLabel(tipo);
	        label.setFont(new Font("Arial", Font.BOLD, 18)); // Set font and size
	        label.setForeground(Color.red); // Set text color
	        label.setBounds(190, 20, 200, 20);

	        // Add label to the frame's content pane
	        getContentPane().setLayout(null);
	        getContentPane().add(label);
	        
	        textArea = new JTextArea();
	        textArea.setLineWrap(true); // Enable line wrapping
	        textArea.setWrapStyleWord(true); // Wrap at word boundaries
	        textArea.setFont(new Font("Arial", Font.BOLD, 20));

	        
	        if (tipo=="Monitoreo") {
				boton = true;
				textArea.setText("Hora Actual: XXX \nVelocidad Actual: XXX");
			}
	        if (tipo=="Fuentes de energía")
	        {
	        	textArea.setText("Fuentes eólicas:\nFuente 0.  Estado: XXX\nFuente 1.  Estado: XXX\n\nFuentes extra:\nFuente 1.  Estado: XXX");
	        	
	        }
	        if (tipo=="Red de energía")
	        {
	        	textArea.setText("Energía actual: XXX");
	        	
	        }
	        
	        Rectangle textAreaBounds = new Rectangle(50, 60, 380, 450);
	        textArea.setBounds(textAreaBounds);
	        textArea.setEditable(false);
	        
	        if (boton) {
	        	JButton button1 = new JButton("Avanzar hora");
		        button1.setBounds(100, 500, 125, 50);
		        getContentPane().add(button1);
	        }
	        
	        
	     // Add buttons to the frame's content pane
	        
	        
	        // Add text area to the frame's content pane
	        getContentPane().add(textArea);    
	        
	        // Set null layout
	        getContentPane().setLayout(null);
	    }

	public static void main(String[] args) {
		GUI monitoreo = new GUI("Monitoreo");
		GUI fuentes = new GUI("Fuentes de energía");
		GUI red = new GUI("Red de energía");
		monitoreo.setVisible(true);
		fuentes.setVisible(true);
		red.setVisible(true);
	}
		

	}
