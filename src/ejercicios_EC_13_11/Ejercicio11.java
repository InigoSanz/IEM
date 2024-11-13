package ejercicios_EC_13_11;

import java.util.Scanner;

/**
 * Pedir al usuario 2 números enteros y devolver el mayor de ellos con el texto:
 * - El mayor de los dos números es: {mayor}
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce un número (se aceptan decimales): ");
		
		double n1 = scanner.nextDouble();
		
		System.out.printf("Introduce un otro número (se aceptan decimales): ");
		
		double n2 = scanner.nextDouble();
		
		scanner.close();
		
		String mensaje = (n1 > n2) ? "El mayor de los dos números es: " + n1 : "El mayor de los dos números es: " + n2;
		
		System.out.printf("%s", mensaje);

	}

}
