package ejercicios_EC_13_11;

import java.util.Scanner;

/**
 * Queremos realizar la comprobación de un formulario donde se introduce el número de puerta del usuario.
 * Si el número de puerta es mayor a 0 debemos decir: 
 * - Número de puerta correcto.
 * Si el número de puerta es negativo:
 * - No puede existir un numero de puerta negativo.
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce tu número de puerta: ");
		
		int doorNumber = scanner.nextInt();
		
		scanner.close();
		
		if (doorNumber > 0) {
			System.out.printf("Número de puerta correcto.");
		} else {
			System.out.printf("No puede existir un numero de puerta negativo.");
		}

	}

}