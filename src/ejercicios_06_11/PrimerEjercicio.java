package ejercicios_06_11;

/**
 * Somos dueños de un bar y queremos saber la rentabilidad que le sacamos al té marroquí.
 * Para realizar un té necesitamos 12 gramos de té y 150ml de agua.
 * ¿Cuantos tés podemos realizar por paquete de té si cada paquete es de 3kg y 250gr?
 * ¿Cuanta agua necesitaremos para un paquete de té?
 * ¿Cuantos gramos de té nos sobrarían de un paquete si hacemos todos los tés de 12 gr exactos?
 */
public class PrimerEjercicio {

	public static void main(String[] args) {
		
		// Complico el ejercicio innecesariamente a conciencia
		double teaBagKg = 3.25;
		final int KG_TO_GR = 1000;
		double teaBagGr = teaBagKg * KG_TO_GR;
		
		// Para realizar un té
		int grTeaCup = 12;
		int mlWater = 150;
		
		double teaAmount = Math.round(teaBagGr / grTeaCup); // Redondea, igual que en mates
		
		double waterAmountMl = teaAmount * mlWater;	
		double lWaterToMl = 1000;		
		double waterAmountL = waterAmountMl / lWaterToMl;
		
		System.out.printf("De un paquete de té se pueden hacer %.2f tés.\n", teaAmount);
		System.out.println("El último té tendrá menos sabor, pero venderemos menos cantidad de té por el precio de una taza (profit).");
		System.out.printf("La cantidad de agua usada para un paquete sería %.2f ml o de %.2f litros.\n", waterAmountMl, waterAmountL);
		
		// Última pregunta resuelta de aquella manera...
		int teaBag = 3250;
		int cantidadTesMal = 270 * grTeaCup;
		int sobrasDeTe = teaBag - cantidadTesMal;
		
		System.out.println("Nos sobran " + sobrasDeTe + " gr de té de un paquete.");
		
	}
}