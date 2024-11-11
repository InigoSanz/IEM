package ejercicios_06_11;

import java.util.Scanner;

/**
 * Queremos realizar un programa que nos transforme un número de segundos a: segundos, minutos y horas.
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce la cantidad de segundos: ");
		
		int seconds = scanner.nextInt();
		
		scanner.close();
		
		int finalHours = seconds / 3600; // Dividimos por los segundos que tiene una hora para sacar las horas
		int finalMins = (seconds % 3600) / 60; // Cogemos el resto del modulo y dividimos entre 60 para obtener los minutos.									
		int finalSeconds = seconds % 60; // Cogemos el resto del módulo para obtener los segundos.
		
		System.out.printf("%d segundos es lo mismo que %02d horas, %02d minutos y %02d segundos.", seconds, finalHours, finalMins, finalSeconds);
	}

}