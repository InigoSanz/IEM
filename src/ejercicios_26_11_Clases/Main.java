package ejercicios_26_11_Clases;

/**
 * Clase Main.
 */
public class Main {

	public static void main(String[] args) {
		
		Alumno inigo = new Alumno("Iñigo", 27, true);
				
		System.out.println("Los datos del alumno son: ");
		System.out.printf("Nombre: %s\n", inigo.getName());
		System.out.printf("Edad: %d\n", inigo.getAge());
		System.out.printf("Online: %s\n", inigo.getIsOnline());
		System.out.printf("Años de experiencia: %d\n", inigo.getYearsOfExperience());
		System.out.printf("Nacionalidad: %s\n", inigo.getNationality());
	}
}