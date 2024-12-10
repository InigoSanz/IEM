package ejercicioCompeticion;

import java.util.Scanner;

/**
 * @author Inigo, Didier, Lucía (Team ONLINE)
 * @version 1.1
 * 
 * Número Armstrong.
 * 
 * Un número Armstrong (o narcisista) es el que es igual a la suma de sus propios dígitos elevados a la potencia de la cantidad de dígitos.
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Creamos un scanner.
		Scanner scanner = new Scanner(System.in);
		
		// Indicamos que introduzca un número.
		System.out.printf("Introduce un Número: ");
		
		// Capturamos la línea que introducimos (para los String).
		String numero = scanner.nextLine();
		
		// Cerramos el scanner.
		scanner.close();
		
		// Inicializamos una variable para guardar el resultado.
		int result = 0;
		
		// Sacamos la longitud del número introducido.
		int longitud = numero.length();
		
		/*
		 * Este bucle se "i" veces hasta que sea menor que la longitud del número introducido.
		 * Luego aislaremos cada caracter en la posicion del indice.
		 * Ese "char" cogido del índice, lo transformaremos a valor númerico para poder operar con el.
		 * En "result" iremos actualizando su valor con el del siguiente índice elevado a la potencia de la longitud introducida.
		 */
		for (int i = 0; i < longitud; i++) {		
			char posicion = numero.charAt(i);
			int var = Character.getNumericValue(posicion); // Obtiene el valor númerico de una caracter.
			// System.out.printf("%d ^ %d\n", var, longitud); -> Se puede borrar.
			result = result + (int) Math.pow(var, longitud); 
		}
		
		int numeroInt = Integer.parseInt(numero); // Transforma una cadena de texto (solo números) a int.
		
		// Aquí comprobamos que el número introducido es o no narcisista.
		if (numeroInt == result) { 
			System.out.printf("El número %s es un número Armstrong.\n", numero);
		} else {
			System.out.printf("El número %s no es un número Armstrong.\n", numero);
		}
		
		// System.out.printf("El número introducido es %s y el resultado %d", numero, result); -> Se puede borrar.
	}
}