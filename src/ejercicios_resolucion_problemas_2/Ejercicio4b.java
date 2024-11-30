package ejercicios_resolucion_problemas_2;

import java.util.Scanner;

/**
 * Modificar el programa para que pida al usuario tanto letras como números. 
 */
public class Ejercicio4b {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String cadena = "";
		String nuevaLetra = "";

		while (!nuevaLetra.equals("exit")) {
			
			System.out.printf("Introduce una letra o un número: ");
			nuevaLetra = scanner.nextLine();
			
			if (!nuevaLetra.equals("exit")) {
				if (nuevaLetra.length() == 1) {
					cadena = cadena + nuevaLetra;
				} else {
					System.out.printf("¡Debes introducir solo una letra o número!\n");
				}
			}
		}
		
		scanner.close();
		
		System.out.printf("La cadena introducida es %s", cadena);
	}
}