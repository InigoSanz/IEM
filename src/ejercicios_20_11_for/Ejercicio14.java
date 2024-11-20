package ejercicios_20_11_for;

/**
 * Vamos a realizar un programa que imprima por pantalla los números del 1 al 100 indicando si son par o impar
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.printf("El número %d es par.\n", i);
				continue;
			} 
			
			System.out.printf("El número %d es impar.\n", i);		
		}

	}

}