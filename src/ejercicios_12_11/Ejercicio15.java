package ejercicios_12_11;

import java.util.Scanner;

/**
 * Estamos realizando un programa donde necesitamos que los usuarios nos indiquen su documento de identificación (DNI/NIE).
 * Uno de los requisitos de negocio es validar la letra del DNI.
 * - El cálculo de la letra es el resto de la división del número del DNI entre el número 23 y las siguientes equivalencias.
 */
public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Programa para validar la letra del DNI");
		
		System.out.printf("Introduce tu DNI: ");
		
		String dni = scanner.nextLine();
		
		scanner.close();
		
		char leter = dni.charAt(8);
		
		System.out.printf("La letra del DNI introducido es %c\n", leter);
		
		String numberDni = dni.substring(0, 8);
		
		System.out.printf("El número del DNI es: %s\n", numberDni);
		
		int dniSinLetra = Integer.parseInt(numberDni); // Método de Integer buscado en internet, transforma de String a Int
													   // Hay que separar los carácteres no numéricos creo 
		
		int restoDni = dniSinLetra % 23;
		
		char calcularLetra = 0;
		
		// O se utiliza un Switch o anidamos if else
		switch (restoDni) {
			case 0:
				calcularLetra = 'T';
				break;
			case 1:
				calcularLetra = 'R';
				break;
			case 2:
				calcularLetra = 'W';
				break;
			case 3:
				calcularLetra = 'A';
				break;
			case 4:
				calcularLetra = 'G';
				break;
			case 5:
				calcularLetra = 'M';
				break;
			case 6:
				calcularLetra = 'Y';
				break;
			case 7:
				calcularLetra = 'F';
				break;
			case 8:
				calcularLetra = 'P';
				break;
			case 9:
				calcularLetra = 'D';
				break;
			case 10:
				calcularLetra = 'X';
				break;
			case 11:
				calcularLetra = 'B';
				break;
			case 12:
				calcularLetra = 'N';
				break;
			case 13:
				calcularLetra = 'J';
				break;
			case 14:
				calcularLetra = 'Z';
				break;
			case 15:
				calcularLetra = 'S';
				break;
			case 16:
				calcularLetra = 'Q';
				break;
			case 17:
				calcularLetra = 'V';
				break;
			case 18:
				calcularLetra = 'H';
				break;
			case 19:
				calcularLetra = 'L';
				break;
			case 20:
				calcularLetra = 'C';
				break;
			case 21:
				calcularLetra = 'K';
				break;
			case 22:
				calcularLetra = 'E';
				break;
			case 23:
				calcularLetra = '?';
				break;
		}
		
		// Validamos la letra obtenida con la introducida
		if (leter == calcularLetra) {
			
			System.out.printf("La letra de tu DNI es correcta.");
			
		} else {
			
			System.out.printf("Letra incorrecta, debería ser la letra %c.", calcularLetra);
			
		}

	}

}