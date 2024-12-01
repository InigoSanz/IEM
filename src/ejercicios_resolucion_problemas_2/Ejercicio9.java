package ejercicios_resolucion_problemas_2;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Inigo Sanz
 * 
 * Crear un programa que generando un número aleatorio entre el 1 y el 100 le permita al usuario adivinarlo.
 * El usuario va a tener infinitos intentos y le indicaremos si el valor a adivinar es mayor o menor que el número ha introducido.
 * Una vez lo haya adivinado, hay que indicar el número de intentos que ha necesitado.
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1; // Sumamos 1 para desplazar la posición, si no generaría del 0 al 99
		
		Scanner scanner = new Scanner(System.in);
		int number;
		int contador = 0;
		
		System.out.printf("---> Este programa genera un número aleatorio entre 1 y 100 <---\n");
		System.out.printf("¡Veamos cuantos intentos tardas en adivinarlo!\n");
		
		do {
			System.out.printf("Introduce un número del 1 al 100: ");			
			number = scanner.nextInt();
			contador++;
		} while (number != randomNumber);
		
		scanner.close();
		
		System.out.printf("¡Bingo!, has tardado %d intentos.", contador);
	}
}