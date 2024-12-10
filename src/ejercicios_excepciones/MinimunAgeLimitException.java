package ejercicios_excepciones;

public class MinimunAgeLimitException extends Exception {

	private static final long serialVersionUID = 1L;

	public MinimunAgeLimitException(String errorMessage) {
		super(errorMessage);
	}
}