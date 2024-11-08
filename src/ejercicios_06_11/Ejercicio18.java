package ejercicios_06_11;

import java.util.Scanner;

/**
 * Queremos realizar un programa que nos transforme un número de pulgadas a cm (1 pulgada son 2,54 cm)
 */
public class Ejercicio18 {

	public static void main(String[] args) {
		
		final double INCH_TO_CM = 2.54;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce un número de pulgadas (puede contener decimales): ");
		
		double inches = scanner.nextDouble();
		
		scanner.close();
		
		double cm = inches * INCH_TO_CM;
		
		System.out.printf("%.2f pulgadas son %.2f centímetros.", inches, cm);	

	}

}