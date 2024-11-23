package ejercicios_20_11_for;

/**
 * Modificar los ejercicios anteriores para que en lugar de imprimir * imprima un triángulo de números: 
 * - 1
 * - 12
 * - 123
 * - 1234
 * - 12345
 */
public class Ejercicio18 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}