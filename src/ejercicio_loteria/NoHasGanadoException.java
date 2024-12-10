package ejercicio_loteria;

public class NoHasGanadoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public NoHasGanadoException (String message) {
		super(message);
	}
}