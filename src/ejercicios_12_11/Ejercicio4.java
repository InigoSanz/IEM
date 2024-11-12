package ejercicios_12_11;

import java.util.Scanner;

/**
 * Realizar un programa que dado un número, nos muestre por pantalla el doble y el triple de ese valor.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		
		/*
		 - Aquí seria simplemente definir dos variables int
		 - En una hacer * 2
		 - En otra hacer * 3
		 - Luego imprimirlas
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce un número sin decimales: ");
		
		int number = scanner.nextInt();
		
		scanner.close();
		
		for (int n = 2; n < 4; n++) {
			
			int out = number * n;
			
			System.out.println(out);
			
		}

	}

}