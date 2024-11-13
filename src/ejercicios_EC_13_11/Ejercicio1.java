package ejercicios_EC_13_11;

import java.util.Scanner;

/**
 * Vamos a realizar un comprobado de contraseñas.
 * Vamos a pedir al usuario que introduzca una contraseña.
 * Si coincide con nuestra contraseña maestra mostrara el mensaje “Contraseña correcta”.
 * Como último mensaje del comprobado hay que mostrar un mensaje que diga:
 * - Hasta luego, gracias por usar el comprobado de contraseñas.
 * Nuestra contraseña maestra es: “Contraseña”.
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce una contraseña: ");
		
		String passwd = scanner.nextLine();
		
		scanner.close();
		
		String masterPasswd = "Contraseña";
		
		if (passwd.equals(masterPasswd)) {
			System.out.printf("Contraseña correcta.\n");
		} else {
			System.out.printf("Contraseña incorrecta.\n");
		}
		
		System.out.printf("Hasta luego, gracias por usar el comprobado de contraseñas.");

	}

}