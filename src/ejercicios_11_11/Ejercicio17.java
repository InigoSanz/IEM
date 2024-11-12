package ejercicios_11_11;

import java.util.Scanner;

/**
 * Crear un programa que pasando una palabra nos responda:
 * - La palabra está en mayúsculas: {true|false}
 */
public class Ejercicio17 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce una palabra: ");
		
		String word = scanner.nextLine();
		
		scanner.close();
		
		boolean isUpper = word.equals(word.toUpperCase());
		
		System.out.printf("La palabra \"%s\" esta en mayúsculas? %b", word, isUpper);

	}

}