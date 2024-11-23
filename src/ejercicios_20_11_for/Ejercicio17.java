package ejercicios_20_11_for;

/**
 * Crear un programa que dibuje en terminal una escalera invertida de asteriscos. 
 * - *****
 * - ****
 * - ***
 * - **
 * - *
 */
public class Ejercicio17 {

	public static void main(String[] args) {
		
		String aster = "*";
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(aster);			
			}
			System.out.println();
		}
	}
}