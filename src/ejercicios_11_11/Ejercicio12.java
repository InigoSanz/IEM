package ejercicios_11_11;

import java.util.Scanner;

/**
 * Realizar un programa que dado un cadena de texto nos indique si contiene la letra ñ. 
 * - ¿Contiene la letra ñ? {true | false}
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce una cadena de texto: ");
		
		String text = scanner.nextLine();
		
		scanner.close();
		
		boolean haveÑ = text.contains("ñ");
		
		System.out.printf("¿Contiene la letra ñ? %b", haveÑ);

	}

}