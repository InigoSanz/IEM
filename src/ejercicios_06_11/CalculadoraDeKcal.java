package ejercicios_06_11;

/**
 * Los macronutrientes de este alimento son:
 * - Proteínas (P): 12,7 gr
 * - Hidratos de carbono (HC): 0,68 gr
 * - Grasas (G): 9,7 gr
 * 
 * Debemos tener en cuenta los siguientes valores para realizar el cálculo:
 * - 1 gr de P = 4 Kcal
 * - 1 gr de HC = 4 Kcal
 * - 1 gr de G = 9 Kcal
 */
public class CalculadoraDeKcal {

	public static void main(String[] args) {
		
		double proteinAmount = 12.7;
		double hcAmount = 0.68;
		double fatsAmount = 9.7;
		
		final int PROTEIN_KCAL = 4;
		final int HC_KCAL = 4;
		final int FATS_KCAL = 9;
		
		double totalKcal = (proteinAmount * PROTEIN_KCAL) + (hcAmount * HC_KCAL) + (fatsAmount * FATS_KCAL);
		
		System.out.printf("El total de Kcal del alimento es %.2f", totalKcal);
	}
}