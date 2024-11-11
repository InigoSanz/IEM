package ejercicios_11_11;

import java.util.Scanner;

/**
 * Crear un programa que indicando un personaje famoso y una cita nos responda:
 * - Como dijo {personaje}: "{cita}".
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce un personaje famoso: ");
		
		String personaje = scanner.nextLine(); // Utilizamos nextLine en vez de next() para que no capture el siguiente print
											   // next() captura todo hasta que encuentra un espacio.	
		
		System.out.printf("Introduce una frase: ");
		
		String cita = scanner.nextLine();
		
		scanner.close();
		
		System.out.printf("Como dijo %s: \"%s\".", personaje, cita);
		
	}

}