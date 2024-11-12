package ejercicios_12_11;

import java.util.Scanner;

/**
 * Realizar un programa que sea capaz de calcular la hipotenusa teniendo la medida de los dos catetos (Pitágoras).
 * - h^2 = C^2 + c^2
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("PITÁGORAS");
		
		System.out.printf("Introduce la medida del cateto 1 (se admiten decimales): ");
		
		double cateto1 = scanner.nextDouble();
		
		System.out.printf("Introduce la medida del cateto 2 (se admiten decimales): ");
		
		double cateto2 = scanner.nextDouble();
		
		scanner.close();
		
		double hipotenusaCuadrado = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
		
		double hipotenusa = Math.sqrt(hipotenusaCuadrado);
		
		System.out.printf("La hipotenusa del triangulo es: %.2f", hipotenusa);

	}

}
