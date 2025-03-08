package ejercicios_refuerzo_juego;

/**
 * Interfaz para los vehículos.
 */
public interface InterfazVehiculo {
	
	/**
	 * Método que permite acelerar un vehículo.
	 * Se implementa en los tipos de vehículos.
	 */
	public void acelerar();
	
	/**
	 * Método que permite frenar un vehículo.
	 * Se implementa en los tipos de vehículos.
	 */
	public void frenar();
}