package dto;

/**
 * Ejercicio repaso Javi Spring (explicación simplificada).
 */
public class Main {

	public static void main(String[] args) {
		
		ProjectController projectController = new ProjectController();
		System.out.println(projectController.getProject(1));
		
		System.out.println(projectController.getProjectByName("Bomba"));

	}
}