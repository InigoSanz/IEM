package ejercicios_06_11;

import java.util.Scanner;

/**
 * Queremos realizar un programa que nos transforme un número de km a millas (1 km son 0,621371 millas)
 */
public class Ejercicio16 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int km;
		
		System.out.print("Introduce el número de kilómetros: ");
		
		while (true) {
			
			if (scanner.hasNextInt()) {
				
				km = scanner.nextInt();
				
				break; // Lo utilizamos para salir del bucle
				
			} else {
				
				System.out.print("Tienes que introducir un número entero: ");
				
				scanner.next(); // Se utiliza para borrar lo introducido anteriormente
				
			}
		}
		
		scanner.close();
		
		final double KM_TO_MILES = 0.621371;
		
		double miles = km * KM_TO_MILES;
		
		System.out.printf("%d KM son %f millas.", km, miles);

	}

}