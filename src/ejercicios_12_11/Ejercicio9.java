package ejercicios_12_11;

/**
 * Queremos calcular cuanto tiempo tarda en llegar un rayo de sol a la superficie de la tierra.
 * - El movimiento de la luz en el vacío es de: 300.000 km/s
 * - Distancia entre la Tierra y el Sol: 150.000.000 km
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		
		double distance = 150000000;
		double speed = 300000;
		
		// Fórmula tiempo t = d/v
		double t = distance / speed;
		int min = (int) t / 60;
		double s = t % 60;
		
		System.out.printf("El tiempo que tarda en llegar un rayo de sol a la tierra es de %.2f segundos o %d minutos y %.0f segundos", t, min, s);

	}

}