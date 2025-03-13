package dto;

/**
 * Ejercicio repaso Javi Spring (explicación simplificada).
 */
public class ProjectController {

	public Project getProject(int id) {
		ProjectRepository projectRepository = new ProjectRepository(); // Lo mismo que pasa en la clase Repository, lo
																		// dejamos asi por que son pruebas de ejemplo

		return projectRepository.findById(id);
	}

	public Project getProjectByName(String name) {
		ProjectRepository projectRepository = new ProjectRepository();

		return projectRepository.findByNombre(name);
	}
}