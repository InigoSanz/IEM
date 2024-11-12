package ejercicios_11_11;

/**
 * Obtener el nombre y la extensión del siguiente nombre de fichero: 
 * - fichero_de_ejemplo.xml
 * Resolverlo de todas las formas que se os ocurran.
 * 
 * Modificar el nombre del fichero por:
 * - example.file.xml
 * Arreglar las soluciones que se hayan roto.
 */
public class Ejercicio18y19 {

	public static void main(String[] args) {
		
		// Primera parte
		String nameArchive = "fichero_de_ejemplo.xml";
		
		int indexOfDot = nameArchive.indexOf(".");
		
		String name = nameArchive.substring(0, indexOfDot);
		String extension = nameArchive.substring(indexOfDot);
		
		System.out.printf("Tenemos el siguiente archivo: %s\n", nameArchive);
		System.out.printf("El nombre es: %s\n", name);
		System.out.printf("La extension es: %s\n", extension);
		
		// Segunda parte
		String nameArchive1 = "example.file.xml";
		
		int indexOfDot1 = nameArchive1.lastIndexOf(".");
		String name1 = nameArchive1.substring(0, indexOfDot1);
		String extension1 = nameArchive1.substring(indexOfDot1);
		
		System.out.printf("Tenemos el siguiente archivo: %s\n", nameArchive1);
		System.out.printf("El nombre es: %s\n", name1);
		System.out.printf("La extension es: %s\n", extension1);

	}

}