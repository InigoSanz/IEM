package ejercicios_EC_13_11;

import java.util.Scanner;

/**
 * Tenemos una cafetería en la cual servimos:
 * - “Café con leche”
 * - “Café solo” 
 * - “Cortado”
 * Queremos realizar un programa que indicando el tipo de café nos diga los ingredientes.
 * El valor retornado debe ser el String indicado según el tipo de café:
 * - Café con leche => “Café y leche”
 * - Café solo => “Café”
 * - Cortado => “Café y poca leche”
 */
public class Ejercicio19 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner("System.in");
		
		System.out.printf("Opciones:\n"
				+ "- Café con leche.\n"
				+ "- Café solo.\n"
				+ "- Cortado.\n"
				+ "¿Introduce tu opción (sin tildes)? ");
		
		String cafe = scanner.nextLine();
		
		String cafeLowerCase = cafe.toLowerCase();
		
		scanner.close();
		
		
		
		switch (cafeLowerCase) {
			case "cafe con leche":
				System.out.println("Café y leche.");
;				break;
			case "cafe solo":
				System.out.println("Café.");
				break;
			case "cortado":
				System.out.println("Café y poca leche.");
				break;
			default:
				System.out.println("No tenemos ese café.");
					
		}
		

	}

}