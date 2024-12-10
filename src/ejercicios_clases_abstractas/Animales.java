package ejercicios_clases_abstractas;

public abstract class Animales {
	
	private String raza;
	private String color;
	private String nombre;
	
	public Animales(String raza, String nombre, String color) {
		this.raza = raza;
		this.nombre = nombre;
		this.color = color;
	}

	public String getRaza() {
		return raza;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	abstract int nPata();
	
	public String toString() {
		return "es " + this.raza +
				" se llama " + this.nombre +
				" y es de color " + this.color;
	}
}