package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class JFPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldApellidos;
	private JTable table;
	private JTextField textFieldDescripcion;
	private JTextField textFieldDni;
	private JSpinner spinnerEdad;
	private JButton btnSimular;
	private JButton btnAñadir;
	private JButton btnEliminar;
	private JButton btnActualizar;

	/**
	 * Create the frame.
	 */
	public JFPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 813, 688);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panelCentral = new JPanel();
		
		JPanel panelInferior = new JPanel();
		
		JPanel panelSuperior = new JPanel();
		
		JScrollPane scrollPane = new JScrollPane();
		
		table = new JTable();
		scrollPane.setViewportView(table);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panelSuperior, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(scrollPane, Alignment.LEADING)
						.addComponent(panelInferior, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelCentral, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(7))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelSuperior, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panelCentral, GroupLayout.PREFERRED_SIZE, 415, GroupLayout.PREFERRED_SIZE)
							.addGap(53))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 415, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(panelInferior, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addContainerGap(11, Short.MAX_VALUE))
		);
		panelInferior.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		btnSimular = new JButton("Simular");
		panelInferior.add(btnSimular);
		
		btnAñadir = new JButton("A\u00F1adir");
		panelInferior.add(btnAñadir);
		
		btnEliminar = new JButton("Eliminar");
		panelInferior.add(btnEliminar);
		
		btnActualizar = new JButton("Actualizar");
		panelInferior.add(btnActualizar);
		panelCentral.setLayout(new BorderLayout(0, 0));
		
		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		
		textFieldApellidos = new JTextField();
		textFieldApellidos.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		
		JLabel lblDni = new JLabel("Dni");
		
		JLabel lblEdad = new JLabel("Edad");
		
		textFieldDni = new JTextField();
		textFieldDni.setColumns(10);
		
		spinnerEdad = new JSpinner();
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		
		textFieldDescripcion = new JTextField();
		textFieldDescripcion.setColumns(10);
		GroupLayout gl_panelSuperior = new GroupLayout(panelSuperior);
		gl_panelSuperior.setHorizontalGroup(
			gl_panelSuperior.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelSuperior.createSequentialGroup()
					.addGroup(gl_panelSuperior.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelSuperior.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_panelSuperior.createSequentialGroup()
								.addComponent(lblNombre)
								.addGap(23))
							.addGroup(gl_panelSuperior.createSequentialGroup()
								.addComponent(lblNewLabel_1)
								.addGap(18))
							.addGroup(gl_panelSuperior.createSequentialGroup()
								.addComponent(lblDni)
								.addGap(45)))
						.addComponent(lblEdad))
					.addGap(18)
					.addGroup(gl_panelSuperior.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelSuperior.createSequentialGroup()
							.addComponent(spinnerEdad, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_panelSuperior.createParallelGroup(Alignment.LEADING, false)
							.addComponent(textFieldApellidos)
							.addComponent(textFieldNombre, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
							.addComponent(textFieldDni)))
					.addPreferredGap(ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
					.addComponent(lblDescripcion)
					.addGap(31)
					.addComponent(textFieldDescripcion, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE))
		);
		gl_panelSuperior.setVerticalGroup(
			gl_panelSuperior.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelSuperior.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelSuperior.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelSuperior.createSequentialGroup()
							.addGroup(gl_panelSuperior.createParallelGroup(Alignment.BASELINE)
								.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNombre))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panelSuperior.createParallelGroup(Alignment.BASELINE)
								.addComponent(textFieldApellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panelSuperior.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDni)
								.addComponent(textFieldDni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panelSuperior.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblEdad)
								.addComponent(spinnerEdad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panelSuperior.createParallelGroup(Alignment.BASELINE)
							.addComponent(textFieldDescripcion, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
							.addComponent(lblDescripcion)))
					.addContainerGap())
		);
		panelSuperior.setLayout(gl_panelSuperior);
		contentPane.setLayout(gl_contentPane);
	}
	
	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextField getTextFieldNombre() {
		return textFieldNombre;
	}

	public JTextField getTextFieldApellidos() {
		return textFieldApellidos;
	}

	public JTable getTable() {
		return table;
	}

	public JTextField getTextFieldDescripcion() {
		return textFieldDescripcion;
	}

	public JTextField getTextFieldDni() {
		return textFieldDni;
	}

	public JSpinner getSpinnerEdad() {
		return spinnerEdad;
	}

	public JButton getBtnSimular() {
		return btnSimular;
	}

	public JButton getBtnAñadir() {
		return btnAñadir;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public JButton getBtnActualizar() {
		return btnActualizar;
	}
}
