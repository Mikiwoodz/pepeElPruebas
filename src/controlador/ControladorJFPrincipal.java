package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Set;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import common.Usuario;
import view.JFPrincipal;

public class ControladorJFPrincipal implements ActionListener{

	private JFPrincipal vista;
	private ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();
	private int contar;

	
	public ControladorJFPrincipal(JFPrincipal vista) {
		
		super();
		this.vista = vista;
		inicializar();
		
	}

	public void comenzar() {
		
		vista.setVisible(true);
		actualizarTabla();
		
	}
	
	private void inicializar() {
		
		//Creamos los action listener
		vista.getBtnSimular().addActionListener(this);
		vista.getBtnAñadir().addActionListener(this);
		vista.getBtnEliminar().addActionListener(this);
		vista.getBtnActualizar().addActionListener(this);
		
		//Creamos los action command
		vista.getBtnSimular().setActionCommand("Simular");
		vista.getBtnAñadir().setActionCommand("Añadir");
		vista.getBtnEliminar().setActionCommand("Eliminar");
		vista.getBtnActualizar().setActionCommand("Actualizar");
		
	}

	public void actionPerformed(ActionEvent arg0) {
		
		String command = arg0.getActionCommand();
		
		if ( command == "Simular") {
			
			simular();
			
		}else if(command == "Añadir") {
			
			añadir();
		}else if(command == "Eliminar") {
			
			eliminar();
		}else if(command == "Actualizar") {
			
			actualizar();
		}
		
		
		
	}

	private void actualizarTabla() {
		
		DefaultTableModel dtm = new DefaultTableModel();
		
		dtm.addColumn("Id");
		dtm.addColumn("Nombre");
		dtm.addColumn("Apellidos");
		dtm.addColumn("Edad");
		dtm.addColumn("Descripcion");
		
		vista.getTable().setModel(dtm);
		
	}

	private void actualizar() {
		// TODO Auto-generated method stub
		
	}

	private void eliminar() {
		// TODO Auto-generated method stub
		
	}

	private void añadir() {
		
		
		((DefaultTableModel) vista.getTable().getModel()).setRowCount(0);
		
		Vector row = new Vector();
		listaUsuario.add(creacionUsuario());
		
		System.out.println(listaUsuario);
		for (Usuario user : listaUsuario) {
			
			row.add(1);
			row.add( user.getNombre());
			row.add( user.getApellidos()); 
			row.add( user.getEdad()); 
			row.add( user.getDescripcion()); 
			
			((DefaultTableModel) vista.getTable().getModel()).addRow(row);
		   
		}
		
		
		   	
	}
	
	private Usuario creacionUsuario() {
		
		String nombre = vista.getTextFieldNombre().getText();
		String apellidos = vista.getTextFieldApellidos().getText();
		int edad = (int) vista.getSpinnerEdad().getValue();
		String descripcion= vista.getTextFieldDescripcion().getText();
		

		Usuario u = new Usuario(nombre,apellidos,edad,descripcion);
		
		return u;
		
	}

	private void simular() {
		// TODO Auto-generated method stub
		
	}
	
		
	

}
