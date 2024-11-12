package ejercicios_12_11;

/**
 * Estamos trabajando en el desarrollo de una aplicación móvil.
 * En ella debemos sacar el id de una imagen de una URL.
 * Sabemos que el id de la imagen se encuentra en la última parte de la URL junto con la extensión.
 * Realizar un programa que obtenga el id de las imágines.
 * Ejemplos:
 * - 
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		
		String url = "https://storage.googleapis.com/images/folder/project/bf45e376-2f2d-49fe-b935-975af9314cbe.png";
		
		int indexOfBarrita = url.lastIndexOf("/");
		String urlSubstring = url.substring(indexOfBarrita + 1);
		
		int indexOfDot = urlSubstring.indexOf(".");
		String id = urlSubstring.substring(0, indexOfDot);
		
		System.out.printf("El ID de la imagen es: %s", id);

	}

}