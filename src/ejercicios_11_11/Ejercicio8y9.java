package ejercicios_11_11;

import java.util.Scanner;

/**
 * Crear un programa que pasando dos cadenas nos devuelva: 
 * - Las cadenas son iguales: {true | false}
 * Consideramos que las cadenas son iguales si el texto de las cadenas es el mismo.
 */
public class Ejercicio8y9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce una palabra o frase: ");
		
		String line1 = scanner.nextLine();
		
		System.out.printf("Introduce otra palabra o frase: ");
		
		String line2 = scanner.nextLine();
		
		scanner.close();
		
		boolean areEquals = line1.equals(line2);
		boolean areEqualsIgnoreCase = line1.equalsIgnoreCase(line2);
		
		System.out.printf("Las cadenas son iguales (sin ignore case): %b\n", areEquals);
		System.out.printf("Las cadenas son iguales (con ignore case): %b\n", areEqualsIgnoreCase);

	}

}