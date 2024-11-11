package ejercicios_11_11;

import java.util.Scanner;

/**
 * Crear un programa que pasando una contraseña nos responda: 
 * - La contraseña es vacia: true | false
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce una contraseña: ");
		
		String password = scanner.nextLine();
		
		scanner.close();
		
		boolean isEmpty = password.isEmpty(); // Si la contraseña es vacía devuelve true por defecto, sino devuelve false.
		/*
		 * Podriamos introducir una contraseña
		 * Luego sacar la longitud
		 * Si longitud es igual a 0, es contraseña vacia
		 * 
		 * int passwdLength = password.length();
		 * boolean isEmpty;
		 * 
		 * if (passwdLength == 0) {
		 * 		isEmpty = true;
		 * } else {
		 * 		isEmpty = false;
		 * }
		 */
		
		System.out.printf("La contraseña es vacía: %b", isEmpty);

	}

}