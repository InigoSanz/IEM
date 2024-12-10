package ejercicios_excepciones;

public class MaximumAgeLimitException extends Exception {

	private static final long serialVersionUID = 1L;

	public MaximumAgeLimitException(String errorMessage) {
		super(errorMessage);
	}
}