package primeros_ejercicios;

/**
 * Sabemos que Shakira gasta 20 Kcal cada 12 segundos de baile.
 * El videoclip de la canción "La bicicleta" dura 3 minutos y 57 segundos.
 * ¿Cuantas Kcal ha gastaddo en todo el videoclip?
 */
public class EjercicioShakira {

	public static void main(String[] args) {
		
		int secondsOfVideo = (3 * 60) + 57; // Se podría crear una variable minutos-secgundos, 
											// fragmentar la operación en variables.
		double kcalPerSecond = 20.0 / 12.0;
		
		double totalKcal = kcalPerSecond * secondsOfVideo;
		
		System.out.printf("Shakira consume %.2f Kcal en el video de la bicicleta.", totalKcal);

	}
}