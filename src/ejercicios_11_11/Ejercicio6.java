package ejercicios_11_11;

import java.util.Scanner;

/**
 * Crear un programa que pasando una contraseña nos responda:
 * - La contraseña tiene {numero} caracteres.
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce una contraseña: ");
		
		String password = scanner.nextLine();
		
		scanner.close();
		
		int passwdLength = password.length();
		
		System.out.printf("La contrasela \"%s\" tiene %d caracteres.", password, passwdLength);

	}

}