package ejercicios_19_11_Funciones;

import java.util.Scanner;

/**
 * Ejercicio clase:
 * Calcular la raíz cuadrada de un número mediante una función.
 */
public class EjercicioColaborativoClase {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce un número: ");
		
		int number = scanner.nextInt();
		
		scanner.close();
		
		int result = raizCuadrada(number);
		
		System.out.printf("La raíz cuadrada de %d es: %d", number, result);

	}
	
	public static int raizCuadrada(int number) {
		number = (int) Math.sqrt(number);
		return number;
	}

}