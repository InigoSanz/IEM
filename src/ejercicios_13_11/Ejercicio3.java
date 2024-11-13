package ejercicios_13_11;

/**
 * Dada una cadena de 4 letras (1234), queremos realizar un programa que nos muestre por pantalla la siguiente información:
 * El valor del primer dígito es: 1
 * El valor del segundo dígito es: 2
 * El valor del tercer dígito es: 3
 * El valor del cuarto dígito es: 4
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		
		String text = "1234";
		
		// Hay que tener en cuenta que se empieza a contar desde 0
		int indexOf1 = text.indexOf("1") + 1;
		int indexOf2 = text.indexOf("2") + 1;
		int indexOf3 = text.indexOf("3") + 1;
		int indexOf4 = text.indexOf("4") + 1;
		
		System.out.printf("El valor del primer dígito es: %d\n", indexOf1);
		System.out.printf("El valor del segundo dígito es: %d\n", indexOf2);
		System.out.printf("El valor del tercer dígito es: %d\n", indexOf3);
		System.out.printf("El valor del cuarto dígito es: %d\n", indexOf4);

	}

}