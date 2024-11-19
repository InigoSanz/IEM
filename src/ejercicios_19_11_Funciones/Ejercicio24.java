package ejercicios_19_11_Funciones;

import java.util.Scanner;

/**
 * Vamos a realizar nuestra primera calculadora de números enteros.
 * Indicando al usuario que nos introduzca 2 números.
 * Luego la operación a realizar debemos realizar un programa que realice la operación.
 * Muestre en pantalla  la operación en este formato:  X + Y = Z
 * Las operaciones que permitimos son: 
 * - Suma (+)
 * - Resta (-)
 * - Multiplicación (*)
 * - División (/)
 */
public class Ejercicio24 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un número (se admiten decimales): ");
		
		double number1 = scanner.nextDouble();
		
		System.out.println("Introduce otro número: ");
		
		double number2 = scanner.nextDouble();
		
		System.out.println("Introduce la operación a realizar (+, -, *, /): ");
		
		String oper = scanner.next(); // Aquí tuve problemas, puse un nextLine()
									  // Por lo que no capturaba el salto de linea y seguia ejecutando
									  // El next() captura el primer caracter que se encuentra
		
		scanner.close();
		
		double result = calculadora(number1, number2, oper);
		
		System.out.printf("%.2f %s %.2f = %.2f (se redondea a 2 decimales)", number1, oper, number2, result);
		
	}
	
	public static double calculadora(double number1, double number2, String operacion) {
		
		double resultCalc = 0;
		
		if (operacion.equals("+")) {
			resultCalc = number1 + number2;
			return resultCalc;
		} else if (operacion.equals("-")) {
			resultCalc = number1 - number2;
			return resultCalc;
		} else if (operacion.equals("*")) {
			resultCalc = number1 * number2;
			return resultCalc;
		} else if (operacion.equals("/")) {
			resultCalc = number1 / number2;
			return resultCalc;
		}
		return resultCalc;
	}

}