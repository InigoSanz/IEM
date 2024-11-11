package ejercicios_11_11;

/**
 * Tenemos un formulario en el cual el usuario puede crear tags. Queremos guardar las tags en base de datos sin el caracter # y por separado.
 * Realizar un programa que dado las siguientes tags: #arquitectura, #cine, #teatro obtenga la primera tag y la envíe al servidor de forma que nos lo piden.
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		
		String tags = "#futbol, #cine, #teatro";
		
		/*
		String tagServer = tags.substring(1, 13);
		
		System.out.printf("El primer tag que vamos a alojar en el server es \"%s\"", tagServer);
		*/
		
		// Ahora hasta que encuentre una coma.
		String tagsToServer = tags.replace("#", "");
		int indexComilla = tagsToServer.indexOf(",");
		String finalTag = tagsToServer.substring(0, indexComilla);
		
		System.out.printf("EL primer hastag es %s.", finalTag);

	}

}