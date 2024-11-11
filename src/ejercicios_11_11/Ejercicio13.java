package ejercicios_11_11;

/**
 * Realiza un programa tomando el texto "Bienvenido a IEM" nos indique la subcadena que hay desde la posición 5 a la 7.
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		
		String text = "Bienvenido a IEM";
		
		String subText = text.substring(5, 7);
		
		System.out.printf("La subcadena de las posiciones 5 y 7 de \"%s\" es \"%s\".", text, subText);

	}

}