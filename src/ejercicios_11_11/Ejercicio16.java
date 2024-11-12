package ejercicios_11_11;

/**
 * Tenemos el String “Estamos aprendiendo a programar”. Debemos realizar las siguientes acciones al String:
 * a) Obtener la longitud del string
 * b) Transformar el string a mayúsculas
 * c) Transformar el string a minúsculas
 * d) Hacer una comprobación por valor con otro string (resultado debe ser true)
 * e) Hacer una comprobación por valor con otro string (resultado debe ser false)
 * f) Hacer una comprobación por valor con el texto de muestra completamente en mayúsculas
 * g) Obtener el caracter 8 de string
 * h) Obtener el último caracter del string
 * i) Obtener la cadena desde la posición 3 hasta el final
 * j) Obtener la cadena desde la posición 3 hasta la posición 8
 * k) Obtener los dos últimos caracteres del string
 * l) Transformar las ocurrencias de la letra ‘a’ por el símbolo ‘-‘
 * m) Devolver el índice de la primera ocurrencia de la letra d
 * n) Devolver el índice de la última ocurrencia de la letra a
 * o) ¿Cual sería el resultado de buscar el índice de la letra x?
 * p) Comprobar si la cadena “o a p” se encuentra dentro del string
 * q) Comprobar si la cadena “pogr” se encuentra dentro del string
 * r) Comprobar si la cadena empieza por “Estamos”
 * s) Comprobar si la cadena empieza por “estamos”
 * t) Comprobar si la cadena acaba por “programar”
 * u) Comprobar si la cadena acaba por “aprendiendo a programar”
 * v) Eliminar todos los espacios y transformarlo a mayúsculas
 */
public class Ejercicio16 {

	public static void main(String[] args) {
		
		String text = "Estamos aprendiendo a programar";
		
		// a
		int length = text.length();
		System.out.printf("a) El String \"%s\" tiene %d caracteres de longitud.\n", text, length);
		
		// b
		String textUppercase = text.toUpperCase();
		System.out.printf("b) %s\n", textUppercase);
		
		// c
		String textLowercase = text.toLowerCase();
		System.out.printf("c) %s\n", textLowercase);
		
		// d
		String textForCompare = "Estamos aprendiendo a programar";
		boolean compare = text.equals(textForCompare);
		System.out.printf("d) Los textos comparados son %b\n", compare);
		
		// e
		String textForCompare1 = "Estamos aprendiendo";
		boolean compare1 = text.equals(textForCompare1);
		System.out.printf("e) Los textos comparados son %b\n", compare1);
		
		// f
		boolean compare2 = text.equals(textUppercase);
		System.out.printf("f) Los textos comparados son %b\n", compare2);
		
		// g
		char position8 = text.charAt(8);
		System.out.printf("g) El caracter de la posición 8 es \"%c\"\n", position8);
		
		// h
		char lastChar = text.charAt(text.length() - 1);
		System.out.printf("h) El último caracter del String es \"%c\"\n", lastChar);
		
		// i
		String sub3ToFinal = text.substring(3);
		System.out.printf("i) La subcadena de la posición 3 hasta el final es \"%s\"\n", sub3ToFinal);
		
		// j
		String sub3To8 = text.substring(3, 8);
		System.out.printf("j) La subcadena de la posición 3 hasta la 8 es \"%s\"\n", sub3To8);
		
		// k
		char penultimateChar = text.charAt(text.length() - 2);
		System.out.println("k) Los dos últimos caracteres del String son \"" + penultimateChar + "" + lastChar + "\"");
		
		// l
		String transform = text.replace("a", "-");
		System.out.printf("l) El texto con los reemplazos sería: %s\n", transform);
		
		// m 
		int firstIndexD = text.indexOf("d");
		System.out.printf("m) El indice de la primera ocurrencia de \"d\" es %d\n", firstIndexD);
		
		// n
		int lastIndexA = text.lastIndexOf("a");
		System.out.printf("n) El indice de la última ocurrencia de \"a\" es %d\n", lastIndexA);
		
		// o
		int indexOfX = text.indexOf("x");
		System.out.printf("o) El indice de la letra \"x\" es %d\n", indexOfX); // Devuelve -1 ya que no lo encuentra
		
		// p -> Lo hacemos sin .contains()
		int indexOfSubstring = text.indexOf("o a p");
		boolean hasSubstring = indexOfSubstring != -1;
		System.out.printf("p) ¿La cadena \"o a p\" esta dentro del String? %b\n", hasSubstring);
		
		// q 
		int indexOfSubstring1 = text.indexOf("pogr");
		boolean hasSubstring1 = indexOfSubstring1 != -1;
		System.out.printf("q) ¿La cadena \"pogr\" esta dentro del String? %b\n", hasSubstring1);
		
		// r
		boolean startText = text.startsWith("Estamos"); 
		System.out.printf("r) La cadena \"%s\" empieza por \"Estamos\"? %b\n", text, startText);
		
		// s
		boolean startText1 = text.startsWith("estamos"); 
		System.out.printf("s) La cadena \"%s\" empieza por \"estamos\"? %b\n", text, startText1);
		
		// t 
		boolean endText = text.endsWith("programar");
		System.out.printf("t) La cadena \"%s\" termina con \"programar\"? %b\n", text, endText);
		
		// u 
		boolean endText1 = text.endsWith("aprendiendo a programar");
		System.out.printf("u) La cadena \"%s\" termina con \"aprendiendo a programar\"? %b\n", text, endText1);
		
		// v 
		String transform1 = text.replace(" ", "");
		String textUppercase1 = transform1.toUpperCase();
		System.out.printf("v) %s\n", textUppercase1);
	}

}