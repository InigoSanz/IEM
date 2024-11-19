package ejercicios_19_11_Funciones;

import java.util.Scanner;

/**
 * Vamos a realizar un validado de Passwords.
 * El validado debe coger la contraseña introducida por el usuario y comprobar la siguientes cosas:
 * - Sea mayor a 8 caracteres. 
 * - Contiene el símbolo: &
 * - No es “1234567890”
 * - No empieza por “pass”
 */
public class Ejercicio23 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduce tu contraseña: ");
		
		String passwd = scanner.nextLine();
		
		// Aquí al sobreescribir el boolean sin tener el cuenta el resultado anterior, no hacia bien la validación
		boolean isTrue = true;
		isTrue = mayor(passwd, isTrue);
		isTrue = contiene(passwd, isTrue) && isTrue;
		isTrue = noEs(passwd, isTrue) && isTrue;
		isTrue = noEmpieza(passwd, isTrue) && isTrue;
		
		scanner.close();
		
		if (isTrue == true) {
			System.out.printf("Contraseña validada.");
		} else {
			System.out.printf("Contraseña no valida.");
		}

	}
	
	public static boolean mayor(String password, boolean isTrue) {
		
		int passwordLength = password.length();
		isTrue = passwordLength > 8;
		
		return isTrue;
	}
	
	public static boolean contiene(String password, boolean isTrue) {
		
		isTrue = password.contains("&");
		
		return isTrue;
	}
	
	public static boolean noEs(String password, boolean isTrue) {
		
		isTrue = !(password.equals("1234567890"));
		
		return isTrue;
	}
	
	public static boolean noEmpieza(String password, boolean isTrue) {
		
		isTrue = !(password.startsWith("pass"));
		
		return isTrue;
	}

}