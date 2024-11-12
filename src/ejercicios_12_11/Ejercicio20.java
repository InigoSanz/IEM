package ejercicios_12_11;

/**
 * Completar la tabla de verdad del operador lógico AND.
 */
public class Ejercicio20 {

	public static void main(String[] args) {
		
		boolean[] values = {true, false};
		
		System.out.println("  A    B    AND");
		
		// Utilizamos un for each para recorrer cada valor de values y asignarselo a "a" y a "b"
		for(boolean a: values) {
			for(boolean b: values) {
				System.out.println(a + " " +  b + " " + (a && b));
			}
		}

	}

}