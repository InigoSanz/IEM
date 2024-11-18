package ejercicios_EC_13_11;

import java.util.Scanner;

/**
 * Queremos saber si un usuario ha aprobado la calificación C2 de francés.
 * Para ello, vamos a realizar un programa que introduciendo la calificación del usuario nos indique si ha aprobado o no.
 * Para aprobar el nivel C2 hay que sacar una calificación superior a 6.5
 * El programa debe devolver un texto indicando:
 * - “Aprobado” o “Suspendido”
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce tu nota: ");
		
		double nota = scanner.nextDouble();
		
		scanner.close();
		
		double notaMin = 6.5;
		
		if (nota > notaMin) {
			System.out.printf("Aprobado");
		} else {
			System.out.printf("Suspendido");
		}

	}

}