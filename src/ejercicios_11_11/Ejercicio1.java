package ejercicios_11_11;

import java.util.Scanner;

/**
 * Crear un programa que indicando el nombre de usuario responda:
 * - ¡Hola, {nombre}! Bienvenido a IEM.
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce tu nombre: ");
		
		String name = scanner.next();
		
		scanner.close();
		
		System.out.printf("¡Hola, %s! Bienvenido a IEM.", name);
		
	}

}