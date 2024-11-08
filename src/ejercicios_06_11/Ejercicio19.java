package ejercicios_06_11;

import java.util.Scanner;

/**
 * Queremos realizar un programa que nos transforme un número de galones a litros (1 galón son 3,78541 litros)
 */
public class Ejercicio19 {

	public static void main(String[] args) {
		
		final double GALLON_TO_LITER = 3.78541;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce el número de galones (puede contener decimales): ");
		
		double gallons = scanner.nextDouble();
		
		scanner.close();
		
		double liters = gallons * GALLON_TO_LITER;
		
		System.out.printf("%.2f galones son %.2f litros.", gallons, liters);

	}

}