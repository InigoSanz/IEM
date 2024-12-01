package ejercicios_resolucion_problemas_2;

import java.util.Scanner;

/**
 * @author Inigo Sanz
 * 
 * Realizar un programa que calcule el máximo, el mínimo, la media y la suma de los números que introduzca el usuario.
 * Para ello podemos pedir el número de valores que quiere introducir el usuario y después de esto, que el usuario vaya introduciendo números.
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Números a introducir: ");
		
		int numbersToIntroduce = scanner.nextInt();
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int suma = 0;
		double media;
		
		for (int i = 1; i <= numbersToIntroduce; i++) {
			
			System.out.printf("Introduce número (%d): ", i);
			
			int number = scanner.nextInt();
					
			suma = suma + number;
			
			if (number > max) {
				max = number;
			}
			
			if (number < min) {
				min = number;
			}
		}
		
		scanner.close();
		
		media = (double) suma / numbersToIntroduce;
		
		System.out.printf("- Máximo: %d\n", max);
		System.out.printf("- Mínimo: %d\n", min);
		System.out.printf("- Suma: %d\n", suma);
		System.out.printf("- Media: %.2f\n", media);
	}
}