package ejercicios_refuerzo_juego;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean seguir = true;
		
		System.out.println("Vehículos disponible:");
		System.out.println("1) Coche");
		System.out.println("2) Bicicleta");
		System.out.println("3) Motocicleta");
		System.out.print("Selección: ");
			
		int opcion = scanner.nextInt();
		scanner.nextLine();
		
		switch (opcion) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			System.err.println("Opción no válida, reinicia el programa.");
			break;	
		}
	}
}