package ejercicios_25_11_ResolucionProblemas2;

import java.util.Scanner;

/**
 * Realizar un programa que realice la suma de los números pares y de los números impares:
 * - El valor de inicio y de fin, debe ser indicado por el usuario. 
 * - Si el número inicial es mayor que el final, debemos devolver un mensaje indicando que el número final debe ser mayor al número inicial.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce el número de inicio: ");
		
		int ini = scanner.nextInt();
		
		System.out.printf("Introduce el número de fin: ");
		
		int end = scanner.nextInt();
		
		scanner.close();
		
		if (ini >= end) {
			System.out.println("¡El valor de inicio no puede ser mayor que el de fin!");
		} else {
		
			int arraySize = end - (ini + 1);
			int sumPares = 0;
			int sumImpares = 0;
		
			int[] array = new int[arraySize];
		
			for (int i = 0; i < arraySize; i++) {
				array[i] = ini + i;
			}
		
			for (int j = ini; j <= end; j++) {
				if (j % 2 == 0) {
					sumPares = sumPares + j;
				} else {
					sumImpares = sumImpares + j;
				}
			}
		
			System.out.printf("La suma de todos los números pares es: %d\n", sumPares);
			System.out.printf("La suma de todos los números impares es: %d\n", sumImpares);
		}
	}
}