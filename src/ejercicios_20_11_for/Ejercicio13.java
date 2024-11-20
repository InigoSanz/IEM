package ejercicios_20_11_for;

/**
 * Sacar los números divisibles entre 11 desde el 1 hasta el 100
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			if (i % 11 == 0) {
				System.out.println(i);
			}
		}

	}

}