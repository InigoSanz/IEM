package ejercicios_06_11;

import java.util.Scanner;

public class EjemploScanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce tu nombre: ");
		
		String name = scanner.nextLine();
		
		scanner.close();
		
		System.out.printf("¿Te llamas %s?", name);

	}

}
