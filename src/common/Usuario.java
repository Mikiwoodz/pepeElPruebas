package common;

public class Usuario {

	private String nombre;
	private String apellidos;
	private int edad;
	private String descripcion;
	
	
	public Usuario(String nombre, String apellidos, int edad, String descripcion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.descripcion = descripcion;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String toString() {
		
		return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", descripcion="
				+ descripcion + "]";
	}
	
}
