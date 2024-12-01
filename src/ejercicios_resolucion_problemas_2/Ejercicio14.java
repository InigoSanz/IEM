package ejercicios_resolucion_problemas_2;

import java.util.Scanner;

/**
 * @author Inigo Sanz
 * 
 * Vamos a realizar un programa que dada una palabra introducida por el usuario nos diga si es una palabra reservada de java o no.
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

	}
}