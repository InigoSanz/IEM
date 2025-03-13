package dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio repaso Javi Spring (explicación simplificada).
 */
public class ProjectRepository {
	
	// Acceder a BBDD y devolver el elemento cuyo id sea el mismo que el parámetro
	public Project findById(int id) {

		List<Project> projectList = new ArrayList<>();
		projectList.add(new Project(1));
		projectList.add(new Project(2));
		projectList.add(new Project(3));
		projectList.add(new Project(4));
		projectList.add(new Project(5));

		Project result = null;

		for (Project project : projectList) {
			if (project.getId() == (id)) {
				result = project;
			}
		}

		if (null == result) {
			throw new Error();
		}

		return result;
	}

	public Project findByNombre(String nombre) {

		// Estamos utilizando dos listas en una clase que se llaman en el mismo sitio
		// fuera, esto esta mal, pero lo dejamos asi
		List<Project> projectList = new ArrayList<>();
		projectList.add(new Project("Bomba"));
		projectList.add(new Project("mega"));
		projectList.add(new Project("hiper"));
		projectList.add(new Project("super"));
		projectList.add(new Project("grande"));

		Project result = null;

		for (Project project : projectList) {
			if (project.getNombre().equals(nombre)) {
				result = project;
			}
		}

		if (null == result) {
			throw new Error();
		}

		return result;
	}
}