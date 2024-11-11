package ejercicios_11_11;

import java.util.Scanner;

/**
 * Realizar un programa que dado el nombre de un fichero y su extensión (file.pdf) nos indique si la extensión es .pdf
 * La salida será:
 * - ¿La extensión del fichero es PDF? {true | false}
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce el nombre y extensión de un fichero: ");
		
		String name = scanner.nextLine();
		
		scanner.close();
		
		boolean result = name.endsWith("pdf");
		
		System.out.printf("¿La extensión del fichero es PDF? %b", result);

	}

}