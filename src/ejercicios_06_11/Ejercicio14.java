package ejercicios_06_11;

import java.util.Scanner;

/**
 * Queremos realizar un programa que nos transforme un número de euros a pesetas (1€ = 166.386 pesetas)
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce una cantidad de Euros: ");
		
		int euros = scanner.nextInt();
		
		scanner.close();
		
		double euroToPeseta = 166.386;
		
		double finalPesetas = euros * euroToPeseta;
		
		System.out.printf("%d € son %.2f pesetas.", euros, finalPesetas);
		
	}

}