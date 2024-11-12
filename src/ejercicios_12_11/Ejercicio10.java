package ejercicios_12_11;

import java.util.Scanner;

/**
 * Realizar un programa que compruebe si un texto es un email.
 * Daremos por válido el email si cumple las siguientes condiciones:
 * - Tiene más de 8 caracteres.
 * - Contiene el caracter @.
 * - La extensión del email es .com
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce un email: ");
		
		String email = scanner.nextLine();
		
		scanner.close();
		
		boolean validLength = email.length() > 8;
		int indexOfArroba = email.indexOf("@");
		boolean hasArroba = indexOfArroba != -1;
		boolean validExtension = email.endsWith(".com");
		
		if (validLength && hasArroba && validExtension) {
			
			System.out.printf("El email \"%s\" es valido.", email);
			
		} else {
			
			System.out.printf("El email \"%s\" no es valido.", email);
			
		}

	}

}