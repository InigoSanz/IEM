package ejercicios_06_11;

import java.util.Scanner;

/**
 * Queremos realizar un programa que nos indique si un número es múltiplo de 3. 
 * Debe mostrar por pantalla “¿Es múltiplo de 3? {true | false}”
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce un numero: ");
		
		int n = scanner.nextInt();
		
		scanner.close();
		
		if (n % 3 == 0) {
			
			System.out.printf("El numero %d es múltiplo de 3.", n);
			
		} else {
			
			System.out.printf("El numero %d no es múltiplo de 3.", n);
			
		}
		
	}

}