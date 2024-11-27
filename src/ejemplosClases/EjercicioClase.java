package ejemplosClases;

import java.util.Scanner;

public class EjercicioClase {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce el primer número: ");
		
		int number1 = scanner.nextInt();
		
		System.out.printf("Introduce el segundo número: ");
		
		int number2 = scanner.nextInt();
		
		scanner.close();
		
		System.out.printf("Los números introducidos son %d y %d\n", number1, number2);
		
		String result = sonIguales(number1, number2);
		
		System.out.printf("Los números %s", result);
	}
	
	public static String sonIguales(int number1, int number2) {
		if (number1 == number2) {
			return "son iguales";
		} else {
			return "no son iguales";
		}
	}
}