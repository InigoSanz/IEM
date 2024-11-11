package ejercicios_11_11;

import java.util.Scanner;

/**
 * Crear un programa que indicando nuestro nombre nos responda:
 * - Hola {nombre}. Tu nombre tiene {numero} caracteres.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce tu nombre: ");
		
		String name = scanner.nextLine();
		
		scanner.close();
		
		int length = name.length();
		
		System.out.printf("Hola %s. Tu nombre tiene %d caracteres.", name, length);

	}

}