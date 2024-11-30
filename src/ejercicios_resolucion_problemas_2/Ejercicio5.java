package ejercicios_resolucion_problemas_2;

/**
 * Vamos a calcular las kcal que tiene 100 gr de arroz a la cubana.
 * Para ello, vamos a tener 3 arrays, en cada uno de estos arrays vamos a tener la cantidad de cada macro nutriente de cada elemento.
 * - 1 gr de G = 9 Kcal
 * - 1 gr de P = 4 Kcal
 * - 1 gr de HC = 4 Kcal
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Orden = Huevo, arroz, tomate frito
		double[] fats = {9.7, 1, 3.5};
		double[] proteins = {12.7, 7, 1.5};
		double[] carbohidrates = {0.68, 79, 9.5};
		
		double[] total = new double[fats.length];
		
		final int KCAL_G = 9;
		final int KCAL_P = 4;
		final int KCAL_HC = 4;
		
		int grams = 100;
		double totalKcal;
		
		for (int i = 0; i < fats.length; i++) {
			total[i] = ((fats[i] * KCAL_G + proteins[i] * KCAL_P + carbohidrates[i] * KCAL_HC) * grams) / 100.0; // Se divide entre 100 para calcular las kcal por porción de 100 gr			
		}
		
		totalKcal = total[0] + total[1] + total[2];
		
		System.out.printf("Las calorias de cada ingrediente por cada %d gr son:\n", grams);
		System.out.printf("- Huevo: %.2f Kcal\n", total[0]);
		System.out.printf("- Arroz: %.2f Kcal\n", total[1]);
		System.out.printf("- Tomate frito: %.2f Kcal\n", total[2]);
		System.out.printf("-> El total son %.2f Kcal", totalKcal);
	}
}