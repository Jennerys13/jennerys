import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import java.awt.List;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Datos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField nombre;
	private JTextField zona;
	private JTextField altura;

	/**
	 * Create the dialog.
	 */
	public Datos(java.awt.Frame parent, boolean modal) {

		super(parent, modal);

		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton insertarArbol = new JButton("Insertar Arbol");
			insertarArbol.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					accion();
				}
			});
			insertarArbol.setFont(new Font("Sitka Small", Font.BOLD, 15));
			insertarArbol.setBounds(138, 219, 149, 30);
			contentPanel.add(insertarArbol);
			insertarArbol.setActionCommand("OK");
			getRootPane().setDefaultButton(insertarArbol);
		}
		{
			JLabel lblIntroducirDatos = new JLabel("Introducir Datos");
			lblIntroducirDatos.setFont(new Font("Sitka Small", Font.BOLD, 18));
			lblIntroducirDatos.setHorizontalAlignment(SwingConstants.CENTER);
			lblIntroducirDatos.setBounds(128, 24, 172, 30);
			contentPanel.add(lblIntroducirDatos);
		}
		{
			JLabel nombre = new JLabel("Nombre:");
			nombre.setHorizontalAlignment(SwingConstants.CENTER);
			nombre.setFont(new Font("Sitka Small", Font.BOLD, 16));
			nombre.setBounds(56, 76, 81, 24);
			contentPanel.add(nombre);
		}
		{
			JLabel zona = new JLabel("Zona:");
			zona.setHorizontalAlignment(SwingConstants.CENTER);
			zona.setFont(new Font("Sitka Small", Font.BOLD, 17));
			zona.setBounds(66, 111, 64, 30);
			contentPanel.add(zona);
		}
		{
			JLabel alturaMedia = new JLabel("Altura media:");
			alturaMedia.setFont(new Font("Sitka Small", Font.BOLD, 16));
			alturaMedia.setHorizontalAlignment(SwingConstants.CENTER);
			alturaMedia.setBounds(10, 152, 127, 30);
			contentPanel.add(alturaMedia);
		}
		{
			nombre = new JTextField();
			nombre.setBounds(157, 79, 172, 20);
			contentPanel.add(nombre);
			nombre.setColumns(10);
		}
		{
			zona = new JTextField();
			zona.setBounds(157, 116, 115, 20);
			contentPanel.add(zona);
			zona.setColumns(10);
		}
		{
			altura = new JTextField();
			altura.setBounds(157, 158, 86, 20);
			contentPanel.add(altura);
			altura.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(null);
		}
	}

	public void accion() {
		Arbol arbol = new Arbol(nombre.getText(), zona.getText(), Double.parseDouble(altura.getText()));
		((Principal)this.getParent()).aniadir(arbol);
		this.dispose();
	}
}
