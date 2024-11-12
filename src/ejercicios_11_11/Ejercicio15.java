package ejercicios_11_11;

import java.util.Scanner;

/**
 * Tenemos un blog en el cual los usuarios pueden poner comentarios.
 * Hemos descubierto que los usuarios añaden enlaces a otras webs en estos comentarios y no queremos que ocurra.
 * Realizar un programa que dado un comentario busque si hay enlaces.
 * Crear un ejemplo donde haya un enlace y otro donde no lo haya.
 * La salida será:
 * - ¿Tiene enlace? {true|false}
 */
public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce un comentario (sin enlace): ");
		
		String commentWithNoLink = scanner.nextLine();
		
		System.out.printf("Introduce un comentario (con enlace): ");
		
		String commentWithLink = scanner.nextLine();
		
		scanner.close();
		
		boolean containsLink1 = commentWithNoLink.contains("www.");
		boolean containsLink2 = commentWithLink.contains("www.");
		
		System.out.printf("¿El comentario \"%s\" tiene enlace?: %b\n", commentWithNoLink, containsLink1);
		System.out.printf("¿El comentario \"%s\" tiene enlace?: %b\n", commentWithLink, containsLink2);

	}

}