package ejercicios_resolucion_problemas_2;

/**
 * Vamos a realizar el ejercicio FizzBuzz para los números del 1 al 100.
 * Las reglas del FizzBuzz son las siguientes:
 * - Si el número es divisible entre 3 imprimimos el valor: “Fizz”
 * - Si el número es divisible entre 5 imprimimos el valor: “Buzz”
 * - Si el número es divisible entre 3 y entre 5 imprimimos el valor: “FizzBuzz”
 * La salida debe ser:
 * - "Para el número {i} el valor es: {Fizz|Buzz|FizzBuzz}"
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		
		int limit = 100;
		
		// Añado un último else para comprobar las iteraciones donde no se cumple
		for (int i = 1; i <= limit; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.printf("Para el número %d el valor es: FizzBuzz\n", i);
			} else if (i % 5 == 0) {
				System.out.printf("Para el número %d el valor es: Buzz\n", i);
			} else if (i % 3 == 0) {
				System.out.printf("Para el número %d el valor es: Fizz\n", i);
			} else {
				System.out.printf("Para el número %d el valor es: -\n", i);
			}
		}
	}
}