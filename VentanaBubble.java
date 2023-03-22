/*****************************************************
 * Autor:Herrera Lopez Giovnny                       *
 * Fecha de creacion:  20 de Marzo                   *
 * Fecha de modificacion: 21 de Marzo                *
 * Descrpcion: Metodo burbuja con interfaz grafica   *
 ****************************************************/
package Tarea;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaBubble extends JFrame implements  ActionListener {

	//Metodos 
	private JLabel etiqueta;
	private JButton btnEnviar;
	private JPanel panel;
	private JTextField valx;
	
	// Constructores (vacios)
	 public VentanaBubble() {
		   panel = new JPanel();
		    panel.setBounds(10, 10, 380, 380);
		    panel.setBackground(Color.gray);
		    panel.setLayout(null);
		    add(panel);

		    etiqueta = new JLabel("Ordenamiento Burbuja");
		    etiqueta.setBounds(10, 10, 200, 50);
		    panel.add(etiqueta);

		    etiqueta = new JLabel("Números (separados por coma): ");
		    etiqueta.setBounds(10, 50, 200, 20);
		    panel.add(etiqueta);

		    valx = new JTextField();
		    valx.setBounds(200, 25, 150, 20);
		    panel.add(valx);

		    btnEnviar = new JButton("Enviar");
		    btnEnviar.setBounds(50, 150, 300, 40);
		    btnEnviar.addActionListener(this);
		    panel.add(btnEnviar);

		    setResizable(false);
		    setLayout(null);
		    setSize(400, 250);
		    setVisible(true);
		    centerFrame(this);
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		 
	 }
		public static void centerFrame(JFrame frame) {
		    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		    int w = frame.getSize().width;
		    int h = frame.getSize().height;
		    int x = (dim.width - w) / 2;
		    int y = (dim.height - h) / 2;
		    frame.setLocation(x, y);
		}
	 
	 //metodos
	 public static void main(String[] args) {
		    new VentanaBubble();
		}
	 
	 @Override
	 public void actionPerformed(ActionEvent e) {
	     if(e.getSource()== btnEnviar) {
	         System.out.println("Click");

	         etiqueta.setText("Resultado: ");
	         etiqueta.setBounds(20,100, 120,20);

	         String[] numeros = valx.getText().split(", ");
	         int[] array = new int[numeros.length];
	         for (int i = 0; i < numeros.length; i++) {
	             array[i] = Integer.parseInt(numeros[i].trim());
	         }

	         burbuja(array);

	         String resultado = "";
	         for (int i = 0; i < array.length; i++) {
	             resultado += array[i] + " ";
	         }

	         System.out.println("Resultado:  " + resultado);
	         JOptionPane.showMessageDialog(null, "Resultado: " + resultado, "Ordenamiento Burbuja", JOptionPane.INFORMATION_MESSAGE);

	     }

	 }

	 private void burbuja(int[] array) {
	     int num = array.length;
	     for (int i = 0; i < num-1; i++) {
	         for (int j = 0; j < num-i-1; j++) {
	             if (array[j] > array[j+1]) {
	             
	                 // Funcion para hacer el intercambio de arreglos
	                 int temp = array[j];
	                 array[j] = array[j+1];
	                 array[j+1] = temp;
	             }
	         }
	     }
	 }
	 
	 
}