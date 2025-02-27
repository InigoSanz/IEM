package ejercicios_refuerzo_juego;

public class VehiculoPadre {

	private int distanciaRecorrida;
	private int combustible;
	private String nombre;

	public VehiculoPadre(String nombre) {
		this.nombre = nombre;
		this.distanciaRecorrida = 0;
		this.combustible = 50;
	}

	public int getDistanciaRecorrida() {
		return distanciaRecorrida;
	}

	public void setDistanciaRecorrida(int distanciaRecorrida) {
		this.distanciaRecorrida = distanciaRecorrida;
	}

	public int getCombustible() {
		return combustible;
	}

	public void setCombustible(int combustible) {
		this.combustible = combustible;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}