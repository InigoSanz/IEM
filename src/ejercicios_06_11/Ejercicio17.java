package ejercicios_06_11;

import java.util.Scanner;

/**
 * Queremos realizar un programa que nos transforme un número de millas a km (1 milla son 1,609344 km)
 */
public class Ejercicio17 {
	
	public static void main(String[] args) {
		
		final double MILE_TO_KM = 1.609344;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce un número de millas (puede contener 2 decimales): ");
		
		double miles = scanner.nextDouble();
		
		scanner.close();
		
		double km = miles * MILE_TO_KM;
		
		System.out.printf("%.2f millas son %.2f kilómetros.", miles, km); // Acotamos los decimales a 4

	}

}