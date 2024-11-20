package ejercicios_20_11_arrays;

/**
 * Realizar un programa que dada una lista de números encuentre el más grande.
 * La lista de números va a ser la siguiente: [12, 1, 89, 3, 90, 34, 89, 32, 12, 0, 8, 45, 22, 56]
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		
		int[] list = {12, 1, 89, 3, 90, 34, 89, 32, 12, 0, 8, 45, 22, 56};
		
		int numeroIni = list[0];
		
		int listLength = list.length;
		
		for (int i = 0; i < listLength; i++) {
			
			if(list[i] > numeroIni) {
				numeroIni = list[i];
			}
			
		}
		
		System.out.printf("%d", numeroIni);
	}
}