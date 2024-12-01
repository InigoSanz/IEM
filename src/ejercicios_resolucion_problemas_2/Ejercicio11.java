package ejercicios_resolucion_problemas_2;

import java.util.Scanner;

/**
 * @author Inigo Sanz
 * 
 * Realizar un programa que pidiendo una palabra al usuario le indique si es un palíndromo o no. (Siendo case sensitive).
 * Un palíndromo es una palabra que se lee igual en las dos direcciones:
 * - Ejemplo: Ana, acurruca, radar
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce una palabra para saber si es un palíndromo: ");
		
		String word = scanner.nextLine();
		
		scanner.close();
		
		// Variables para recorrer las posiciones del String.
		int ini = 0;
		int fin = word.length() - 1;
			
		while(ini < fin) {
			// Comparamos el primer indice del String con el último
			if (word.charAt(ini) != word.charAt(fin)) {
				System.out.printf("La palabra %s no es un palíndormo.", word);
				System.exit(0);;
			}
			// Lo recorremos de principio a fin y de fin al principio
			ini++;
			fin--;
		}
		
		System.out.printf("La palabra %s es un palíndromo.", word);
	}
}