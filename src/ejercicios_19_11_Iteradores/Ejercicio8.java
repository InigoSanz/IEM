package ejercicios_19_11_Iteradores;

/**
 * Vamos a realizar un programa que realiza la multiplicación: 2*6
 * - Para realizar el cálculo, hay que usar la instrucción do-while
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		
		int value = 0;
		int i = 0;
		
		do {
			value = value + 2;
			i++;
		} while (i < 6);
		
		System.out.printf("%d", value);

	}

}
