package ejercicios_11_11;

import java.util.Scanner;
import java.time.LocalDate;

/**
 * Crear un programa que indicando el año de nacimiento responda:
 * - Este año lo vas a acabar con: {numero} años.
 * La operación para calcular los años debe estar en el System.out.println()
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		
		int actualYear = LocalDate.now().getYear();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce tu año de nacimiento: ");
		
		int year = scanner.nextInt();
		
		scanner.close();
		
		System.out.println("Este año lo vas a acabar con: " + (actualYear - year) + " años.");	

	}

}