package ejercicios_20_11_for;

/**
 * Crear un programa que dibuje una pirámide de asteriscos:
 * -     *
 * -    ***
 * -   *****
 * -  *******
 * - *********
 */
public class Ejercicio19 {

	public static void main(String[] args) {
		
		String aster = "*";
		int height = 5;
		
		for (int i = 1; i <= height; i++) { // Recorre las filas, de la fila 1 hasta la altura
			
			// Imprime los especios de cada fila
			for (int j = 1; j <= height - i; j++) { // i = 1 -> 5 - 1 = 4 espacios | i = 2 -> 5 - 2 = 3 espacios
				System.out.print(" ");
			}
			// Imprime los asteriscos
			for (int k = 1; k <= i * 2 - 1; k++) { // i = 2 -> 1 * 2 - 1 = 1 asterisco | i = 2 -> 2 * 2 - 1 = 3 asteriscos
												   // Se multiplica i * 2 ya que hay que añadir un asterisco al principio como al final.
												   // Luego se resta 1 ya que los asteriscos de cada fila son impares.
												   // Tuve que buscar la fórmula de la sucesión de números impares.
				System.out.print(aster);
			}
			System.out.println(); // Salto de línea después del fin de las operaciones de cada fila		
		}
	}
}