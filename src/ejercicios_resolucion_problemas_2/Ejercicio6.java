package ejercicios_resolucion_problemas_2;

import java.util.Scanner;

/**
 * 6-Trabajamos en la DGT y queremos crear un programa que nos indique la cantidad de puntos que nos van a restar según la infracción que se ha cometido.
 * Este programa va a necesitar el límite de la vía y la velocidad a la que se circulaba.
 * Las reglas para la retirada de puntos son:
 * - Si la velocidad supera entre un 10% y un 20% del límite de la vía: 1 punto
 * - Si la velocidad supera entre un 21% y un 30% del límite de la vía: 2 punto
 * - Si la velocidad supera entre un 31% y un 50% del límite de la vía: 4 punto
 * - Si la velocidad supera más de un 51% del límite de la vía: 6 puntos. 
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce el límite de la vía (KM/H): ");
		
		double limiteVia = scanner.nextDouble();
		
		System.out.printf("Introduce la velocidad a la que circulaba (KM/H): ");
		
		double velocidad = scanner.nextDouble();
		
		scanner.close();
		
		if (velocidad >= limiteVia * 1.1 && velocidad <= limiteVia * 1.2) {
			System.out.printf("Conlleva una perdida de 1 punto.");
		} else if (velocidad >= limiteVia * 1.21 && velocidad <= limiteVia * 1.3) {
			System.out.printf("Conlleva una perdida de 2 puntos.");
		} else if (velocidad >= limiteVia * 1.31 && velocidad <= limiteVia * 1.5) {
			System.out.printf("Conlleva una perdida de 4 puntos.");
		} else if (velocidad >= limiteVia * 1.51) {
			System.out.printf("Conlleva una perdida de 6 puntos.");
		} else {
			System.out.printf("La velocidad al ser menos que el límite de la vía no conlleva perdida de puntos.");
		}		
	}
}