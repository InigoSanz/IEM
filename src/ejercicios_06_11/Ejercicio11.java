package ejercicios_06_11;

import java.util.Scanner;

/**
 * Queremos realizar un programa que nos devuelva si un número es par o impar. El retorno debe ser: “El número es par: {true | false}”
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce un número: ");
		
		int n = scanner.nextInt();
		
		scanner.close();
		
		if (n % 2 == 0) {
			
			System.out.printf("El numero %d es par.", n);
			
		} else {
			
			System.out.printf("El numero %d es impar.", n);
			
		}
		
	}
	
}