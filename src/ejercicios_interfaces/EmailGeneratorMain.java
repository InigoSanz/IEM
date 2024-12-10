package ejercicios_interfaces;

public class EmailGeneratorMain {

	public static void main(String[] args) {
		
		User user = new User("jhon", "doe", "smith");
		
		EmailGenerator emailGenerator = new EmailGenerator();
		
		String email = emailGenerator.generate(user);
		
		System.out.printf("El correo generado es: %s", email);
	}
}