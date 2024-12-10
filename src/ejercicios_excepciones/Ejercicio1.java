package ejercicios_excepciones;

import java.util.Scanner;

/**
 * Vamos a mostrar al usuario su edad por terminal. 
 * Para ello hay que pedirle el año de nacimiento.
 * - El valor del año debemos cogerlo con el método nextInt()
 * - Hay que controlar que ocurre si el usuario nos introduce un valor que no sea tipo númerico.
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.printf("Introduce tu año de nacimiento: ");
			int anio = scanner.nextInt();
			int edad = calculateAge(anio);
			System.out.printf("Tienes %d años.", edad);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println("¡Finally!");
		}
		
		scanner.close();
	}
	
	public static int calculateAge(int anioNacimiento) throws MinimunAgeLimitException, MaximumAgeLimitException {
		if (anioNacimiento < 1900) {
			throw new MinimunAgeLimitException("La edad introducida no puede ser menos a 1900.");
		}
		
		int edad = currentYear() - anioNacimiento;
		
		return edad;
	}
	
	public static int currentYear() {
		return 2024;
	}
}