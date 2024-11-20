package ejercicios_20_11_for;

/**
 * Vamos a realizar un programa que realiza la multiplicación: 2*6
 * - Para realizar el cálculo, hay que usar la instrucción for
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		
		int value = 0;
		
		for (int i = 0; i < 6; i++) {
			value = value + 2;		
		}
		
		System.out.printf("%d", value);

	}

}