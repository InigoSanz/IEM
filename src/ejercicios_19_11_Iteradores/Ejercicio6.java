package ejercicios_19_11_Iteradores;

/**
 * Sacar los números divisibles entre 3 desde el 1 hasta el 100
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		
		int i = 1;
		
		while (i <= 100) {
			if (i % 3 == 0) {
				System.out.printf("%d\n", i);
			}
			i++;
		}

	}

}