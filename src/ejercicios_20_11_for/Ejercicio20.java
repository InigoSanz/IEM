package ejercicios_20_11_for;

import java.util.Scanner;

/**
 * Calcular el interés compuesto.
 * Dada una cantidad, un porcentaje y un número de años indicar cual es la cantidad final que tendría el usuario.
 * 
 * Capital final = C0 x (1+Ti) ^t
 * Fórmula
	=	cantidad final
	=	capital inicial
	=	tasa de interés
	=	número de veces que se ha aplicado el interés por periodo
	=	número de periodos transcurridos
 */
public class Ejercicio20 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("CALCULADORA DE INTERÉS COMPUESTO\n");
		
		System.out.printf("-> Introduce el deposito inicial: ");
		
		int depositoIni = scanner.nextInt();
		
		System.out.printf("-> Introduce cantidad de tiempo en años: ");
		
		int anios = scanner.nextInt();
		
		System.out.printf("-> Introduce porcentaje de interés: ");
		
		int interes = scanner.nextInt();
		double porcentajeInteres = interes / 100.0;
		
		scanner.close();
		
		double monto = depositoIni;
	
		// Capital final = C0 x (1+Ti)^t
		for (int i = 1; i <= anios; i++) {
			double interesBeneficio = monto * porcentajeInteres;
			monto = monto + interesBeneficio;
			System.out.printf("Año %d: Interés = %.2f €, Monto total = %.2f €%n", i, interesBeneficio, monto);
		}		
		System.out.printf("El monto final sería de %.2f €.", monto);	
	}
}