package ejercicios_resolucion_problemas_2;

/**
 * Tenemos un listado de notas de los alumnos de una clase.
 * Queremos saber el número de alumnos que hay en cada calificación.
 * Para ello, vamos a realizar la siguiente clasificación:
 * - Suspendidos: 2
 * - Aprobados: 4
 * - Bien: 8
 * - Notable: 4
 * - Sobresaliente: 2
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		
		double[] qualifications = {4.5, 1, 5.0, 7.3, 6.8, 9.0, 9.5, 5.8, 7.4, 3.4, 7.8, 8.2, 3.4, 9.2};
		
		int index = qualifications.length - 1;
		
		int contadorSuspenso = 0;
		int contadorAprobado = 0;
		int contadorBien = 0;
		int contadorNotable = 0;
		int contadorSobresaliente = 0;
		
		for (int i = 0; i <= index; i++) {
			if (qualifications[i] < 5) {
				contadorSuspenso++;
			} else if (qualifications[i] >= 5 && qualifications[i] < 6) {
				contadorAprobado++;
			} else if (qualifications[i] >= 6 && qualifications[i] < 7) {
				contadorBien++;
			} else if (qualifications[i] >= 7 && qualifications[i] < 9) {
				contadorNotable++;
			} else {
				contadorSobresaliente++;
			}
		}
		
		System.out.printf("NOTAS:\n");
		System.out.printf("- Suspendidos (menos que 5): %d\n", contadorSuspenso);
		System.out.printf("- Aprobados (entre 5 y 6): %d\n", contadorAprobado);
		System.out.printf("- Bien (entre 6 y 7): %d\n", contadorBien);
		System.out.printf("- Notable (entre 7 y 9): %d\n", contadorNotable);
		System.out.printf("- Sobresaliente (9 o más): %d\n", contadorSobresaliente);
	}
}