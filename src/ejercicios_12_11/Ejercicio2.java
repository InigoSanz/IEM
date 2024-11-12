package ejercicios_12_11;

import java.util.Scanner;

/**
 * Realizar un programa que dado el radio de una esfera, calcule e imprima el área y volumen.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		
		final double PI = 3.141592;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce el radio de una esfera: ");
		
		double radius = scanner.nextDouble();
		
		scanner.close();
		
		// Formula area esfera: 4 * PI * radio^2
		double sphereArea = 4 * PI * Math.pow(radius, 2); // o multiplicar por si mismo 
		
		System.out.printf("El area de una esfera de radio %.2f es de %.2f\n", radius, sphereArea);
		
		// Formula volumen esfera: 4/3 * PI * radio^3
		
		double sphereVolume = (4 / 3) * PI * Math.pow(radius, 3); // o multiplicar por si mismo 2 veces
		
		System.out.printf("El volumen de una esfera de radio %.2f es de %.2f", radius, sphereVolume);
		
	}

}