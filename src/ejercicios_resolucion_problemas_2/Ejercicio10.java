package ejercicios_resolucion_problemas_2;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Inigo Sanz
 * 
 * Crear un programa que generando un número aleatorio entre el 1 y el 100 le permita al usuario adivinarlo.
 * El usuario va a tener 10 intentos y le indicaremos si el valor a adivinar es mayor o menor que el número ha introducido.
 * Una vez lo haya adivinado (Si lo consigue), hay que indicar el número de intentos que ha necesitado.
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1; // Sumamos 1 para desplazar la posición, si no generaría del 0 al 99
		
		Scanner scanner = new Scanner(System.in);
		
		int nIntentos = 10;
		int contadorIntentos = 1;
		int number;
		
		System.out.printf("---> Este programa genera un número aleatorio entre 1 y 100 <---\n");
		System.out.printf("¡Tienes 10 intentos para adivinarlo!\n");
		
		while (contadorIntentos <= nIntentos) {
			System.out.printf("Introduce un número del 1 al 100 (intento %d): ", contadorIntentos);
			number = scanner.nextInt();
			contadorIntentos++;
			
			if (number == randomNumber) {
				System.out.printf("¡Bingo! Has adivinado el número.\n");
				break;
			}
		}
		
		scanner.close();
		
		System.out.printf("¡No lo has adivinado! Era el número %d.", randomNumber);
	}
}