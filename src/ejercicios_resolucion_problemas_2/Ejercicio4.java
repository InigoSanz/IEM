package ejercicios_resolucion_problemas_2;

import java.util.Scanner;

/**
 * Realizar un programa que pidiendo una letra al usuario, nos indique si es una vocal o no.
 * - Hay que tener en cuenta que la letra a y la letra A son vocales.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce una letra (mayúscula o minúsucula): ");
		
		String letter = scanner.nextLine();
		
		scanner.close();
		
		String letterA = "a";
		String letterE = "e";
		String letterI = "i";
		String letterO = "o";
		String letterU = "u";
		
		if (letter.equals(letterA) || letter.equals(letterA.toUpperCase()) || letter.equals(letterE) || letter.equals(letterE.toUpperCase())
				|| letter.equals(letterI) || letter.equals(letterI.toUpperCase()) || letter.equals(letterO) || letter.equals(letterO.toUpperCase())
				|| letter.equals(letterU) || letter.equals(letterU.toUpperCase())) {
			System.out.printf("La letra %s es una vocal.", letter);		
		} else {
			System.out.printf("La letra %s no es una vocal.", letter);
		}
	}
}	