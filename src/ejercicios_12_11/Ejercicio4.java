package ejercicios_12_11;

import java.util.Scanner;

/**
 * Realizar un programa que dado un número, nos muestre por pantalla el doble y el triple de ese valor.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce un número sin decimales: ");
		
		int number = scanner.nextInt();
		
		scanner.close();
		
		int n;
		
		for (n = 2; n < 4; n++) {
			
			int out = number * n;
			
			System.out.println(out);
			
		}

	}

}