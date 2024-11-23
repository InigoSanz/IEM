package ejercicios_20_11_for;

/**
 * Crear un programa que dibuje en terminal una escalera de asteriscos. 
 * - *
 * - **
 * - ***
 * - ****
 * - *****
 */
public class Ejercicio16 {

	public static void main(String[] args) {
		
		String aster = "*";
		
		for (int i = 1; i <= 5; i ++) {	// Este bucle indica las filas		
			for (int j = 1; j <= i; j++) { // Este imprime los asteriscos según el número de fila
				System.out.print(aster);			
			}
			System.out.println(); // Después de imprimir los asteriscos hacemos un salto de línea		
		}
	}
}