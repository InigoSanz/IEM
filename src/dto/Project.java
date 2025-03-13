package dto;

/**
 * Ejercicio repaso Javi Spring (explicación simplificada).
 */
public class Project {

	private int id;
	private String nombre;

	public Project(int id) {
		this.id = id;
	}

	public Project(String nombre) {
		this.nombre = nombre;
	}

	
	
	@Override
	public String toString() {
		return "Project [id=" + id + ", nombre=" + nombre + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}