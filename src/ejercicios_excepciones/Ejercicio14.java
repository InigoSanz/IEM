package ejercicios_excepciones;

import java.util.Scanner;

/**
 * Vamos a realizar un programa que dada una palabra introducida por el usuario nos diga si es una palabra reservada de java o no.
 * La busqueda de la palabra reservada debe estar en un método especifico para eso.
 * Si no la encuentra, debe lanzar una excepcion indicando que es apalabra no es una palabra reservada de Java.
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		
		String[] reservedWords = {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
	            "continue", "default", "do", "double", "else", "enum", "extends", "false", "final", "finally",
	            "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long",
	            "native", "new", "null", "package", "private", "protected", "public", "return", "short", "static",
	            "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "true",
	            "try", "void", "volatile", "while"};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce una palabara para saber si es una palabra reservada de Java: ");
		
		String word = scanner.nextLine();
		
		scanner.close();
		
		 try {
			 esReservada(word, reservedWords);
			 System.out.printf("La palabra -> %s <- es una palabra reservada de Java.\n", word);
		 } catch (NotReservedWordException e) {
			 System.err.println(e.getMessage());
		 }
	}
	
	// Javi aqui en vez de devolver el mensaje de error o validación, devuelve un boolean y en la captura de la excepción devuelve el mensaje
	public static boolean esReservada(String word, String[] reservedWords) throws NotReservedWordException {
		
		boolean isTrue = false;
		
		for (String reservedWord : reservedWords) { // For Each para recorrer todas las palabras del array
			if (reservedWord.equals(word)) { // Lo intente usando contains, pero al parecer en un array no se puede utilizar
				isTrue = true;
				break; // Aqui tuve que cambiar el exit, ya que lo único que queremos es salir del bucle y que vaya a manageResult().
			}
		}
		
		try {
			return manageResult(isTrue, word); // Captura la excepcion lanzada por manageResult y lanza una nueva excepcion que capturara el Main
		} catch (NotReservedWordException e) {
			System.err.println(e.getMessage());
			throw new NotReservedWordException("Este mensaje solo se muestra si no es una palabra reservada.");
		}		
	}
	
	public static boolean manageResult(boolean isTrue, String word) throws NotReservedWordException {
		if (!isTrue) {
			throw new NotReservedWordException("La palabra -> " + word + " <- no es una palabra reservada de Java.");
		}
		
		return true;
	}
}