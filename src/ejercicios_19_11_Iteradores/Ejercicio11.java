package ejercicios_19_11_Iteradores;

import java.util.Scanner;

/**
 * Realizar un programa que pidiendo al usuario que introduzca una palabra, muestre por terminal cada una de sus letras.
 * Si introduce la palabra: “Hola”, mostrará: 
 * - H
 * - o
 * - l
 * - a
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce una palabra: ");
		
		String word = scanner.nextLine();
		
		int wordLength = word.length();
		
		scanner.close();
		
		int i = 0;
		
		do {
			char letra = word.charAt(i);
			System.out.printf("%c\n", letra);
			i++;
		} while (i < wordLength);

	}

}