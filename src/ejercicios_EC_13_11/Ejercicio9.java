package ejercicios_EC_13_11;

import java.util.Scanner;

/**
 * Calcular si una persona es mayor de edad.
 * En caso de la edad ser mayor o igual a 18, mostraremos:
 * - Enhorabuena, eres mayor de edad.
 * En caso contrario: 
 * - Lo sentimos, eres menor de edad.
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		
		int edadMin = 18;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce tu edad: ");
		
		int edad = scanner.nextInt();
		
		scanner.close();
		
		String mensaje = (edad >= edadMin) ? "Enhorabuena, eres mayor de edad." : "Lo sentimos, eres menor de edad.";
		
		System.out.printf("%s", mensaje);

	}

}