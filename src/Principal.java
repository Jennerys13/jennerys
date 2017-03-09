import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.JList;
import java.awt.Panel;
import java.awt.Button;
import java.awt.Choice;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private Choice lista;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel listaDeArboles = new JLabel("Lista de Arboles");
		listaDeArboles.setHorizontalAlignment(SwingConstants.CENTER);
		listaDeArboles.setFont(new Font("Sitka Small", Font.BOLD, 18));
		listaDeArboles.setBounds(131, 27, 177, 43);
		contentPane.add(listaDeArboles);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(151, 89, 134, 28);
		contentPane.add(comboBox);
		
		JButton abrirFormulario = new JButton("Abrir Formulario");
		abrirFormulario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		abrirFormulario.setFont(new Font("Sitka Small", Font.BOLD, 16));
		abrirFormulario.setBounds(131, 214, 177, 36);
		contentPane.add(abrirFormulario);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		contentPane.add(menuBar);
		
		JMenu gestion = new JMenu("Gestion");
		gestion.setFont(new Font("Sitka Small", Font.BOLD, 15));
		menuBar.add(gestion);
		
		JMenuItem insertar = new JMenuItem("Insertar");
		insertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				accion();
			}
		});
		insertar.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		insertar.setHorizontalAlignment(SwingConstants.LEFT);
		gestion.add(insertar);
			
		
		JMenuItem borrar = new JMenuItem("Borrar");
		borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		borrar.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		gestion.add(borrar);
	}

	public void accion() {
		Datos hija=new Datos();
		hija.setVisible(true);
		
	}
	public void aniadir(Arbol arbol){
		lista.addItem(arbol.nombre +" "+arbol.zona+" "+arbol.altura);
	}
}
