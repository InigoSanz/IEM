package primeros_ejercicios;

/**
 * Sabemos que Shakira gasta 20 Kcal cada 12 segundos de baile.
 * El videoclip de la canción "La bicicleta" dura 3 minutos y 57 segundos.
 * ¿Cuantas Kcal ha gastaddo en todo el videoclip?
 */
public class EjercicioShakira {

	public static void main(String[] args) {
		
		int secondsOfVideo = (3 * 60) + 57; // Se podría crear una variable minutos-segundos, 
											// fragmentar la operación en variables
		
		double kcalPerSecond = 20.0 / 12.0; // Aquí como no comprobé el resultado del total de los segundos
											// del video, no me dí cuenta del fallo a la hora de calcular las
											// Kcal por segundo
		
		double totalKcal = kcalPerSecond * secondsOfVideo;
		
		System.out.printf("Shakira consume %.2f Kcal en el video de la bicicleta.", totalKcal);

	}
}