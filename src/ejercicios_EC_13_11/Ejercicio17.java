package ejercicios_EC_13_11;

import java.util.Scanner;

/**
 * Realizar un programa que introduciendo el número del día de la semana nos indique su nombre.
 */
public class Ejercicio17 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce el número del día de la semana (1-7): ");
		
		int day = scanner.nextInt();
		
		scanner.close();
		
		switch (day) {
			case 1: 
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miércoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sábado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("¿Tu semana es especial?");
		}

	}

}