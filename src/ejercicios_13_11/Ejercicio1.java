package ejercicios_13_11;

/**
 * Trabajamos en una empresa de mantenimiento de ascensores.
 * Sabemos el peso máximo que soporta un ascensor es de 425kg.
 * - Peso medio hombres 77,5 kg
 * - Peso medio mujeres 64,5 kg
 * A) Número de hombres que pueden subir
 * B) Número de mujeres que pueden subir
 * C) ¿Podrían subir 2 hombres y 3 mujeres en el ascensor a la vez?
 * D) ¿Y 3 hombres y 3 mujeres?
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		
		// A)
		double menWeight = 77.5;
		
		int maxWeightElevator = 425;
		
		int maxMenInElevator = (int) (maxWeightElevator / menWeight);
		
		System.out.printf("La cantidad máxima de hombres que pueden subir es %d.\n", maxMenInElevator);
		
		// B)
		double womenWeight = 64.5;
		
		int maxWomenInElevator = (int) (maxWeightElevator / womenWeight);
		
		System.out.printf("La cantidad máxima de mejeres que pueden subir es %d.\n", maxWomenInElevator);
		
		// C)
		double menWeightTwice = menWeight * 2;
		double womenWeightTriple = womenWeight * 3;
		
		double totalWeight = (int) (menWeightTwice + womenWeightTriple);
		
		if (totalWeight <= maxWeightElevator) {
			System.out.printf("Si se pueden subir 2 hombres y 3 mujeres.\n");
		} else {
			System.out.printf("No se pueden subir 2 hombres y 3 mujeres.\n");
		}
		
		// D)
		double menWeightTriple = menWeight * 3;
		
		double totalWeight1 = (int) (menWeightTriple + womenWeightTriple);
		
		if (totalWeight1 <= maxWeightElevator) {
			System.out.printf("Si se pueden subir 3 hombres y 3 mujeres.\n");
		} else {
			System.out.printf("No se pueden subir 3 hombres y 3 mujeres.\n");
		}
	}

}
