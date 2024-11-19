package ejercicios_19_11_Iteradores;

/**
 * Vamos a realizar un programa que realiza la multiplicación: 2*6
 * - Únicamente se puede realizar la operación matemática de la suma. 
 * - En cada linea de código, sólo se puede realizar una operación suma. (Es incorrecto hacer: 2 + 2 + 2)
 * - Solo se pueden usar 1 variable en todo el código. Que va a ser: int value = 0;
 * - Hay que imprimir el resultado de la operación al final del todo con la instrucción: 
 * -----------------------> System.out.println(“El valor de la operación es: “ + value);
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		
		int value = 0;
		
		value = value + 2;
		value = value + 2;
		value = value + 2;
		value = value + 2;
		value = value + 2;
		value = value + 2;
		
		System.out.println("El valor de la operación es: " + value);

	}

}