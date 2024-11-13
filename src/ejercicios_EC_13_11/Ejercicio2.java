package ejercicios_EC_13_11;

import java.util.Scanner;

/**
 * Tenemos que comprobar si una persona es mayor de edad una vez nos ha introducido su edad.
 * En caso de ser mayor de edad, queremos que muestre un mensaje que ponga: 
 * - Eres mayor de edad, puedes continuar.
 * En caso de ser menor de edad debe mostrar:
 * - Lo siento, todavía no puedes entrar aquí.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		
		int minAge = 18;
		
		System.out.printf("Bienvenido... \n");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce tu edad: ");
		
		int age = scanner.nextInt();
		
		scanner.close();
		
		if (age >= minAge) {
			System.out.printf("Puedes continuar.");
		} else {
			System.out.printf("Cuando crezcas un poco más vuelve.");
		}

	}

}