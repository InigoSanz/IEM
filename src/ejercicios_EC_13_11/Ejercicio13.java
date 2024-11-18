package ejercicios_EC_13_11;

import java.util.Scanner;

/**
 * Ahora para aprobar el C2 vamos a calcularlo por cada una de sus partes. 
 * Redacción, dictado, oral y escrito. 
 * Todas la partes deben estar aprobadas (calificación > 5) y la media de todos ha de ser mayor a 6,5
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce tu nota de redacción: ");
		
		double redaccion = scanner.nextDouble();
		
		System.out.printf("Introduce tu nota de dictado: ");
		
		double dictado = scanner.nextDouble();
		
		System.out.printf("Introduce tu nota de oral: ");
		
		double oral = scanner.nextDouble();
		
		System.out.printf("Introduce tu nota de escrito: ");
		
		double escrito = scanner.nextDouble();
		
		scanner.close();
		
		double notaMedia = (redaccion + dictado + oral + escrito) / 4.0;
		
		double notaMediaMin = 6.5;
		double notaMin = 5;
		
		// Podriamos optimizarlo para que cuando una nota no supere el 5, ya no continue
		if ((notaMedia > notaMediaMin) && (redaccion > notaMin && dictado > notaMin && oral > notaMin && escrito > notaMin)) {
			System.out.printf("Has aprobado");
		} else {
			System.out.printf("Has suspendido");
		}

	}

}