package ejercicios_12_11;

/**
 * Somos los gestores de los trabajadores de Mestalla.
 * Sabemos que cada partido trabajan 150 trabajadores y 10 supervisores.
 * - Los trabajadores y los supervisores tienen que venir 2h antes del partido y un partido dura 2h.
 * - Un trabajador recibe 5 € por cada hora trabajada y un supervisor 12 € la hora.
 * - Realizar el programa que calcule cuanto es el precio de un partido.
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		
		int workerNumber = 150;
		int supervisorNumber = 10;
		
		int salaryWorker = 5;
		int salarySupervisor = 12;
		
		int workedHours = 4;
		
		int workersCost = workerNumber * salaryWorker * workedHours;
		int supervisorCost = supervisorNumber * salarySupervisor * workedHours;
		
		int finalCost = workersCost + supervisorCost;
		
		System.out.printf("Segun los datos, al Valencia le cuesta el partido %d €.", finalCost);

	}

}
