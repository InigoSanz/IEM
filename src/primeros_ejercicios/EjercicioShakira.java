package primeros_ejercicios;

/**
 * Sabemos que Shakira gasta 20 Kcal cada 12 segundos de baile.
 * El videoclip de la canción "La bicicleta" dura 3 minutos y 57 segundos.
 * ¿Cuantas Kcal ha gastaddo en todo el videoclip?
 */
public class EjercicioShakira {

	public static void main(String[] args) {
		
		int secondsOfVideo = (3 * 60) + 57;
		double kcalPerSecond = 20 / 12;
		
		double totalKcal = kcalPerSecond * secondsOfVideo;
		
		System.out.printf("Shakira consume %.2f Kcal en el video de la bicicleta.", totalKcal);

	}
}