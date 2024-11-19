package ejercicios_19_11_Iteradores;

/**
 * Completar el siguiente bucle while para que una vez i tenga el valor 7, no continue ejecutándose.
 * El valor de i debe ser: 0, 1, 2, 3, 4, 5, 6, 7
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		
		boolean a = true;
		int i = 0;
		
		while (a) {
			
			System.out.println("El valor de i es: " + i);
			i++;
			
			if (i > 7) {
				a = false;
			}
			
		}

	}

}