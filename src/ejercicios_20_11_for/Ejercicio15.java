package ejercicios_20_11_for;

import java.util.Scanner;

/**
 * Vamos a realizar un programa que recorra desde el 50 al 100. 
 * Pero pare la ejecución al llegar al número que introduzca el usuario.
 */
public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce un número entre 50 y 100: ");
		
		int number = scanner.nextInt();
		
		scanner.close();
		
		for (int i = 50; i <= 100; i++) {
			System.out.printf("%d\n", i);
			if (i == number) {
				System.out.println("Esté es el número del usuario.");
				break;
			}
					
		}
		
	}

}