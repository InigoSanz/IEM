package ejercicios_11_11;

import java.util.Scanner;

/**
 * Realiza un programa que dado el número de teléfono con su prefijo nos idndique si el número es español (prefijo +34).
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce un número de teléfono con su prefijo: ");
		
		String telNumber = scanner.nextLine();
		
		scanner.close();
		
		boolean isSpanishNumber = telNumber.startsWith("+34");
		
		System.out.printf("¿El número %s introducido es español? %b", telNumber, isSpanishNumber);

	}

}