package ejercicios_19_11_Iteradores;

/**
 * Vamos a realizar un programa que realiza la multiplicación: 2*6
 * - Para realizar el cálculo, hay que usar la instrucción while
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		
		int value = 0;
		int i = 0;
		
		while (i < 6) {
			value = value + 2;
			i++;		
		}
		
		System.out.printf("%d", value);

	}

}