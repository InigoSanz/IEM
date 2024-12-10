package ejercicios_excepciones;

/**
 * Excepción para el ejercicio 14.
 */
public class NotReservedWordException extends Exception {

	private static final long serialVersionUID = 1L;

	public NotReservedWordException(String errorMessage) {
		super(errorMessage);
	}
}