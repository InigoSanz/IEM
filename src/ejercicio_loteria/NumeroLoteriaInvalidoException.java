package ejercicio_loteria;

public class NumeroLoteriaInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;

	public NumeroLoteriaInvalidoException (String message) {
		super(message);
	}
}