package ejercicios_resolucion_problemas_2;

import java.util.Scanner;

/**
 * Modificar el programa para que pida al usuario no sólo una letra si no todas las que quiera.
 * Siempre de 1 letra en 1 letra.
 * - El programa parará cuando el usuario introduzca la palabra: exit
 */
public class Ejercicio4a {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String cadena = "";
		String nuevaLetra = "";

		while (!nuevaLetra.equals("exit")) {
			
			System.out.printf("Introduce una letra: ");
			nuevaLetra = scanner.nextLine();
			
			if (!nuevaLetra.equals("exit")) {
				if (nuevaLetra.length() == 1) {
					cadena = cadena + nuevaLetra;
				} else {
					System.out.printf("¡Debes introducir solo una letra!\n");
				}
			}
		}
		
		scanner.close();
		
		System.out.printf("La cadena introducida es %s", cadena);
	}
}