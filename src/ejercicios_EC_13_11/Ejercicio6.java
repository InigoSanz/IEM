package ejercicios_EC_13_11;

import java.util.Scanner;

/**
 * Queremos realizar un programa que indicando la calificación de un alumno nos indique su calificación.
 * Si la nota es menor a 5 la salida es: "Suspendido"
 * Si la nota es entre 5 y 5.99 la salida es: “Aprobado”
 * Si la nota es entre 6 y 6.99 la salida es: “Bien”
 * Si la nota es entre 7 y 8.99 la salida es: “Notable”
 * Si la nota es entre 9 y 9.99 la salida es: “Sobresaliente”
 * Si la nota es 10 la salida es: “Matrícula de honor”
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double nota;
		
		do {
			System.out.printf("Introduce tu nota: ");
			nota = scanner.nextDouble();
			
			if (nota > 10) {
				System.out.printf("¡No se puede sacar más de un 10!\n");
			}
		} while (nota > 10);
		
		scanner.close();
		
		if (nota < 5) {
			System.out.println("Suspendido.");
		} else if (nota < 6) {
			System.out.println("Aprobado.");
		} else if (nota < 7) {
			System.out.println("Bien.");
		} else if (nota < 9) {
			System.out.println("Notable.");
		} else if (nota < 10) {
			System.out.println("Sobresaliente.");
		} else if (nota == 10) {
			System.out.println("Matrícula de honor.");
		}

	}

}