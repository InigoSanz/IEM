package ejercicios_25_11_ResolucionProblemas2;

import java.util.Scanner;

/**
 * Realizar un programa que dado un número indicado por el usuario nos indique si es un número primo o no. 
 * - Un número es primo si sólo son divisibles entre ellos mismos y el número 1.
 * - Un número menor a 2, NO es primo
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce un número para saber si es primo: ");
		
		int number = scanner.nextInt();
		
		scanner.close();
		
		if (number < 2) {
			System.out.printf("El número %d no es primo.", number);
		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					System.out.printf("El número %d no es primo.", number);
					System.exit(0);
				} 
			}
			
			System.out.printf("El número %d es primo.", number);
		}
	}
}